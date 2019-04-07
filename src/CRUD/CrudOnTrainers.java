package CRUD;

import Dao.HeadmasterDao;
import entities.Headmaster;
import entities.Trainers;

import java.util.Scanner;

public class CrudOnTrainers extends HeadmasterDao {
    public static void CrudOnTrainersHeadMaster(Scanner sc) {
        String choice;
        do {
            System.out.println("Given your choice, pick one of the following letter to act accordingly");
            System.out.println("Press 'Q' to move back.");
            System.out.println("'T' to create a trainer");
            System.out.println("'R' to read a  specific trainers details from database.");
            System.out.println("'U' to update a trainer");
            System.out.println("'D' to delete a trainer from the database.");
            System.out.println("\nPress 'Z' to terminate the program.");

            choice = sc.next();
            switch (choice) {
                case "Q":
                case "q":
                    System.out.println("Taking you there...");
                    Headmaster.headmasterManagingMenu(sc);
                    break;
                default:
                    System.out.println("Invalid option.Try again");
                    continue;
                case "T":
                case "t":
                    CrudonTrainersCaseT(sc);
                    break;
                case "r":
                case "R":
                   CrudOnTrainersCaseR(sc);
                    break;
                case "U":
                case "u":
                    CrudOnTrainersCaseU(sc);
                    break;
                case "d":
                case "D":
                    CrudOnTrainersCaseD(sc);
                    break;
                case "z":
                case "Z":
                    System.exit(0);
                    break;

            }

        } while (!(choice.equals("q") || choice.equals("Q")));
    }
    public static void CrudonTrainersCaseT(Scanner sc) {
        String choice;
        CrudOnTrainers CoT = new CrudOnTrainers();
        Trainers t = new Trainers();
        System.out.println("The following is the list of the existing Trainers IDs ");
        CoT.getListOfTrainers(); //********************** na ftiaksw methodo sti dao gia trainersIDs
        System.out.println("Use a unique ID for your new Trainer");
        System.out.println(" ");
        System.out.println("Enter TrainersID/First Name/Last Name/Trainers subject.");
        CoT.insertTrainers(sc.nextInt(),sc.next(),sc.next(),sc.next());
        do{
            System.out.println(" ");
            System.out.println("Would you like to add another Trainer?");
            System.out.println("Press 'Y'/'N' ");
            choice = sc.next();
            switch (choice) {
                case "y":
                case "Y":
                    System.out.println("Enter TrainersID/First Name/Last Name/Trainers subject.");
                    CoT.insertTrainers(sc.nextInt(),sc.next(),sc.next(),sc.next());
                    break;
                case "n":
                case "N":
                    System.out.println("Getting you there....");
                    CrudOnTrainersHeadMaster(sc);
                    break;
                default:
                    System.out.println("Invalid option.Try again.");
                    continue;
            }
        }while(!(choice.equals("n") || choice.equals("N")));
    }
    public static void CrudOnTrainersCaseR(Scanner sc) {
        String choice;
        CrudOnTrainers CoT = new CrudOnTrainers();
        Trainers t = new Trainers();
        System.out.println("Would you like to get a detailed list of Trainers 'A'/ Specific details of a Trainer 'B'");
        do {
            System.out.println(" ");
            choice = sc.next();
            switch (choice) {
                case "a":
                case "A":
                    CoT.getListOfTrainers();
                    System.out.println(" ");
                    System.out.println(" ");
                    do {
                        System.out.println("Would you like to check for a Trainer providing an ID? ('Y','N')");
                        choice = sc.next();
                        switch (choice) {
                            case "y":
                            case "Y":
                                CoT.getListOfTrainersIDs();
                                System.out.println(" ");
                                System.out.println("Enter an ID");
                                System.out.println(CoT.getTrainersById(sc.nextInt()));
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
                    CrudOnTrainersHeadMaster(sc);
                    break;
                case "b":
                case "B":
                    CoT.getListOfTrainersIDs();
                    System.out.println("Select Trainers id from the list above.");
                    System.out.println(CoT.getTrainersById(sc.nextInt()));

                    do{
                        System.out.println("Would you like to check another iD?('Y' / 'N')");
                        choice = sc.next();
                        switch (choice) {
                            case "Y":
                            case "y":
                                System.out.println("Enter another ID");
                                System.out.println(CoT.getTrainersById(sc.nextInt()));
                                break;
                            case "N":
                            case "n":
                                System.out.println("Getting you there.....");
                                CrudOnTrainersHeadMaster(sc);
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
    public static void CrudOnTrainersCaseU(Scanner sc) {
        String choice;
        CrudOnTrainers CoT = new CrudOnTrainers();
        Trainers t = new Trainers();
        CoT.getListOfTrainers();
        System.out.println(" ");
        System.out.println("From to list above select the Trainer you would like to update: ");
        System.out.println("Enter Trainers ID/Firs name/Last name/Trainers subject");
        CoT.updatetrainers(sc.nextInt(),sc.next(),sc.next(),sc.next());
        do {
            choice = sc.next();
            System.out.println(" ");
            System.out.println("Would you like to update another Trainer?");
            System.out.println("Press 'Y' / 'N'");

        switch (choice) {
            case "y":
            case "Y":
                CoT.getListOfTrainers();
                System.out.println(" ");
                System.out.println("Enter Trainers ID/First name/Last name/Trainers subkect");
                CoT.updatetrainers(sc.nextInt(),sc.next(),sc.next(),sc.next());
                break;
            case "n":
            case "N":
                System.out.println("Getting you there....");
                break;
            default:
                System.out.println("Invalid option.Try again");
                continue;
        }
        }while (!(choice.equals("n") || choice.equals("N")));
    }
    public static void CrudOnTrainersCaseD(Scanner sc) {
        String choice;
        CrudOnTrainers CoT = new CrudOnTrainers();
        Trainers t = new Trainers();
        CoT.getListOfTrainers();
        System.out.println("From the list above select the Trainer you would like to delete!");
        System.out.println("");
        System.out.println("Enter Trainers ID");
        CoT.deleteTrainer(sc.nextInt());
        do{
            System.out.println(" ");
            System.out.println("Would you like to delete another Student?");
            System.out.println("Press 'Y'/'N')");
            choice = sc.next();
            switch (choice) {
                case "y":
                case "Y":
                    CoT.getListOfTrainers();
                    System.out.println(" ");
                    System.out.println("Enter Trainers ID");
                    CoT.deleteTrainer(sc.nextInt());
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

