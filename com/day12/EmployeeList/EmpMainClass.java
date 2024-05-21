package com.day12.EmployeeList;

import java.util.*;

public class EmpMainClass  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<EmployeeOBJ> emp = new ArrayList<EmployeeOBJ>( );

        System.out.println("Enter EMP Name, EMP ID, EMP Role");
        String empName = scan.next();
        int empID = scan.nextInt();
        String empROle = scan.next();

        EmployeeOBJ employeeObj1 = new EmployeeOBJ(empName,empROle,empID);

        emp.add(employeeObj1);
        emp.add(new EmployeeOBJ("Bavana","Testing",2));
        emp.add(new EmployeeOBJ("Charan","Testing",3));
        emp.add(new EmployeeOBJ("Deepa","Testing",4));
        emp.add(new EmployeeOBJ("Farhan","Testing",5));

        System.out.println(emp);

        Collections.sort(emp, new EmployeeSorting());
        System.out.println("Sorted list by name:");

        for (int i = 0; i < emp.size(); i++) {
            EmployeeOBJ emps = emp.get(i);
            System.out.print(emps.getEmpName() + " " + emps.getEmpID() + " " + emps.getEmpRole());
            System.out.println();
        }

        EmployeeOBJ employeObk2 = new EmployeeOBJ("","",19);
        Set<EmployeeOBJ> empobj1 =new HashSet<EmployeeOBJ>();
        empobj1.add(employeObk2);
        System.out.println(empobj1);


    }
}
