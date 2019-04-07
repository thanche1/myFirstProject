package entities;

public class TrainersPerCourse {
    private int TrainersPerCourseID;
    private int TpcTrainersID;
    private int TpcCoursesID;


    @Override
    public String toString() {
        return "Trainers per Course{" +
                "Trainers per Course ID=" + TrainersPerCourseID +
                ", TpcTrainersID=" + TpcTrainersID +
                ", TpcCoursesID=" + TpcCoursesID +
                '}';
    }

    public TrainersPerCourse() {

    }
    public TrainersPerCourse(int trainersPerCourseID, int tpcTrainersID, int tpcCoursesID) {
        TrainersPerCourseID = trainersPerCourseID;
        TpcTrainersID = tpcTrainersID;
        TpcCoursesID = tpcCoursesID;
    }

    public int getTrainersPerCourseID() {
        return TrainersPerCourseID;
    }

    public void setTrainersPerCourseID(int trainersPerCourseID) {
        TrainersPerCourseID = trainersPerCourseID;
    }

    public int getTpcTrainersID() {
        return TpcTrainersID;
    }

    public void setTpcTrainersID(int tpcTrainersID) {
        TpcTrainersID = tpcTrainersID;
    }

    public int getTpcCoursesID() {
        return TpcCoursesID;
    }

    public void setTpcCoursesID(int tpcCoursesID) {
        TpcCoursesID = tpcCoursesID;
    }
}
