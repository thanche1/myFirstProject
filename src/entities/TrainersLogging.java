package entities;


import Dao.HeadmasterDao;
import Menu.UserPass;
import com.mysql.cj.protocol.Resultset;

import javax.swing.plaf.nimbus.State;
import java.io.Console;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.Scanner;

import static Menu.LogginManage.logginMenu;
public class TrainersLogging extends HeadmasterDao {
    private final String URL = "jdbc:mysql://localhost:3306/schoolproject?serverTimezone=UTC";
    private final String USERNAME = "root";
    private final String PASS = "Pepitoftw12!";
    private Connection conn;

    private Connection getConnection() {
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASS);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    private void closeConnection() {

        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String hashingOfPassTrainers(Scanner sc) {
        String dbusername, dbpassword;
        String passwordTohash = sc.next();
        String generatedPassword = null;
        PreparedStatement pst = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(passwordTohash.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;

    }

    public void checkingAndLoggingTrainers(Scanner sc) {
        String dbUsername, dbPassword = null;

        Connection c = getConnection();
        Scanner in = new Scanner(System.in);
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "select * from  traineruserpass where trainerusername = ? and trainerpassword = ?";

        try {
            pst = c.prepareStatement(sql);
            System.out.println("Enter Trainers username :");
            String user = sc.next();
            System.out.println("Enter Trainers password :");
            String one;
            one = hashingOfPassTrainers(sc);
            pst.setString(1, user);
            pst.setString(2, one);
            rs = pst.executeQuery();
            if (rs.next()) {// <--------------------------CHECK THIS !!!!!!!!!!!!!!!!!!
                dbUsername = rs.getString("trainerusername");
                dbPassword = rs.getString("trainerpassword");


                if (!user.equals(dbUsername) && one.equals(dbPassword)) {
                    System.out.println("Incorrect Password :");
                    System.out.println("Try Again !\n");
//                       System.out.println("Successful login! \n---");
//                       System.out.println("Welcome, " + dbUsername + "!");
                } else {
                    System.out.println("Successful login! \n---");
                    System.out.println("Welcome, " + dbUsername + "!");
                    TrainersManagingMenu(sc);

                }
            } else {
                System.out.println("Ops.Wrong input,Please Try again.");
            }//<---------------------- AND THIS !!!!!!!!!
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pst.close();
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void TrainersManagingMenu(Scanner sc) {
        String choice;
        do {
            System.out.println("Welcome to Trainers managing menu.");
            System.out.println("Choose from the following options.");
            System.out.println("Press '1' to view all the Courses you are enrolled.");
            System.out.println("Press '2' to view all the Students enrolled per Course.");
            System.out.println("Press 'Q' to move back and log again with a different user");
            System.out.println("Press 'Z' to terminate the program.");
            choice = sc.next();
            switch (choice) {
                case "1":
                    coursesEnrolledCase1(sc);
                    break;
                case "2":
                    StundetsperCourseCase2(sc);
                    break;
                case "q":
                case "Q":
                    System.out.println("Redirecting you into the previous Menu...");
                    logginMenu(sc);
                    break;
                case "z":
                case "Z":
                    System.out.println("Goodbye.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.Please choose between '1' / '2' / '3' ");
                    continue;
            }
        } while (!(choice.equals("q") || choice.equals("Q")));
    }

    public static void coursesEnrolledCase1(Scanner sc) {
        TrainersLogging t = new TrainersLogging();
        t.getListOfTrainers();
        System.out.println("Provide your ID");
        System.out.println(t.getListOfCoursesPerTrainerID(sc.nextInt()));
    }

    public static void StundetsperCourseCase2(Scanner sc) {
        String choice;
        TrainersLogging t = new TrainersLogging();
        t.getListOfCoursesIDs();
            System.out.println("Provide Courses ID");
        System.out.println(t.getListOfStudentsPerCourseID(sc.nextInt()));
            do{
                System.out.println("Would you like to check for another Course ID? ( 'Y' / 'N' )");
                choice = sc.next();
                switch (choice) {
                    case "y":
                    case "Y":
                        System.out.println("Provide Courses ID");
                        System.out.println(t.getListOfStudentsPerCourseID(sc.nextInt()));
                        break;
                    case "n":
                    case "N":
                        System.out.println("Taking you there...");
                        break;
                    default:
                        System.out.println("Invalid option,please try again.");
                        continue;
                    case "q":
                    case "Q":
                        System.out.println("Taking you there...");
                        break;
                }

        } while (!(choice.equals("n") || choice.equals("N")));
    }
}

