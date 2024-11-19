package Controller;

import parkinglot.core.Customer;
import parkinglot.core.User;
import parkinglot.service.EmailService;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CustomerController implements CustomerService {

    // Các phương thức của CustomerController như addCustomer, updateCustomer, v.v...

    @Override
    public void addCustomer(Customer customer) {
        String query = "INSERT INTO customer (customer_name, phone_number, email) VALUES ('"
                + customer.getName() + "', '"
                + customer.getPhoneNumber() + "', '"
                + customer.getEmail() + "')";
        
        dbops.executeUpdate(query, "Added new customer: " + customer.getName());
    }

    @Override
    public void updateCustomer(Customer customer) {
        String query = "UPDATE customer SET customer_name = '"
                + customer.getName() + "', phone_number = '"
                + customer.getPhoneNumber() + "', email = '"
                + customer.getEmail() + "' WHERE customer_id = "
                + customer.getCustomerId();
        
        dbops.executeUpdate(query, "Updated customer: " + customer.getName());
    }

    @Override
    public void deleteCustomerByParkingSpaceId(int parkingSpaceId) {
        String query = "DELETE FROM customer WHERE parking_space_id = " + parkingSpaceId;
        System.out.println("Executing query: " + query);

        try {
            int rowsAffected = dbops.executeUpdate(query, "Deleted customer associated with Parking Space ID: " + parkingSpaceId);
            if (rowsAffected > 0) {
                System.out.println("Customer associated with Parking Space ID " + parkingSpaceId + " was successfully deleted.");
            } else {
                System.out.println("No customer found for Parking Space ID " + parkingSpaceId + ". Deletion skipped.");
            }
        } catch (Exception e) {
            System.err.println("Error deleting customer with Parking Space ID " + parkingSpaceId + ": " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public Customer getCustomerById(int customerId) {
        String query = "SELECT * FROM customer WHERE customer_id = " + customerId;
        ResultSet rs = dbops.selectQuery(query);
        
        try {
            if (rs.next()) {
                return new Customer(
                    rs.getInt("customer_id"),
                    rs.getString("customer_name"),
                    rs.getString("phone_number"),
                    rs.getString("email")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
@Override
public ArrayList<Customer> getAllCustomers() {
    String query = "SELECT * FROM customer";
    ResultSet rs = null;
    ArrayList<Customer> customers = new ArrayList<>();
    Connection conn = null; // Kết nối cần được đóng

    try {
        conn = ConnectDB.getConnection(); // Kết nối cơ sở dữ liệu
        Statement stmt = conn.createStatement(); // Tạo Statement
        rs = stmt.executeQuery(query); // Thực thi truy vấn

        // Lặp qua kết quả và lấy thông tin khách hàng
        while (rs.next()) {
            Customer customer = new Customer(
                rs.getInt("customer_id"),
                rs.getString("customer_name"),
                rs.getString("phone_number"),
                rs.getString("email")
            );
            customers.add(customer);
            System.out.println("Email to send: " + customer.getEmail()); // In ra email để kiểm tra
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Đảm bảo đóng ResultSet, Statement và Connection sau khi sử dụng
        try {
            if (rs != null) rs.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    return customers;
}



    @Override
    public void addCustomerToDB(Customer customer, User user) {
        String query = "INSERT INTO customer (customer_name, phone_number, email, parking_space_id) VALUES ('"
                + customer.getName() + "', '"
                + customer.getPhoneNumber() + "', '"
                + customer.getEmail() + "', "
                + user.getParkingSpaceId() + ")";

        dbops.executeUpdate(query, "Added new customer: " + customer.getName());
    }

    @Override
    public int getCustomerByParkingSpace(int parkingSpaceId) {
        String query = "SELECT customer_id FROM customer WHERE parking_space_id = " + parkingSpaceId;
        System.out.println("Executing query: " + query);
        ResultSet rs = dbops.selectQuery(query);
        try {
            if (rs != null && rs.next()) {
                int customerId = rs.getInt("customer_id");
                System.out.println("Found customer ID: " + customerId);
                return customerId;
            } else {
                System.out.println("No customer found for parking space ID: " + parkingSpaceId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Return -1 if no customer is found
    }
@Override
public void sendNotificationToAllCustomers(String message) {
    // Lấy tất cả khách hàng từ cơ sở dữ liệu
    ArrayList<Customer> customers = getAllCustomers();
    System.out.println("Total customers to notify: " + customers.size()); // Log tổng số khách hàng

    // Tạo đối tượng EmailService để gửi email
    EmailService emailService = new EmailService();

    // Gửi email thông báo đến mỗi khách hàng
    for (Customer customer : customers) {
        try {
            System.out.println("Sending email to: " + customer.getEmail()); // Log email đang gửi
            emailService.sendEmail(customer.getEmail(), "Customer Notification", message);
            System.out.println("Email successfully sent to: " + customer.getEmail());
        } catch (Exception e) {
            // Log lỗi khi gửi email
            System.err.println("Failed to send email to: " + customer.getEmail());
            e.printStackTrace();
        }
    }

    System.out.println("Notification process completed for all customers.");
}
}
    

