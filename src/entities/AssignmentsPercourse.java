package entities;

public class AssignmentsPercourse {
   private int AssignmentsperCourseID;
   private int ApcAssignmentsID;
   private int ApcCoursesID;

    public AssignmentsPercourse(int assignmentsperCourseID, int apcAssignmentsID, int apcCoursesID) {
        AssignmentsperCourseID = assignmentsperCourseID;
        ApcAssignmentsID = apcAssignmentsID;
        ApcCoursesID = apcCoursesID;
    }
    public AssignmentsPercourse() {

    }

    @Override
    public String toString() {
        return "AssignmentsPercourse{" +
                "AssignmentsperCourseID=" + AssignmentsperCourseID +
                ", ApcAssignmentsID=" + ApcAssignmentsID +
                ", ApcCoursesID=" + ApcCoursesID +
                '}';
    }

    public int getAssignmentsperCourseID() {
        return AssignmentsperCourseID;
    }

    public void setAssignmentsperCourseID(int assignmentsperCourseID) {
        AssignmentsperCourseID = assignmentsperCourseID;
    }

    public int getApcAssignmentsID() {
        return ApcAssignmentsID;
    }

    public void setApcAssignmentsID(int apcAssignmentsID) {
        ApcAssignmentsID = apcAssignmentsID;
    }

    public int getApcCoursesID() {
        return ApcCoursesID;
    }

    public void setApcCoursesID(int apcCoursesID) {
        ApcCoursesID = apcCoursesID;
    }
}
