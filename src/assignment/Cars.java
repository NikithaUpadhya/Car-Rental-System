/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment;

import java.beans.Statement;
import javax.swing.*;  
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
/**
 *
 * @author leelynnchanel
 */
public class Cars extends javax.swing.JFrame {

    /**
     * Creates new form Cars
     */
    public Cars() {
        initComponents();
        DisplayCars();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtRegNum = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        cbStatus = new javax.swing.JComboBox<>();
        saveBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        carsTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(153, 102, 0));
        jLabel1.setFont(new java.awt.Font("Kohinoor Bangla", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setText("Car Rental System");

        jLabel2.setFont(new java.awt.Font("Kohinoor Bangla", 0, 18)); // NOI18N
        jLabel2.setText("Username: ");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(100, 100, 100))
        );

        jLabel3.setFont(new java.awt.Font("Kohinoor Bangla", 0, 18)); // NOI18N
        jLabel3.setText("Password:");

        jButton1.setFont(new java.awt.Font("Kohinoor Bangla", 1, 13)); // NOI18N
        jButton1.setText("Login");

        jLabel5.setFont(new java.awt.Font("Kohinoor Bangla", 0, 12)); // NOI18N
        jLabel5.setText("Reset password");

        jLabel6.setFont(new java.awt.Font("Kohinoor Bangla", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 51, 0));
        jLabel6.setText("X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(52, 52, 52))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel8.setBackground(new java.awt.Color(153, 102, 0));
        jLabel8.setFont(new java.awt.Font("Kohinoor Bangla", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 51, 0));
        jLabel8.setText("Car Rental System");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(153, 102, 0));
        jPanel4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel4FocusLost(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(153, 102, 0));
        jLabel9.setFont(new java.awt.Font("Kohinoor Bangla", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 51, 0));
        jLabel9.setText("Cars Management ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(321, 321, 321))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(14, 14, 14))
        );

        jLabel11.setBackground(new java.awt.Color(153, 102, 0));
        jLabel11.setFont(new java.awt.Font("Kohinoor Bangla", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Model");

        jLabel13.setBackground(new java.awt.Color(153, 102, 0));
        jLabel13.setFont(new java.awt.Font("Kohinoor Bangla", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("Registration no.");

        jLabel14.setBackground(new java.awt.Color(153, 102, 0));
        jLabel14.setFont(new java.awt.Font("Kohinoor Bangla", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("Brand");

        jLabel15.setBackground(new java.awt.Color(153, 102, 0));
        jLabel15.setFont(new java.awt.Font("Kohinoor Bangla", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("Status");

        jLabel16.setBackground(new java.awt.Color(153, 102, 0));
        jLabel16.setFont(new java.awt.Font("Kohinoor Bangla", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 0));
        jLabel16.setText("Price Per Day");

        cbStatus.setFont(new java.awt.Font("Kohinoor Bangla", 1, 13)); // NOI18N
        cbStatus.setForeground(new java.awt.Color(153, 0, 0));
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Booked" }));

        saveBtn.setBackground(new java.awt.Color(200, 194, 175));
        saveBtn.setFont(new java.awt.Font("Kohinoor Bangla", 1, 13)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(200, 194, 175));
        deleteBtn.setFont(new java.awt.Font("Kohinoor Bangla", 1, 13)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(200, 194, 175));
        resetBtn.setFont(new java.awt.Font("Kohinoor Bangla", 1, 13)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        carsTable.setFont(new java.awt.Font("Kohinoor Bangla", 0, 13)); // NOI18N
        carsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        carsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(carsTable);

        jLabel12.setBackground(new java.awt.Color(153, 102, 0));
        jLabel12.setFont(new java.awt.Font("Kohinoor Bangla", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 51, 0));
        jLabel12.setText("Car lists");

        editBtn.setBackground(new java.awt.Color(200, 194, 175));
        editBtn.setFont(new java.awt.Font("Kohinoor Bangla", 1, 13)); // NOI18N
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(114, 82, 12));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cars");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Generalized reports ");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Return Cars");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Logout");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Customer booking ");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Booking history");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel7)
                .addGap(51, 51, 51)
                .addComponent(jLabel21)
                .addGap(65, 65, 65)
                .addComponent(jLabel10)
                .addGap(52, 52, 52)
                .addComponent(jLabel22)
                .addGap(53, 53, 53)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRegNum))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtRegNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(deleteBtn)
                    .addComponent(resetBtn)
                    .addComponent(editBtn))
                .addGap(46, 46, 46)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4FocusLost
    JFrame f;
    Object[] row = new Object[5]; 
    ArrayList<CarClass> ArrayCar = new ArrayList<>();

    //Path filePath = Paths.get(".", "cars.txt");
    File filePath = new File("/Users/leelynnchanel/Desktop/3rd Semester/Java/Assignment/cars.txt");
    
    private void DisplayCars() 
    {
        
        try{       
            
              BufferedReader br = new BufferedReader(new FileReader(filePath));   
              //BufferedReader br = Files.newBufferedReader(filePath);
              String firstLine = br.readLine().trim();
              String[] columnsName = firstLine.split(",");
              DefaultTableModel model = (DefaultTableModel)carsTable.getModel();
              model.setColumnIdentifiers((columnsName));
             Object[] tableLines = br.lines().toArray();             

             
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
                
               String rn =  dataRow[0].toString();
               String b = dataRow[1].toString();
               String m = dataRow[2].toString();
               String a = dataRow[3].toString();
               Double p = Double.parseDouble(dataRow[4]);
               
               CarClass newCar = new CarClass(rn,b,m,a,p);
               ArrayCar.add(newCar);
            }
               
        } catch (Exception ex) {
             ex.printStackTrace();
        }
    }
    
    
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        if (txtRegNum.getText().isEmpty() || txtPrice.getText().isEmpty() || txtBrand.getText().isEmpty() || txtModel.getText().isEmpty() || cbStatus.getSelectedIndex() == -1)
        {
          JOptionPane.showMessageDialog(this,"Missing Information. Please re-enter.");

        } else{            
            try (FileWriter fw = new FileWriter(filePath, true);
                BufferedWriter writer = new BufferedWriter(fw); 
                PrintWriter out = new PrintWriter(writer))               
            {    
                out.write(txtRegNum.getText() + ",");
                 out.write(txtBrand.getText()+ ",");
                 out.write(txtModel.getText()+ ",");
                 out.write(cbStatus.getSelectedItem().toString()+ ",");
                 out.write(txtPrice.getText().toString());
                 out.write(System.getProperty("line.separator"));
                 
                row[0] = txtRegNum.getText();
                row[1] = txtBrand.getText();
                row[2] = txtModel.getText();
                row[3] = cbStatus.getSelectedItem().toString();
                row[4] = txtPrice.getText().toString();
                DefaultTableModel model = (DefaultTableModel)carsTable.getModel();
                model.addRow(row);
       
                CarClass NewCar = new CarClass(txtRegNum.getText(), txtBrand.getText(), txtModel.getText(),cbStatus.getSelectedItem().toString(), Double.parseDouble(txtPrice.getText()));
                ArrayCar.add(NewCar);
                
                f = new JFrame();
                JOptionPane.showMessageDialog(f,"New row successfully Updated.","Alert",JOptionPane.INFORMATION_MESSAGE);     

                 out.close();
                 txtRegNum.setText("");
                 txtBrand.setText("");
                 txtModel.setText("");
                 txtPrice.setText("");
                 
            } catch(IOException ex) {
                    ex.printStackTrace();
             }           
          }
    }//GEN-LAST:event_saveBtnActionPerformed

    public static void removeRecord(String rn, String b, String m, String s, String p, int found ) {  
        try
        {
            Path old = Paths.get(".", "cars.txt");
            Path tempFile = Files.createTempFile(old.getParent(), "PendingTemp", ".txt");
            try (BufferedReader reader = Files.newBufferedReader(old);
                BufferedWriter writer = Files.newBufferedWriter(tempFile))
            {
                String line33= rn + "," + b + "," + m + ","+ s + "," + p;
                String line123;
  
                while ((line123 = reader.readLine()) != null)
                { 
                    String trimmedLine = line123.trim();
                    if (trimmedLine.equals(line33)) continue;
                    
                    writer.write(line123 + System.getProperty("line.separator"));
                    found=1;
                }             
            }
            Files.copy(tempFile, old, StandardCopyOption.REPLACE_EXISTING);
            Files.delete(tempFile);
           
        } catch (Exception e){
        }
    }
    
    
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel)carsTable.getModel();
        int SelRow = carsTable.getSelectedRow();
        int found = 0;
        String line; 
//        FileReader fr = new FileReader(filePath);
//        BufferedReader br = new BufferedReader (fr);
        
        if (SelRow >=0)
        {
           model.removeRow(SelRow);

           String reg = txtRegNum.getText();
           try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));    
            
            while ((line = reader.readLine()) != null) {
                 String[] fields = line.split("[,]");  
                 if (reg.equals(fields[0])){
                     found = 1;
                     
                     String regnum = txtRegNum.getText();
                     String brand = txtBrand.getText();
                     String Model = txtModel.getText();
                     String status = cbStatus.getSelectedItem().toString();
                     String price = txtPrice.getText();
                     
                     removeRecord(regnum, brand, Model, status, price, found);
                     if (found == 0)
                        {
                            JOptionPane.showMessageDialog(rootPane, "Record not found.");
                        }
                        if (found == 1)
                        {
                            JOptionPane.showMessageDialog(rootPane, "Record Deleted Successfully");
                            txtRegNum.setText("");
                            txtBrand.setText("");
                            txtModel.setText("");
                            cbStatus.setSelectedIndex(0);
                            txtPrice.setText("");
                        }
                }
           
              }
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
     
       //JOptionPane.showMessageDialog(f,"Row succesfully deleted","Alert",JOptionPane.WARNING_MESSAGE);     
        }
        else
        { 
             //f = new JFrame();
       JOptionPane.showMessageDialog(f,"Row Not Selected","Alert",JOptionPane.WARNING_MESSAGE);     
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void carsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carsTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)carsTable.getModel();
        int index = carsTable.getSelectedRow();
        txtRegNum.setText(model.getValueAt(index, 0).toString());
        txtBrand.setText(model.getValueAt(index, 1).toString());
        txtModel.setText(model.getValueAt(index, 2).toString());
        cbStatus.setSelectedItem(model.getValueAt(index, 3).toString());
        txtPrice.setText(model.getValueAt(index, 4).toString());
    }//GEN-LAST:event_carsTableMouseClicked

    private void Reset() {
        txtRegNum.setText("");
         txtBrand.setText("");
         txtModel.setText("");
         cbStatus.setSelectedIndex(0);
         txtPrice.setText("");
    }
    
    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        Reset();
    }//GEN-LAST:event_resetBtnActionPerformed

    public static void editRecord (String rn, String b, String m, String s, String p, int found){
    try
        {
            Path old = Paths.get(".", "cars.txt");
            Path tempFile = Files.createTempFile(old.getParent(), "PendingTemp", ".txt");
            try (BufferedReader reader = Files.newBufferedReader(old);
                BufferedWriter writer = Files.newBufferedWriter(tempFile))
            {
                String line123;
                // copy everything until the id is found
                while ((line123 = reader.readLine()) != null)
                {
                    String[] fields = line123.split("[,]");
                    System.out.println(fields[0]);
                    if (rn.equals(fields[0]))
                    {
                        found = 1;
                        
                        fields[0] = rn;
                        fields[1] = b;
                        fields[2] = m;
                        fields[3] = s;
                        fields[4] = p;
                                           }
                    writer.write(String.join(",", fields));
                    writer.newLine();
                    found = 1;
                }             
            }
            // copy new file & delete temporary file
            Files.copy(tempFile, old, StandardCopyOption.REPLACE_EXISTING);
            Files.delete(tempFile);
           
        }catch (IOException ex){} 
    }
    
    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        if (txtRegNum.getText().isEmpty() || txtPrice.getText().isEmpty() || txtBrand.getText().isEmpty() || txtModel.getText().isEmpty() || cbStatus.getSelectedIndex() == -1){
          JOptionPane.showMessageDialog(this,"Select the car that you'd like to update.");
        }else{
          //JOptionPane.showMessageDialog(this,"Car update successfully.");
          
          DefaultTableModel model = (DefaultTableModel)carsTable.getModel();
          int index = carsTable.getSelectedRow();
          int found = 0;
          if (index >= 0){
              model.setValueAt(txtRegNum.getText(), index, 0);
              model.setValueAt(txtBrand.getText(), index, 1);
              model.setValueAt(txtModel.getText(), index, 2);
              model.setValueAt(cbStatus.getSelectedItem(), index, 3);
              model.setValueAt(txtPrice.getText(), index, 4);

              
              String reg = txtRegNum.getText();
              String line;
           try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));    
            //BufferedReader reader = Files.newBufferedReader(filePath);
            while ((line = reader.readLine()) != null) {
                 String[] fields = line.split("[,]");  
                 if (reg.equals(fields[0])){
                     found = 1;
                     
                     String regnum = txtRegNum.getText();
                     String brand = txtBrand.getText();
                     String Model = txtModel.getText();
                     String status = cbStatus.getSelectedItem().toString();
                     String price = txtPrice.getText();
                     
                     editRecord(regnum, brand, Model, status, price, found);
                     if (found == 0)
                        {
                            JOptionPane.showMessageDialog(rootPane, "Record not found.");
                        }
                        if (found == 1)
                        {
                            JOptionPane.showMessageDialog(rootPane, "Record Updated Successfully");
                            txtRegNum.setText("");
                            txtBrand.setText("");
                            txtModel.setText("");
                            cbStatus.setSelectedIndex(0);
                            txtPrice.setText("");
                        }
                }
           
              }
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
          } else{
              System.out.println("Update error.");
          }
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        new Cars().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        new Reports().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        new Return().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        new MainJF().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        new Customers().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        new Customer_History().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel23MouseClicked

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
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable carsTable;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRegNum;
    // End of variables declaration//GEN-END:variables
}
