package parkinglot.user;

public class Customer {
    private String name;
    private String contactInfo;

    // Constructor
    public Customer(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Getter cho tên
    public String getName() {
        return name;
    }

    // Getter cho thông tin liên lạc
    public String getContactInfo() {
        return contactInfo;
    }

    // Override phương thức toString để hiển thị thông tin khách hàng
    @Override
    public String toString() {
        return "Customer{name='" + name + "', contactInfo='" + contactInfo + "'}";
    }
}
