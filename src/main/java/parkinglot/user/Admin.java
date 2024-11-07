package parkinglot.user;

import parkinglot.core.User;
import parkinglot.core.Notifiable;

public class Admin extends User implements Notifiable {
    // Constructor
   public Admin(String name, String password) {
    super(name, password, "Admin"); // Gọi constructor của lớp cha với đầy đủ tham số
}

    
    public void displayRole() {
    System.out.println("Role: " + getRole()); // Sử dụng getter để truy cập thuộc tính role
}


    @Override
    public void sendNotification(String message) {
        System.out.println("Admin Notification: " + message);
    }

    // Phương thức quá tải (overloading)
    public final void generateReport(String reportType) { // Phương thức `final` không thể ghi đè
        System.out.println("Generating report: " + reportType);
    }

    public final void generateReport() { // Phương thức `final` không thể ghi đè
        System.out.println("Generating default report.");
    }
}
