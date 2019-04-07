package entities;

public class StudentPerCourseDao {
    private int CoursesID;
    private String Fname;
    private String Lname;
    private String Title;
    private int coursePerStudentID;
    private int Studentsid;
    private String Type;
    private String Stream;



    @Override
    public String toString() {
        return "Courses ID=" + CoursesID +
                ", First name='" + Fname + '\'' +
                ", Last name='" + Lname + '\'' +
                ", Title='" + Title + '\'' +
                ", course per student ID=" + coursePerStudentID +
                '}';
    }

    public StudentPerCourseDao(int coursesID, String fname, String lname, String title, int coursePerStudentID, int studentsid, String type, String stream, int studentsperCourseid) {
        this.CoursesID = coursesID;
        this.Fname = fname;
        this.Lname = lname;
        this.Title = title;
        this.coursePerStudentID = coursePerStudentID;
        this.Studentsid = studentsid;
        this.Type = type;
        this.Stream = stream;
        this.StudentsperCourseid = studentsperCourseid;
    }

    public StudentPerCourseDao(int studentsID, int coursesID, String lname, String fname, String title, String stream, String type, int studentsperCourseID) {
        studentsID = studentsID;
        coursesID = coursesID;
        lname = lname;
        fname = fname;
        title = title;
        stream = stream;
        type = type;
        studentsperCourseID = studentsperCourseID;
    }

    public int getStudentsid() {
        return Studentsid;
    }

    public void setStudentsid(int studentsid) {
        Studentsid = studentsid;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }

    public int getStudentsperCourseid() {
        return StudentsperCourseid;
    }

    public void setStudentsperCourseid(int studentsperCourseid) {
        StudentsperCourseid = studentsperCourseid;
    }

    private int StudentsperCourseid;

    public StudentPerCourseDao() {

    }

    public StudentPerCourseDao(int coursesID, String fname, String lname, String title, int coursePerStudentID) {
        CoursesID = coursesID;
        Fname = fname;
        Lname = lname;
        Title = title;
        this.coursePerStudentID = coursePerStudentID;
    }

    public int getCoursesID() {
        return CoursesID;
    }

    public void setCoursesID(int coursesID) {
        CoursesID = coursesID;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getCoursePerStudentID() {
        return coursePerStudentID;
    }

    public void setCoursePerStudentID(int coursePerStudentID) {
        this.coursePerStudentID = coursePerStudentID;
    }
}
