package Menu;

import entities.Headmaster;
import entities.StudentsLogging;
import entities.TrainersLogging;

import java.util.Scanner;


public class LogginManage {
    public static void logginMenu(Scanner sc) {
        String choice;
        System.out.println("\n Welcome to the Logging Menu.");
        do {
            System.out.println("\n Press :");
            System.out.println("\n 'H' to loggin as a Headmaster");
            System.out.println(" 'S' to loggin as a Student");
            System.out.println(" 'T' to loggin as a Trainer");
            System.out.println(" 'Q' to quit");
            System.out.println(" 'Z' to terminate");
            System.out.println("\n Options : 'H','S','T','Q', 'Z' ");
            choice = sc.next();
            System.out.println("**************************");
            switch (choice) {
                case "H":
                case "h":
                    Headmaster h = new Headmaster();
                    h.athenticationOfHeadmaster(sc);
                    break;
                case "S":
                case "s":
                    StudentsLogging s = new StudentsLogging();
                    s.checkingAndLoggingStudent(sc);
//                    s.StudentsManagingMenu(sc);
                    break;
                case "T":
                case "t":
                    TrainersLogging t = new TrainersLogging();
                    t.checkingAndLoggingTrainers(sc);
                    break;
                case "Q":
                case "q":
                    System.out.println("Redirecting you into previous Menu.....");
                    SchoolMenu.menu(sc);
                    break;
                case "z":
                case "Z":
                    System.out.println("Goodbye...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.Please try again");
                   continue;
            }

        } while (!(choice.equals("q") || choice.equals("Q")));
    }
}
