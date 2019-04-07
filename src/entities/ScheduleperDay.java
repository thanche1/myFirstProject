package entities;

public class ScheduleperDay {
    private String idscheduleperCourse;
    private String mondayCourses;
    private String tuesday;
    private String wednesday;
    private String thursday;
    private String friday;
    private int studentsScheduleID;
    public ScheduleperDay () {

    }

    @Override
    public String toString() {
        return "Weekly schedule :" +
                " Monday='" + mondayCourses + '\'' +
                ", Tuesday='" + tuesday + '\'' +
                ", Wednesday='" + wednesday + '\'' +
                ", Thursday='" + thursday + '\'' +
                ", Friday='" + friday + '\'' +
                ", Students ID=" + studentsScheduleID +
                '}';
    }

    public ScheduleperDay(String idscheduleperCourse, String mondayCourses, String tuesday, String wednesday, String thursday, String friday, int studentsScheduleID) {
        this.idscheduleperCourse = idscheduleperCourse;
        this.mondayCourses = mondayCourses;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.studentsScheduleID = studentsScheduleID;
    }

    public String getIdscheduleperCourse() {
        return idscheduleperCourse;
    }

    public void setIdscheduleperCourse(String idscheduleperCourse) {
        this.idscheduleperCourse = idscheduleperCourse;
    }

    public String getMondayCourses() {
        return mondayCourses;
    }

    public void setMondayCourses(String mondayCourses) {
        this.mondayCourses = mondayCourses;
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }

    public int getStudentsScheduleID() {
        return studentsScheduleID;
    }

    public void setStudentsScheduleID(int studentsScheduleID) {
        this.studentsScheduleID = studentsScheduleID;
    }
}
