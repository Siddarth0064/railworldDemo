package com.day10.interfaceType;

import java.io.Serializable;

public class StudentPojoClass implements StudentInterface, Serializable,Comparable<StudentPojoClass> {
    private int rollNo;
    private String name;
    private int marks;

    public StudentPojoClass(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public StudentPojoClass(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int rollNo() {
        return getRollNo();
    }

    @Override
    public String display() {
        return getName();
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(StudentPojoClass std) {
        if (marks==std.marks){
            return 0;
        }else if (marks<std.marks){
            return -1;
        }
            return 1;

    }
}
