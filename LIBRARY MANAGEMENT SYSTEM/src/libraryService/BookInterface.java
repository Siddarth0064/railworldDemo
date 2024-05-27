package libraryService;

import libraryDao.BookDAO;

import java.sql.SQLException;
import java.util.List;

public interface BookInterface {
    Boolean createBook(BookDAO bookObj) throws SQLException;
    List<BookDAO> getAllBooks()throws SQLException;
    BookDAO getBookByID(int id)throws SQLException;
    boolean deleteBookByID(int id)throws SQLException;
}
