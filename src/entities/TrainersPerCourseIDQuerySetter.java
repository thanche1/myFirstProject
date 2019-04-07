package entities;

public class TrainersPerCourseIDQuerySetter {
    public int TrainersPerCourseID;

    public TrainersPerCourseIDQuerySetter(int trainersPerCourseID) {
        TrainersPerCourseID = trainersPerCourseID;
    }
    public TrainersPerCourseIDQuerySetter() {

    }

    @Override
    public String toString() {
        return
                "TrainersPerCourseID=" + TrainersPerCourseID +
                '}';
    }

    public int getTrainersPerCourseID() {
        return TrainersPerCourseID;
    }

    public void setTrainersPerCourseID(int trainersPerCourseID) {
        TrainersPerCourseID = trainersPerCourseID;
    }
}
