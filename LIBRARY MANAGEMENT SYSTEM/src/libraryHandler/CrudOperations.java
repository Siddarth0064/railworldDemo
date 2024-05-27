package libraryHandler;

import libraryDao.BookDAO;
import libraryDao.LoansDAO;
import libraryDao.MembersDAO;
import libraryDao.ReservationsDAO;
import libraryService.*;

import java.sql.SQLException;
import java.util.List;

public class CrudOperations {
    BookInterface bookInterface = new BookServices(); // Replace BookService with the actual implementation class
    MembershipInterface membershipInterface = new MemberShipService(); // Replace MembershipService with the actual implementation class
    LoanInterface loanInterface = new LoanService(); // Replace LoanService with the actual implementation class
    ReservationInterface reservationInterface = new ReservationService();

    public boolean InsertBook(BookDAO book){
        try {
            return bookInterface.createBook(book);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public List<BookDAO> getAllBooksData(){
        try {
            return bookInterface.getAllBooks();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public BookDAO getBookByBookID(int id){
        try {
            return bookInterface.getBookByID(id);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public boolean deleteBookByBookID(int id){
        try {
            return bookInterface.deleteBookByID(id);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public boolean insertMembers(MembersDAO membersDAO){
        try {
            return membershipInterface.createMembers(membersDAO);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public MembersDAO getMembershipByMemberID(int id){
        try {
            return membershipInterface.getMembersByID(id);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public List<MembersDAO> getAllMembershipData(){
        try {
            return membershipInterface.getAllMembers();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public boolean deleteMembershipByMemberID(int id){
        try {
            return membershipInterface.deleteMembersByID(id);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }


    public   boolean reservBook(ReservationsDAO reservationsDAO){
        try {
            return reservationInterface.reservBook( reservationsDAO) ;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public  List<ReservationsDAO>  getAllReservBookData( ){
        try {
            return reservationInterface.viewAllReservedBooks() ;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public   ReservationsDAO getReservBookByID(int id){
        try {
            return reservationInterface.viewReservedBookByID(id) ;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public List<ReservationsDAO> getReservBookByMemberID(int id){
        try {
            return reservationInterface.viewReservedBookByMemberID(id) ;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public boolean deleteResevBoodByBookId(int id){
        try {
            return reservationInterface.deleteReservedBookByBookID(id) ;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public  boolean getBookLoan(LoansDAO loansDAO){
        try {
            return loanInterface.bookLoan(loansDAO);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public  List<LoansDAO> getAllLoansBook( ){
        try {
            return loanInterface.viewAllBookLoans();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public  LoansDAO getLoansBookByBookID(int id ){
        try {
            return loanInterface.viewBookLoanByBookID(id);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public   List<LoansDAO> getLoansBookByMemberID(int id ){
        try {
            return loanInterface.viewBookLoanByMemberID(id);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public   boolean deleteLoansBookByBookID(int id ){
        try {
            return loanInterface.deleteBookLoanByBookID(id);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public   boolean deleteLoansBookByMemberID(int id ){
        try {
            return loanInterface.deleteBookLoanByMemberID(id);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
