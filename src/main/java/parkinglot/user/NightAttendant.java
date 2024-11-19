package parkinglot.user;

public class NightAttendant extends ParkingAttendant {

    public NightAttendant(String name, String contactInfo) {
        super(name, contactInfo);
    }

    @Override
    public String getShiftDetails() {
        return "Night shift (10 PM - 6 AM)";
    }
}
