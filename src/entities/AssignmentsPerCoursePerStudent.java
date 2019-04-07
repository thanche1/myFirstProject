package entities;

public class AssignmentsPerCoursePerStudent {
    private int AssignmentspercourseperstudentID;
    private int ApcpsApcID;
    private int ApcpsApsID;


    @Override
    public String toString() {
        return "AssignmentsPerCoursePerStudent{" +
                "AssignmentspercourseperstudentID=" + AssignmentspercourseperstudentID +
                ", ApcpsApcID=" + ApcpsApcID +
                ", ApcpsApsID=" + ApcpsApsID +
                '}';
    }

    public AssignmentsPerCoursePerStudent(int assignmentspercourseperstudentID, int apcpsApcID, int apcpsApsID) {
        AssignmentspercourseperstudentID = assignmentspercourseperstudentID;
        ApcpsApcID = apcpsApcID;
        ApcpsApsID = apcpsApsID;
    }

    public int getAssignmentspercourseperstudentID() {
        return AssignmentspercourseperstudentID;
    }

    public void setAssignmentspercourseperstudentID(int assignmentspercourseperstudentID) {
        AssignmentspercourseperstudentID = assignmentspercourseperstudentID;
    }

    public int getApcpsApcID() {
        return ApcpsApcID;
    }

    public void setApcpsApcID(int apcpsApcID) {
        ApcpsApcID = apcpsApcID;
    }

    public int getApcpsApsID() {
        return ApcpsApsID;
    }

    public void setApcpsApsID(int apcpsApsID) {
        ApcpsApsID = apcpsApsID;
    }
}
