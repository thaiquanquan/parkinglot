package parkinglot.user;

public abstract class ParkingAttendant {
    private String name;
    private String contactInfo;

    // Constructor
    public ParkingAttendant(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Getter cho thuộc tính
    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    // Phương thức trừu tượng
    public abstract String getShiftDetails();

    // Phương thức thông thường
    @Override
    public String toString() {
        return "ParkingAttendant{name='" + name + "', contactInfo='" + contactInfo + "'}";
    }
}
