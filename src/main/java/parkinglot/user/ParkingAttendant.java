package parkinglot.user;

public class ParkingAttendant extends Customer {
    private String shift;

    // Constructor
    public ParkingAttendant(String name, String contactInfo, String shift) {
        super(name, contactInfo);
        this.shift = shift;
    }

    // Getter cho shift
    public String getShift() {
        return shift;
    }

    // Override phương thức toString để hiển thị thông tin nhân viên trông xe
    @Override
    public String toString() {
        return "ParkingAttendant{name='" + getName() + "', contactInfo='" + getContactInfo() + "', shift='" + shift + "'}";
    }
}
