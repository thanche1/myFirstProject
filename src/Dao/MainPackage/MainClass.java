package Dao.MainPackage;

import Dao.HeadmasterDao;
import Menu.UserPass;
import entities.*;
import Menu.SchoolMenu;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HeadmasterDao hdao = new HeadmasterDao();
        Scanner sc = new Scanner(System.in);
        Headmaster h = new Headmaster();
        StudentPerCourseDao a = new StudentPerCourseDao();
        TrainersLogging t = new TrainersLogging();
        TrainersPerCourseQuerySetter l = new TrainersPerCourseQuerySetter();
        AssignmentsPerCourseQuerySetter u = new AssignmentsPerCourseQuerySetter();
        TrainersListOfCoursesByID k = new TrainersListOfCoursesByID();
ScheduleperDay s = new ScheduleperDay();

//        System.out.println(hdao.getScheduleperdayPerStudentID(2));

            SchoolMenu.menu(sc);
















//        System.out.println(hdao.getStudentsPerCourse(8));
//        System.out.println(hdao.getAssignmentsPerStudentId(1));
//        hdao.insertAssingmentsPerStudent(1,2,3);
//        System.out.println(hdao.getAssignmentsPerCourse(2));
//        System.out.println(hdao.getAssignmentsPerCourse(1));
//        System.out.println(hdao.getAssignmentsPerCourse(4));



//        System.out.println(hdao.getStudentById(1));
//        System.out.println(hdao.getStudentById(2));
//        System.out.println(hdao.getCoursesById(1));
//        System.out.println(hdao.getTrainersById(1));
//        System.out.println(hdao.getAssignmentByID(2));

//
//     hdao.insertassignmentspercourse(1,2,3);
//        hdao.deleteTrainersPerCourse(7);
//        hdao.deleteAssignmentsPerStudent(2);
//        hdao.deleteAssignmentsPerCourse(1);
//        hdao.deleteStudentsPerCourse(1);
//        hdao.deleteAssignment(1);
//          hdao.deleteTrainer(2);
//        hdao.deletecourse(2);
//        hdao.deleteStudent(2);
//        hdao.insertStudent(2,"Than","Tsele","12-11-1991",2400);
//        hdao.insertassignmentspercourseperstudent(3,2,3);
//        hdao.updateTrainersPerCourse(1,3,2);
//        hdao.updateAssignmentsPerCourse(1,2,5);
//        hdao.updateAssignmentsPerCourse(1,2,4);
//        hdao.updatecourses(1,"Programming","Python","Full time","20-5-2019","29-5-2019");
//        hdao.updatetrainers(1,"John","Doe","Programming");
//        hdao.updateStudent(1,"Bob","Marley","12/11/1991",1400);
//        hdao.updatecourses(1,"Programming","Python","Full time","20-3-2019","27-3-2019");
//        hdao.insertAssingmentsPerStudent(17,1,1);
//        hdao.insertAssingmentsPerStudent(1,1,1);
//        hdao.insertTrainersPerCourse(11,3,1);
//        hdao.insertStudentsPerCourse(19,10,4);
//        hdao.insertCourse(6,"mathematics","one","Python","12/11/1991","12/12/1991");
//        hdao.insertAssignment(6, "enadyotria", "test desc", 10, 10, "12/11/1991");
    }
}