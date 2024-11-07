/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parkinglot.gui;
import parkinglot.core.ParkingLot;
import javax.swing.JOptionPane;
import parkinglot.core.Vehicle;
import parkinglot.core.Customer;
import java.util.ArrayList;
import parkinglot.core.Admin;
import parkinglot.core.ParkingAttendant;
import parkinglot.transaction.Transaction;
import java.util.Date;
import parkinglot.notification.Notification;
import parkinglot.gui.UserScreen;
import parkinglot.gui.AdminScreen;


/**
 *
 * @author Maxsys
 */
public class MainScreen extends javax.swing.JFrame {

    private ParkingLot parkingLot;
     private ArrayList<Customer> customers;
     private Admin admin;
     // Thêm thuộc tính attendants vào MainScreen
    private ArrayList<ParkingAttendant> attendants; // Danh sách nhân viên bãi đỗ xe
    private ArrayList<Transaction> transactions; // Danh sách giao dịch
    public MainScreen() {
        initComponents();
        parkingLot = new ParkingLot(10);
        customers = new ArrayList<>();
        admin = new Admin("Quan", "lebathaiquan@gmail.com", "System Administrator");
        attendants = new ArrayList<>(); // Tạo danh sách nhân viên bãi đỗ xe
        attendants.add(new ParkingAttendant("Jane Smith", "attendant1@parkinglot.com")); // Thêm nhân viên mẫu
        transactions = new ArrayList<>(); // Tạo danh sách giao dịch
    }
    
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        checkAvailabilityButton = new javax.swing.JButton();
        releaseButton = new javax.swing.JButton();
        reserveButton = new javax.swing.JButton();
        addCustomerButton = new javax.swing.JButton();
        viewTransactionButton = new javax.swing.JButton();
        generateReportButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        calculateChargesButton = new javax.swing.JButton();
        sendNotificationButton = new javax.swing.JButton();
        viewAttendantInfoButton = new javax.swing.JButton();
        btnUserInterface = new javax.swing.JButton();
        btnAdminInterface = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setText("Parking Lot Management System");

        checkAvailabilityButton.setText("Check Availability");
        checkAvailabilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAvailabilityButtonActionPerformed(evt);
            }
        });

        releaseButton.setText("Release Parking Spot");
        releaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                releaseButtonActionPerformed(evt);
            }
        });

        reserveButton.setText("Reserve Parking Spot");
        reserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveButtonActionPerformed(evt);
            }
        });

        addCustomerButton.setText("Add Customer");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });

        viewTransactionButton.setText("View Transaction History");
        viewTransactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTransactionButtonActionPerformed(evt);
            }
        });

        generateReportButton.setText("Generate Report");
        generateReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit System");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        calculateChargesButton.setText("Calculate Charges");
        calculateChargesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateChargesButtonActionPerformed(evt);
            }
        });

        sendNotificationButton.setText("Send Notification");
        sendNotificationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendNotificationButtonActionPerformed(evt);
            }
        });

        viewAttendantInfoButton.setText("View Attendant Info");
        viewAttendantInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAttendantInfoButtonActionPerformed(evt);
            }
        });

        btnUserInterface.setText("User Interface");
        btnUserInterface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserInterfaceActionPerformed(evt);
            }
        });

        btnAdminInterface.setText("Admin Interface");
        btnAdminInterface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminInterfaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewAttendantInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(releaseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reserveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkAvailabilityButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnUserInterface, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(generateReportButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewTransactionButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addCustomerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculateChargesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(sendNotificationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdminInterface, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAvailabilityButton)
                    .addComponent(addCustomerButton)
                    .addComponent(exitButton))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(releaseButton)
                    .addComponent(viewTransactionButton)
                    .addComponent(calculateChargesButton))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reserveButton)
                    .addComponent(generateReportButton)
                    .addComponent(sendNotificationButton))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewAttendantInfoButton)
                    .addComponent(btnUserInterface)
                    .addComponent(btnAdminInterface))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkAvailabilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAvailabilityButtonActionPerformed
         int availableSpots = parkingLot.getAvailableSpacesCount();
          JOptionPane.showMessageDialog(this, "Number of available parking spots: " + availableSpots);
    }//GEN-LAST:event_checkAvailabilityButtonActionPerformed

    private void releaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_releaseButtonActionPerformed
         String input = JOptionPane.showInputDialog(this, "Enter Parking Spot ID to release (1-10):");
        if (input != null) {
            try {
                int spaceId = Integer.parseInt(input);
                if (parkingLot.releaseSpace(spaceId)) {
                    JOptionPane.showMessageDialog(this, "Parking spot " + spaceId + " released successfully.");
                    Transaction transaction = new Transaction("T" + (transactions.size() + 1), "N/A", "N/A", "Release", 0.0, new Date());
                    transactions.add(transaction);
                } else {
                    JOptionPane.showMessageDialog(this, "Parking spot " + spaceId + " is already available or does not exist.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
            }
        }
    }//GEN-LAST:event_releaseButtonActionPerformed

    private void reserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveButtonActionPerformed
    String input = JOptionPane.showInputDialog(this, "Enter Parking Spot ID to reserve (1-10):");
        if (input != null) {
            try {
                int spaceId = Integer.parseInt(input);
                if (parkingLot.getParkingSpace(spaceId) != null && parkingLot.getParkingSpace(spaceId).isAvailable()) {
                    String ownerName = JOptionPane.showInputDialog(this, "Enter Owner Name:");
                    String licensePlate = JOptionPane.showInputDialog(this, "Enter License Plate:");
                    String vehicleType = JOptionPane.showInputDialog(this, "Enter Vehicle Type:");

                    if (ownerName != null && licensePlate != null && vehicleType != null) {
                        Vehicle vehicle = new Vehicle(licensePlate, ownerName, vehicleType);
                        if (parkingLot.reserveSpace(spaceId, vehicle)) {
                            JOptionPane.showMessageDialog(this, "Parking spot " + spaceId + " reserved successfully for vehicle: " + vehicle);
                            Transaction transaction = new Transaction("T" + (transactions.size() + 1), ownerName, licensePlate, "Reserve", 0.0, new Date());
                            transactions.add(transaction);
                        } else {
                            JOptionPane.showMessageDialog(this, "Parking spot " + spaceId + " is already reserved.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Reservation cancelled.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Parking spot " + spaceId + " is not available or does not exist.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
            }
        }
    }//GEN-LAST:event_reserveButtonActionPerformed

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButtonActionPerformed
         String name = JOptionPane.showInputDialog(this, "Enter Customer Name:");
        String phoneNumber = JOptionPane.showInputDialog(this, "Enter Phone Number:");
        String email = JOptionPane.showInputDialog(this, "Enter Email:");

        if (name != null && phoneNumber != null && email != null) {
            Customer customer = new Customer(name, phoneNumber, email);
            customers.add(customer);
            JOptionPane.showMessageDialog(this, "Customer added successfully: " + customer);
        } else {
            JOptionPane.showMessageDialog(this, "Customer addition cancelled.");
        }
    }//GEN-LAST:event_addCustomerButtonActionPerformed

    private void viewTransactionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTransactionButtonActionPerformed
         StringBuilder transactionHistory = new StringBuilder();
    for (Transaction transaction : transactions) {
        transactionHistory.append(transaction.toString()).append("\n");
    }
    JOptionPane.showMessageDialog(this, transactionHistory.length() > 0 ? transactionHistory.toString() : "No transactions found.");
    }//GEN-LAST:event_viewTransactionButtonActionPerformed

    private void generateReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportButtonActionPerformed
        // Giả lập việc tạo báo cáo
    StringBuilder report = new StringBuilder("Parking Lot Report:\n");
    report.append("Total Spots: ").append(parkingLot.getTotalSpaces()).append("\n");
    report.append("Available Spots: ").append(parkingLot.getAvailableSpacesCount()).append("\n");
    report.append("Total Transactions: ").append(transactions.size()).append("\n");
    
    // Thêm thông tin giao dịch chi tiết vào báo cáo
    for (Transaction transaction : transactions) {
        report.append(transaction.toString()).append("\n");
    }

    JOptionPane.showMessageDialog(this, report.toString());
    }//GEN-LAST:event_generateReportButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
       System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void calculateChargesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateChargesButtonActionPerformed
           String input = JOptionPane.showInputDialog(this, "Enter Parking Spot ID to calculate charges (1-10):");
    if (input != null) {
        try {
            int spaceId = Integer.parseInt(input);
            if (parkingLot.getParkingSpace(spaceId) != null && !parkingLot.getParkingSpace(spaceId).isAvailable()) {
                double ratePerHour = 20.0;
                long hoursParked = Long.parseLong(JOptionPane.showInputDialog(this, "Enter number of hours parked:"));

                double totalCharges = hoursParked * ratePerHour;

                JOptionPane.showMessageDialog(this, "Total parking charges for spot " + spaceId + ": $" + totalCharges);

                // Tạo giao dịch mới và thêm vào danh sách giao dịch
                Transaction transaction = new Transaction("T" + (transactions.size() + 1), "N/A", "N/A", "Calculate Charges", totalCharges, new Date());
                transactions.add(transaction);
            } else {
                JOptionPane.showMessageDialog(this, "Parking spot " + spaceId + " is not reserved or does not exist.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
        }
    }
    }//GEN-LAST:event_calculateChargesButtonActionPerformed

    private void sendNotificationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendNotificationButtonActionPerformed
        String recipient = JOptionPane.showInputDialog(this, "Enter recipient name or email:");
        String message = JOptionPane.showInputDialog(this, "Enter the message:");

        if (recipient != null && message != null) {
            Notification notification = new Notification(recipient, message);
            notification.send();
            JOptionPane.showMessageDialog(this, "Notification sent successfully to " + recipient);
            } else {
            JOptionPane.showMessageDialog(this, "Notification cancelled.");
        }        
    }//GEN-LAST:event_sendNotificationButtonActionPerformed

    private void viewAttendantInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAttendantInfoButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Attendant Information: " + attendants);
    }//GEN-LAST:event_viewAttendantInfoButtonActionPerformed

    private void btnUserInterfaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserInterfaceActionPerformed
         new UserScreen(); // Mở giao diện người dùng
         dispose(); // Đóng MainScreen
    }//GEN-LAST:event_btnUserInterfaceActionPerformed

    private void btnAdminInterfaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminInterfaceActionPerformed
        String password = JOptionPane.showInputDialog("Enter admin password:");
        if ("admin123".equals(password)) { // Kiểm tra mật khẩu
            new AdminScreen(); // Mở giao diện quản trị viên
            dispose(); // Đóng MainScreen
        } else {
            JOptionPane.showMessageDialog(this, "Invalid password!");
        }
    }//GEN-LAST:event_btnAdminInterfaceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JButton btnAdminInterface;
    private javax.swing.JButton btnUserInterface;
    private javax.swing.JButton calculateChargesButton;
    private javax.swing.JButton checkAvailabilityButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton generateReportButton;
    private javax.swing.JButton releaseButton;
    private javax.swing.JButton reserveButton;
    private javax.swing.JButton sendNotificationButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewAttendantInfoButton;
    private javax.swing.JButton viewTransactionButton;
    // End of variables declaration//GEN-END:variables
}
