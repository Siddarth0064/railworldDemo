package com.day12.EmployeeList;

import java.io.Serializable;
import java.util.Comparator;

public class EmployeeSorting implements Comparator<EmployeeClass> {


    @Override
    public int compare(EmployeeClass emp1, EmployeeClass emp2) {
        return emp1.getEmpName().compareTo(emp2.getEmpName());
    }
}
