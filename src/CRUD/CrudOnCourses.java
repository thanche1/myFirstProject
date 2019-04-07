package CRUD;

import Dao.HeadmasterDao;
import entities.Courses;
import entities.Headmaster;
import sun.plugin.dom.core.CoreConstants;

import java.util.Scanner;

public class CrudOnCourses extends HeadmasterDao {

    public static void CRUDonCoursesHeadmaster(Scanner sc) {
        String choice;

        do {
            System.out.println("Given your choice, pick one of the following letters to act accordingly");
            System.out.println("'C' to create a course.");
            System.out.println("'R' to read a course.");
            System.out.println("'U' to update a course.");
            System.out.println("'D' to delete a course.");
            System.out.println(" 'Q' Return to the previous Menu.");
            choice = sc.next();
            switch (choice) {
                case "C":
                case "c":
                    crudonCoursesCaseC(sc);
                    break;
                case "R":
                case "r":
                    crudOnCoursesCaseR(sc);
                    break;
                case "u":
                case "U":
                    crudOnCoursesCaseU(sc);
                    break;
                case "d":
                case "D":
                    crudOnCoursesCaseD(sc);
                    break;
                case "q":
                case "Q":
                    System.out.println("Redirecting you there...");
                    Headmaster.headmasterManagingMenu(sc);
                    break;
                default:
                    System.out.println("Invalid option.Try again");
                    continue;
            }

        } while (!(choice.equals("q") || choice.equals("Q")));
    }

    public static void crudonCoursesCaseC(Scanner sc) {
        String choice;
        CrudOnCourses coc = new CrudOnCourses();
        Courses c = new Courses();
        System.out.println("The following is the list of the existing Course IDs");
        coc.getListOfCoursesIDs();
        System.out.println("Use a unique ID for your new course");
        System.out.println("                                   ");
        System.out.println("Enter courses id/Title,Stream/Type/Startdate/Enddate");
        coc.insertCourse(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
        do {
            System.out.println("                                    ");
            System.out.println("Would you like to add another course?");
            System.out.println("Press 'Y'/'N')");
            choice = sc.next();
            switch (choice) {
                case "y":
                case "Y":
                    System.out.println("Enter courses id,Title,Stream,Type,Startdate,Enddate");
                    coc.insertCourse(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
                    break;
                case "n":
                case "N":
                    System.out.println("Getting you there....");
                    CRUDonCoursesHeadmaster(sc);
                    break;
                default:
                    System.out.println("Invalid option.Try again");
                    continue;
            }
        } while (!(choice.equals("n") || choice.equals("N")));

    }

    public static void crudOnCoursesCaseR(Scanner sc) {
        String choice;
        CrudOnCourses CoCR = new CrudOnCourses();
        Courses c = new Courses();
        System.out.println("Would you like to get a detailed list of Courses 'A'/Details of a specific Course 'B'");
        do {
            System.out.println("\n");
            choice = sc.next();
            switch (choice) {
                case "a":
                case "A":
                    CoCR.getListOfCourses();
                    System.out.println("\n\n");
                    do {
                        System.out.println("Would you like to check for a course with it's iD? ('Y','N')");
                        choice = sc.next();
                        switch (choice) {
                            case "Y":
                            case "y":
                                CoCR.getListOfCoursesIDs();
                                System.out.println("Enter another ID");
                                System.out.println(CoCR.getCoursesById(sc.nextInt()));
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
                    CRUDonCoursesHeadmaster(sc);
                    break;
                case "b":
                case "B":
                    CoCR.getListOfCoursesIDs();
                    System.out.println("Select  courses ID from the list above.");
                    System.out.println(CoCR.getCoursesById(sc.nextInt()));
                    do {
                        System.out.println("Would you like to check another iD? ('Y','N')");
                        choice = sc.next();
                        switch (choice) {
                            case "Y":
                            case "y":
                                System.out.println("Enter another ID");
                                System.out.println(CoCR.getCoursesById(sc.nextInt()));
                                break;
                            case "N":
                            case "n":
                                System.out.println("Getting you back");
                                CRUDonCoursesHeadmaster(sc);
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

        } while (!choice.equals("q") || choice.equals("Q"));
    }

    public static void crudOnCoursesCaseU(Scanner sc) {
        String choice;
        CrudOnCourses CoCCU = new CrudOnCourses();
        Courses c = new Courses();
        CoCCU.getListOfCourses();
        System.out.println("\n");
        System.out.println("From the list above select the Course you would like to update:");
        System.out.println("Enter courses ID/Title/Stream/Type/Startdate/Enddate.");
        CoCCU.updatecourses(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
        do {
            System.out.println("\n");
            System.out.println("Would you like to update another Course?");
            System.out.println("Press 'Y'/'N')");
            choice = sc.next();
            switch (choice) {
                case "y":
                case "Y":
                    CoCCU.getListOfCourses();
                    System.out.println(" ");
                    System.out.println("Enter courses ID,Title,Stream,Type,Startdate,Enddate");
                    CoCCU.updatecourses(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
                    break;
                case "n":
                case "N":
                    System.out.println("Getting you there....");
                    break;
                default:
                    System.out.println("Invalid option.Try again");
                    continue;
            }
        } while (!(choice.equals("n") || choice.equals("N")));

    }
    public static void crudOnCoursesCaseD(Scanner sc) {
        String choice;
        CrudOnCourses CoCCD = new CrudOnCourses();
        Courses c = new Courses();
        CoCCD.getListOfCourses();
        System.out.println("From the list above select the Course you would like to delete:");
        System.out.println("Enter courses  ID");
        CoCCD.deletecourse(sc.nextInt());
        do {
            System.out.println("                                    ");
            System.out.println("Would you like to delete another course?");
            System.out.println("Press 'Y'/'N')");
            choice = sc.next();
            switch (choice) {
                case "y":
                case "Y":
                    CoCCD.getListOfCourses();
                    System.out.println("Enter courses ID");
                    CoCCD.deletecourse(sc.nextInt());
                    break;
                case "n":
                case "N":
                    System.out.println("Getting you there....");
                    break;
                default:
                    System.out.println("Invalid option.Try again");
                    continue;
            }
        } while (!(choice.equals("n") || choice.equals("N")));



    }

}

