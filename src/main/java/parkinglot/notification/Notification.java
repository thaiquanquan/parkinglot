package parkinglot.notification;

public class Notification {
    private String recipient;
    private String message;

    // Constructor
    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    // Getter

    public String getMessage() {
        return message;
    }

    // Phương thức gửi thông báo
    public void send() {
        System.out.println("Sending notification to " + recipient + ": " + message);
    }
}
