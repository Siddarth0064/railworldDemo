package libraryDao;

public class BookDAO {
    private int bookID;
    private String bookTitle;
    private String author;
    private String publisher;

    public BookDAO(int bookID, String bookTitle, String author, String publisher) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "BOOK: BookID: "+getBookID()+" BookTitle: "+getBookTitle()+" BookAuthor: "+getAuthor()+" BookPublisher: "+getPublisher();
    }
}
