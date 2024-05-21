package com.day12.EmployeeList;

import java.util.Comparator;

public class EmployeeSorting implements Comparator<EmployeeOBJ> {


    @Override
    public int compare(EmployeeOBJ emp1, EmployeeOBJ emp2) {
        return emp1.getEmpName().compareTo(emp2.getEmpName());
    }
}
