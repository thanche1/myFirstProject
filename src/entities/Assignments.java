package entities;

import Dao.HeadmasterDao;

import java.util.List;

public class Assignments {
    private int AssignmentsID;
    private String Title;
    private String Description;
    private double Oralmark;
    private double Totalmark;
    private String Deadline;

    @Override
    public String toString() {
        return "Assignments{" +
                "AssignmentsID=" + AssignmentsID +
                ", Title='" + Title + '\'' +
                ", Description='" + Description + '\'' +
                ", Oralmark=" + Oralmark +
                ", Totalmark=" + Totalmark +
                ", Deadline='" + Deadline + '\'' +
                '}';
    }

    public Assignments() {

    }
    public Assignments(int assignmentsID, String title, String description, double oralmark, double totalmark, String deadline) {
        AssignmentsID = assignmentsID;
        Title = title;
        Description = description;
        Oralmark = oralmark;
        Totalmark = totalmark;
        Deadline = deadline;
    }

    public int getAssignmentsID() {
        return AssignmentsID;
    }

    public void setAssignmentsID(int assignmentsID) {
        AssignmentsID = assignmentsID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getOralmark() {
        return Oralmark;
    }

    public void setOralmark(double oralmark) {
        Oralmark = oralmark;
    }

    public double getTotalmark() {
        return Totalmark;
    }

    public void setTotalmark(double totalmark) {
        Totalmark = totalmark;
    }

    public String getDeadline() {
        return Deadline;
    }

    public void setDeadline(String deadline) {
        Deadline = deadline;
    }

}


