package parkinglot.core;

public abstract class User {
    protected static final String COMPANY_NAME = "ParkingLot Inc."; // Biến hằng số
    protected String name;
    protected String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Phương thức trừu tượng cần được các lớp con thực hiện
    public abstract void displayRole();
}
