/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui;

import com.ui.mainForm;
import com.dao.UserDAO;
import com.models.User;
import static com.ui.mainForm.Desktop1;
import static com.ui.mainForm.mnu;
import static com.ui.mainForm.mnuHT;
import static com.ui.mainForm.mnuTG;
import static com.ui.mainForm.mnuTL;
import static com.ui.mainForm.mnuTruyen;
import com.utils.Auth;
import com.utils.MsgBox;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;

/**
 *
 * @author admin
 */
public class Login extends javax.swing.JInternalFrame {

    /**
     * Creates new form Login
     */
    UserDAO dao = new UserDAO();

    public Login() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        lblpass = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        btnLog = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        lblDK = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/hinh-chibi-3.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 576));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbltitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbltitle.setText("Đăng Nhập");

        lbluser.setBackground(new java.awt.Color(255, 255, 255));
        lbluser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbluser.setForeground(new java.awt.Color(51, 51, 51));
        lbluser.setText("Username");

        txtuser.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtuser.setText("nv001");
        txtuser.setBorder(null);
        txtuser.setOpaque(false);
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });

        lblpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblpass.setForeground(new java.awt.Color(51, 51, 51));
        lblpass.setText("Password");

        txtpass.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtpass.setText("12345");
        txtpass.setBorder(null);
        txtpass.setOpaque(false);

        btnLog.setBackground(new java.awt.Color(255, 153, 153));
        btnLog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLog.setText("Đăng Nhập");
        btnLog.setBorder(null);
        btnLog.setOpaque(false);
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        lblDK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDK.setForeground(new java.awt.Color(51, 51, 255));
        lblDK.setText("Đăng ký");
        lblDK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDKMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtpass)
                                .addComponent(txtuser)
                                .addComponent(lblpass, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDK)
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblpass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblDK)
                .addGap(18, 18, 18)
                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 0, 450, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_btnLogActionPerformed

    private void lblDKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDKMouseClicked
        // TODO add your handling code here:
        DangKy dk = new DangKy();
        Desktop1.add(dk);
        this.dispose();
        dk.setVisible(true);
    }//GEN-LAST:event_lblDKMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDK;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lbluser;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
    private void login() {
        String user = txtuser.getText();
        String pass = new String(txtpass.getPassword());
        try {
            User us = dao.selectByID(user);
            if (us == null) {
                MsgBox.alert(this, "Sai tên đăng nhập");
                return;
            } else if (!pass.equals(us.getPass())) {
                MsgBox.alert(this, "Sai mật khẩu");
            } else {
                Auth.user = us;
                if (Auth.isManager()) {
                    mnuTG.setVisible(true);
                    mnuHT.setVisible(true);
                    mnuTL.setVisible(true);
                    mnuTruyen.setVisible(true);
                } else {

                    mnuHT.setVisible(false);

                }
                this.dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void init() {
        JDesktopPane Desktop1 = mainForm.Desktop1;
        Dimension size1 = Desktop1.getSize();
        Dimension size = this.getSize();
        this.setLocation((size1.width - size.width) / 2, (size1.height - size.height) / 2);
    }
}
