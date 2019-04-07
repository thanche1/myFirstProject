package Menu;

import java.util.Scanner;

public class SchoolMenu {
    public static void menu(Scanner sc) {
        String choice;
        System.out.println("\n Welcome to School database project");
        do {

            System.out.println("\n Press:");
            System.out.println("\n 'M' to manage data");

            System.out.println(" 'Q' to quit");
            System.out.println("\n Options : 'M','Q' ");
            choice = sc.next();
            System.out.println("\n ************************************************");
            switch (choice) {
                case "M":
                case "m":
LogginManage.logginMenu(sc);
                    break;
                case "Q":
                case "q":
                    System.out.println("Goodbye");
                    System.exit(0);

                    break;
                default:
                    System.out.println("Invalid option.Try again");
                    continue;
            }
        }while (!(choice.equals("q") || choice.equals("Q")));
        }
    }

