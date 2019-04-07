package CRUD;
import Dao.HeadmasterDao;

import com.sun.org.apache.xml.internal.security.c14n.implementations.Canonicalizer20010315;
import entities.Assignments;
import entities.Headmaster;

import javax.swing.plaf.synth.ColorType;
import java.util.Scanner;

public class CrudOnAssignments extends HeadmasterDao {


    public static void CRUDonAssignmentsHeadmaster(Scanner sc) {
        String choice;
        do {
            System.out.println("Given your choice, pick one of the following letters to act accordingly");
            System.out.println("Press  'Q' to move back.");
            System.out.println("'A' to create an Assignment.");
            System.out.println("'R' to read an Assignment.");
            System.out.println("'U' to update an Assignment.");
            System.out.println("'D' to delete an Assignment.");
            choice = sc.next();
            switch (choice) {
                case "q":
                case "Q":
                    System.out.println("Redirecting you there...");
                    Headmaster.headmasterManagingMenu(sc);
                    break;
                case "a":
                case "A":
                    CrudOnAssignmentsCaseA(sc);
                    break;
                case "r":
                case "R":
                    crudOnAssignmentsCaseR(sc);
                    break;
                case "u":
                case "U":
                    CrudOnAssignmentsCaseU(sc);
                    break;
                case "D":
                case "d":
                    crudonAssignmentsCaseD(sc);
                    break;
                default:
                    System.out.println("Invalid option.Try again");
                    continue;
            }

        } while (!(choice.equals("q") || choice.equals("Q")));
    }

    public static void CrudOnAssignmentsCaseA(Scanner sc) {
        String choice;
        CrudOnAssignments CoA = new CrudOnAssignments();
        Assignments a = new Assignments();
        System.out.println("The following is the list of the existing Assignments IDs");
        CoA.getListOfAssignmentsIDs();
        System.out.println("Use a  unique ID for your new Assignment");
        System.out.println(" ");
        System.out.println("Enter Assignments ID/ Title/ Description/ Oralmark/ Totalmark / Deadline ");
        CoA.insertAssignment(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next());
        do {
            System.out.println(" ");
            System.out.println("Would you like to add another Assignment?");
            System.out.println("Press 'Y' / 'N')");
            choice = sc.next();
            switch (choice) {
                case "Y":
                case "y":

                    System.out.println("Enter Assignments ID/ Title/ Description/ Oralmark/ Totalmark / Deadline ");
                    CoA.insertAssignment(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next());
                    break;
                case "n":
                case "N":
                    System.out.println("Getting you there....");
                    CRUDonAssignmentsHeadmaster(sc);
                    break;
                default:
                    System.out.println("Invalid option.Try again");
                    continue;
            }
        } while (!(choice.equals("n") || choice.equals("N")));
    }

    public static void crudOnAssignmentsCaseR(Scanner sc) {
        String choice;
        CrudOnAssignments CoA = new CrudOnAssignments();
        Assignments a = new Assignments();
        System.out.println("Would you like to get a detailed list of Assignments 'A'/Details of a specific Assignment 'B'");
        do {
            System.out.println("                                ");
            choice = sc.next();
            switch (choice) {
                case "a":
                case "A":
                    CoA.getAssignmentsList();
                    System.out.println("           ");
                    System.out.println("           ");
                    do {
                        System.out.println("Would you like to check for an Assignment with it's iD? ('Y','N')");
                        choice = sc.next();
                        switch (choice) {
                            case "Y":
                            case "y":
                                System.out.println("List of the existing Assignments IDs");
                                CoA.getListOfAssignmentsIDs();
                                System.out.println("Enter another ID");
                                System.out.println(CoA.getAssignmentByID(sc.nextInt()));
                                break;
                            case "N":
                            case "n":
                                System.out.println("Getting you back");
                                break;
                            default:
                                System.out.println("Invalid option .Try again");
                                continue;
                        }
                    } while (!(choice.equals("N") || choice.equals("n")));
                    CRUDonAssignmentsHeadmaster(sc);
                    break;
                case "b":
                case "B":
                    CoA.getListOfAssignmentsIDs();
                    System.out.println("Select  Assignments ID from the list above.");
                    System.out.println(CoA.getAssignmentByID(sc.nextInt()));

                    do {
                        System.out.println("Would you like to check another iD? ('Y','N')");
                        choice = sc.next();
                        switch (choice) {
                            case "Y":
                            case "y":
                                System.out.println("Enter another ID");
                                System.out.println(CoA.getAssignmentByID(sc.nextInt()));
                                break;
                            case "N":
                            case "n":

                                System.out.println("Getting you back");
                                CRUDonAssignmentsHeadmaster(sc);
                                break;
                            default:
                                System.out.println("Invalid option .Try again");
                                continue;
                        }
                    } while (!(choice.equals("N") || choice.equals("n")));
                default:
                    System.out.println("Invalid option choοse between 'A','B','Q')");
                    continue;
            }


        } while (!(choice.equals("q") || choice.equals("Q")));
    }

    public static void CrudOnAssignmentsCaseU(Scanner sc) {
        String choice;
        CrudOnAssignments c = new CrudOnAssignments();
        Assignments a = new Assignments();
        c.getAssignmentsList();
        System.out.println(" ");
        System.out.println("From the list above select the Assignment you would like to update:");
        System.out.println("Enter Assignments ID/ Title/ Description/ Oralmark/ Totalmark / Deadline ");
        c.updateassignments(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next());
        do {
            System.out.println(" ");
            System.out.println("Would you like to update another Assignment?");
            System.out.println("Press 'Y' /'N'");
            choice = sc.next();
            switch (choice) {
                case "y":
                case "Y":
                    c.getAssignmentsList();
                    System.out.println("");
                    System.out.println("Enter Assignments ID/Title/Description/Oralmark/Totalmark/Deadline");
                    c.updateassignments(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next());
                    break;
                case "n":
                case "N":
                    System.out.println("Getting you there...");
                    break;
                default:
                    System.out.println("Invalid option.Try again");
                    continue;
            }
        } while (!choice.equals("n") || choice.equals("N"));


    }
    public static void crudonAssignmentsCaseD(Scanner sc) {
        String choice;
        CrudOnAssignments c = new CrudOnAssignments();
        Assignments a = new Assignments();
        c.getAssignmentsList();
        System.out.println("From the list above choose the Assignment you would like to delete:");
        System.out.println("Enter Assignments ID");
        c.deleteAssignment(sc.nextInt());
        do {
            System.out.println(" ");
            System.out.println("Would you like to Delete another Assignment?");
            System.out.println("Press 'Y' / 'N'");
            choice = sc.next();
            switch(choice) {
                case "y":
                case "Y":
                    c.getAssignmentsList();
                    System.out.println("Enter Assignments ID");
                    c.deleteAssignment(sc.nextInt());
                    break;
                case "n":
                case "N":
                    System.out.println("Getting you there...");
                    break;
                default:
                    System.out.println("Invalid option.Try again.");
                    continue;
            }
        }while(!(choice.equals("n") || choice.equals("N")));
        }
    }


