/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import daoImpl.ICustomerImpl;
import entities.Customer;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FSAddCustomer extends javax.swing.JFrame {

    /**
     * Creates new form FAddCustomer
     */
    public FSAddCustomer() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtGovernmentID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAdd = new javax.swing.JTextField();
        txtCCNo = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        dcsCCExpiry = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Customer");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "New Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(51, 51, 255)));

        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Name");

        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Address");

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Phone");

        btnOk.setText("Submit");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Email");

        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Government ID");

        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Credit card Number");

        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Credit card Expiry Date ");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");

        dcsCCExpiry.setBackground(new java.awt.Color(255, 255, 255));
        dcsCCExpiry.setForeground(new java.awt.Color(255, 0, 0));
        dcsCCExpiry.setToolTipText("");
        dcsCCExpiry.setDateFormatString("yyyy/MM/dd");
        dcsCCExpiry.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtGovernmentID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAdd, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCCNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(dcsCCExpiry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGovernmentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCCNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(dcsCCExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnOk)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        String name = txtName.getText();
        String ID = txtGovernmentID.getText();
        String phone = txtPhone.getText();
        String mail = txtEmail.getText();
        String add = txtAdd.getText();
        String ccNo = txtCCNo.getText();
        Date date = dcsCCExpiry.getDate();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name is compulsory");
            txtName.requestFocus();
        } else if (!Pattern.compile("[a-z ]+", Pattern.CASE_INSENSITIVE).matcher(name).matches()) {
            JOptionPane.showMessageDialog(null, "Name must be latin characters");
            txtName.requestFocus();
        } else if (name.trim().length() > 30) {
            JOptionPane.showMessageDialog(null, "Name no more than 30 characters");
            txtName.requestFocus();
        } else if (ID.isEmpty()) {
            JOptionPane.showMessageDialog(null, "GovernmentID is compulsory");
            txtGovernmentID.requestFocus();
        } else if (!Pattern.compile("[0-9]+").matcher(ID).matches()) {
            JOptionPane.showMessageDialog(null, "GovernmentID must be digit characters");
            txtGovernmentID.requestFocus();
        } else if (ID.trim().length() > 20) {
            JOptionPane.showMessageDialog(null, "GovernmentID no more than 20 characters");
            txtGovernmentID.requestFocus();
        } else if (phone.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Phone is compulsory");
            txtPhone.requestFocus();
        } else if (!Pattern.compile("[0-9]+").matcher(phone).matches()) {
            JOptionPane.showMessageDialog(null, "Phone must be digit characters");
            txtPhone.requestFocus();
        } else if (phone.trim().length() > 15) {
            JOptionPane.showMessageDialog(null, "Phone no more than 15 characters");
            txtPhone.requestFocus();
        } else if (mail.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Email is compulsory");
            txtEmail.requestFocus();
        } else if (!Pattern.compile("^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*(\\_[a-zA-Z0-9]+)*\\@[a-z]+(\\.[a-z]+)*(\\.[a-z]{2,})$").matcher(mail).matches()) {
            JOptionPane.showMessageDialog(null, "Email is invalid");
            txtEmail.requestFocus();
        } else if (mail.trim().length() > 30) {
            JOptionPane.showMessageDialog(null, "Email no more than 30 characters");
            txtEmail.requestFocus();
        } else if (add.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Address is compulsory");
            txtAdd.requestFocus();
        } else if (!Pattern.compile("[a-zA-Z0-9 -/,.]+").matcher(add).matches()) {
            JOptionPane.showMessageDialog(null, "Address is invalid");
            txtAdd.requestFocus();
        } else if (add.trim().length() > 100) {
            JOptionPane.showMessageDialog(null, "Address no more than 100 characters");
            txtAdd.requestFocus();
        } else if (ccNo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Credit card is compulsory");
            txtCCNo.requestFocus();
        } else if (!Pattern.compile("[0-9]+").matcher(ccNo).matches()) {
            JOptionPane.showMessageDialog(null, "Credit card is digit characters");
            txtCCNo.requestFocus();
        } else if (ccNo.trim().length() > 20) {
            JOptionPane.showMessageDialog(null, "Credit card no more than 20 characters");
            txtCCNo.requestFocus();
        } else if (date == null) {
            JOptionPane.showMessageDialog(null, "Please choose valid date of Credit card expiry");
        } else {
            Customer c = new Customer(0, name, ID, add, phone, mail, ccNo, date, date);
            ICustomerImpl ici = new ICustomerImpl();
            if (ici.insertTan(c)) {
                JOptionPane.showMessageDialog(null, "Insert completed");
                FSSelectCustomer.it.model2.addRow(c.toVector());
                FSSelectCustomer.it.count++;
                if (FSSelectCustomer.it.count == FSSelectCustomer.it.max) {
                    FSSelectCustomer.it.dis();
                }
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Insert failed");
            }
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtAdd.setText(null);
        txtCCNo.setText(null);
        txtEmail.setText(null);
        txtGovernmentID.setText(null);
        txtName.setText(null);
        txtPhone.setText(null);
        dcsCCExpiry.setDate(null);
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FSAddCustomer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnReset;
    private com.toedter.calendar.JDateChooser dcsCCExpiry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtCCNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGovernmentID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}