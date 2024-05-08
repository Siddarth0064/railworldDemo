package com.day6;

public class School {
    private String SchoolName;
    private String SchoolAddras;

    public School(String schoolName, String schoolAddras) {
        this.SchoolName = schoolName;
       this.SchoolAddras = schoolAddras;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public String getSchoolAddras() {
        return SchoolAddras;
    }

    public void setSchoolAddras(String schoolAddras) {
        SchoolAddras = schoolAddras;
    }

    @Override
    public String toString() {
        return "School{" +
                "SchoolName='" + SchoolName + '\'' +
                ", SchoolAddras='" + SchoolAddras + '\'' +
                '}';
    }
}
