package Dao;

import CRUD.CrudOnTrainersPerCourse;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxSession;
import com.mysql.cj.xdevapi.SqlDataResult;
import javafx.beans.property.DoublePropertyBase;
import sun.dc.pr.PRError;

import javax.sql.ConnectionPoolDataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import entities.*;

public class HeadmasterDao {
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

    public void insertAssignment(int AssignmentsID, String Title, String Description, double Oralmark, double Totalmark, String Deadline) {
        String query = "INSERT INTO assignments VALUES (?,?,?,?,?,?)";
        try {
            Connection con = getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, AssignmentsID);
            pst.setString(2, Title);
            pst.setString(3, Description);
            pst.setDouble(4, Oralmark);
            pst.setDouble(5, Totalmark);
            pst.setString(6, Deadline);
            int number = pst.executeUpdate();
            if (number > 0) {
                System.out.println("good");
            } else {
                System.out.println("bad");
            }
            pst.close();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(HeadmasterDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertCourse(int CoursesID, String Title, String Stream, String Type, String Startdate, String Enddate) {
        String query = "INSERT INTO Courses VALUES (?,?,?,?,?,?)";
        try {
            Connection con = getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, CoursesID);
            pst.setString(2, Title);
            pst.setString(3, Stream);
            pst.setString(4, Type);
            pst.setString(5, Startdate);
            pst.setString(6, Enddate);
            int number = pst.executeUpdate();
            if (number > 0) {
                System.out.println("Successfully inserted a new course with the ID " + CoursesID + " " + "Title: " + Title + " Stream: " + Stream + " Type: " + Type + " Startdate: " + Startdate + " Enddate: " + Enddate);
            } else {
                System.out.println("badbad");
            }
            pst.close();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(HeadmasterDao.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public void insertTrainers(int TrainersID, String TrainersFname, String TrainersLname, String TrainersSubject) {
        String query = "INSERT INTO trainers VALUES (?,?,?,?)";

        try {
            Connection con = getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, TrainersID);
            pst.setString(2, TrainersFname);
            pst.setString(3, TrainersLname);
            pst.setString(4, TrainersSubject);
            int number = pst.executeUpdate();
            if (number > 0) {
                System.out.println("success");
            } else {
                System.out.println("bad");
            }
            pst.close();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(HeadmasterDao.class.getName()).log(Level.SEVERE, null, ex);
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

    public void insertassignmentspercourse(int AssignmentsperCourseID, int ApcAssignmentsID, int ApcCoursesID) {
        String query = "INSERT INTO assignmentspercourse VALUES (?,?,?)";
        Connection con = getConnection();
        try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, AssignmentsperCourseID);
            pst.setInt(2, ApcAssignmentsID);
            pst.setInt(3, ApcCoursesID);
            int number = pst.executeUpdate();
            if (number > 0) {
                System.out.println("goodie");
            } else {
                System.out.println("not sucess");
            }
            pst.close();
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertTrainersPerCourse(int TrainersPerCourseID, int TpcTrainersID, int TpcCoursesID) {
        String query = "INSERT INTO trainerspercourse VALUES (?,?,?)";
        Connection con = getConnection();
        try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, TrainersPerCourseID);
            pst.setInt(2, TpcTrainersID);
            pst.setInt(3, TpcCoursesID);
            int number = pst.executeUpdate();
            if (number > 0) {
                System.out.println("high five");
            } else {
                System.out.println("fucked up ");
            }
            pst.close();
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void insertAssingmentsPerStudent(int AssignmentsPerStudent, int ApSStudentID, int ApSAssignmentsID) {

        String query = "INSERT INTO assignmentsperstudent VALUES (?,?,?)";
        Connection con = getConnection();
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement(query);
            pst.setInt(1, AssignmentsPerStudent);
            pst.setInt(2, ApSStudentID);
            pst.setInt(3, ApSAssignmentsID);
            int number = pst.executeUpdate();
            if (number > 0) {
                System.out.println("very well");
            } else {
                System.out.println("not good");
            }
            pst.close();
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void insertassignmentspercourseperstudent(int AssignmentspercourseperstudentID, int ApcpsApcID, int ApcpsApsID) {
        String query = "insert into assignmentspercourseperstudent values (?,?,?)";
        Connection con = getConnection();
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement(query);
            pst.setInt(1, AssignmentspercourseperstudentID);
            pst.setInt(2, ApcpsApcID);
            pst.setInt(3, ApcpsApsID);
            int number = pst.executeUpdate();
            if (number > 0) {
                System.out.println("good job");
            } else {
                System.out.println("noooo");
            }
            pst.close();
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
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

    public void updatecourses(int id, String Title, String Stream, String Type, String Startdate, String Enddate) {
        String query = "update courses set Title = ?, Stream = ?,Type = ?,Startdate = ?,Enddate = ? where CoursesID = ?";
        Connection conn = getConnection();
        PreparedStatement pst = null;
        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, Title);
            pst.setString(2, Stream);
            pst.setString(3, Type);
            pst.setString(4, Startdate);
            pst.setString(5, Enddate);
            pst.setInt(6, id);
            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("Good job you just updated  " + getCoursesById(id));
            } else {
                System.out.println("noo");
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
    public void updateassignments(int id,String Title,String Description,double Oralmark,double Totalmark,String Deadline) {
        String query = "update assignments set Title =?,Description =?,Oralmark = ?,Totalmark =?,Deadline=? where AssignmentsID = ?";
        Connection conn = getConnection();
        PreparedStatement pst = null;
        try {
            pst = conn.prepareStatement(query);
            pst.setString(1,Title);
            pst.setString(2,Description);
            pst.setDouble(3,Oralmark);
            pst.setDouble(4,Totalmark);
            pst.setString(5,Deadline);
            pst.setInt(6,id);
            int result = pst.executeUpdate();
            if( result > 0) {
                System.out.println("Goog, Assignment updated");
            } else {
                System.out.println("no update");
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
    public void updatetrainers(int id, String TrainersFname, String TrainersLname, String TranersSubject) {
        String query = "update trainers set TrainersFname = ?,TrainersLname = ?,TrainersSubject = ? where TrainersID = ?";
        Connection conn = getConnection();
        PreparedStatement pst = null;

        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, TrainersFname);
            pst.setString(2, TrainersLname);
            pst.setString(3, TranersSubject);
            pst.setInt(4, id);
            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("good");
            } else {
                System.out.println("no update");
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

    public void updateStudentsPerCourse(int id, int StudentID, int courseID) {
        String query = "update studentspercourse set StudentID = ?,CourseID = ? where StudentsperCourseID = ?";
        Connection conn = getConnection();
        PreparedStatement pst = null;

        try {
            pst = conn.prepareStatement(query);
            pst.setInt(1, StudentID);
            pst.setInt(2, courseID);
            pst.setInt(3, id);
            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("updated");
            } else {
                System.out.println("not updated");
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

    public void updateAssignmentsPerCourse(int id, int ApcAssignmentsID, int ApcCoursesID) {
        String query = "update assignmentspercourse set ApcAssignmentsID = ?,ApcCoursesID = ? where AssignmentsperCourseID = ?";
        Connection conn = getConnection();
        PreparedStatement pst = null;

        try {
            pst = conn.prepareStatement(query);
            pst.setInt(1, ApcAssignmentsID);
            pst.setInt(2, ApcCoursesID);
            pst.setInt(3, id);
            int result = pst.executeUpdate();

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

    public void updateAssignmentsPerStudent(int id, int ApSStudentID, int ApSAssignmentID) {
        String query = "update assignmentsperstudent set ApSStudentID = ?,ApSAssignmentID = ? where AssignmentsPerStudent = ?";
        Connection conn = getConnection();
        PreparedStatement pst = null;

        try {
            pst = conn.prepareStatement(query);
            pst.setInt(1, ApSStudentID);
            pst.setInt(2, ApSAssignmentID);
            pst.setInt(3, id);
            int result = pst.executeUpdate();
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

    public void updateTrainersPerCourse(int id, int TpcTrainersID, int TpcCoursesID) {
        String query = "update trainerspercourse set TpcTrainersID = ?, TpcCoursesID = ? where TrainersPerCourseID = ?";
        Connection conn = getConnection();
        PreparedStatement pst = null;

        try {
            pst = conn.prepareStatement(query);
            pst.setInt(1, TpcTrainersID);
            pst.setInt(2, TpcCoursesID);
            pst.setInt(3, id);
            int result = pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public void updateAssignmentsPerCoursePerStudent(int id, int AssignmentspercourseperstudentID, int ApcpsApcID, int ApcpsApsID) {
        String query = "update assignmentspercourseperstudent set  ApcpsApcID =?,ApcpsApsID =? where AssignmentspercourseperstudentID = ?";
        Connection conn = getConnection();
        PreparedStatement pst = null;
        try {
            pst = conn.prepareStatement(query);
            pst.setInt(1, ApcpsApcID);
            pst.setInt(2, ApcpsApcID);
            pst.setInt(3, AssignmentspercourseperstudentID);
            int result = pst.executeUpdate();

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


    public void deleteStudent(int id) {
        String query = "delete from students where StudentsID = ?";
        Connection conn = getConnection();
        PreparedStatement pst = null;

        try {
            pst = conn.prepareStatement(query);
            pst.setInt(1, id);
            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("deleted " + getCoursesById(id) + " Successfully");
            } else {
                System.out.println("The student with id " + id + " was not found ");
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

    public void deletecourse(int id) {
        String query = "delete from courses where CoursesID = ?";
        Connection conn = getConnection();
        PreparedStatement pst = null;

        try {
            pst = conn.prepareStatement(query);
            pst.setInt(1, id);
            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("Course deleted");
            } else {
                System.out.println("+id+" + " could not be found");
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

    public void deleteTrainer(int id) {
        String query = "delete from trainers where TrainersID =?";
        Connection conn = getConnection();
        PreparedStatement pst = null;

        try {
            pst = conn.prepareStatement(query);
            pst.setInt(1, id);
            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("Trainer deleted");
            } else {
                System.out.println(id + " could not be found");
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

    public void deleteAssignment(int id) {
        String query = "delete from assignments where AssignmentsID = ?";
        Connection con = getConnection();
        PreparedStatement pst = null;


        try {
            pst = con.prepareStatement(query);
            pst.setInt(1, id);
            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("Assignment deleted");
            } else {
                System.out.println(id + " could not be found");
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

    public void deleteStudentsPerCourse(int id) {
        String query = "delete from studentspercourse where StudentsperCourseID = ?";
        Connection con = getConnection();
        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(query);
            pst.setInt(1, id);
            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("StudentPerCourse Deleted");
            } else {
                System.out.println("Could not be found");
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

    public void deleteAssignmentsPerCourse(int id) {
        String query = "delete from assignmentspercourse where  AssignmentsperCourseID = ?";
        Connection con = getConnection();
        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(query);
            pst.setInt(1, id);
            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("AssignmentPerCourse delete");
            } else {
                System.out.println("AssignmentPerCourse could not be found");
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

    public void deleteAssignmentsPerStudent(int id) {
        String query = "delete from assignmentsperstudent where assignmentsperstudent =?";
        Connection con = getConnection();
        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(query);
            pst.setInt(1, id);
            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("deleted");
            } else {
                System.out.println("not found");
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

    public void deleteTrainersPerCourse(int in) {
        String query = "delete from trainerspercourse where TrainersPerCourseID = ?";
        Connection conn = getConnection();
        PreparedStatement pst = null;
        try {
            pst = conn.prepareStatement(query);
            pst.setInt(1, in);
            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("TrainersPerCourse deleted");
            } else {
                System.out.println("Not found");
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

    public void deleteAssignmentsPerCoursePerStudent(int id) {
        String query = "delete from assignmentspercourseperstudent where AssignmentspercourseperstudentID = ?";
        Connection conn = getConnection();
        PreparedStatement pst = null;
        try {
            pst = conn.prepareStatement(query);
            pst.setInt(1, id);
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

    public Students getStudentById(int id) {
        String query = "select * from students where StudentsID = ?";
        Students s = new Students();
        Connection con = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            pst = conn.prepareStatement(query);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            rs.next();
            s.setStudentsID(rs.getInt("StudentsID"));
            s.setFname(rs.getString("Fname"));
            s.setLname(rs.getString("Lname"));
            s.setDOB(rs.getString("DOB"));
            s.setFees(rs.getInt("Fees"));
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
        return s;
    }
    public Courses getCoursesById(int id) {
        String query = "select * from courses where CoursesID = ?";
        Courses c = new Courses();
        Connection conn = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement(query);
            pst.setInt(1,id);
            rs = pst.executeQuery();
            rs.next();
            c.setCoursesID(rs.getInt("CoursesID"));
            c.setTitle(rs.getString("Title"));
            c.setStream(rs.getString("Stream"));
            c.setType(rs.getString("Type"));
            c.setStartdate(rs.getString("Startdate"));
            c.setEnddate(rs.getString("Enddate"));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                pst.close();
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return c;

    }
    public Trainers getTrainersById(int id) {
        String query =" select * from trainers where TrainersID = ?";
        Trainers t = new Trainers();
        Connection conn = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement(query);
            pst.setInt(1,id);
            rs = pst.executeQuery();
            rs.next();
            t.setTrainersID(rs.getInt("TrainersID"));
            t.setTrainersFname(rs.getString("TrainersFname"));
            t.setTrainersLname(rs.getString("TrainersLname"));
            t.setTrainersSubject(rs.getString("TrainersSubject"));
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
        return t;
    }
    public ScheduleperDay getScheduleperdayPerStudentID(int id) {
        String sql = "select * from schedulepercourse as sc\n" +
                "inner join students s on s.StudentsID = sc.studentsScheduleID where studentsScheduleID = ?";
        ScheduleperDay s = new ScheduleperDay();
        Connection conn = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1,id);
            rs = pst.executeQuery();
            rs.next();
            s.setStudentsScheduleID(rs.getInt(7));
            s.setMondayCourses(rs.getString(2));
            s.setTuesday(rs.getString(3));
            s.setWednesday(rs.getString(4));
            s.setThursday(rs.getString(5));
            s.setFriday(rs.getString(6));



        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                pst.close();
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return s;

    }

    public Assignments getAssignmentByID(int id) {
        String query = "select * from assignments where AssignmentsID =?";
        Assignments a = new Assignments();
        Connection con = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            pst =  con.prepareStatement(query);
            pst.setInt(1,id);
            rs = pst.executeQuery();
            rs.next();
            a.setAssignmentsID(rs.getInt("AssignmentsID"));
            a.setTitle(rs.getString("Title"));
            a.setDescription(rs.getString("Description"));
            a.setOralmark(rs.getInt("Oralmark"));
            a.setTotalmark(rs.getInt("Totalmark"));
            a.setDeadline(rs.getString("Deadline"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally   {
            try {
                rs.close();
                pst.close();
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return a;

    }
    public AssignmentsPercourse getAssignmentsPerCourse(int id) {
        String query = "select* from assignmentspercourse where AssignmentsperCourseID = ?";
        AssignmentsPercourse apc = new AssignmentsPercourse();
        Connection con = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            pst = con.prepareStatement(query);
            pst.setInt(1,id);
            rs = pst.executeQuery();
            rs.next();
            apc.setAssignmentsperCourseID(rs.getInt("AssignmentsperCourseID"));
            apc.setApcAssignmentsID(rs.getInt("ApcAssignmentsID"));
            apc.setApcCoursesID(rs.getInt("ApcCoursesID"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally   {
            try {
                rs.close();
                pst.close();
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
return apc;
    }
    public AssignmentsPerStudent getAssignmentsPerStudentId(int id) {
        String query = "select * from assignmentsperstudent where AssignmentsPerStudent =?";
        Connection conn = getConnection();
        PreparedStatement pst = null;
        AssignmentsPerStudent aps = new AssignmentsPerStudent();
        ResultSet rs = null;

        try {
            pst = conn.prepareStatement(query);
            pst.setInt(1,id);
            rs = pst.executeQuery();
            rs.next();
            aps.setAssignmentsPerStudent(rs.getInt("AssignmentsPerStudent"));
            aps.setApsStudentID(rs.getInt("ApSStudentID"));
            aps.setApsAssignmentid(rs.getInt("ApSAssignmentID"));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                pst.close();
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return aps;
    }
    //------------------------------------------------------------------------------------------------------------------------------------
    public List<StudentPerCourseDao> getStudentsPerCourse() {
        String query = "select CoursesID,Fname,Lname,Title,coursePerStudentID from students as s inner join courseperstudent as cps on cps.cpsstudentID = s.StudentsID inner join courses as c on c.CoursesID = cps.cpscourseID";
        Connection conn = getConnection();
        List<StudentPerCourseDao> spcdList = new ArrayList<StudentPerCourseDao>();
        try {
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {

                StudentPerCourseDao a = new StudentPerCourseDao(rs.getInt("CoursesID"), rs.getString("Fname"), rs.getString("Lname"), rs.getString("Title"), rs.getInt("coursePerStudentID"));
            spcdList.add(a);
        }
            rs.close();
            st.close();
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return spcdList;
    }
    public void getTrainersPerCourseID() {
        List<TrainersPerCourseIDQuerySetter> l = new ArrayList<TrainersPerCourseIDQuerySetter>();
        String sql = "select TrainersPerCourseID from trainerspercourse;";
        try {
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                TrainersPerCourseIDQuerySetter t = new TrainersPerCourseIDQuerySetter(rs.getInt("TrainersPerCourseID"));
                l.add(t);
            }
            rs.close();
            closeConnection();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }for(TrainersPerCourseIDQuerySetter x: l) {
            System.out.println(x);
        }

    }
    public List<TrainersPerCourseQuerySetter> getTrainersPerCourse() {
        String sql = "select TrainersID,TrainersFname,TrainersLname,CoursesID,Title from trainers as t inner join trainerspercourse as tpc on tpc.TpcTrainersID = t.TrainersID inner join courses as c on c.CoursesID = tpc.TpcCoursesID;";
        Connection conn = getConnection();
        List<TrainersPerCourseQuerySetter> l = new ArrayList<TrainersPerCourseQuerySetter>();

        try {
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                TrainersPerCourseQuerySetter a = new TrainersPerCourseQuerySetter(rs.getInt("TrainersID"),rs.getString("TrainersFname"),rs.getString("TrainersLname"),rs.getInt("CoursesID"),rs.getString("Title"));
                l.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return l;

    }
    public List<AssignmentsPerCourseQuerySetter> getAssignmentsperCourseQuery() {
        String sql = "select AssignmentsID,description,CoursesID,type from assignments as a\n" +
                "inner join assignmentspercourse as apc on apc.ApcAssignmentsID = a.AssignmentsID\n" +
                "inner join courses as c on c.CoursesID = apc.ApcCoursesID;\n";
        Connection conn = getConnection();
        List<AssignmentsPerCourseQuerySetter> l = new ArrayList<AssignmentsPerCourseQuerySetter>();
        try {
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                AssignmentsPerCourseQuerySetter a = new AssignmentsPerCourseQuerySetter(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
                l.add(a);
            }
            rs.close();
            closeConnection();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return l;

    }
    //--------------------------------------------------------------------------//

    //lists? or tables?//
    public void getListOfStudents() {
        List<Students> studentsList = new ArrayList<Students>();
        String query = "select * from students";
        try {
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Students s = new Students(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
                studentsList.add(s);
            }
            rs.close();
            st.close();
            closeConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }
         for(Students s : studentsList) {
             System.out.println(s);
         }
        }
        public void getListOfTrainers() {
            List<Trainers> trainersList = new ArrayList<Trainers>();
            String sql = "select * from trainers;";
            Statement st = null;
            try {
                st = getConnection().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    Trainers t = new Trainers(rs.getInt("TrainersID"), rs.getString("TrainersFname"), rs.getString("TrainersLname"), rs.getString("TrainersSubject"));
                    trainersList.add(t);
                }
                rs.close();
                st.close();
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            for (Trainers t : trainersList) {
                System.out.println(t);
            }
        }
        //***********************************************************************************************************************************
        public List<StudentPerCourseDao>  getListOfStudentsPerCourseID(int id) {
        List<StudentPerCourseDao> s = new ArrayList<StudentPerCourseDao>();
            String query = "select CoursesID,Fname,Lname,Title,coursePerStudentID from students as s inner join courseperstudent as cps on cps.cpsstudentID = s.StudentsID inner join courses as c on c.CoursesID = cps.cpscourseID where c.CoursesID = ?";
            Connection conn = getConnection();
            PreparedStatement pst = null;
            ResultSet rs = null;
            try {
                pst = conn.prepareStatement(query);
                pst.setInt(1,id);
                rs = pst.executeQuery();
                while(rs.next()){

                    StudentPerCourseDao d = new StudentPerCourseDao(rs.getInt("CoursesID"), rs.getString("Fname"), rs.getString("Lname"), rs.getString("Title"), rs.getInt("coursePerStudentID"));
                    s.add(d);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    rs.close();
                    pst.close();
                    closeConnection();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return s;
//**************************************************************************************************************************************
        }
        public List<TrainersListOfCoursesByID> getListOfCoursesPerTrainerID(int id) {
        List<TrainersListOfCoursesByID> t = new ArrayList<TrainersListOfCoursesByID>();
        String sql = "select TrainersFname,TrainersLname,CoursesID,Stream,Title,Type,Startdate,Enddate from trainers as t\n" +
                "inner join trainerspercourse as tpc on tpc.TpcTrainersID = t.TrainersID\n" +
                "inner join courses as c on c.CoursesID = tpc.TpcCoursesID where TrainersID = ?";
        Connection conn = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

            try {
                pst = conn.prepareStatement(sql);
                pst.setInt(1,id);
                rs = pst.executeQuery();
                while(rs.next()) {
                    TrainersListOfCoursesByID a = new TrainersListOfCoursesByID(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
                    t.add(a);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                rs.close();
                closeConnection();
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return t;
        }

        public List<TrainersPerCourseQuerySetter> getListOfTrainersPerCourseID(int id) {
        List<TrainersPerCourseQuerySetter> t = new ArrayList<TrainersPerCourseQuerySetter>();
        String sql =" select TrainersID,TrainersFname,TrainersLname,CoursesID,Title from trainers as t inner join trainerspercourse as tpc on tpc.TpcTrainersID = t.TrainersID inner join courses as c on c.CoursesID = tpc.TpcCoursesID  where c.CoursesID = ?";
        Connection conn = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

            try {
                pst = conn.prepareStatement(sql);
                pst.setInt(1,id);
                rs = pst.executeQuery();
                while(rs.next()) {
                   TrainersPerCourseQuerySetter a = new TrainersPerCourseQuerySetter(rs.getInt("TrainersID"),rs.getString("TrainersFname"),rs.getString("TrainersLname"),rs.getInt("CoursesID"),rs.getString("Title"));
                   t.add(a);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
return t;
        }
        public List<AssignmentsPerCourseQuerySetter> getListOfAssignmentsPerCourseIDQuery(int id) {
        List<AssignmentsPerCourseQuerySetter> a = new ArrayList<AssignmentsPerCourseQuerySetter>();
        String q = "select AssignmentsID,description,CoursesID,type from assignments as a\n" +
                "inner join assignmentspercourse as apc on apc.ApcAssignmentsID = a.AssignmentsID\n" +
                "inner join courses as c on c.CoursesID = apc.ApcCoursesID where c.CourseID = ?";
        Connection conn = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

            try {
                pst = conn.prepareStatement(q);
                pst.setInt(1,id);
                rs = pst.executeQuery();
                while(rs.next()){
                    AssignmentsPerCourseQuerySetter s = new AssignmentsPerCourseQuerySetter(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
                    a.add(s);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
return a;
        }
//        public List<CourseDetailsPerStudent> getListOfCoursePerStudentID(int id) {
//        List<CourseDetailsPerStudent> s = new ArrayList<CourseDetailsPerStudent>();
//        String sql = "select courseid,title,stream,type,startdate,enddate from students,courses,courseperstudent where StudentID = ?;";
//        Connection conn = getConnection();
//        PreparedStatement pst = null;
//        ResultSet rs = null;
//            try {
//                pst = conn.prepareStatement(sql);
//                pst.setInt(1,id);
//                CourseDetailsPerStudent c = new CourseDetailsPerStudent(rs.getInt("courseid"),rs.getString("title"),rs.getString("stream"),rs.getString("type"),rs.getString("startdate"),rs.getString("enddate"));
//                while(rs.next());
//
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//
//            return s;
//        }
        public  void getListOfCoursesIDs() {
        List<Courses> coursesIdList = new ArrayList<Courses>();
        String query = "select CoursesID  from courses";
            try {
                Statement st = getConnection().createStatement();
                ResultSet rs = st.executeQuery(query);
                while(rs.next()) {
                    Courses c = new Courses();
                    c.setCoursesID(rs.getInt("CoursesID"));
                    coursesIdList.add(c);
                }
                rs.close();
                st.close();
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            for(Courses c: coursesIdList) {
                System.out.println(c.getCoursesID());
            }

        }
    public void getListOfTrainersIDs() {
        List<Trainers> trainersIdList = new ArrayList<Trainers>();
        String query = "select TrainersID from trainers";
        try {
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                Trainers t = new Trainers();
                t.setTrainersID(rs.getInt("TrainersID"));
                trainersIdList.add(t);
            }
            rs.close();
            st.close();
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for(Trainers t: trainersIdList) {
            System.out.println(t.getTrainersID());
        }
    }
        public void getListOfStudentsIDs() {
        List<Students> studentsIdList = new ArrayList<Students>();
        String query = "select StudentsID from students";
            try {
                Statement st = getConnection().createStatement();
                ResultSet rs = st.executeQuery(query);
                while(rs.next()) {
                    Students s = new Students();
                    s.setStudentsID(rs.getInt("StudentsID"));
                    studentsIdList.add(s);
                }
                rs.close();
                st.close();
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            for(Students s: studentsIdList) {
                System.out.println(s.getStudentsID());
            }
        }
        public void getListOfAssignmentsIDs() {
        List<Assignments> assignmentsIdList = new ArrayList<Assignments>();
        String query = "select AssignmentsID from assignments";
            try {
                Statement st = getConnection().createStatement();
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    Assignments a = new Assignments();
                    a.setAssignmentsID(rs.getInt("AssignmentsID"));
                    assignmentsIdList.add(a);
                }
                rs.close();
                st.close();
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }for(Assignments a: assignmentsIdList) {
                System.out.println(a.getAssignmentsID());
            }
        }
        public void  getListOfCourses() {
        List<Courses> CoursesList = new ArrayList<Courses>();
        String query = "select * from courses";

            try {
                Statement st =getConnection().createStatement();
                ResultSet rs = st.executeQuery(query);
                while(rs.next()) {
                    Courses c = new Courses(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                    CoursesList.add(c);
                }
                rs.close();
                st.close();
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            for(Courses c : CoursesList) {
                System.out.println(c);
            }
        }
        public void  getAssignmentsList() {
        List<Assignments> assignmentsList = new ArrayList<Assignments>();
        String query ="select * from assignments";
            try {
                Statement st = getConnection().createStatement();
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    Assignments a = new Assignments(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getDouble(5),rs.getString(6));
                    assignmentsList.add(a);
                }
                rs.close();
                st.close();
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            for(Assignments a: assignmentsList) {
                System.out.println(a);
            }

            }


//        public void getListOfStudentsPerCourse() {
//        List<StudentsPerCourse> studentsPerCoursesList = new ArrayList<StudentsPerCourse>();
//        String query = "select lname,fname,title,stream, Type,StudentsperCourseID\n" +
//                " from students s,courses c ,studentspercourse spc\n" +
//                "where s.studentsid = spc.studentid\n" +
//                "and c.coursesid = spc.courseid";
//            try {
//                Statement st = getConnection().createStatement();
//                ResultSet rs = st.executeQuery(query);
//
//
//                while(rs.next())
//                {
//                    StudentsPerCourse spc = new StudentsPerCourse();
//                    studentsPerCoursesList.add(spc);
//                    Stu
//                    rs.getString("lname")
//                }
//                rs.close();
//                st.close();
//                closeConnection();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            for(StudentsPerCourse spc : studentsPerCoursesList) {
//                System.out.println(spc);
//            }
//
//        }

    }








