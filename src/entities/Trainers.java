package entities;

import Dao.HeadmasterDao;

import java.util.List;

public class Trainers {
    private int TrainersID;
    private String TrainersFname;
    private String TrainersLname;
    private String TrainersSubject;

    public Trainers(int trainersID, String trainersFname, String trainersLname, String trainersSubject) {
        TrainersID = trainersID;
        TrainersFname = trainersFname;
        TrainersLname = trainersLname;
        TrainersSubject = trainersSubject;
    }

    @Override
    public String toString() {
        return "Trainers{" +
                "Trainers ID=" + TrainersID +
                ", Trainers First name='" + TrainersFname + '\'' +
                ", Trainers Last name='" + TrainersLname + '\'' +
                ", Trainers Subject='" + TrainersSubject + '\'' +
                '}';
    }

    public Trainers() {

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

    public String getTrainersLname() {
        return TrainersLname;
    }

    public void setTrainersLname(String trainersLname) {
        TrainersLname = trainersLname;
    }

    public String getTrainersSubject() {
        return TrainersSubject;
    }

    public void setTrainersSubject(String trainersSubject) {
        TrainersSubject = trainersSubject;
    }

}
