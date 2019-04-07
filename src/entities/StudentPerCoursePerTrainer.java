package entities;

public class StudentPerCoursePerTrainer {
    private String Fname;
    private String Lname;
    private int studentsid;
    private int courseid;
    private String courseTitle;
    private String courseStream;
    private String TrainersFname;
    private String TrainersLname;


    public StudentPerCoursePerTrainer() {

    }

    public StudentPerCoursePerTrainer(String fname, String lname, int studentsid, int courseid, String courseTitle, String courseStream, String trainersFname, String trainersLname) {
        Fname = fname;
        Lname = lname;
        this.studentsid = studentsid;
        this.courseid = courseid;
        this.courseTitle = courseTitle;
        this.courseStream = courseStream;
        TrainersFname = trainersFname;
        TrainersLname = trainersLname;
    }

    @Override
    public String toString() {
        return "StudentPerCoursePerTrainer{" +
                "Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", studentsid=" + studentsid +
                ", courseid=" + courseid +
                ", courseTitle='" + courseTitle + '\'' +
                ", courseStream='" + courseStream + '\'' +
                ", TrainersFname='" + TrainersFname + '\'' +
                ", TrainersLname='" + TrainersLname + '\'' +
                '}';
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

    public int getStudentsid() {
        return studentsid;
    }

    public void setStudentsid(int studentsid) {
        this.studentsid = studentsid;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseStream() {
        return courseStream;
    }

    public void setCourseStream(String courseStream) {
        this.courseStream = courseStream;
    }

    public String getTrainersFname() {
        return TrainersFname;
    }

    public void setTrainersFname(String trainersFname) {
        TrainersFname = trainersFname;
    }

    public String getTrainersLname() {
        return TrainersLname;
    }

    public void setTrainersLname(String trainersLname) {
        TrainersLname = trainersLname;
    }
}
