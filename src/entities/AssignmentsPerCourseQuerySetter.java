package entities;

public class AssignmentsPerCourseQuerySetter {
    private int AssignmentsID;
    private String description;
    private int CoursesID;
    private String type;

    @Override
    public String toString() {
        return "Assignments per Course{" +
                "AssignmentsID=" + AssignmentsID +
                ", description='" + description + '\'' +
                ", CoursesID=" + CoursesID +
                ", type='" + type + '\'' +
                '}';
    }
    public AssignmentsPerCourseQuerySetter() {

    }

    public int getAssignmentsID() {
        return AssignmentsID;
    }

    public void setAssignmentsID(int assignmentsID) {
        AssignmentsID = assignmentsID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCoursesID() {
        return CoursesID;
    }

    public void setCoursesID(int coursesID) {
        CoursesID = coursesID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AssignmentsPerCourseQuerySetter(int assignmentsID, String description, int coursesID, String type) {
        AssignmentsID = assignmentsID;
        this.description = description;
        CoursesID = coursesID;
        this.type = type;
    }
}
