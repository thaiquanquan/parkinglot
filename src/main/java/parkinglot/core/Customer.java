package parkinglot.core;

public class Customer {
    private String name; // Tên khách hàng
    private String phoneNumber; // Số điện thoại khách hàng
    private String email; // Địa chỉ email khách hàng

    // Constructor khởi tạo khách hàng
    public Customer(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getter cho tên khách hàng
    public String getName() {
        return name;
    }

    // Getter cho số điện thoại khách hàng
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Getter cho email khách hàng
    public String getEmail() {
        return email;
    }

    // Phương thức hiển thị thông tin khách hàng
    @Override
    public String toString() {
        return "Customer{name='" + name + "', phoneNumber='" + phoneNumber + "', email='" + email + "'}";
    }
}