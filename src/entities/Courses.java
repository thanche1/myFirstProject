package entities;

import Dao.HeadmasterDao;

import java.util.ArrayList;
import java.util.List;

public class Courses {
    private int  CoursesID;
    private String Title;
    private String Stream;
    private String Type;
    private String Startdate;
    private String Enddate;

    public Courses(int coursesID, String title, String stream, String type, String startdate, String enddate) {
        CoursesID = coursesID;
        Title = title;
        Stream = stream;
        Type = type;
        Startdate = startdate;
        Enddate = enddate;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "CoursesID='" + CoursesID + '\'' +
                ", Title='" + Title + '\'' +
                ", Stream='" + Stream + '\'' +
                ", Type='" + Type + '\'' +
                ", Startdate='" + Startdate + '\'' +
                ", Enddate='" + Enddate + '\'' +
                '}';
    }

    public Courses() {

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

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getStartdate() {
        return Startdate;
    }

    public void setStartdate(String startdate) {
        Startdate = startdate;
    }

    public String getEnddate() {
        return Enddate;
    }

    public void setEnddate(String enddate) {
        Enddate = enddate;
    }

    }


