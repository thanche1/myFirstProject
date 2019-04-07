package CRUD;

import Dao.HeadmasterDao;
import entities.Headmaster;

import java.util.Scanner;

public class CrudOnAssignmentsPerCourse extends HeadmasterDao {
    public static void CRUDonAssignmentsPerCourseHeadmaster(Scanner sc) {
        String choice;

        do {
            System.out.println("\nGiven your choice , pick one of the following letters to act accordingly.");
            System.out.println("\n'A' to create at Assignments per Course.");
            System.out.println("'R' to read the Assignments per specific Course ID");
            System.out.println("'U' to update on Assignments per Course");
            System.out.println(" 'D' to delete on Assignments per Course");
            System.out.println("\nPress 'Q' to move back.");
            System.out.println("Press 'Z' to terminate the program.");
            choice = sc.next();
            switch (choice) {
                case "Q":
                case "q":
                    System.out.println("Taking you there...");
                    Headmaster.headmasterManagingMenu(sc);
                    break;
                case "z":
                case "Z":
                    System.out.println("Bye,bye.");
                    System.exit(0);
                    break;
                case "a":
                case "A":
                    //
                    break;
                case "r":
                case "R":
                    //
                    break;
                case "u":
                case "U":
                    //break;
                case "d":
                case "D":
                    //break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
            continue;

        } while (!(choice.equals("q") || choice.equals("Q")));
    }

    public static void CRUDonAssignmentsPerCourseCaseA(Scanner sc) {
        String choice;
        CrudOnAssignmentsPerCourse c = new CrudOnAssignmentsPerCourse();
        System.out.println("The following is the list of the existing Assignments per course");
        System.out.println(c.getAssignmentsperCourseQuery());
        System.out.println("\nTo create Assignments per Course");
        System.out.println("Enter Assignments per Course ID/ Assignments ID / Courses ID");
        c.insertassignmentspercourse(sc.nextInt(),sc.nextInt(),sc.nextInt());
        do{
            System.out.println("Would you like to add another Assignment per course?");
            System.out.println("Press 'Y' / 'N'");
            choice = sc.next();
            switch (choice) {
                case "y":
                case "Y":
                    System.out.println("Enter Assignments per Course ID/ Assignments ID / Courses ID");
                    c.insertassignmentspercourse(sc.nextInt(),sc.nextInt(),sc.nextInt());
                    break;
                case "n":
                case "N":
                    System.out.println("Taking you there...");
                    CRUDonAssignmentsPerCourseHeadmaster(sc);
                    break;
                default:
                    System.out.println("Invalid option,please try again.");
                    continue;
            }
        } while(!(choice.equals("n") || choice.equals("N")));

    }
    public static void CRUDonAssignmentsperCourseCaseR(Scanner sc) {

    }
}



