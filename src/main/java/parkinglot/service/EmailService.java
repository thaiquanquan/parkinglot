package parkinglot.service;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailService {

    private static final String HOST = "smtp.gmail.com"; // SMTP server của Gmail
    private static final String PORT = "587"; // Cổng SMTP
    private static final String USERNAME = "lebathaiquan@gmail.com"; // Thay bằng email của bạn
    private static final String PASSWORD = "uqqf achh ohos pkec"; // Thay bằng mật khẩu ứng dụng của bạn

    /**
     * Phương thức gửi email
     * @param toEmail: Địa chỉ email người nhận
     * @param subject: Tiêu đề của email
     * @param messageBody: Nội dung email
     */
    public void sendEmail(String toEmail, String subject, String messageBody) {
        // Cấu hình các thuộc tính cho kết nối với SMTP server
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", HOST);  // Cấu hình SMTP server
        properties.put("mail.smtp.port", PORT);  // Cổng SMTP
        properties.put("mail.smtp.auth", "true");  // Xác thực người dùng
        properties.put("mail.smtp.starttls.enable", "true");  // Bật TLS để bảo mật kết nối

        // Tạo một Session với thông tin tài khoản email
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                // Xác thực bằng email và mật khẩu của bạn
                return new PasswordAuthentication(USERNAME, PASSWORD);
            }
        });

        try {
            // Tạo đối tượng MimeMessage (thông điệp email)
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(USERNAME));  // Người gửi (email của bạn)
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));  // Người nhận
            message.setSubject(subject);  // Tiêu đề email
            message.setText(messageBody);  // Nội dung email

            // Gửi email
            Transport.send(message);  // Phương thức gửi email
            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("Failed to send email.");
        }
    }

    // Phương thức main để thử gửi email
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        emailService.sendEmail("lebathaiquan@gmail.com", "Test Subject", "Test message");
    }
}
