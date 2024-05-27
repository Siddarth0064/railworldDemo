package libraryService;

import ConnectionUtility.ConnectToJDBC;
import libraryDao.ReservationsDAO;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ReservationService implements  ReservationInterface {
    static Connection con = null;
    static Statement st = null;
   static  PreparedStatement prSt = null;

    public  boolean reservBook(ReservationsDAO reservationsDAO) throws SQLException {
        con = ConnectToJDBC.getConnections();
        System.out.println("reserve Book METHOD ENTERED");
        String query = "INSERT INTO RESERVATIONS (book_id,member_id,reservation_date) VALUES (?,?,?);";
        prSt = con.prepareStatement(query);
        prSt.setInt(1,reservationsDAO.getBookID());
        prSt.setInt(2,reservationsDAO.getMemberID());
        prSt.setDate(3,reservationsDAO.getReservationDate());

        int result = prSt.executeUpdate();
        return result==1;
    }
    public  List<ReservationsDAO> viewAllReservedBooks() throws SQLException {
        List<ReservationsDAO> reservations = new ArrayList<>();
        try (Connection con = ConnectToJDBC.getConnections()) {
            String query = "SELECT * FROM RESERVATIONS";
            try (PreparedStatement prSt = con.prepareStatement(query)) {
                try (ResultSet rs = prSt.executeQuery()) {
                    while (rs.next()) {
                        int bookID = rs.getInt("book_id");
                        int memberID = rs.getInt("member_id");
                        java.sql.Date reservationDate = rs.getDate("reservation_date");

                        ReservationsDAO reservation = new ReservationsDAO(bookID, memberID, reservationDate);
                        reservations.add(reservation);
                    }
                }
            }
        }
        return reservations;
    }
    public  ReservationsDAO viewReservedBookByID(int id) throws SQLException {
        ReservationsDAO reservation = null;
        try (Connection con = ConnectToJDBC.getConnections()) {
            String query = "SELECT * FROM RESERVATIONS WHERE book_id = ?";
            try (PreparedStatement prSt = con.prepareStatement(query)) {
                prSt.setInt(1, id);
                try (ResultSet rs = prSt.executeQuery()) {
                    if (rs.next()) {
                        int bookID = rs.getInt("book_id");
                        int memberID = rs.getInt("member_id");
                        java.sql.Date reservationDate = rs.getDate("reservation_date");

                        reservation = new ReservationsDAO(bookID, memberID, reservationDate);
                    }
                }
            }
        }
        return reservation;
    }
    public  List<ReservationsDAO> viewReservedBookByMemberID(int id) throws SQLException {
        List<ReservationsDAO> reservations = new ArrayList<>();
        try (Connection con = ConnectToJDBC.getConnections()) {
            String query = "SELECT * FROM RESERVATIONS WHERE member_id = ?";
            try (PreparedStatement prSt = con.prepareStatement(query)) {
                prSt.setInt(1, id);
                try (ResultSet rs = prSt.executeQuery()) {
                    while (rs.next()) {
                        int bookID = rs.getInt("book_id");
                        int memberID = rs.getInt("member_id");
                        java.sql.Date reservationDate = rs.getDate("reservation_date");

                        ReservationsDAO reservation = new ReservationsDAO(bookID, memberID, reservationDate);
                        reservations.add(reservation);
                    }
                }
            }
        }
        return reservations;
    }

    public  boolean deleteReservedBookByBookID(int id) throws SQLException {
        try (Connection con = ConnectToJDBC.getConnections()) {
            String query = "DELETE FROM RESERVATIONS WHERE book_id = ?";
            try (PreparedStatement prSt = con.prepareStatement(query)) {
                prSt.setInt(1, id);
                int result = prSt.executeUpdate();
                return result > 0;
            }
        }
    }







}
