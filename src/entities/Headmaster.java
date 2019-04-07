package entities;

import CRUD.*;
import Menu.LogginManage;
import Menu.SchoolMenu;
import sun.security.util.Password;
import java.util.Scanner;
import entities.*;

import static Menu.LogginManage.logginMenu;

public class Headmaster {
    private String Username;
    private String Password;


    public void athenticationOfHeadmaster(Scanner sc) {
        Password = "123";
        Username = "headmaster";
        Scanner in = new Scanner(System.in);
        System.out.println("\n Please enter Username  " + " /  Or press Q to move into previous menu : ");
        do {
            Username = in.next();
            switch (Username) {
                case "headmaster":
                    System.out.println("Enter Password : ");
                    do {
                        Password = in.next();
                        switch (Password) {
                            case "123":
                                Headmaster.headmasterManagingMenu(sc);
                                break;
                            default:
                                System.out.println("Please Enter correct Password : ");
                                continue;
                        }
                    } while (!(Password.equals("123")) || Password.equals("q") || Password.equals("Q"));
                    break;
                case "q":
                case "Q":
                    System.out.println("Taking your there...");
                    logginMenu(sc);
                    break;
                default:
                    System.out.println("Please Enter correct Username : ");
                    continue;
            }
        } while (!(Username.equals("headmaster")) || sc.next().equals("q") || sc.next().equals("Q"));
    }

    public static void headmasterManagingMenu(Scanner sc) {
        String choice;
        System.out.println("\nWelcome to the Headmasters digital office!");
        System.out.println("Now, would you like to CRUD on :");
        do {

            System.out.println("\nCourses: press '1' ");
            System.out.println("Students: press '2'");
            System.out.println("Assignments: press '3'");
            System.out.println("Trainers: press '4'");
            System.out.println("Students per Courses: press '5'");
            System.out.println("Trainers per Courses: press '6'");
            System.out.println("Assignments per Courses: press '7'");
            System.out.println("Schedule per Courses: press '8'");
            System.out.println("\nPress 'Q' to go back.");
            System.out.println("Else 'Z' to terminate the program");
        choice = sc.next();

            switch (choice) {
                case "z":
                case "Z":
                    System.out.println("Bye,bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("****************************************************");
                 System.out.println("Invalid option.Please choose one of the following " );
                    System.out.println(" ");
                    continue;
                case "1":
                    CrudOnCourses.CRUDonCoursesHeadmaster(sc);
                    break;
                case "2":
                    CrudOnStudents.CRUDonStudentsHeadmaster(sc);
                    break;
                case "3":
                    CrudOnAssignments.CRUDonAssignmentsHeadmaster(sc);
                    break;
                case "4":
                    CrudOnTrainers.CrudOnTrainersHeadMaster(sc);
                    break;
                case "5":
                    CrudOnStudentsPerCourse.CRUDonStudentsperCourseHeadmaster(sc);
                    break;
                case "6":
                    CrudOnTrainersPerCourse.CRUDonTrainersperCourseHeadmaster(sc);
                    break;
                case "7":
                    System.out.println("\nIncomplete");
                    break;
                case "8":
                    System.out.println("\nIncomplete");
                    break;
                case "q":
                case "Q":
                    System.out.println("Redirecting you into previous Menu.....");
                    logginMenu(sc);
                    break;

            }
        } while (!(choice.equals("q") || choice.equals("Q")));



    }
}

