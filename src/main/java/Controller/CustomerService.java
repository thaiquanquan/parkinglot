package Controller;

import parkinglot.core.Customer;
import parkinglot.core.User;
import java.util.ArrayList;

public interface CustomerService {

    void addCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomerByParkingSpaceId(int parkingSpaceId);

    Customer getCustomerById(int customerId);

    ArrayList<Customer> getAllCustomers();

    void addCustomerToDB(Customer customer, User user);

    int getCustomerByParkingSpace(int parkingSpaceId);
     // Thêm phương thức sendNotification vào CustomerService
    void sendNotificationToAllCustomers(String message);  // Hàm này sẽ được implement trong CustomerController
}