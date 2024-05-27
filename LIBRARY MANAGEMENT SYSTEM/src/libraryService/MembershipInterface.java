package libraryService;

import libraryDao.MembersDAO;

import java.sql.SQLException;
import java.util.List;

public interface MembershipInterface {
    boolean createMembers(MembersDAO membersDAO) throws SQLException;
    MembersDAO getMembersByID(int id) throws SQLException;
    List<MembersDAO> getAllMembers() throws SQLException;
    boolean deleteMembersByID(int id) throws SQLException;
}
