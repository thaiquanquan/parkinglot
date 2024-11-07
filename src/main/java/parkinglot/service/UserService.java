package parkinglot.service;

import parkinglot.core.User;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users;

    // Constructor
    public UserService() {
        users = new ArrayList<>();
        // Khởi tạo một số người dùng mặc định
        users.add(new User("admin", "admin123", "Admin")); // Quản trị viên
        users.add(new User("user", "user123", "User"));  // Người dùng thông thường
        users.add(new User("attendant", "password123", "ParkingAttendant")); // Nhân viên quản lý bãi đỗ
    }

    // Phương thức để đăng ký người dùng mới
    public void registerUser(String username, String password, String role) {
        users.add(new User(username, password, role));
    }

    // Phương thức để đăng nhập
    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user; // Trả về đối tượng User sau khi xác thực thành công
            }
        }
        return null; // Đăng nhập không thành công
    }

    // Getter cho danh sách người dùng (nếu cần dùng để kiểm tra)
    public List<User> getUsers() {
        return users;
    }
}
