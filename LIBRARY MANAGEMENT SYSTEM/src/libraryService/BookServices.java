package libraryService;

import ConnectionUtility.ConnectToJDBC;
import libraryDao.BookDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookServices implements BookInterface {
    static Connection con = null;
    static Statement st = null;
    static PreparedStatement prSt = null;


    public  Boolean createBook(BookDAO bookObj) throws SQLException {
        con = ConnectToJDBC.getConnections();
        System.out.println("CREAT BOOKING METHOD ENTERED");
        String query = "INSERT INTO BOOKS (book_id,book_title,author,publisher) VALUES (?,?,?,?);";
        prSt = con.prepareStatement(query);
        prSt.setInt(1,bookObj.getBookID());
        prSt.setString(2,bookObj.getBookTitle());
        prSt.setString(3,bookObj.getAuthor());
        prSt.setString(4,bookObj.getPublisher());
        int result = prSt.executeUpdate();
        return result==1;
    }
    public  List<BookDAO> getAllBooks() throws SQLException {
        List<BookDAO> books = new ArrayList<>();
        try (Connection con = ConnectToJDBC.getConnections()) {
            String query = "SELECT * FROM BOOKS";
            try (PreparedStatement prSt = con.prepareStatement(query)) {
                try (ResultSet rs = prSt.executeQuery()) {
                    while (rs.next()) {
                        int bookID = rs.getInt("book_id");
                        String bookTitle = rs.getString("book_title");
                        String author = rs.getString("author");
                        String publisher = rs.getString("publisher");

                        BookDAO book = new BookDAO(bookID, bookTitle, author, publisher);
                        books.add(book);
                    }
                }
            }
        }
        return books;
    }
    public  BookDAO getBookByID(int id) throws SQLException {
        BookDAO book = null;
        try (Connection con = ConnectToJDBC.getConnections()) {
            String query = "SELECT * FROM BOOKS WHERE book_id = ?";
            try (PreparedStatement prSt = con.prepareStatement(query)) {
                prSt.setInt(1, id);
                try (ResultSet rs = prSt.executeQuery()) {
                    if (rs.next()) {
                        int bookID = rs.getInt("book_id");
                        String bookTitle = rs.getString("book_title");
                        String author = rs.getString("author");
                        String publisher = rs.getString("publisher");

                        book = new BookDAO(bookID, bookTitle, author, publisher);
                    }
                }
            }
        }
        return book;
    }
    public  boolean deleteBookByID(int id) throws SQLException {
        try (Connection con = ConnectToJDBC.getConnections()) {
            String query = "DELETE FROM BOOKS WHERE book_id = ?";
            try (PreparedStatement prSt = con.prepareStatement(query)) {
                prSt.setInt(1, id);
                int result = prSt.executeUpdate();
                return result == 1;
            }
        }
    }

}
