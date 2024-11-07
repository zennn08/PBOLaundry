/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.aqul.pbolaundry.view;

import com.aqul.pbolaundry.Credential;
import com.aqul.pbolaundry.Database;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class FormLogin extends javax.swing.JFrame {

    private int xx, xy;
    /**
     * Creates new form FormLogin
     */
    public FormLogin() {
        initComponents();
        
        // Menjadikan background transparant
        setBackground(new Color(0, 0, 0, 0));
        
        // Menyembunyikan hide eye password
        eyeHideButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        panelUtama = new com.aqul.pbolaundry.palette.Custom_JPanelRounded();
        custom_JPanelRounded1 = new com.aqul.pbolaundry.palette.Custom_JPanelRounded();
        imageLogo = new javax.swing.JLabel();
        buttonClose = new javax.swing.JLabel();
        usernameTextField = new com.aqul.pbolaundry.palette.Custom_JTextFieldRounded();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        loginButton = new com.aqul.pbolaundry.palette.Custom_JButtonRounded();
        helloLabel = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        eyeButton = new javax.swing.JLabel();
        eyeHideButton = new javax.swing.JLabel();
        passwordField = new com.aqul.pbolaundry.palette.Custom_JPasswordFieldRounded();
        usernameAlert = new javax.swing.JLabel();
        passwordAlert = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/logo.png")).getImage());
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        panelUtama.setBackground(new java.awt.Color(255, 255, 255));
        panelUtama.setRoundBottomLeft(20);
        panelUtama.setRoundBottomRight(20);
        panelUtama.setRoundTopLeft(20);
        panelUtama.setRoundTopRight(20);
        panelUtama.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        custom_JPanelRounded1.setBackground(new java.awt.Color(204, 255, 255));
        custom_JPanelRounded1.setRoundBottomRight(20);
        custom_JPanelRounded1.setRoundTopRight(20);

        imageLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundry_logo.png"))); // NOI18N

        buttonClose.setForeground(new java.awt.Color(102, 102, 102));
        buttonClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonClose.setText("x");
        buttonClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout custom_JPanelRounded1Layout = new javax.swing.GroupLayout(custom_JPanelRounded1);
        custom_JPanelRounded1.setLayout(custom_JPanelRounded1Layout);
        custom_JPanelRounded1Layout.setHorizontalGroup(
            custom_JPanelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custom_JPanelRounded1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(imageLogo)
                .addGap(43, 43, 43))
            .addComponent(buttonClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        custom_JPanelRounded1Layout.setVerticalGroup(
            custom_JPanelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, custom_JPanelRounded1Layout.createSequentialGroup()
                .addComponent(buttonClose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(imageLogo)
                .addGap(51, 51, 51))
        );

        panelUtama.add(custom_JPanelRounded1, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 0, -1, -1));

        usernameTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        usernameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameTextFieldKeyPressed(evt);
            }
        });
        panelUtama.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 149, 288, 40));

        usernameLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(102, 102, 102));
        usernameLabel.setText("Username");
        panelUtama.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 127, -1, -1));

        passwordLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(102, 102, 102));
        passwordLabel.setText("Password");
        panelUtama.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 211, -1, -1));

        loginButton.setText("LOGIN");
        loginButton.setFillClick(new java.awt.Color(41, 128, 220));
        loginButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        panelUtama.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 295, 288, 40));

        helloLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        helloLabel.setText("Hello,");
        panelUtama.add(helloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 52, -1, -1));

        welcomeLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        welcomeLabel.setText("Welcome");
        panelUtama.add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 83, -1, -1));

        eyeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-eye-20.png"))); // NOI18N
        eyeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eyeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeButtonMouseClicked(evt);
            }
        });
        panelUtama.add(eyeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 20, 30));

        eyeHideButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-hide-20.png"))); // NOI18N
        eyeHideButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eyeHideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeHideButtonMouseClicked(evt);
            }
        });
        panelUtama.add(eyeHideButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 20, 30));

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });
        panelUtama.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 233, 288, 40));

        usernameAlert.setForeground(new java.awt.Color(255, 0, 0));
        panelUtama.add(usernameAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        passwordAlert.setForeground(new java.awt.Color(255, 0, 0));
        panelUtama.add(passwordAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 274, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void buttonCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCloseMouseClicked
        dispose();
        System.exit(0);
    }//GEN-LAST:event_buttonCloseMouseClicked

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void eyeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeButtonMouseClicked
        passwordField.setEchoChar('\0');
        eyeHideButton.setVisible(true);
        eyeButton.setVisible(false);
    }//GEN-LAST:event_eyeButtonMouseClicked

    private void eyeHideButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeHideButtonMouseClicked
        passwordField.setEchoChar('*');
        eyeHideButton.setVisible(false);
        eyeButton.setVisible(true);
    }//GEN-LAST:event_eyeHideButtonMouseClicked

    private void usernameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTextFieldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            usernameTextField.transferFocus();
        }
    }//GEN-LAST:event_usernameTextFieldKeyPressed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
         if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            loginButton.doClick();
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String username = usernameTextField.getText();
        String password = passwordField.getText();
        boolean nextStep = true;
        
        // Menghapus semua alert
        usernameAlert.setText("");
        passwordAlert.setText("");
        
        // Jila username kosong
        if (username.isEmpty()) {
            usernameAlert.setText("Username harus di isi!");
            nextStep = false;
        } 
        // Jika password kosong
        if (password.isEmpty()) {
            passwordAlert.setText("Password harus di isi!");
            nextStep = false;
        }
        
        if (nextStep) {
            try {
                Connection conn = Database.Connect();
                String query = "SELECT * FROM admin WHERE username = ?";
                PreparedStatement prepare = conn.prepareStatement(query);
                prepare.setString(1, username);
                ResultSet result = prepare.executeQuery();

                // Jika username ada
                if (result.next()) {
                    // Jika passwordnya sama
                    if (password.equals(result.getString("password"))) {
                        Credential creds = new Credential(result.getInt("id"), result.getString("username"), result.getBoolean("is_owner"));
                        if (creds.getIsOwner()) {
                            System.out.println("is_owner");
                        }
                        dispose();
                        FormMain formMain = new FormMain(creds);
                        formMain.changePanelUtama(new MenuCreateOrder(creds));
                        formMain.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Password salah", "", JOptionPane.ERROR_MESSAGE);
                    }
                    
                // Jika username tidak ada    
                } else {
                    JOptionPane.showMessageDialog(this, "Username tidak ditemukan", "", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error : " + e.getMessage(), "Sistem Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buttonClose;
    private com.aqul.pbolaundry.palette.Custom_JPanelRounded custom_JPanelRounded1;
    private javax.swing.JLabel eyeButton;
    private javax.swing.JLabel eyeHideButton;
    private javax.swing.JLabel helloLabel;
    private javax.swing.JLabel imageLogo;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.aqul.pbolaundry.palette.Custom_JButtonRounded loginButton;
    private com.aqul.pbolaundry.palette.Custom_JPanelRounded panelUtama;
    private javax.swing.JLabel passwordAlert;
    private com.aqul.pbolaundry.palette.Custom_JPasswordFieldRounded passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel usernameAlert;
    private javax.swing.JLabel usernameLabel;
    private com.aqul.pbolaundry.palette.Custom_JTextFieldRounded usernameTextField;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
