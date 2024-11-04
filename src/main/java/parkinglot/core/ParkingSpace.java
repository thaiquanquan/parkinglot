package parkinglot.core;

public class ParkingSpace {
    private int id;                  // ID của chỗ đỗ xe
    private boolean available;       // Trạng thái của chỗ đỗ xe
    private Vehicle vehicle;         // Thông tin phương tiện đỗ tại chỗ này (nếu có)

    // Constructor khởi tạo chỗ đỗ xe với ID và trạng thái mặc định trống
    public ParkingSpace(int id) {
        this.id = id;
        this.available = true;       // Mặc định chỗ đỗ là trống khi tạo mới
        this.vehicle = null;         // Không có phương tiện nào khi chỗ đỗ còn trống
    }

    // Getter cho ID chỗ đỗ
    public int getId() {
        return id;
    }

    // Getter và Setter cho trạng thái chỗ đỗ
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Getter và Setter cho phương tiện
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
