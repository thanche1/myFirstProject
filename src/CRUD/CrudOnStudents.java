package CRUD;

import Dao.HeadmasterDao;
import entities.Headmaster;
import entities.Students;

import java.util.Scanner;

public class CrudOnStudents extends HeadmasterDao {

    public static void CRUDonStudentsHeadmaster(Scanner sc) {
        String choice;

        do {
            System.out.println("Given your choice ,pick one of the following letters to act accordingly");
            System.out.println("Press 'Q' to move back.");
            System.out.println("  'S' to create a student.");
            System.out.println("  'R' to read a specific student's details from database.");
            System.out.println("  'U' to update a student.");
            System.out.println("  'D' to delete a student from the database.");
            choice = sc.next();
            switch(choice) {
                case "Q":
                case "q":
                    System.out.println("Taking you there....");
                   Headmaster.headmasterManagingMenu(sc);
                    break;
                default:
                    System.out.println("Invalid option.Try again.");
                    continue;
                case "S":
                case "s":
                    CrudOnStudentsCaseS(sc);
                    break;
                case "R":
                case "r":
                    CrudOnStudentsCaseR(sc);
                    break;
                case "U":
                case "u":
                    crudOnStudentsCaseU(sc);
                    break;
                case "D":
                case "d":
                    crudOnStudentsCaseD(sc);
                    break;

            }
        }    while(!(choice.equals("q") || choice.equals("Q")));

    }


    public static void CrudOnStudentsCaseS(Scanner sc) {
        String choice;
        CrudOnStudents CoS = new CrudOnStudents();
        Students s = new Students();
        System.out.println("The following is the list of the existing Students IDs ");
        CoS.getListOfStudentsIDs();
        System.out.println("Use a unique ID for your new student");
        System.out.println(" ");
        System.out.println("Enter ID/First Name/Last Name/Date of birth/Fees");
        CoS.insertStudent(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextInt());
        do{
            System.out.println(" ");
            System.out.println("Would you like to add another student?");
            System.out.println("Press 'Y'/'N' ");
            choice = sc.next();
            switch (choice) {
                case "y":
                case "Y":
                    System.out.println("Enter ID/First Name/Last Name/Date of birth/Fees");
                    CoS.insertStudent(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextInt());
                    break;
                case "n":
                case "N":
                    System.out.println("Getting you there....");
                    CRUDonStudentsHeadmaster(sc);
                    break;
                default:
                    System.out.println("Invalid option.Try again.");
                    continue;
            }
        }while(!(choice.equals("n") || choice.equals("N")));
    }
public static void CrudOnStudentsCaseR(Scanner sc) {
        String choice;
        CrudOnStudents CoS = new CrudOnStudents();
        Students s = new Students();
    System.out.println("Would you like to get a detailed list of Students 'A'/ Specific details of a student 'B'");
    do {
        System.out.println(" ");
        choice = sc.next();
    switch (choice) {
        case "a":
        case "A":
            CoS.getListOfStudents();
            System.out.println(" ");
            System.out.println(" ");
            do {
                System.out.println("Would you like to check for a student providing an ID? ('Y','N')");
                choice = sc.next();
                switch (choice) {
                    case "y":
                    case "Y":
                        CoS.getListOfStudentsIDs();
                        System.out.println(" ");
                        System.out.println("Enter an ID");
                        System.out.println(CoS.getStudentById(sc.nextInt()));
                        break;
                    case "N":
                    case "n":
                        System.out.println("Getting you there...");
                        break;
                    default:
                        System.out.println("Invalid option.Try again");
                        continue;
                }
            } while (!(choice.equals("n") || choice.equals("N")));
            CRUDonStudentsHeadmaster(sc);
            break;
        case "b":
        case "B":
            CoS.getListOfStudentsIDs();
            System.out.println("select students id from the list above.");
            System.out.println(CoS.getStudentById(sc.nextInt()));
//        default:
//            System.out.println("Invalid option choose between 'A','B','Q' ");
//            continue;
            do{
                System.out.println("Would you like to check another iD?('Y' / 'N')");
                choice = sc.next();
                switch (choice) {
                    case "Y":
                    case "y":
                        System.out.println("Enter another ID");
                        System.out.println(CoS.getStudentById(sc.nextInt()));
                        break;
                    case "N":
                    case "n":
                        System.out.println("Getting you there.....");
                        CRUDonStudentsHeadmaster(sc);
                        break;
                        default:
                            System.out.println("Invalid option.Try again");
                            continue;
                }
            }while(!(choice.equals("N") || choice.equals("n")));
            default:
                System.out.println("Invalid option choose between 'A', 'B', 'Q')");
                continue;
    }
    }while(!(choice.equals("q") || choice.equals("Q")));
    }
    public static void crudOnStudentsCaseU(Scanner sc) {
        String choice;
        CrudOnStudents CoS = new CrudOnStudents();
        Students s = new Students();
        CoS.getListOfStudents();
        System.out.println("\nFrom the list above select the Student you would like to update:");
        System.out.println("Enter Students ID/First name/Last name/Date of birth/Fees.");

        CoS.updateStudent(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextInt());
        do{
            System.out.println("\nWould you like to update another Student?");
            System.out.println("Press 'Y'/'N')");
            choice = sc.next();
            switch (choice) {
                case "y":
                case "Y":
                    CoS.getListOfStudents();
                    System.out.println("\nEnter Students ID/First name/Last name/Date of birth/Fees.");
                    CoS.updateStudent(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextInt());
                    break;
                case "n":
                case "N":
                    System.out.println("\nGetting you there......");
                    break;
                default:
                    System.out.println("Invalid option.Try again");
                    continue;
            }
        }while (!(choice.equals("n") || choice.equals("N")));
    }
    public static void crudOnStudentsCaseD(Scanner sc) {
        String choice;
        CrudOnStudents Cos = new CrudOnStudents();
        Students s = new Students();
        Cos.getListOfStudents();
        System.out.println("From the list above select the Student you would like to delete!");
        System.out.println("\nEnter Students ID");
        Cos.deleteStudent(sc.nextInt());
        do{
            System.out.println("\nWould you like to delete another Student?");
            System.out.println("Press 'Y'/'N')");
            choice = sc.next();
            switch (choice) {
                case "y":
                case "Y":
                    Cos.getListOfStudents();
                    System.out.println(" ");
                    System.out.println("Enter Student's ID");
                    Cos.deleteStudent(sc.nextInt());
                    break;
                case "n":
                case "N":
                    System.out.println("Getting you there....");
                    break;
                default:
                    System.out.println("Invalid option.Try again");
                    continue;
            }
        }while(!(choice.equals("n") || choice.equals("N")));
    }

}


