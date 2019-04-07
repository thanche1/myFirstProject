package Dao.MainPackage;

import Dao.HeadmasterDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentDao {
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
    public void insertStudent(int StudentsID, String Fname, String Lname, String DOB, double Fees) {
        String query = "INSERT INTO students VALUES (?,?,?,?,?)";
        try {
            Connection con = getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, StudentsID);
            pst.setString(2, Fname);
            pst.setString(3, Lname);
            pst.setString(4, DOB);
            pst.setDouble(5, Fees);
            int number = pst.executeUpdate();
            if (number > 0) {
                System.out.println("cool");
            } else {
                System.out.println("oooops");
            }
            pst.close();
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertStudentsPerCourse(int StudentsperCourseID, int StudentID, int courseID) {
        String query = "INSERT INTO studentspercourse VALUES (?,?,?)";
        try {
            Connection con = getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, StudentsperCourseID);
            pst.setInt(2, StudentID);
            pst.setInt(3, courseID);
            int number = pst.executeUpdate();
            if (number > 0) {
                System.out.println("good");
            } else {
                System.out.println("no");
            }
            pst.close();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(HeadmasterDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateStudent(int id, String Fname, String Lname, String DOB, double Fees) {
        String query = "update students set Fname = ?, Lname = ?, DOB = ?, Fees = ? where StudentsID = ? ";
        Connection conn = getConnection();
        PreparedStatement pst = null;
        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, Fname);
            pst.setString(2, Lname);
            pst.setString(3, DOB);
            pst.setDouble(4, Fees);
            pst.setInt(5, id);
            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("updated");
            } else {
                System.out.println("nooooooo");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                pst.close();
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }



}
