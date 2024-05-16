package com.day12.EmployeeList;

public class EmployeeClass {
    private String empName;
    private int empID;
    private String empRole;

    public EmployeeClass(String empName, String empRole, int empID) {
        this.empName = empName;
        this.empRole = empRole;
        this.empID = empID;
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

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "empName='" + empName + '\'' +
                ", empID=" + empID +
                ", empRole='" + empRole + '\'' +
                '}';
    }
}
