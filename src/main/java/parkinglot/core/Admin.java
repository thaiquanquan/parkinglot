package parkinglot.core;

public class Admin {
    private String name; // Tên admin
    private String email; // Email của admin
    private String role; // Vai trò của admin

    // Constructor khởi tạo admin
    public Admin(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    // Getter cho tên admin
    public String getName() {
        return name;
    }

    // Getter cho email
    public String getEmail() {
        return email;
    }

    // Getter cho vai trò
    public String getRole() {
        return role;
    }

    // Phương thức hiển thị thông tin admin
    @Override
    public String toString() {
        return "Admin{name='" + name + "', email='" + email + "', role='" + role + "'}";
    }
}
