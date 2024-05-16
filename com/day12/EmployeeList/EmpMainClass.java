package com.day12.EmployeeList;

import java.util.*;

public class EmpMainClass  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<EmployeeClass> emp = new ArrayList<EmployeeClass>( );

        System.out.println("Enter EMP Name, EMP ID, EMP Role");
        String empName = scan.next();
        int empID = scan.nextInt();
        String empROle = scan.next();

        EmployeeClass employeeObj1 = new EmployeeClass(empName,empROle,empID);

        emp.add(employeeObj1);
        emp.add(new EmployeeClass("Bavana","Testing",2));
        emp.add(new EmployeeClass("Charan","Testing",3));
        emp.add(new EmployeeClass("Deepa","Testing",4));
        emp.add(new EmployeeClass("Farhan","Testing",5));

        System.out.println(emp);

        Collections.sort(emp, new EmployeeSorting());
        System.out.println("Sorted list by name:");

        for (int i = 0; i < emp.size(); i++) {
            EmployeeClass emps = emp.get(i);
            System.out.print(emps.getEmpName() + " " + emps.getEmpID() + " " + emps.getEmpRole());
            System.out.println();
        }

        EmployeeClass employeObk2 = new EmployeeClass("","",19);
        Set<EmployeeClass> empobj1 =new HashSet<EmployeeClass>();
        empobj1.add(employeObk2);
        System.out.println(empobj1);


    }
}
