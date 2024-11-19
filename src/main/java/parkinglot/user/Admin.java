package parkinglot.user;

import parkinglot.core.User;
import parkinglot.core.Notifiable;
import parkinglot.service.EmailService; // Import EmailService

public class Admin extends User implements Notifiable {

    // Constructor
    public Admin(String name, String password) {
        super(name, password, "Admin"); // Gọi constructor của lớp cha với đầy đủ tham số
    }

    // Phương thức hiển thị vai trò của người dùng
    public void displayRole() {
        System.out.println("Role: " + getRole()); // Sử dụng getter để truy cập thuộc tính role
    }

    // Phương thức gửi thông báo (override từ interface Notifiable)
    @Override
    public void sendNotification(String message) {
        // Gửi email thông qua EmailService
        EmailService emailService = new EmailService();
        emailService.sendEmail(getEmail(), "Admin Notification", message);
    }

    // Phương thức quá tải (overloading) để tạo báo cáo
    public final void generateReport(String reportType) { // Phương thức `final` không thể ghi đè
        System.out.println("Generating report: " + reportType);
    }

    // Phương thức quá tải (overloading) để tạo báo cáo mặc định
    public final void generateReport() { // Phương thức `final` không thể ghi đè
        System.out.println("Generating default report.");
    }
}
