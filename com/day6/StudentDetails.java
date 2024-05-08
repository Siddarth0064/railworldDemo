package com.day6;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Student std = new Student();
        Scanner scan = new Scanner(System.in);
        std.setStudentName(scan.nextLine());
        std.setStudentAge(scan.nextLine());

        School sch = new School("sadvidya","mysore");
        Subject sub = new Subject("maths");

        std.setSchool(sch);
        std.setSubject(sub);

        System.out.println(std);

    }
}
