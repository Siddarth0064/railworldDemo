package libraryService;

import ConnectionUtility.ConnectToJDBC;
import libraryDao.MembersDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberShipService implements MembershipInterface{
    static Connection con = null;
    static Statement st = null;
    static PreparedStatement prSt = null;

    public boolean createMembers(MembersDAO membersDAO) throws SQLException {
        con = ConnectToJDBC.getConnections();
        System.out.println("CREAT MEMBER METHOD ENTERED");
        String query = "INSERT INTO MEMBERS (member_id,name,email,phone_no,address) VALUES (?,?,?,?,?);";
        prSt = con.prepareStatement(query);
        prSt.setInt(1,membersDAO.getMemberId());
        prSt.setString(2,membersDAO.getName());
        prSt.setString(3,membersDAO.getEmail());
        prSt.setString(4,membersDAO.getPhoneNo());
        prSt.setString(5,membersDAO.getAddress());
        int result = prSt.executeUpdate();
        return result==1;
    }
    public  MembersDAO getMembersByID(int id) throws SQLException {
        MembersDAO member = null;
        try (Connection con = ConnectToJDBC.getConnections()) {
            String query = "SELECT * FROM MEMBERS WHERE member_id = ?";
            try (PreparedStatement prSt = con.prepareStatement(query)) {
                prSt.setInt(1, id);
                try (ResultSet rs = prSt.executeQuery()) {
                    if (rs.next()) {
                        int memberId = rs.getInt("member_id");
                        String name = rs.getString("name");
                        String email = rs.getString("email");
                        String phoneNo = rs.getString("phone_no");
                        String address = rs.getString("address");

                        member = new MembersDAO(memberId, name, email, phoneNo, address);
                    }
                }
            }
        }
        return member;
    }
    public  List<MembersDAO> getAllMembers() throws SQLException {
        List<MembersDAO> members = new ArrayList<>();
        try (Connection con = ConnectToJDBC.getConnections()) {
            String query = "SELECT * FROM MEMBERS";
            try (PreparedStatement prSt = con.prepareStatement(query)) {
                try (ResultSet rs = prSt.executeQuery()) {
                    while (rs.next()) {
                        int memberId = rs.getInt("member_id");
                        String name = rs.getString("name");
                        String email = rs.getString("email");
                        String phoneNo = rs.getString("phone_no");
                        String address = rs.getString("address");

                        MembersDAO member = new MembersDAO(memberId, name, email, phoneNo, address);
                        members.add(member);
                    }
                }
            }
        }
        return members;
    }
    public boolean deleteMembersByID(int id) throws SQLException {
        try (Connection con = ConnectToJDBC.getConnections()) {
            String query = "DELETE FROM MEMBERS WHERE member_id = ?";
            try (PreparedStatement prSt = con.prepareStatement(query)) {
                prSt.setInt(1, id);
                int result = prSt.executeUpdate();
                return result == 1;
            }
        }
    }
}
