package libraryService;

import libraryDao.LoansDAO;

import java.sql.SQLException;
import java.util.List;

public interface LoanInterface {
    boolean bookLoan(LoansDAO loansDAO) throws SQLException;
    List<LoansDAO> viewAllBookLoans()throws SQLException;
    LoansDAO viewBookLoanByBookID(int id) throws SQLException;
    List<LoansDAO> viewBookLoanByMemberID(int id) throws SQLException;
    boolean deleteBookLoanByBookID(int id) throws SQLException;
    boolean deleteBookLoanByMemberID(int id) throws SQLException;
}
