package libraryService;

import ConnectionUtility.ConnectToJDBC;
import libraryDao.LoansDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LoanService implements  LoanInterface{
    static Connection con = null;
    static Statement st = null;
    static PreparedStatement prSt = null;

    public   boolean bookLoan(LoansDAO loansDAO) throws SQLException {
        con = ConnectToJDBC.getConnections();
        System.out.println("Book Loan METHOD ENTERED");
        String query = "INSERT INTO LOANS (book_id,member_id,loan_date,return_date,fine_amount) VALUES (?,?,?,?,?);";
        prSt = con.prepareStatement(query);
        prSt.setInt(1,loansDAO.getBookId());
        prSt.setInt(2,loansDAO.getMemberId());
        prSt.setDate(3,loansDAO.getLoanDate());
        prSt.setDate(4,loansDAO.getReturnDate());
        prSt.setDouble(5,loansDAO.getFineAmount());

        int result = prSt.executeUpdate();
        return result==1;
    }

    public  List<LoansDAO> viewAllBookLoans() throws SQLException {
        List<LoansDAO> loans = new ArrayList<>();
        try (Connection con = ConnectToJDBC.getConnections()) {
            String query = "SELECT * FROM LOANS";
            try (PreparedStatement prSt = con.prepareStatement(query)) {
                try (ResultSet rs = prSt.executeQuery()) {
                    while (rs.next()) {
                        int bookID = rs.getInt("book_id");
                        int memberID = rs.getInt("member_id");
                        java.sql.Date loanDate = rs.getDate("loan_date");
                        java.sql.Date returnDate = rs.getDate("return_date");
                        double fineAmount = rs.getDouble("fine_amount");

                        LoansDAO loan = new LoansDAO(bookID, memberID, loanDate, returnDate, fineAmount);
                        loans.add(loan);
                    }
                }
            }
        }
        return loans;
    }

    public  LoansDAO viewBookLoanByBookID(int id) throws SQLException {
        LoansDAO loan = null;
        try (Connection con = ConnectToJDBC.getConnections()) {
            String query = "SELECT * FROM LOANS WHERE book_id = ?";
            try (PreparedStatement prSt = con.prepareStatement(query)) {
                prSt.setInt(1, id);
                try (ResultSet rs = prSt.executeQuery()) {
                    if (rs.next()) {
                        int bookID = rs.getInt("book_id");
                        int memberID = rs.getInt("member_id");
                        java.sql.Date loanDate = rs.getDate("loan_date");
                        java.sql.Date returnDate = rs.getDate("return_date");
                        double fineAmount = rs.getDouble("fine_amount");

                        loan = new LoansDAO(bookID, memberID, loanDate, returnDate, fineAmount);
                    }
                }
            }
        }
        return loan;
    }

    public  List<LoansDAO> viewBookLoanByMemberID(int id) throws SQLException {
        List<LoansDAO> loans = new ArrayList<>();
        try (Connection con = ConnectToJDBC.getConnections()) {
            String query = "SELECT * FROM LOANS WHERE member_id = ?";
            try (PreparedStatement prSt = con.prepareStatement(query)) {
                prSt.setInt(1, id);
                try (ResultSet rs = prSt.executeQuery()) {
                    while (rs.next()) {
                        int bookID = rs.getInt("book_id");
                        int memberID = rs.getInt("member_id");
                        java.sql.Date loanDate = rs.getDate("loan_date");
                        java.sql.Date returnDate = rs.getDate("return_date");
                        double fineAmount = rs.getDouble("fine_amount");

                        LoansDAO loan = new LoansDAO(bookID, memberID, loanDate, returnDate, fineAmount);
                        loans.add(loan);
                    }
                }
            }
        }
        return loans;
    }


    public  boolean deleteBookLoanByBookID(int id) throws SQLException {
        try (Connection con = ConnectToJDBC.getConnections()) {
            String query = "DELETE FROM LOANS WHERE book_id = ?";
            try (PreparedStatement prSt = con.prepareStatement(query)) {
                prSt.setInt(1, id);
                int result = prSt.executeUpdate();
                return result > 0;
            }
        }
    }

    public  boolean deleteBookLoanByMemberID(int id) throws SQLException {
        try (Connection con = ConnectToJDBC.getConnections()) {
            String query = "DELETE FROM LOANS WHERE member_id = ?";
            try (PreparedStatement prSt = con.prepareStatement(query)) {
                prSt.setInt(1, id);
                int result = prSt.executeUpdate();
                return result > 0;
            }
        }
    }

}
