package parkinglot.user;

public class Admin extends Customer {
    private String role;

    // Constructor
    public Admin(String name, String contactInfo, String role) {
        super(name, contactInfo);
        this.role = role;
    }

    // Getter cho role
    public String getRole() {
        return role;
    }

    // Override phương thức toString để hiển thị thông tin quản trị viên
    @Override
    public String toString() {
        return "Admin{name='" + getName() + "', contactInfo='" + getContactInfo() + "', role='" + role + "'}";
    }
}
