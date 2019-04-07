package CRUD;
import Dao.HeadmasterDao;
import entities.Headmaster;
import entities.Trainers;

import java.util.Scanner;

public class CrudOnTrainersPerCourse extends HeadmasterDao {

    public static void CRUDonTrainersperCourseHeadmaster(Scanner sc) {
        String choice;
        do{
            System.out.println("\nGiven your choice, pick one of the following letters to act accordingly.");
            System.out.println("\n'T' to create a Trainer per Course.");
            System.out.println("'R' to read  Trainers per specific course id.");
            System.out.println("'U' to update on Trainers per Course.");
            System.out.println("'D' to delete on Trainers per Course.");
            System.out.println("\nPress 'Q' to move back.");
            System.out.println("Press 'Z' to terminate the program.");
            choice = sc.next();
            switch (choice) {
                case "q":
                case "Q":
                    System.out.println("Taking you there...");
                    Headmaster.headmasterManagingMenu(sc);
                    break;
                case "z":
                case "Z":
                    System.out.println("\nBye,bye..");
                    System.exit(0);
                case "T":
                case "t":
                    CRUDonTrainersPerCourseCaseT(sc);
                    break;
                case "r":
                case "R":
                    CRUDonTrainersPerCourseCaseR(sc);
                    break;
                case "U":
                case "u":
                    System.out.println("Not completed");
//                    CRUDonTrainersPerCourseCaseU(sc);
                    break;
                case "d":
                case "D":
                    CRUDonTrainersPerCourseCaseD(sc);
                    break;
            }
        }while(!(choice.equals("q") || choice.equals("Q")));
    }
    public static void CRUDonTrainersPerCourseCaseT(Scanner sc) {
        String choice;
        CrudOnTrainersPerCourse c  = new CrudOnTrainersPerCourse();
        System.out.println("\nThe following is the list of the existing Trainers per Course");
        System.out.println(c.getTrainersPerCourse());
        System.out.println("\nGive the right input to add on Trainers per Course Table.");
        System.out.println(" Enter 'Trainers per Course ID' / ' Trainers ID '/ ' Courses ID '");
        c.insertTrainersPerCourse(sc.nextInt(),sc.nextInt(),sc.nextInt());
        do {
            System.out.println("\nWould you like to add another Trainer per Course?");
            System.out.println("Press 'Y' / 'N'");
            choice = sc.next();
            switch (choice) {
                case "y":
                case "Y":
                    System.out.println("\nEnter 'Trainers per Course ID' / ' Trainers ID '/ ' Courses ID '");
                    c.insertTrainersPerCourse(sc.nextInt(),sc.nextInt(),sc.nextInt());
                    break;
                case "n":
                case "N":
                    System.out.println("Getting you there...");
                    CRUDonTrainersperCourseHeadmaster(sc);
                    break;
                default:
                    System.out.println("\nInvalid option.Try again");
                    continue;
            }
        }while(!(choice.equals("n") || choice.equals("N")));



    }
    public static void CRUDonTrainersPerCourseCaseR(Scanner sc) {
        String choice;
        CrudOnTrainersPerCourse c = new CrudOnTrainersPerCourse();
        System.out.println("Would you like to get the table of Trainers per Course 'A' / Or a list of all the trainers per Specific Course 'B'?");
        do {
            choice = sc.next();
            switch (choice) {
                case "A":
                case "a":
                    System.out.println(c.getTrainersPerCourse());
                    System.out.println("\n");
                    do {
                        System.out.println("Would you like to check the Trainers of a specific Course ID? 'Y' /'n'" );
                        choice = sc.next();
                        switch (choice) {
                            case "y":
                            case "Y":
                                System.out.println("List of Course IDs");
                                c.getListOfCoursesIDs();
                                System.out.println("Enter another Course ID");
                                System.out.println(c.getListOfTrainersPerCourseID(sc.nextInt()));
                                break;
                            case "N":
                            case "n":
                                System.out.println("Taking you there...");
                                break;
                            default:
                                System.out.println("Invalid option.Please try again");
                                continue;
                        }

                    }while(!(choice.equals("n") || choice.equals("N")));
                    CRUDonTrainersperCourseHeadmaster(sc);
                    break;
                case "b":
                case "B":
                    c.getListOfCoursesIDs();
                    System.out.println("\nGive a specific Course ID");
                    System.out.println(c.getListOfTrainersPerCourseID(sc.nextInt()));
                    do {
                        System.out.println("Would you like to check for a different ID? 'Y' / 'N'");
                        choice = sc.next();
                        switch (choice) {
                            case "Y":
                            case "y":
                                System.out.println("Enter another ID");
                                System.out.println(c.getListOfTrainersPerCourseID(sc.nextInt()));
                                break;
                            case "N":
                            case "n":
                                System.out.println("Taking you there...)");
                                CRUDonTrainersperCourseHeadmaster(sc);
                                break;
                            default:
                                System.out.println("Invalid option.Please try again");
                                continue;
                        }
                    }while(!(choice.equals("n") || choice.equals("N")));
                    }
        }while(!(choice.equals("q") || choice.equals("Q")));
        }
        public static void CRUDonTrainersPerCourseCaseU (Scanner sc) {
        String choice;
        CrudOnTrainersPerCourse c = new CrudOnTrainersPerCourse();
            System.out.println(c.getTrainersPerCourse());
            System.out.println("Select from Trainers per Course to update: ");
            System.out.println(" Enter 'Trainers per Course ID' / ' Trainers ID '/ ' Courses ID '");
            c.updateTrainersPerCourse(sc.nextInt(),sc.nextInt(),sc.nextInt());
            do {
                System.out.println("\nWould you like to update another Traners per Course ?");
                System.out.printf("\nPress 'Y' / 'N'");
                choice = sc.next();
                switch (choice) {
                    case "Y":
                    case "y":
                        System.out.println(c.getTrainersPerCourse());
                        System.out.println(" Enter 'Trainers per Course ID' / ' Trainers ID '/ ' Courses ID '");
                        c.updateTrainersPerCourse(sc.nextInt(), sc.nextInt(), sc.nextInt());
                        break;
                    case "n":
                    case "N":
                        System.out.println("\n Taking you there...");
                        break;
                    default:
                        System.out.println("Invalid option.Please try again.");
                        continue;
                }
            }while(!(choice.equals("n") || choice.equals("N")));
            }
            public static void CRUDonTrainersPerCourseCaseD (Scanner sc) {
        String choice;
        CrudOnTrainersPerCourse a = new CrudOnTrainersPerCourse();
                System.out.println(a.getTrainersPerCourse());
                System.out.println("\nSelect the Trainers per Course ID you would like to delete");
                a.getTrainersPerCourseID();
                System.out.println("\n Enter Trainers per Course ID");
                a.deleteTrainersPerCourse(sc.nextInt());
                do {
                    System.out.println("\nWould you like to delete another Trainers per Course ID ?");
                    System.out.println(" 'Y' / 'N' ");
                    choice = sc.next();
                    switch (choice) {
                        case "y":
                        case "Y":
                            a.getTrainersPerCourseID();
                            System.out.println("Enter Trainers per Course ID");
                            a.deleteTrainersPerCourse(sc.nextInt());
                            break;
                        case "n":
                        case "N":
                            System.out.println("\nTaking you there...");
                            break;
                        default:
                            System.out.println("Invalid option, please try again");
                            continue;
                    }
                }while(!(choice.equals("n") || choice.equals("N")));
            }
        }



