package com.day17.Controller;

import com.day17.service.CRUDOpperations;

import java.sql.SQLException;

public class AccessToDB {
    public static void main(String[] args) throws SQLException {

        CRUDOpperations.getAllStudents();

        System.out.println("==================================================");

        CRUDOpperations.getStudentByID(1);

        System.out.println("==================================================");

        CRUDOpperations.insertStudnet(3,"Keerthi",1,2);

        System.out.println("==================================================");

        CRUDOpperations.deleteStudentByID(3);

        System.out.println("==================================================");

        CRUDOpperations.getAllStudents();

        System.out.println("==================================================");

    }
}
