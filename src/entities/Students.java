package entities;

import Dao.HeadmasterDao;


import java.util.List;

public class Students {
    private int StudentsID;
    private String Fname;
    private String Lname;
    private String DOB;
    private int Fees;

    public Students() {

    }

    public Students(int studentsID, String fname, String lname, String DOB, int fees) {
        StudentsID = studentsID;
        Fname = fname;
        Lname = lname;
        this.DOB = DOB;
        Fees = fees;
    }

    @Override
    public String toString() {
        return
                "StudentsID=" + StudentsID +
                ", First name='" + Fname + '\'' +
                ", Last name='" + Lname + '\'' +
                ", Date of birth='" + DOB + '\'' +
                ", Fees=" + Fees +
                '}';
    }

    public int getStudentsID() {
        return StudentsID;
    }

    public void setStudentsID(int studentsID) {
        StudentsID = studentsID;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getFees() {
        return Fees;
    }

    public void setFees(int fees) {
        Fees = fees;
    }

    }

