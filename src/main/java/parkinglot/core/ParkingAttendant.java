package parkinglot.core;

public class ParkingAttendant {
    private String name; // Tên nhân viên
    private String email; // Email của nhân viên

    // Constructor khởi tạo nhân viên
    public ParkingAttendant(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter cho tên nhân viên
    public String getName() {
        return name;
    }

    // Getter cho email
    public String getEmail() {
        return email;
    }

    // Phương thức hỗ trợ khách hàng đặt chỗ đỗ
   public void assistWithReservation(ParkingLot parkingLot, int spaceId, Vehicle vehicle) {
    boolean reserved = parkingLot.reserveSpace(spaceId, vehicle);
    if (reserved) {
        System.out.println("Parking space " + spaceId + " reserved successfully for vehicle: " + vehicle);
    } else {
        System.out.println("Parking space " + spaceId + " is not available.");
    }
}


    // Phương thức hiển thị thông tin nhân viên
    @Override
    public String toString() {
        return "ParkingAttendant{name='" + name + "', email='" + email + "'}";
    }
}
