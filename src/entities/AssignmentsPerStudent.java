package entities;

public class AssignmentsPerStudent {
    private int AssignmentsPerStudent;
    private int ApsStudentID;
    private int ApsAssignmentid;


    public AssignmentsPerStudent() {

    }
    @Override
    public String toString() {
        return "AssignmentsPerStudent{" +
                "AssignmentsPerStudent=" + AssignmentsPerStudent +
                ", ApsStudentID=" + ApsStudentID +
                ", ApsAssignmentid=" + ApsAssignmentid +
                '}';
    }

    public AssignmentsPerStudent(int assignmentsPerStudent, int apsStudentID, int apsAssignmentid) {
        AssignmentsPerStudent = assignmentsPerStudent;
        ApsStudentID = apsStudentID;
        ApsAssignmentid = apsAssignmentid;
    }

    public int getAssignmentsPerStudent() {
        return AssignmentsPerStudent;
    }

    public void setAssignmentsPerStudent(int assignmentsPerStudent) {
        AssignmentsPerStudent = assignmentsPerStudent;
    }

    public int getApsStudentID() {
        return ApsStudentID;
    }

    public void setApsStudentID(int apsStudentID) {
        ApsStudentID = apsStudentID;
    }

    public int getApsAssignmentid() {
        return ApsAssignmentid;
    }

    public void setApsAssignmentid(int apsAssignmentid) {
        ApsAssignmentid = apsAssignmentid;
    }
}
