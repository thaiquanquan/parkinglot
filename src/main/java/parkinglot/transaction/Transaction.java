package parkinglot.transaction;

import java.util.Date;

interface ChargeCalculator {
    double calculateCharge(int hours);
}

class CarChargeCalculator implements ChargeCalculator {
    private static final double RATE_PER_HOUR = 5.0;

    @Override
    public double calculateCharge(int hours) {
        return hours * RATE_PER_HOUR;
    }
}

class MotorbikeChargeCalculator implements ChargeCalculator {
    private static final double RATE_PER_HOUR = 2.0;

    @Override
    public double calculateCharge(int hours) {
        return hours * RATE_PER_HOUR;
    }
}

public class Transaction {
    private String transactionId;
    private String customerId;
    private String vehicleLicense;
    private String transactionType;
    private double amount;
    private Date date;
    private Date startTime;
    private Date endTime;
    private ChargeCalculator chargeCalculator;
    private String phoneNumber; // Trường mới
    private String email;       // Trường mới
    private int parkingSpotId;  // Trường mới

    // Constructor cập nhật
    public Transaction(String transactionId, String customerId, String vehicleLicense, String transactionType, double amount, Date date, String phoneNumber, String email, int parkingSpotId) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.vehicleLicense = vehicleLicense;
        this.transactionType = transactionType;
        this.amount = amount;
        this.date = date;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.parkingSpotId = parkingSpotId;
    }

    public Transaction(String vehicleType, Date startTime, String phoneNumber, String email, int parkingSpotId) {
        this.startTime = startTime;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.parkingSpotId = parkingSpotId;

        switch (vehicleType.toLowerCase()) {
            case "car":
                this.chargeCalculator = new CarChargeCalculator();
                break;
            case "motorbike":
                this.chargeCalculator = new MotorbikeChargeCalculator();
                break;
            default:
                throw new IllegalArgumentException("Unsupported vehicle type: " + vehicleType);
        }
    }

    // Getters và setters cho các trường mới
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(int parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }

    // Thêm các setters bị thiếu
    public void setVehicleLicense(String vehicleLicense) {
        this.vehicleLicense = vehicleLicense;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    // Các getters và setters khác...

    public String getVehicleLicense() {
        return vehicleLicense;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public double calculateCharges() {
        if (chargeCalculator == null || startTime == null || endTime == null) {
            throw new IllegalStateException("ChargeCalculator, Start time or End time is not set");
        }
        return chargeCalculator.calculateCharge((int) calculateHours());
    }

    private long calculateHours() {
        if (startTime == null || endTime == null) {
            throw new IllegalStateException("Start or end time not set");
        }
        long millis = endTime.getTime() - startTime.getTime();
        long hours = millis / (1000 * 60 * 60); // Chuyển đổi từ mili giây sang giờ
        return hours > 0 ? hours : 1;          // Tối thiểu là 1 giờ
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", vehicleLicense='" + vehicleLicense + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                ", date=" + (date != null ? date.toString() : "Not set") +
                ", startTime=" + (startTime != null ? startTime.toString() : "Not set") +
                ", endTime=" + (endTime != null ? endTime.toString() : "Not set") +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", parkingSpotId=" + parkingSpotId +
                '}';
    }
}