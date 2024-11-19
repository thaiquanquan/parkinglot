package Controller;

import parkinglot.core.Customer;
import parkinglot.core.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerController {

    // Add a new customer
    public static void addCustomer(Customer customer) {
        String query = "INSERT INTO customer (customer_name, phone_number, email) VALUES ('"
                + customer.getName() + "', '"
                + customer.getPhoneNumber() + "', '"
                + customer.getEmail() + "')";
        
        dbops.executeUpdate(query, "Added new customer: " + customer.getName());
    }

    // Update an existing customer
    public static void updateCustomer(Customer customer) {
        String query = "UPDATE customer SET customer_name = '"
                + customer.getName() + "', phone_number = '"
                + customer.getPhoneNumber() + "', email = '"
                + customer.getEmail() + "' WHERE customer_id = "
                + customer.getCustomerId();
        
        dbops.executeUpdate(query, "Updated customer: " + customer.getName());
    }

        public static void deleteCustomerByParkingSpaceId(int parkingSpaceId) {
        String query = "DELETE FROM customer WHERE parking_space_id = " + parkingSpaceId;
        System.out.println("Executing query: " + query); // Log the query for debugging

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

    // Retrieve a single customer by ID
    public static Customer getCustomerById(int customerId) {
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

    // Retrieve all customers
    public static ArrayList<Customer> getAllCustomers() {
        String query = "SELECT * FROM customer";
        ResultSet rs = dbops.selectQuery(query);
        ArrayList<Customer> customers = new ArrayList<>();
        
        try {
            while (rs.next()) {
                customers.add(new Customer(
                    rs.getInt("customer_id"),
                    rs.getString("customer_name"),
                    rs.getString("phone_number"),
                    rs.getString("email")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }
    
    public static void addCustomerToDB(Customer customer, User user) {
        String query = "INSERT INTO customer (customer_name, phone_number, email, parking_space_id) VALUES ('"
                + customer.getName() + "', '"
                + customer.getPhoneNumber() + "', '"
                + customer.getEmail() + "', "
                + user.getParkingSpaceId() + ")";

        dbops.executeUpdate(query, "Added new customer: " + customer.getName());
    }
    
    public static int getCustomerByParkingSpace(int parkingSpaceId) {
        String query = "SELECT customer_id FROM customer WHERE parking_space_id = " + parkingSpaceId;
        System.out.println("Executing query: " + query); // Log query for debugging
        ResultSet rs = dbops.selectQuery(query);
        try {
            if (rs != null && rs.next()) {
                int customerId = rs.getInt("customer_id");
                System.out.println("Found customer ID: " + customerId); // Log found ID
                return customerId;
            } else {
                System.out.println("No customer found for parking space ID: " + parkingSpaceId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Return -1 if no customer is found
    }
}