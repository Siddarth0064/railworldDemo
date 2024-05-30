[README.md](https://github.com/Siddarth0064/railworldDemo/files/15496272/README.md)

# Library Management System 

The Library Management System is a Java-based application designed to manage the operations of a library. This system provides functionalities to manage books, members, and loans, facilitating efficient library administration. The system utilizes JDBC for database connectivity and performs CRUD (Create, Read, Update, Delete) operations on the library database.



## Project Structure 
    1) BOOKS: Stores information about books.

    2) MEMBERS: Stores information about library members.

    3) LOANS: Stores information about which book is loaned to which member.
    
    4) RESERVATION: Stores information about which book is reserved for which member

## Database Schema Tables
 
     Books:
      * BookID INT AUTO_INCREMENT PRIMARY KEY
      * Title VARCHAR(100) NOT NULL
      * Author VARCHAR(50)
      * Publishers Varchar(200)
    
     Member:
      * MemberID AUTO_INCREMENT PRIMARY KEY
      * MemberName VARCHAR(100) NOT NULL
      * MemberPhone Int
      * MemberEmail Varchar(200)
      * MemberAddress Varchar(200)
    
     Loans:
      * LoanID INT AUTO_INCREMENT PRIMARY KEY
      * BookID INT
      * MemberID INT
      * LoanDate DATE
      * ReturnDate DATE
      * FineAmount Int
   
     Reservation:
      * ReservationID AUTO_INCREMENT
      * BookID Int
      * MemberID Int
      * FineAmount Int
## Project Setup

    1. Clone The Repository:
         
         * git clone https://github.com/siddarth0064/library-management-system.git
         * cd library-management-system

    2. Set up the Database:
         * Create a database named librarydb.
         * Execute the SQL scripts to create the tables as shown in the Database Schema section.

    3. Add the JDBC driver:
         * Download the MySQL JDBC driver and add it to your project's classpath.

    4. Compile and run the project:
         * Use your IDE to compile and run the MainClass for interaction with the library system.


## User Stories and CRUD Operations

    1. Show All Book Data:

          *  Description: As a librarian, I want to view a list of all books so that I can manage the book inventory effectively.

          *  SQL Query:   SELECT * FROM Books;


    2. Insert Book:

          *  Description: As a librarian, I want to add new books to the library so that the book collection is up-to-date. 

          *  SQL Query:   INSERT INTO Books (BookTitle, Author, Publisher) VALUES ('Book Title', 'Author Name', 'Publisher Name');

    3. Get Book by BookID:
     
          *  Description: As a librarian, I want to search for a book by its ID to view specific book details. 

          *  SQL Query:  SELECT * FROM Books WHERE BookID = 1;

    4. Delete Book by BookID:

          *  Description: As a librarian, I want to delete a book by its ID to remove outdated or damaged books from the inventory.

          *  SQL Query:  DELETE FROM Books WHERE BookID = 1;

    5. Show All Members Data:

          *  Description: As a librarian, I want to view a list of all members to manage member information effectively.

          *  SQL Query:  SELECT * FROM Members;

    6. Insert Member:

          *  Description: As a librarian, I want to add new members to the library so that member records are up-to-date.

          *  SQL Query:  INSERT INTO Members (Name, Email, PhoneNo, Address) VALUES ('Member Name', 'email@example.com', '1234567890', 'Address');

    7. Get Member by MemberID: 

          *  Description: As a librarian, I want to search for a member by their ID to view specific member details.

          *  SQL Query:  SELECT * FROM Members WHERE MemberID = 1;

    8. Delete Member by MemberID:
      
          *  Description: As a librarian, I want to delete a member by their ID to remove inactive or invalid member records.

          *  SQL Query:  DELETE FROM Members WHERE MemberID = 1;

    9. Reserve Book: 
     
          *  Description: As a member, I want to reserve a book so that I can borrow it when it becomes available.

          *  SQL Query:  INSERT INTO Reservations (BookID, MemberID, ReservationDate) VALUES (1, 1, '2024-05-25');

    10. Get All Reservation Data:

          *  Description: As a librarian, I want to view all reservations to manage book reservations effectively.

          *  SQL Query:  SELECT * FROM Reservations;

    11. Get Reservation by BookID:
      
          *  Description: As a librarian, I want to view reservations for a specific book to manage its availability.

          *  SQL Query:   SELECT * FROM Reservations WHERE BookID = 1;

    12. Get All Reservations by MemberID:
     
          *  Description: As a librarian, I want to view all reservations made by a specific member to manage their reservations.

          *  SQL Query:  SELECT * FROM Reservations WHERE MemberID = 1;

    13. Delete Reservation by BookID:

          *  Description: As a librarian, I want to delete a reservation by book ID to free up the book for other members.

          *  SQL Query:  DELETE FROM Reservations WHERE BookID = 1;
    
    14. Get All Loan Data:
        
          *  Description: As a librarian, I want to view all book loans to manage borrowed books effectively.

          *  SQL Query:   SELECT * FROM Loans;

    15. Get Book Loan by LoanID: 

          *  Description: As a librarian, I want to view details of a specific book loan to track its status.

          *  SQL Query:   SELECT * FROM Loans WHERE loanID = ?;

    16. Get BookLoans by BookID:
        
          *  Description: As a librarian, I want to retrieve all loan details of a specific book by its ID.

          *  SQL Query:   SELECT * FROM Loans WHERE BookID = ?;

    17. Get BookLoans by MemberID:

          *  Description: As a librarian, I want to retrieve all loan details made by a member.

          *  SQL Query:     SELECT * FROM Loans WHERE MemberID = ?;

    18. Delete BookLoans by BookID:
      
          *  Description: As a librarian, I want to delete loan records by the book's ID.

          *  Sql Query:   DELETE FROM Loans WHERE BookID = ?;

    19. Delete BookLoans by MemberID:

          *  Description: As a librarian, I want to delete loan records by the member's ID.

          *  SQL Query:  DELETE FROM Loans WHERE MemberID = ?;

    20. Exit:
       
          *  Description: As a librarian, I want to exit the system safely, ensuring all operations are properly closed.


## Conclusion
This README file provides a comprehensive guide to setting up and running the Library Management System. The system's functionalities allow for effective management of library operations, ensuring a streamlined process for handling books, members, and loans. The provided user stories guide the development and testing of the system's key features.


