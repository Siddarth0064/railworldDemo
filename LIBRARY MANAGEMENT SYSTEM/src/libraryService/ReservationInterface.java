package libraryService;

import libraryDao.ReservationsDAO;

import java.sql.SQLException;
import java.util.List;

public interface ReservationInterface {
    boolean reservBook(ReservationsDAO reservationsDAO) throws SQLException;
    List<ReservationsDAO> viewAllReservedBooks() throws SQLException;
    ReservationsDAO viewReservedBookByID(int id) throws SQLException;
    List<ReservationsDAO> viewReservedBookByMemberID(int id) throws SQLException;
    boolean deleteReservedBookByBookID(int id) throws SQLException;

}
