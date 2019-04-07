package entities;

public class CourseDetailsPerStudent {
    private int CoursesID;
    private String Title;
    private String Stream;
    private String Type;
    private String Startdate;
    private String Enddate;
    private String StudentLname;
    private String StudentFname;
    private int studentsid;
    public CourseDetailsPerStudent() {

    }

    @Override
    public String toString() {
        return "CourseDetailsPerStudent{" +
                "CoursesID=" + CoursesID +
                ", Title='" + Title + '\'' +
                ", Stream='" + Stream + '\'' +
                ", Type='" + Type + '\'' +
                ", Startdate='" + Startdate + '\'' +
                ", Enddate='" + Enddate + '\'' +
                ", StudentLname='" + StudentLname + '\'' +
                ", StudentFname='" + StudentFname + '\'' +
                '}';
    }


    public CourseDetailsPerStudent(int coursesID, String title, String stream, String type, String startdate, String enddate, String studentLname, String studentFname) {
        CoursesID = coursesID;
        Title = title;
        Stream = stream;
        Type = type;
        Startdate = startdate;
        Enddate = enddate;
        StudentLname = studentLname;
        StudentFname = studentFname;
    }

    public int getCoursesID() {
        return CoursesID;
    }

    public void setCoursesID(int coursesID) {
        CoursesID = coursesID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getStartdate() {
        return Startdate;
    }

    public void setStartdate(String startdate) {
        Startdate = startdate;
    }

    public String getEnddate() {
        return Enddate;
    }

    public void setEnddate(String enddate) {
        Enddate = enddate;
    }

    public String getStudentLname() {
        return StudentLname;
    }

    public void setStudentLname(String studentLname) {
        StudentLname = studentLname;
    }

    public String getStudentFname() {
        return StudentFname;
    }

    public void setStudentFname(String studentFname) {
        StudentFname = studentFname;
    }
}
