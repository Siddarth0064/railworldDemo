package libraryDao;

import java.sql.Date;

public class ReservationsDAO {
    private int reservationID;
    private int bookID;
    private int memberID;
    private java.sql.Date reservationDate;

    public ReservationsDAO(int bookID, int memberID, Date reservationDate) {
        this.bookID = bookID;
        this.memberID = memberID;
        this.reservationDate = reservationDate;
    }

    public ReservationsDAO(int reservationID, int bookID, int memberID, Date reservationDate) {
        this.reservationID = reservationID;
        this.bookID = bookID;
        this.memberID = memberID;
        this.reservationDate = reservationDate;
    }

    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Override
    public String toString() {
        return "ReservationsDAO{" +
                "reservationID=" + reservationID +
                ", bookID=" + bookID +
                ", memberID=" + memberID +
                ", reservationDate=" + reservationDate +
                '}';
    }
}
