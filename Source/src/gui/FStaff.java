/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import entities._Account;

/**
 *
 * @author User
 */
public class FStaff extends javax.swing.JFrame {

    /**
     * Creates new form Staff
     */
    public FStaff() {
        initComponents();
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnReception = new javax.swing.JButton();
        btnReservation = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        btnRoom = new javax.swing.JButton();
        btnChangePass = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setPreferredSize(new java.awt.Dimension(0, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/banner_Staff.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnReception.setBackground(new java.awt.Color(153, 0, 153));
        btnReception.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnReception.png"))); // NOI18N
        btnReception.setMaximumSize(new java.awt.Dimension(230, 100));
        btnReception.setMinimumSize(new java.awt.Dimension(230, 100));
        btnReception.setPreferredSize(new java.awt.Dimension(230, 100));
        btnReception.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceptionActionPerformed(evt);
            }
        });

        btnReservation.setBackground(new java.awt.Color(51, 51, 255));
        btnReservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnReservation.png"))); // NOI18N
        btnReservation.setMaximumSize(new java.awt.Dimension(230, 100));
        btnReservation.setMinimumSize(new java.awt.Dimension(230, 100));
        btnReservation.setPreferredSize(new java.awt.Dimension(230, 100));
        btnReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservationActionPerformed(evt);
            }
        });

        btnPayment.setBackground(new java.awt.Color(204, 102, 0));
        btnPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnPayment.png"))); // NOI18N
        btnPayment.setMaximumSize(new java.awt.Dimension(230, 100));
        btnPayment.setMinimumSize(new java.awt.Dimension(230, 100));
        btnPayment.setPreferredSize(new java.awt.Dimension(230, 100));
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        btnRoom.setBackground(new java.awt.Color(204, 0, 0));
        btnRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnRoom.png"))); // NOI18N
        btnRoom.setMaximumSize(new java.awt.Dimension(230, 100));
        btnRoom.setMinimumSize(new java.awt.Dimension(230, 100));
        btnRoom.setPreferredSize(new java.awt.Dimension(230, 100));
        btnRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomActionPerformed(evt);
            }
        });

        btnChangePass.setBackground(new java.awt.Color(0, 0, 153));
        btnChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnChangePass.png"))); // NOI18N
        btnChangePass.setMaximumSize(new java.awt.Dimension(230, 100));
        btnChangePass.setMinimumSize(new java.awt.Dimension(230, 100));
        btnChangePass.setPreferredSize(new java.awt.Dimension(230, 100));
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(102, 102, 102));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnLogout.png"))); // NOI18N
        btnLogout.setMaximumSize(new java.awt.Dimension(230, 100));
        btnLogout.setMinimumSize(new java.awt.Dimension(230, 100));
        btnLogout.setPreferredSize(new java.awt.Dimension(230, 100));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnReception, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, 27)
                        .addComponent(btnRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReception, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservationActionPerformed
        FSReservationMenu reser = new FSReservationMenu();
        reser.setAccount(acc);
        reser.setLocationRelativeTo(this);
        reser.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReservationActionPerformed

    private void btnReceptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceptionActionPerformed
        FSReceptionMenu recep = new FSReceptionMenu();
        recep.setAccount(acc);
        recep.setLocationRelativeTo(this);
        recep.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReceptionActionPerformed

    private void btnRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomActionPerformed
        FSServiceMenu room = new FSServiceMenu();
        room.setAccount(acc);
        room.setLocationRelativeTo(this);
        room.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRoomActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        FSPaymentMenu payment = new FSPaymentMenu();
        payment.setAccount(acc);
        payment.setLocationRelativeTo(this);
        payment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        FChangePass change = new FChangePass(acc.getUserName());
        change.setAccount(acc);
        change.setLocationRelativeTo(this);
        change.setVisible(true);
    }//GEN-LAST:event_btnChangePassActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        FLogin logout = new FLogin();
        logout.setLocationRelativeTo(this);
        logout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePass;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnReception;
    private javax.swing.JButton btnReservation;
    private javax.swing.JButton btnRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
    _Account acc = new _Account();
    public void setAccount(_Account aa){
        acc = aa;
    }
}
