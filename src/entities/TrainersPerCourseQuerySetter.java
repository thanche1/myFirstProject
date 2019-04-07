package entities;

public class TrainersPerCourseQuerySetter {
    private int TrainersID;
    private String TrainersFname;
    private String TranersLname;
    private int CoursesID;
    private String Title;

    public TrainersPerCourseQuerySetter() {

    }

    public TrainersPerCourseQuerySetter(int trainersID, String trainersFname, String tranersLname, int coursesID, String title) {
        TrainersID = trainersID;
        TrainersFname = trainersFname;
        TranersLname = tranersLname;
        CoursesID = coursesID;
        Title = title;
    }

    @Override
    public String toString() {
        return
                "TrainersID=" + TrainersID +
                ", TrainersFname='" + TrainersFname + '\'' +
                ", TranersLname='" + TranersLname + '\'' +
                ", CoursesID=" + CoursesID +
                ", Title='" + Title + '\'' +
                '}';
    }

    public int getTrainersID() {
        return TrainersID;
    }

    public void setTrainersID(int trainersID) {
        TrainersID = trainersID;
    }

    public String getTrainersFname() {
        return TrainersFname;
    }

    public void setTrainersFname(String trainersFname) {
        TrainersFname = trainersFname;
    }

    public String getTranersLname() {
        return TranersLname;
    }

    public void setTranersLname(String tranersLname) {
        TranersLname = tranersLname;
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
}
