package parkinglot.transaction;

import java.util.Date;

public class Transaction {
    private String transactionId;   // ID của giao dịch
    private String customerId;      // ID khách hàng thực hiện giao dịch
    private String vehicleLicense;  // Biển số xe của khách hàng
    private String transactionType; // Loại giao dịch (reserve, release, calculate charges, etc.)
    private double amount;          // Số tiền của giao dịch
    private Date date;              // Ngày thực hiện giao dịch

    // Constructor
    public Transaction(String transactionId, String customerId, String vehicleLicense, String transactionType, double amount, Date date) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.vehicleLicense = vehicleLicense;
        this.transactionType = transactionType;
        this.amount = amount;
        this.date = date;
    }

    // Getter và Setter
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
                ", date=" + date +
                '}';
    }
}
