package com.day6;

public class Student {
    private String studentName;
    private String studentAge;
    private School school;
    private Subject subject;

    public Student() {
    }

    public Student(String studentName, Subject subject, School school, String studentAge) {
        this.studentName = studentName;
        this.subject = subject;
        this.school = school;
        this.studentAge = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentAge='" + studentAge + '\'' +
                ", school=" + school +
                ", subject=" + subject +
                '}';
    }
}
