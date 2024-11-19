package parkinglot.core;

public class Customer {
    private int customerId; // Unique ID for the customer
    private String name; // Customer name
    private String phoneNumber; // Customer phone number
    private String email; // Customer email address

    // Constructor for creating a customer with all details
    public Customer(int customerId, String name, String phoneNumber, String email) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Constructor for creating a customer without an ID (for inserts)
    public Customer(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // No-argument constructor (added for compatibility)
    public Customer() {
    }

    // Getter and setter for customer ID
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    // Getter and setter for customer name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter and setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method to display customer information
    @Override
    public String toString() {
        return "Customer{id=" + customerId + ", name='" + name + "', phoneNumber='" + phoneNumber + "', email='" + email + "'}";
    }
}