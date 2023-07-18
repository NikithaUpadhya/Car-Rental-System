/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leelynnchanel
 */
public class PurchaseHistory extends javax.swing.JFrame {
    Path filePath = Paths.get(".", "RentalBooking.txt");
    /**
     * Creates new form PurchaseHistory
     */
    public PurchaseHistory() {
        initComponents();
    }
    
    public PurchaseHistory(String username) {
        initComponents();
        lblUser1.setText(username);
        try {
            DefaultTableModel model = (DefaultTableModel)historyTable.getModel();

            BufferedReader br = Files.newBufferedReader(filePath);         
            Object[] Lines = br.lines().toArray();
            int i = 0;
            model.setRowCount(0);  
            for ( i = 0; i < Lines.length; i ++){
                String Line = Lines[i].toString().trim();
                String[] Row = Line.split(",");
                if (username.equals(Row[6])) {
                    String r = Row[0] +"," +  Row[1] +"," + Row[2] +"," + Row[3] +"," + Row[4] +"," + Row[5];
                    String[] Row2 = r.split(",");
                    System.out.println("r"+ r);
                    System.out.println("row2" + Row2);
                     model.addRow(Row2);
                }
            } 
        } catch (Exception ex) {
                ex.printStackTrace();
        } 
    }
    
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        profileLbl = new javax.swing.JLabel();
        logoutLbl = new javax.swing.JLabel();
        carrentalBtn = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblUser1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(114, 82, 17));

        profileLbl.setBackground(new java.awt.Color(153, 102, 0));
        profileLbl.setFont(new java.awt.Font("Kohinoor Bangla", 1, 18)); // NOI18N
        profileLbl.setForeground(new java.awt.Color(255, 255, 255));
        profileLbl.setText("Profile");
        profileLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileLblMouseClicked(evt);
            }
        });

        logoutLbl.setBackground(new java.awt.Color(153, 102, 0));
        logoutLbl.setFont(new java.awt.Font("Kohinoor Bangla", 1, 18)); // NOI18N
        logoutLbl.setForeground(new java.awt.Color(255, 255, 255));
        logoutLbl.setText("Logout");
        logoutLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLblMouseClicked(evt);
            }
        });

        carrentalBtn.setBackground(new java.awt.Color(153, 102, 0));
        carrentalBtn.setFont(new java.awt.Font("Kohinoor Bangla", 1, 18)); // NOI18N
        carrentalBtn.setForeground(new java.awt.Color(255, 255, 255));
        carrentalBtn.setText("Car Rental Booking");
        carrentalBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carrentalBtnMouseClicked(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(153, 102, 0));
        jLabel24.setFont(new java.awt.Font("Kohinoor Bangla", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Booking History");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logoutLbl)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(profileLbl)
                    .addComponent(carrentalBtn))
                .addGap(32, 32, 32))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(profileLbl)
                .addGap(39, 39, 39)
                .addComponent(carrentalBtn)
                .addGap(39, 39, 39)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(logoutLbl)
                .addGap(14, 14, 14))
        );

        jLabel9.setBackground(new java.awt.Color(153, 102, 0));
        jLabel9.setFont(new java.awt.Font("Kohinoor Bangla", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 51, 0));
        jLabel9.setText("My Booking History");

        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Registration No.", "Car Type", "Start Date", "Return Date", "Total", "Fine"
            }
        ));
        jScrollPane1.setViewportView(historyTable);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Welcome back, ");

        lblUser1.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        lblUser1.setText("Welcome back, ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(294, 294, 294))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUser1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblUser1))
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLblMouseClicked
        new LoginCus().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutLblMouseClicked

    private void carrentalBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carrentalBtnMouseClicked
       String un = lblUser1.getText();
        new CarBooking(un).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_carrentalBtnMouseClicked

    private void profileLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileLblMouseClicked
        String un = lblUser1.getText();
        new Profile(un).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_profileLblMouseClicked

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
            java.util.logging.Logger.getLogger(PurchaseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carrentalBtn;
    private javax.swing.JTable historyTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JLabel logoutLbl;
    private javax.swing.JLabel profileLbl;
    // End of variables declaration//GEN-END:variables
}