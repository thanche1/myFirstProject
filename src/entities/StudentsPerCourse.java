package entities;

public class StudentsPerCourse {
    private int StudentsperCourseID;
    private int StudentID;
    private int courseID;

    @Override
    public String toString() {
        return "StudentsPerCourse{" +
                "StudentsperCourseID=" + StudentsperCourseID +
                ", StudentID=" + StudentID +
                ", courseID=" + courseID +
                '}';
    }
    public StudentsPerCourse() {

    }

    public StudentsPerCourse(int studentsperCourseID, int studentID, int courseID) {
        StudentsperCourseID = studentsperCourseID;
        StudentID = studentID;
        this.courseID = courseID;
    }

    public int getStudentsperCourseID() {
        return StudentsperCourseID;
    }

    public void setStudentsperCourseID(int studentsperCourseID) {
        StudentsperCourseID = studentsperCourseID;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
}