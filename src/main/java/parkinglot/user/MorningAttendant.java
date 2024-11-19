package parkinglot.user;

public class MorningAttendant extends ParkingAttendant {

    public MorningAttendant(String name, String contactInfo) {
        super(name, contactInfo);
    }

    @Override
    public String getShiftDetails() {
        return "Morning shift (6 AM - 2 PM)";
    }
}
