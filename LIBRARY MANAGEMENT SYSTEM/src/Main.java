import libraryDao.BookDAO;
import libraryDao.LoansDAO;
import libraryDao.MembersDAO;
import libraryDao.ReservationsDAO;
import libraryHandler.CrudOperations;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("============ WELCOME TO LIBRARY =============");
        CrudOperations crudOperations = new CrudOperations();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("==================================================================");
            System.out.println("Choose an option: ");
            System.out.println("1. Get all Book data");
            System.out.println("2, Insert Book:");
            System.out.println("3, Get Book By BookID:");
            System.out.println("4. Delete Book By BookID: ");

            System.out.println("5. Get all Members data");
            System.out.println("6. Insert Member:");
            System.out.println("7. Get Member by MemberID");
            System.out.println("8. Delete Member by MemberID");

            System.out.println("9. Reserv Book:");
            System.out.println("10. Get all ReservBook Data");
            System.out.println("11. Get ReservBook By BookID ");
            System.out.println("12. Get all ReservBook by MemberID ");
            System.out.println("13. Delete ReservBook By BookID");


            System.out.println("14. Get all BookLoans Listed Data");
            System.out.println("15, Get Book Loan");
            System.out.println("16, Get BookLoans by BookID ");
            System.out.println("17, Get BookLoans List by MemberID ");
            System.out.println("18, Delete BookLoans By BookID");
            System.out.println("19, Delete BookLoans by MemberID ");

            System.out.println("20. Exit");

            System.out.print("Please Enter Your Choice Here:   ");


            int choice = scan.nextInt();
            scan.nextLine();
            System.out.println("==================================================================");
            switch (choice) {

                case 1:
                    List<BookDAO> allBooks = crudOperations.getAllBooksData();
                    System.out.println("All Books:");
                    for (BookDAO book : allBooks) {
                        System.out.println(book);
                    }
                    break;

                case 2:
                    System.out.println("Enter Book Details:");
                    System.out.print("Book ID: ");
                    int bookID = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Book Title: ");
                    String bookTitle = scan.nextLine();
                    System.out.print("Book Author: ");
                    String bookAuthor = scan.nextLine();
                    System.out.print("Book Publisher: ");
                    String bookPublisher = scan.nextLine();

                    BookDAO bookObj = new BookDAO(bookID, bookTitle, bookAuthor, bookPublisher);
                    if (crudOperations.InsertBook(bookObj)) {
                        System.out.println("Book inserted successfully.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int bookId = scan.nextInt();
                    BookDAO bookById = crudOperations.getBookByBookID(bookId);
                    System.out.println("Book Details: " + bookById);
                    break;

                case 4:
                    System.out.print("Enter Book ID to delete: ");
                    int bookIdToDelete = scan.nextInt();
                    if (crudOperations.deleteBookByBookID(bookIdToDelete)) {
                        System.out.println("Book deleted successfully.");
                    }
                    break;

                case 5:
                    List<MembersDAO> allMembers = crudOperations.getAllMembershipData();
                    System.out.println("All Members:");
                    for (MembersDAO member : allMembers) {
                        System.out.println(member);
                    }
                    break;

                case 6:
                    System.out.println("Enter Member Details:");
                    System.out.print("Member ID: ");
                    int memberID = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Name: ");
                    String memberName = scan.nextLine();
                    System.out.print("Email: ");
                    String memberEmail = scan.nextLine();
                    System.out.print("Phone: ");
                    String memberPhone = scan.nextLine();
                    System.out.print("Address: ");
                    String memberAddress = scan.nextLine();

                    MembersDAO membersDAO = new MembersDAO(memberID, memberName, memberEmail, memberPhone, memberAddress);
                    if (crudOperations.insertMembers(membersDAO)) {
                        System.out.println("Member inserted successfully.");
                    }
                    break;

                case 7:
                    System.out.print("Enter Member ID: ");
                    int memberId = scan.nextInt();
                    MembersDAO memberById = crudOperations.getMembershipByMemberID(memberId);
                    System.out.println("Member Details: " + memberById);
                    break;

                case 8:
                    System.out.print("Enter Member ID to delete: ");
                    int memberIdToDelete = scan.nextInt();
                    if (crudOperations.deleteMembershipByMemberID(memberIdToDelete)) {
                        System.out.println("Member deleted successfully.");
                    }
                    break;

                case 9:
                    System.out.println("Enter Reservation Details:");
                    System.out.print("Book ID: ");
                    int reserveBookID = scan.nextInt();
                    System.out.print("Member ID: ");
                    int reserveMemberID = scan.nextInt();
                    System.out.print("Reservation Date (yyyy-MM-dd): ");
                    String reservationDate = scan.next();

                    ReservationsDAO reservationsDAO = new ReservationsDAO(0, reserveBookID, reserveMemberID, Date.valueOf(reservationDate));
                    if (crudOperations.reservBook(reservationsDAO)) {
                        System.out.println("Book reserved successfully.");
                    }
                    break;

                case 10:
                    List<ReservationsDAO> allReservedBooks = crudOperations.getAllReservBookData();
                    System.out.println("All Reserved Books:");
                    for (ReservationsDAO reservedBook : allReservedBooks) {
                        System.out.println(reservedBook);
                    }
                    break;

                case 11:
                    System.out.print("Enter Reserved Book ID: ");
                    int reservedBookID = scan.nextInt();
                    ReservationsDAO reservedBookById = crudOperations.getReservBookByID(reservedBookID);
                    System.out.println("Reserved Book Details: " + reservedBookById);
                    break;

                case 12:
                    System.out.print("Enter Member ID to view reservations: ");
                    int reservedMemberID = scan.nextInt();
                    List<ReservationsDAO> reservedBooksByMember = crudOperations.getReservBookByMemberID(reservedMemberID);
                    System.out.println("Reserved Books by Member:");
                    for (ReservationsDAO reservedBook : reservedBooksByMember) {
                        System.out.println(reservedBook);
                    }
                    break;

                case 13:
                    System.out.print("Enter Book ID to delete reservation: ");
                    int bookIDToDeleteReservation = scan.nextInt();
                    if (crudOperations.deleteResevBoodByBookId(bookIDToDeleteReservation)) {
                        System.out.println("Reservation deleted successfully.");
                    }
                    break;

                case 14:
                    List<LoansDAO> allBookLoans = crudOperations.getAllLoansBook();
                    System.out.println("All Book Loans:");
                    for (LoansDAO bookLoan : allBookLoans) {
                        System.out.println(bookLoan);
                    }
                    break;

                case 15:
                    System.out.println("Enter Loan Details:");
                    System.out.print("Book ID: ");
                    int loanBookID = scan.nextInt();
                    System.out.print("Member ID: ");
                    int loanMemberID = scan.nextInt();
                    System.out.print("Loan Date (yyyy-MM-dd): ");
                    String loanDate = scan.next();
                    System.out.print("Return Date (yyyy-MM-dd): ");
                    String returnDate = scan.next();
                    System.out.print("Fine Amount: ");
                    double fineAmount = scan.nextDouble();

                    LoansDAO loansDAO = new LoansDAO(loanBookID, loanMemberID, Date.valueOf(loanDate), Date.valueOf(returnDate), fineAmount);
                    if (crudOperations.getBookLoan(loansDAO)) {
                        System.out.println("Loan confirmed successfully.");
                    }
                    break;

                case 16:
                    System.out.print("Enter Book ID to view loan details: ");
                    int loanBookId = scan.nextInt();
                    LoansDAO loanByBookId = crudOperations.getLoansBookByBookID(loanBookId);
                    System.out.println("Loan Details: " + loanByBookId);
                    break;

                case 17:
                    System.out.print("Enter Member ID to view loan details: ");
                    int loanMemberId = scan.nextInt();
                    List<LoansDAO> loansByMemberId = crudOperations.getLoansBookByMemberID(loanMemberId);
                    System.out.println("Loans by Member:");
                    for (LoansDAO loan : loansByMemberId) {
                        System.out.println(loan);
                    }
                    break;

                case 18:
                    System.out.print("Enter Book ID to delete loan: ");
                    int bookIdToDeleteLoan = scan.nextInt();
                    if (crudOperations.deleteLoansBookByBookID(bookIdToDeleteLoan)) {
                        System.out.println("Loan deleted successfully.");
                    }
                    break;

                case 19:
                    System.out.print("Enter Member ID to delete loan: ");
                    int memberIdToDeleteLoan = scan.nextInt();
                    if (crudOperations.deleteLoansBookByMemberID(memberIdToDeleteLoan)) {
                        System.out.println("Loan deleted successfully.");
                    }
                    break;

                case 20:
                    System.out.println("Exiting...");
                    scan.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}