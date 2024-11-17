package parkinglot.transaction;

import java.util.Date;

// Abstract class to calculate charges
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
    private String transactionId;   // ID của giao dịch
    private String customerId;      // ID khách hàng thực hiện giao dịch
    private String vehicleLicense;  // Biển số xe của khách hàng
    private String transactionType; // Loại giao dịch (reserve, release, calculate charges, etc.)
    private double amount;          // Số tiền của giao dịch
    private Date date;              // Ngày thực hiện giao dịch
    private Date startTime;         // Thời gian xe vào
    private Date endTime;           // Thời gian xe rời đi
    private ChargeCalculator chargeCalculator; // Đối tượng tính phí

    // Constructor cho Transaction
    public Transaction(String transactionId, String customerId, String vehicleLicense, String transactionType, double amount, Date date) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.vehicleLicense = vehicleLicense;
        this.transactionType = transactionType;
        this.amount = amount;
        this.date = date;
    }

    // Constructor gán loại xe và thời gian bắt đầu
    public Transaction(String vehicleType, Date startTime) {
        this.startTime = startTime;

        // Gán ChargeCalculator dựa trên loại xe
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

    // Getter cho ChargeCalculator
    public ChargeCalculator getChargeCalculator() {
        return chargeCalculator;
    }

    // Thêm thời gian rời đi
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    // Getter cho startTime
    public Date getStartTime() {
        return startTime;
    }

    // Getter cho endTime
    public Date getEndTime() {
        return endTime;
    }

    // Tính số giờ đỗ
    public long calculateHours() {
        if (startTime == null || endTime == null) {
            throw new IllegalStateException("Start or end time not set");
        }
        long millis = endTime.getTime() - startTime.getTime();
        long hours = millis / (1000 * 60 * 60); // Chuyển đổi từ mili giây sang giờ
        return hours > 0 ? hours : 1;          // Tối thiểu là 1 giờ
    }

    // Tính phí
    public double calculateCharges() {
        if (chargeCalculator == null || startTime == null || endTime == null) {
            throw new IllegalStateException("ChargeCalculator, Start time or End time is not set");
        }
        return chargeCalculator.calculateCharge((int) calculateHours());
    }

    // Getter và Setter cho các thuộc tính khác
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getVehicleLicense() {
        return vehicleLicense;
    }

    public void setVehicleLicense(String vehicleLicense) {
        this.vehicleLicense = vehicleLicense;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
                '}';
    }
}
