package parkinglot.core;

import java.util.Date;

public class Reservation {
    private int spaceId;
    private String customerName;
    private Date reservationDate;

    // Constructor
    public Reservation(int spaceId, String customerName, Date reservationDate) {
        this.spaceId = spaceId;
        this.customerName = customerName;
        this.reservationDate = reservationDate;
    }

    // Getters
    public int getSpaceId() {
        return spaceId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "spaceId=" + spaceId +
                ", customerName='" + customerName + '\'' +
                ", reservationDate=" + reservationDate +
                '}';
    }
}
