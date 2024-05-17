package com.day13;

public class StudentsOBJ {
    private String stdName;
    private int stdId;

    public StudentsOBJ(String stdName, int stdId) {
        this.stdName = stdName;
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    @Override
    public String toString() {
        return "StudentsOBJ{ stdName: "+getStdName()+" stdID: "+getStdId();
    }
}
