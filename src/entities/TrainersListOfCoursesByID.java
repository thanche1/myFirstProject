package entities;

public class TrainersListOfCoursesByID {
    private String TrainersFname;
    private String TrainersLname;
    private int CoursesID;
    private String Stream;
    private String Title;
    private String Type;
    private String Startdate;
    private String Enddate;

    public String getTrainersFname() {
        return TrainersFname;
    }

    @Override
    public String toString() {
        return
                "Trainers First name='" + TrainersFname + '\'' +
                ", Trainers Last name='" + TrainersLname + '\'' +
                ", CoursesID=" + CoursesID +
                ", Stream='" + Stream + '\'' +
                ", Title='" + Title + '\'' +
                ", Type='" + Type + '\'' +
                ", Startdate='" + Startdate + '\'' +
                ", Enddate='" + Enddate + '\'' +
                '}';
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

    public int getCoursesID() {
        return CoursesID;
    }

    public void setCoursesID(int coursesID) {
        CoursesID = coursesID;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
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

    public TrainersListOfCoursesByID() {

    }

    public TrainersListOfCoursesByID(String trainersFname, String trainersLname, int coursesID, String stream, String title, String type, String startdate, String enddate) {
        TrainersFname = trainersFname;
        TrainersLname = trainersLname;
        CoursesID = coursesID;
        Stream = stream;
        Title = title;
        Type = type;
        Startdate = startdate;
        Enddate = enddate;
    }
}
