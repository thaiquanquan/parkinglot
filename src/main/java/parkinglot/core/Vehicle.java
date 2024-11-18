package parkinglot.core;

public class Vehicle {
    private String licensePlate;   // Biển số xe
    private String ownerName;      // Tên chủ xe
    private String vehicleType;    // Loại phương tiện (xe hơi, xe máy, v.v.)
    private String phoneNumber;    // Số điện thoại
    private String email;          // Địa chỉ email

    // Constructor khởi tạo phương tiện với biển số, chủ xe, loại xe, số điện thoại và email
    public Vehicle(String licensePlate, String ownerName, String vehicleType, String phoneNumber, String email) {
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getter và Setter cho biển số xe
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    // Getter và Setter cho tên chủ xe
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Getter và Setter cho loại xe
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Getter và Setter cho số điện thoại
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter và Setter cho email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Vehicle [licensePlate=" + licensePlate + ", ownerName=" + ownerName + ", vehicleType=" + vehicleType + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
    }
}