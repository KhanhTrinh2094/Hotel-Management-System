package gui;

import bill.BillCus;
import bill.BillDrink;
import bill.BillFood;
import bill.BillService;
import bill.BillTotal;
import daoImpl.ICustomerImpl;
import daoImpl.IDrinkImpl;
import daoImpl.IFoodImpl;
import daoImpl.IReceptionImpl;
import daoImpl.IRoomImpl;
import daoImpl.IRoomTypeImpl;
import daoImpl.I_ServicesImpl;
import entities.Customer;
import entities.Drink;
import entities.Food;
import entities.Reception;
import entities.Room;
import entities.RoomType;
import entities._Account;
import entities._Services;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class FSPaymentMenu extends javax.swing.JFrame {

    /**
     * Creates new form FSPaymentMenu
     */
    String name, type, checkIn, roomType, checkOut, nameSer, nameDri, nameFo;
    int amount, price, sumDate, roomNo, priceSer, priceDri, priceFo, amountSer = 0, amountDri = 0, amountFo = 0, total = 0;
    String[] serv;
    String[] fo;
    String[] dri;
    public static FSPaymentMenu pm;

    public FSPaymentMenu() {
        initComponents();
        pm = this;
        initModel();
        cbbTypeActionPerformed(null);
        grViewReservationMouseClicked(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbRoom = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbbType = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnPrintBill = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grViewReservation = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(810, 400));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(51, 51, 255)));

        lbRoom.setForeground(new java.awt.Color(51, 51, 255));
        lbRoom.setText("Room");

        txtSearch.setMaximumSize(new java.awt.Dimension(300, 20));

        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Type");

        cbbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Group" }));
        cbbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbType, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRoom)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/banner_Payment.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel6.setBackground(new java.awt.Color(178, 208, 254));

        btnBack.setBackground(new java.awt.Color(51, 153, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnBack.png"))); // NOI18N
        btnBack.setMaximumSize(new java.awt.Dimension(90, 43));
        btnBack.setMinimumSize(new java.awt.Dimension(90, 43));
        btnBack.setPreferredSize(new java.awt.Dimension(90, 43));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(51, 153, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnReset.png"))); // NOI18N
        btnReset.setMaximumSize(new java.awt.Dimension(90, 43));
        btnReset.setMinimumSize(new java.awt.Dimension(90, 43));
        btnReset.setPreferredSize(new java.awt.Dimension(90, 43));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnPrintBill.setBackground(new java.awt.Color(51, 153, 255));
        btnPrintBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnBill.png"))); // NOI18N
        btnPrintBill.setEnabled(false);
        btnPrintBill.setMaximumSize(new java.awt.Dimension(90, 43));
        btnPrintBill.setMinimumSize(new java.awt.Dimension(90, 43));
        btnPrintBill.setPreferredSize(new java.awt.Dimension(90, 43));
        btnPrintBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintBillActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnSearch.png"))); // NOI18N
        btnSearch.setMaximumSize(new java.awt.Dimension(90, 43));
        btnSearch.setMinimumSize(new java.awt.Dimension(90, 43));
        btnSearch.setPreferredSize(new java.awt.Dimension(90, 43));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPrintBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrintBill, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        grViewReservation.setAutoCreateRowSorter(true);
        grViewReservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "roomid", "deputyid", "cus", "Room", "Deputy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grViewReservation.getTableHeader().setReorderingAllowed(false);
        grViewReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grViewReservationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grViewReservation);
        grViewReservation.getColumnModel().getColumn(0).setMinWidth(0);
        grViewReservation.getColumnModel().getColumn(0).setPreferredWidth(0);
        grViewReservation.getColumnModel().getColumn(0).setMaxWidth(0);
        grViewReservation.getColumnModel().getColumn(1).setMinWidth(0);
        grViewReservation.getColumnModel().getColumn(1).setPreferredWidth(0);
        grViewReservation.getColumnModel().getColumn(1).setMaxWidth(0);
        grViewReservation.getColumnModel().getColumn(2).setMinWidth(0);
        grViewReservation.getColumnModel().getColumn(2).setPreferredWidth(0);
        grViewReservation.getColumnModel().getColumn(2).setMaxWidth(0);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintBillActionPerformed
        amountSer = 0;
        amountDri = 0;
        amountFo = 0;
        total = 0;
        int i = grViewReservation.getSelectedRow();
        int j = cbbType.getSelectedIndex();
        int row = 0;
        IReceptionImpl iri = new IReceptionImpl();
        for (Reception item : iri.getListTan()) {
            if ((item.getCusGroupID() == Integer.parseInt(grViewReservation.getValueAt(i, 1).toString()))) {
                row++;
            }
        }
        if (cbbType.getSelectedIndex() == 0) {
            if (grViewReservation.getSelectedRowCount() == 1) {
                for (Reception item : iri.getListTan()) {
                    if (grViewReservation.getValueAt(i, 0).equals(item.getRoomID())) {
                        view(item, j);
                        report();
                        FSPayment pm = new FSPayment(item, j);
                        pm.setLocationRelativeTo(this);
                        pm.setVisible(true);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please only choose one row of this ID for Single");
            }
        } else {

            if (grViewReservation.getSelectedRows().length == row) {
                for (int rowSelect : grViewReservation.getSelectedRows()) {
                    if (!grViewReservation.getValueAt(rowSelect, 1).equals(grViewReservation.getValueAt(i, 1))) {
                        JOptionPane.showMessageDialog(null, "Pleasse choose all row of this ID for Group");
                        return;
                    }
                }
                for (Reception item : iri.getListTan()) {
                    if (item.getCusGroupID() == Integer.parseInt(grViewReservation.getValueAt(i, 1).toString())) {
                        amountDri = amountFo = amountSer = total = 0;
                        view(item, j);
                        report();
                    }
                }
                for (Reception item : iri.getListTan()) {
                    if (item.getCusGroupID() == Integer.parseInt(grViewReservation.getValueAt(i, 1).toString())) {
                        FSPayment pm = new FSPayment(item, j);
                        pm.setLocationRelativeTo(this);
                        pm.setVisible(true);
                        break;
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Please choose all row of this ID for Group");
            }
        }
    }//GEN-LAST:event_btnPrintBillActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String s = txtSearch.getText();
        String s1 = "^" + s + "$";
        if (cbbType.getSelectedIndex() == 0) {
            if (s.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter Room No.");
                txtSearch.requestFocus();
            } else if (!Pattern.compile("[0-9]+").matcher(s).matches()) {
                JOptionPane.showMessageDialog(null, "Room No. is digit characters");
                txtSearch.requestFocus();
            } else {
                ArrayList dk = new ArrayList();
                dk.add(RowFilter.notFilter(RowFilter.orFilter(checkG())));
                dk.add(RowFilter.regexFilter(s1, 3));
                sort.setRowFilter(RowFilter.andFilter(dk));
            }
        } else {
            if (s.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter Deputy ID");
                txtSearch.requestFocus();
            } else if (!Pattern.compile("[0-9]+").matcher(s).matches()) {
                JOptionPane.showMessageDialog(null, "Deputy ID is digit characters");
                txtSearch.requestFocus();
            } else {
                ArrayList dk = new ArrayList();
                dk.add(RowFilter.orFilter(checkG()));
                dk.add(RowFilter.regexFilter(s1, 4));
                sort.setRowFilter(RowFilter.andFilter(dk));
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtSearch.setText(null);
        cbbType.setSelectedIndex(0);
        cbbTypeActionPerformed(evt);
    }//GEN-LAST:event_btnResetActionPerformed

    private void cbbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTypeActionPerformed
        grViewReservation.clearSelection();
        sort();
    }//GEN-LAST:event_cbbTypeActionPerformed

    private void grViewReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grViewReservationMouseClicked
        int i = grViewReservation.getSelectedRow();
        if (grViewReservation.getSelectedRow() > -1) {
            btnPrintBill.setEnabled(true);
        }
        amountSer = 0;
        amountDri = 0;
        amountFo = 0;
        total = 0;
    }//GEN-LAST:event_grViewReservationMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FStaff f = new FStaff();
        f.setAccount(acc);
        f.setLocationRelativeTo(this);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FSPaymentMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPrintBill;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    public javax.swing.JComboBox cbbType;
    private javax.swing.JTable grViewReservation;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbRoom;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel model;
    TableRowSorter<TableModel> sort;
    _Account acc = new _Account();

    public void setAccount(_Account aa) {
        acc = aa;
    }

    public void initModel() {
        model = (DefaultTableModel) grViewReservation.getModel();
        sort = (TableRowSorter<TableModel>) grViewReservation.getRowSorter();
        IReceptionImpl iri = new IReceptionImpl();
        for (Reception r : iri.getListTan()) {
            Vector v = new Vector();
            v.add(r.getRoomID());
            v.add(r.getCusGroupID());
            v.add(r.getCustomer());
            v.add(getRoomNo(r.getRoomID()));
            v.add(getCusName(r.getCusGroupID()));
            model.addRow(v);
        }
    }

    public String getCusName(int i) {
        for (Customer c : new ICustomerImpl().getList()) {
            if (c.getCustomerID() == i) {
                return c.getCusName();
            }
        }
        return null;
    }

    public int getRoomNo(int i) {
        for (Room c : new IRoomImpl().getList()) {
            if (c.getRoomID() == i) {
                return c.getRoomNumber();
            }
        }
        return -1;
    }

    public void sort() {
        if (cbbType.getSelectedIndex() == 1) {
            sort.setRowFilter(RowFilter.orFilter(checkG()));
            lbRoom.setText("Deputy");
        } else {
            sort.setRowFilter(RowFilter.notFilter(RowFilter.orFilter(checkG())));
            lbRoom.setText("Room");
        }
    }

    private ArrayList checkG() {
        ArrayList gList = new ArrayList();
        for (int i = 0; i < model.getRowCount() - 1; i++) {
            for (int j = i + 1; j < model.getRowCount(); j++) {
                if (model.getValueAt(i, 1).toString().equals(model.getValueAt(j, 1).toString())) {
                    gList.add(RowFilter.regexFilter(model.getValueAt(i, 1).toString(), 1));
                    break;
                }
            }
        }
        return gList;
    }

    private void report() {
        try {
            String s = "report/bill.jasper";
            File f = new File(s);
            FileInputStream fis = new FileInputStream(f);
           // JasperReport jr = JasperCompileManager.compileReport(fis);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("Service", new JRBeanCollectionDataSource(billSer()));
            map.put("Food", new JRBeanCollectionDataSource(billFo()));
            map.put("Drink", new JRBeanCollectionDataSource(billDri()));
            map.put("Total", new JRBeanCollectionDataSource(billTo()));
            JasperPrint jp = JasperFillManager.fillReport(fis, map, new JRBeanCollectionDataSource(billCollection()));
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void view(Reception r, int index) {
        serv = r.getServices().split(" ");
        fo = r.getFoods().split(" ");
        dri = r.getDrinks().split(" ");
        ICustomerImpl ici = new ICustomerImpl();
        IRoomImpl iroi = new IRoomImpl();
        IRoomTypeImpl irti = new IRoomTypeImpl();
        long date = (r.getCheckoutDate().getTime() - r.getCheckinDate().getTime()) / 1000 / 60 / 60 / 24;
        int d = (int) (Math.ceil(date) + 1);
        for (Customer cus : ici.getListTan()) {
            if (cus.getCustomerID() == r.getCusGroupID()) {
                name = cus.getCusName();
            }
        }
        if (index == 0) {
            type = "SINGLE";
        } else {
            type = "GROUP";
        }
        for (Room room : iroi.getListTan()) {
            if (room.getRoomID() == r.getRoomID()) {
                roomNo = room.getRoomNumber();
                for (RoomType roomtype : irti.getListTan()) {
                    if (roomtype.getRoomTypeID() == room.getRoomTypeID()) {
                        amount = roomtype.getRoomPrice() * d;
                        price = roomtype.getRoomPrice();
                        roomType = roomtype.getRoomTypeName();
                        total += amount;
                    }
                }
            }
        }
        checkIn = r.getCheckinDate().toString();
        checkOut = r.getExpectedCheckoutDate().toString();
        sumDate = d;
    }

    public Collection billCollection() {
        Vector v = new Vector();
        v.add(new BillCus(name, type, roomType, checkIn, checkOut, sumDate, price, amount, roomNo));
        return v;
    }

    public Collection billSer() {
        I_ServicesImpl isi = new I_ServicesImpl();
        Vector v = new Vector();
        for (_Services service : isi.getListTan()) {
            for (int a = 0; a < serv.length; a++) {
                if (service.getServiceID() == Integer.parseInt(serv[a])) {
                    nameSer = service.getServiceName();
                    priceSer = service.getServicePrice();
                    amountSer += service.getServicePrice();
                    total += priceSer;
                    v.add(new BillService(nameSer, priceSer));
                }
            }
        }
        return v;
    }

    public Collection billFo() {
        IFoodImpl ifi = new IFoodImpl();
        Vector v = new Vector();
        for (Food food : ifi.getListTan()) {
            for (int a = 0; a < fo.length; a++) {
                if (food.getFoodID() == Integer.parseInt(fo[a])) {
                    nameFo = food.getFoodName();
                    priceFo = food.getFoodPrice();
                    amountFo += food.getFoodPrice();
                    total += priceFo;
                    v.add(new BillFood(nameFo, priceFo));
                }
            }
        }
        return v;
    }

    public Collection billDri() {
        IDrinkImpl idi = new IDrinkImpl();
        Vector v = new Vector();
        for (Drink drink : idi.getListTan()) {
            for (int a = 0; a < dri.length; a++) {
                if (drink.getDrinkID() == Integer.parseInt(dri[a])) {
                    nameDri = drink.getDrinkName();
                    priceDri = drink.getDrinkPrice();
                    amountDri += drink.getDrinkPrice();
                    total += priceDri;
                    v.add(new BillDrink(nameDri, priceDri));
                }
            }
        }
        return v;
    }

    public Collection billTo() {
        Vector v = new Vector();
        v.add(new BillTotal(amountSer, amountFo, amountDri, total));
        return v;
    }
}