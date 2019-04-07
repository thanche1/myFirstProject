package CRUD;

import Dao.HeadmasterDao;
import entities.Headmaster;
import entities.Students;

import java.util.Scanner;

public class CrudOnStudentsPerCourse extends HeadmasterDao {


    public static void CRUDonStudentsperCourseHeadmaster(Scanner sc) {
        String choice;

        do {
            System.out.println("\nGiven your choice ,pick one of the following letters to act accordingly.");
            System.out.println("\n  'S' to create at Students per Course.");
            System.out.println("  'R' to read the students per specific course id.");
            System.out.println("  'U' to update on Students per Course.");
            System.out.println("  'D' to delete on Students per Course.");
            System.out.println("\nPress 'Q' to move back.");
            System.out.println("Press 'Z' to terminate the program.");
            choice = sc.next();
            switch (choice) {
                case "q":
                case "Q":
                    System.out.println("Taking you there....");
                    Headmaster.headmasterManagingMenu(sc);
                    break;
                case "Z":
                case "z":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.Try again.");
                    continue;
                case "S":
                case "s":
                    CRUDonStudentsPerCourseCaseS(sc);
                    break;
                case "R":
                case "r":
                    CRUDonStundetsPerCoursesCaseR(sc);
                    break;
                case "u":
                case "U":
                    CRUDonStudentsPerCourseCaseU(sc);
                    break;
                case "D":
                case "d":
                    CRUDonStudentsPerCourseCaseD(sc);
                    break;
            }
        } while (!(choice.equals("q") || choice.equals("Q")));
    }

    public static void CRUDonStudentsPerCourseCaseS(Scanner sc) {
        String choice;
        CrudOnStudentsPerCourse c = new CrudOnStudentsPerCourse();
        System.out.println("The following is the list of the existing Students per Course");
        System.out.println(c.getStudentsPerCourse());
        System.out.println("To enroll any of the existing students above to the remaining courses, use the right ids");
        System.out.println(" ");
        System.out.println("Enter Students per course ID / students ID / Courses ID ");
        c.insertStudentsPerCourse(sc.nextInt(), sc.nextInt(), sc.nextInt());
        do {
            System.out.println(" ");
            System.out.println(" Would you like to add another student per Course?");
            System.out.println("Press 'Y' / 'N'");
            choice = sc.next();
            switch (choice) {
                case "y":
                case "Y":
                    System.out.println("Enter Students per course ID / students ID / Courses ID ");
                    c.insertStudentsPerCourse(sc.nextInt(), sc.nextInt(), sc.nextInt());
                    break;
                case "n":
                case "N":
                    System.out.println("Getting you there....");
                    CRUDonStudentsperCourseHeadmaster(sc);
                    break;
                default:
                    System.out.println("Invalid option.Try again");
                    continue;
            }
        } while (!(choice.equals("n") || choice.equals("N")));


    }

    public static void CRUDonStundetsPerCoursesCaseR(Scanner sc) {
        String choice;
        CrudOnStudentsPerCourse c = new CrudOnStudentsPerCourse();
        System.out.println("Would you like to get the table Students per Course 'A' / Or a list of all the students per specific Course 'B'?");
        do {
            System.out.println(" ");
            choice = sc.next();
            switch (choice) {
                case "a":
                case "A":
                    System.out.println(c.getStudentsPerCourse());
                    System.out.println(" ");
                    do {
                        System.out.println("Would you like to check the Students of another Course? ('Y' / 'N')");
                        choice = sc.next();
                        switch (choice) {
                            case "y":
                            case "Y":
                                System.out.println("Enter another Course ID");
                                System.out.println(c.getListOfStudentsPerCourseID(sc.nextInt()));
                                break;
                            case "n":
                            case "N":
                                System.out.println("Taking you there...");
                                break;
                            default:
                                System.out.println("Invalid option.Try again");
                                continue;
                        }
                    } while (!(choice.equals("n") || choice.equals("N")));
                    CRUDonStudentsperCourseHeadmaster(sc);
                    break;
                case "b":
                case "B":
                    System.out.println("Give a specific course ID : ");
                    c.getListOfCourses();
                    System.out.println(c.getListOfStudentsPerCourseID(sc.nextInt()));
                    do {
                        System.out.println("Would you like to check for a different Course ID ? ('Y' /'N')");
                        choice = sc.next();
                        switch (choice) {
                            case "y":
                            case "Y":
                                System.out.println("Enter another ID");
                                System.out.println(c.getListOfStudentsPerCourseID(sc.nextInt()));
                                break;
                            case "N":
                            case "n":
                                System.out.println("Getting you there...");
                                CRUDonStudentsperCourseHeadmaster(sc);
                                break;
                            default:
                                System.out.println("Invalid option.Try again");
                                continue;
                        }
                    } while (!(choice.equals("N") || choice.equals("n")));
                default:
                    System.out.println("Invalid option choose between 'A' / 'B')");
                    continue;
            }

        } while (!(choice.equals("q") || choice.equals("Q")));
    }

    public static void CRUDonStudentsPerCourseCaseU(Scanner sc) {
        String choice;
        CrudOnStudentsPerCourse c = new CrudOnStudentsPerCourse();
        System.out.println(c.getStudentsPerCourse());
        System.out.println("\n Select the StudentsperCourseID you would like to update: ");
        System.out.println("\nEnter Students per Course ID/ Student ID / Course ID");
        c.updateStudentsPerCourse(sc.nextInt(), sc.nextInt(), sc.nextInt());
        do {
            System.out.println("\nWould you like to update another Students per Course  ID ?");
            System.out.println("\nPress 'Y' / 'N'");
            choice = sc.next();
            switch (choice) {
                case "y":
                case "Y":
                    System.out.println(c.getStudentsPerCourse());
                    System.out.println("\nEnter Students per Course ID/ Student ID / Course ID");
                    c.updateStudentsPerCourse(sc.nextInt(), sc.nextInt(), sc.nextInt());
                    break;
                case "n":
                case "N":
                    System.out.println("\n Getting you there...");
                    break;
                default:
                    System.out.println("Invalid option.Try again");
                    continue;
            }
        } while (!(choice.equals("n") || choice.equals("N")));
    }

    public static void CRUDonStudentsPerCourseCaseD(Scanner sc) {
        String choice;
        CrudOnStudentsPerCourse c = new CrudOnStudentsPerCourse();
        System.out.println(c.getStudentsPerCourse());
        System.out.println("\nSelect the StudentsperCourseID you would like to delete.");
        System.out.println("\nEnter Students per Course ID :");
        c.deleteStudentsPerCourse(sc.nextInt());
        do {
            System.out.println("\nWould you like to delete another Students per Course ID?");
            System.out.println("Press 'Y' / 'N'");
            choice = sc.next();
            switch (choice) {
                case "Y":
                case "y":
                    System.out.println(c.getStudentsPerCourse());
                    System.out.println("\nEnter Students per Course ID");
                    c.deleteStudentsPerCourse(sc.nextInt());
                    break;
                case "n":
                case "N":
                    System.out.println("\nGetting you there...");
                    break;
                default:
                    System.out.println("Invalid option.Try again");
                    continue;
            }
        }while (!(choice.equals("n") || choice.equals("N"))) ;
    }
}


