package com.day17.repo;


public class Employee {

    private int empID;
    private String empName;
    private int empSallary;
    private int empAge;

    public Employee(int empID, String empName, int empSallary, int empAge) {
        this.empID = empID;
        this.empName = empName;
        this.empSallary = empSallary;
        this.empAge = empAge;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSallary() {
        return empSallary;
    }

    public void setEmpSallary(int empSallary) {
        this.empSallary = empSallary;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empSallary=" + empSallary +
                ", empAge=" + empAge +
                '}';
    }
}
