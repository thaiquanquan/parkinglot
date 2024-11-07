package parkinglot.user;

import parkinglot.core.User;
import parkinglot.core.Notifiable;

public class Admin extends User implements Notifiable {
    // Constructor
    public Admin(String name) {
        super(name, "Admin"); // Gọi constructor của lớp cha với `super`
    }

    @Override
    public void displayRole() {
        System.out.println("Role: " + this.role);
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
