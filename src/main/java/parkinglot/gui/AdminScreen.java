/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parkinglot.gui;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.Box;
import parkinglot.transaction.Transaction;
import parkinglot.core.ParkingLot;
import parkinglot.core.User;
import javax.swing.table.DefaultTableModel;
import parkinglot.core.Customer;
import Controller.CustomerController;
import parkinglot.user.Admin;  // Import lớp Admin
import Controller.CustomerService;
import parkinglot.service.EmailService;  // Thêm dòng này để import EmailService
import parkinglot.user.MorningAttendant;
import parkinglot.user.NightAttendant;
import parkinglot.user.ParkingAttendant;



/**
 *
 * @author Maxsys
 */
public class AdminScreen extends javax.swing.JFrame {
    private ArrayList<Transaction> transactions;
    private ParkingLot parkingLot;
    private ArrayList<User> users;
    private UserScreen userScreen; // Tham chiếu đến UserScreen
    private DefaultTableModel tableModel; // Khai báo biến DefaultTableModel
    


    /**
     * Creates new form AdminScreen
     */
    public void updateParkingStatus(String licensePlate, String status) {
    // Ví dụ: Cập nhật trạng thái trong giao diện hoặc thông báo
    System.out.println("Vehicle " + licensePlate + " has been updated to status: " + status);
}

    public AdminScreen(ParkingLot parkingLot, ArrayList<Transaction> transactions) {
       this.parkingLot = parkingLot;
        this.transactions = transactions;
        this.users = new ArrayList<>();
        initComponents();
        this.setVisible(true); // Ensure the UI is displayed
        tableModel = (DefaultTableModel) jTable1.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddCustomer = new javax.swing.JButton();
        btnGenerateReport = new javax.swing.JButton();
        btnViewTransactions = new javax.swing.JButton();
        btnReleaseSpot = new javax.swing.JButton();
        btnSendNotification = new javax.swing.JButton();
        btnViewAttendantInfo = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAddCustomer.setText("Add Customer");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        btnGenerateReport.setText("Generate Report");
        btnGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateReportActionPerformed(evt);
            }
        });

        btnViewTransactions.setText("View Transactions");
        btnViewTransactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTransactionsActionPerformed(evt);
            }
        });

        btnReleaseSpot.setText("Release Spot");
        btnReleaseSpot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReleaseSpotActionPerformed(evt);
            }
        });

        btnSendNotification.setText("Send Notification");
        btnSendNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendNotificationActionPerformed(evt);
            }
        });

        btnViewAttendantInfo.setText("View Attendant Info");
        btnViewAttendantInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAttendantInfoActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Customer Name", "Phone number", "Email", "PackingSpace id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerateReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewTransactions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReleaseSpot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSendNotification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewAttendantInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReleaseSpot, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnAddCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSendNotification, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnGenerateReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewTransactions, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnViewAttendantInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
     JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTextField txtName = new JTextField(15);
        JTextField txtPhoneNumber = new JTextField(15);
        JTextField txtEmail = new JTextField(15);
        JTextField txtParkingSpaceId = new JTextField(15); // Parking Space ID

        panel.add(new JLabel("Customer Name:"));
        panel.add(txtName);
        panel.add(Box.createVerticalStrut(10));

        panel.add(new JLabel("Phone Number:"));
        panel.add(txtPhoneNumber);
        panel.add(Box.createVerticalStrut(10));

        panel.add(new JLabel("Email:"));
        panel.add(txtEmail);
        panel.add(Box.createVerticalStrut(10));

        panel.add(new JLabel("Parking Space ID:"));
        panel.add(txtParkingSpaceId);

        int result = JOptionPane.showConfirmDialog(this, panel, "Add New Customer", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            String name = txtName.getText();
            String phoneNumber = txtPhoneNumber.getText();
            String email = txtEmail.getText();
            String parkingSpaceIdStr = txtParkingSpaceId.getText();

            if (name.isEmpty() || phoneNumber.isEmpty() || email.isEmpty() || parkingSpaceIdStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields before adding the customer.", "Input Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    int parkingSpaceId = Integer.parseInt(parkingSpaceIdStr); // Convert Parking Space ID to int

                    // Generate a temporary ID or retrieve it from a database
                    int tempId = users.size() + 1; // Example ID generation

                    // Create new User object
                    User newUser = new User(tempId, name, phoneNumber, email, parkingSpaceId);

                    // Create a new Customer object
                    Customer newCustomer = new Customer(name, phoneNumber, email);

                    // Use CustomerController through the CustomerService interface
                    CustomerService customerService = new CustomerController();

                    // Add the customer to the database
                    customerService.addCustomerToDB(newCustomer, newUser);

                    // Add customer details to the table (GUI update)
                    tableModel.addRow(new Object[]{tempId, name, phoneNumber, email, parkingSpaceId});

                    JOptionPane.showMessageDialog(this, "Customer added successfully: " + name);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Parking Space ID must be a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error adding customer: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Add customer action was canceled.");
        }
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void btnGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateReportActionPerformed
             int confirm = JOptionPane.showConfirmDialog(this, "Do you want to generate the report now?", "Generate Report", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.out.println("Generating report...");
        } else {
            System.out.println("Report generation was canceled.");
        }
    }

    private void btnViewTransactionsActionPerformed() {
        
    }//GEN-LAST:event_btnGenerateReportActionPerformed

    private void btnViewTransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTransactionsActionPerformed
       if (transactions.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No transactions available to view.", "View Transactions", JOptionPane.INFORMATION_MESSAGE);
        } else {
            StringBuilder transactionHistory = new StringBuilder();
            for (Transaction transaction : transactions) {
                transactionHistory.append(transaction.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(this, transactionHistory.toString());
        }
    }//GEN-LAST:event_btnViewTransactionsActionPerformed

    private void btnReleaseSpotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReleaseSpotActionPerformed
    String input = JOptionPane.showInputDialog(this, "Enter Parking Spot ID to release (1-50):");
    if (input != null) {
        try {
            int spaceId = Integer.parseInt(input);

            // Attempt to release the parking space
            if (parkingLot.releaseSpace(spaceId)) { // Check if the parking spot is released
                JOptionPane.showMessageDialog(this, "Parking spot " + spaceId + " released successfully.");
                
                          // Delete the customer associated with the parking space
                        System.out.println("Attempting to delete customer associated with Parking Space ID: " + spaceId);
                        CustomerService customerService= new CustomerController();
                                customerService.deleteCustomerByParkingSpaceId(spaceId);

                // Remove the corresponding row from the JTable
                DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
                int rowToRemove = -1;

                // Find the row with the matching Parking Space ID
                for (int i = 0; i < tableModel.getRowCount(); i++) {
                    Object value = tableModel.getValueAt(i, 4); // Assuming column 4 contains ParkingSpaceId
                    if (value != null && Integer.parseInt(value.toString()) == spaceId) {
                        rowToRemove = i;
                        break;
                    }
                }

                // Remove the row if found
                if (rowToRemove != -1) {
                    tableModel.removeRow(rowToRemove); // Remove the row from the table model
                    jTable1.revalidate(); // Refresh the table layout
                    jTable1.repaint();    // Redraw the table to reflect changes
                    JOptionPane.showMessageDialog(this, "Row for Parking Spot " + spaceId + " removed from the table.");
                } else {
                    JOptionPane.showMessageDialog(this, "No matching row found for Parking Spot " + spaceId + " in the table.");
                }

                // Remove the corresponding "Reserve" transaction
                Transaction transactionToRemove = null;
                for (Transaction transaction : transactions) {
                    if ("Reserve".equalsIgnoreCase(transaction.getTransactionType())
                            && transaction.getParkingSpotId() == spaceId) {
                        transactionToRemove = transaction;
                        break;
                    }
                }

                if (transactionToRemove != null) {
                    transactions.remove(transactionToRemove);
                    JOptionPane.showMessageDialog(this, "Related reservation transaction has been removed.");
                }

                // Add a new "Release" transaction
                Transaction transaction = new Transaction(
                        "T" + (transactions.size() + 1), 
                        "Admin", 
                        "N/A", 
                        "Release", 
                        0.0, 
                        new Date(), 
                        "N/A", 
                        "N/A", 
                        spaceId
                );
                transactions.add(transaction);

            } else {
                JOptionPane.showMessageDialog(this, "Parking spot " + spaceId + " is already available or does not exist.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
        }
    }

    }//GEN-LAST:event_btnReleaseSpotActionPerformed

    private void btnViewAttendantInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAttendantInfoActionPerformed
     // Tạo danh sách nhân viên mẫu (có thể thay bằng dữ liệu từ cơ sở dữ liệu)
    ArrayList<ParkingAttendant> attendants = new ArrayList<>();
    attendants.add(new MorningAttendant("Alice", "alice@example.com"));
    attendants.add(new NightAttendant("Bob", "bob@example.com"));

    // Xây dựng chuỗi thông tin để hiển thị
    StringBuilder info = new StringBuilder("Attendant Information:\n");
    for (ParkingAttendant attendant : attendants) {
        info.append("Name: ").append(attendant.getName())
            .append(", Contact Info: ").append(attendant.getContactInfo())
            .append(", Shift: ").append(attendant.getShiftDetails())
            .append("\n");
    }

    // Hiển thị thông tin qua JOptionPane
    JOptionPane.showMessageDialog(this, info.toString(), "Attendant Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnViewAttendantInfoActionPerformed
  
    private void btnSendNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendNotificationActionPerformed
      // Lấy thông báo từ người dùng
    String message = JOptionPane.showInputDialog(this, "Enter the notification message:", "Send Notification", JOptionPane.PLAIN_MESSAGE);
    
    if (message != null && !message.trim().isEmpty()) {
        // Tạo đối tượng CustomerController
        CustomerController customerController = new CustomerController();

        // Gọi phương thức để gửi thông báo tới tất cả khách hàng
        customerController.sendNotificationToAllCustomers(message);
        
        // Thông báo đã gửi
        System.out.println("Notification sent to all customers.");
    } else if (message != null) {
        // Nếu message không hợp lệ (rỗng)
        JOptionPane.showMessageDialog(this, "Notification message cannot be empty.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnSendNotificationActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

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
        java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
        ParkingLot parkingLot = new ParkingLot(50);
        ArrayList<Transaction> transactions = new ArrayList<>();
        new AdminScreen(parkingLot, transactions).setVisible(true);
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGenerateReport;
    private javax.swing.JButton btnReleaseSpot;
    private javax.swing.JButton btnSendNotification;
    private javax.swing.JButton btnViewAttendantInfo;
    private javax.swing.JButton btnViewTransactions;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
