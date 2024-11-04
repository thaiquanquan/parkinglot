package parkinglot.core;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpace> parkingSpaces; // Danh sách các chỗ đỗ xe

    // Constructor khởi tạo bãi đỗ với tổng số chỗ
    public ParkingLot(int totalSpaces) {
        parkingSpaces = new ArrayList<>();
        for (int i = 0; i < totalSpaces; i++) {
            parkingSpaces.add(new ParkingSpace(i + 1)); // Tạo các chỗ đỗ với ID từ 1
        }
    }

    // Kiểm tra số chỗ đỗ còn trống
    public int getAvailableSpacesCount() {
        int count = 0;
        for (ParkingSpace space : parkingSpaces) {
            if (space.isAvailable()) {
                count++;
            }
        }
        return count;
    }

    // Đặt chỗ đỗ và liên kết với phương tiện
    public boolean reserveSpace(int spaceId, Vehicle vehicle) {
        for (ParkingSpace space : parkingSpaces) {
            if (space.getId() == spaceId && space.isAvailable()) {
                space.setAvailable(false);
                space.setVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    // Giải phóng chỗ đỗ
    public boolean releaseSpace(int spaceId) {
        for (ParkingSpace space : parkingSpaces) {
            if (space.getId() == spaceId && !space.isAvailable()) {
                space.setAvailable(true);
                space.setVehicle(null); // Bỏ thông tin phương tiện
                return true;
            }
        }
        return false;
    }

    // Lấy thông tin chỗ đỗ
    public ParkingSpace getParkingSpace(int spaceId) {
        for (ParkingSpace space : parkingSpaces) {
            if (space.getId() == spaceId) {
                return space;
            }
        }
        return null; // Nếu không tìm thấy chỗ đỗ
    }
    public int getTotalSpaces() {
    return parkingSpaces.size();
}

}


