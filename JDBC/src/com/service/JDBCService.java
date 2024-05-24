package com.service;

import com.module.ConnectToJDBC;

import java.sql.*;

public class JDBCService {
    static Connection con = null;
    static Statement st = null;
    static ResultSet resultSet = null;


    public static void getAllStudents() throws SQLException {
        con = ConnectToJDBC.getConnections();
        st = con.createStatement();
        String query = "select * from student";
        resultSet = st.executeQuery(query);

        while (resultSet.next()) {
            int stdId = resultSet.getInt("STD_ID");
            String stdName = resultSet.getString("STD_NAME");
            int colID = resultSet.getInt("COL_ID");
            int courseID = resultSet.getInt("COURSE_ID");
            System.out.println("STD_ID: " + stdId + ", STD_NAME: " + stdName + ",  COL_ID: " + colID + ", COURSE_ID: " + courseID);
        }
    }


    public static void getStudentByID(int id) throws SQLException {
        con = ConnectToJDBC.getConnections();
        st = con.createStatement();
        String query = "SELECT * FROM student WHERE STD_ID = " + id;
        resultSet = st.executeQuery(query);
        if (resultSet.next()) {
            int studentId = resultSet.getInt(1);  // 1st column
            String name = resultSet.getString(2);  // 2nd column
            String col_id = resultSet.getString(3);  // 3rd column
            double courseID = resultSet.getDouble(4);  // 4th column
            System.out.println("ID: " + studentId + ", Name: " + name + ", colID: " + col_id + ", CoreseID: " + courseID);
        } else {
            System.out.println("No student found with ID: " + id);
        }
    }
    public static void insertStudnet(int id, String name,int colID, int courseID) throws SQLException {
        con = ConnectToJDBC.getConnections();
        String query = "INSERT INTO student (STD_ID, STD_NAME, COL_ID, COURSE_ID) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setInt(3, colID);
        pstmt.setInt(4, courseID);

        int rowsAffected = pstmt.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Student inserted successfully!");
        } else {
            System.out.println("Failed to insert student.");
        }
        pstmt.close();
        con.close();
    }
    public static void deleteStudentByID(int id) throws SQLException {
        con = ConnectToJDBC.getConnections();
        String query = "DELETE FROM student WHERE STD_ID = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1, id);

        int rowsAffected = pstmt.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("No student found with ID: " + id);
        }
        pstmt.close();
        con.close();
    }
}
