package parkinglot.core;

public class Vehicle {
    private String licensePlate;   // Biển số xe
    private String ownerName;      // Tên chủ xe
    private String vehicleType;    // Loại phương tiện (xe hơi, xe máy, v.v.)

    // Constructor khởi tạo phương tiện với biển số, chủ xe và loại xe
    public Vehicle(String licensePlate, String ownerName, String vehicleType) {
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
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

    @Override
    public String toString() {
        return "Vehicle [licensePlate=" + licensePlate + ", ownerName=" + ownerName + ", vehicleType=" + vehicleType + "]";
    }
}
