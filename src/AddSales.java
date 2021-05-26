
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Raven Torres
 */
public class AddSales extends javax.swing.JFrame {
    private String Order_id = "";
    private Connection conn;
    private PreparedStatement pstmt;

    /**
     * Creates new form AddSales
     */
    public AddSales() {
        initComponents();
        getMenu();
        getPrice();
        orderTable();
        orderTableSize();
        getTotal();
        getChange();

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
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        addOrderBtn = new javax.swing.JButton();
        payOrderBtn = new javax.swing.JButton();
        deleteOrderBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tableDropdown = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        menuDropdown = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        quantity = new javax.swing.JSpinner();
        price = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        amountTendered = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        editOrderBtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        changeTxtField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        order_id = new javax.swing.JTextField();
        nameTxtField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tableNameTxtField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "MENU", "PRICE", "QUANTITY", "AMOUNT"
            }
        ));
        orderTable.getTableHeader().setReorderingAllowed(false);
        orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(orderTable);
        if (orderTable.getColumnModel().getColumnCount() > 0) {
            orderTable.getColumnModel().getColumn(1).setMinWidth(150);
            orderTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            orderTable.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 400, 190));

        addOrderBtn.setBackground(new java.awt.Color(0, 204, 51));
        addOrderBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        addOrderBtn.setText("ADD");
        addOrderBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 1, true));
        addOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 110, 50));

        payOrderBtn.setBackground(new java.awt.Color(0, 51, 255));
        payOrderBtn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        payOrderBtn.setText("PAY");
        payOrderBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        payOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payOrderBtnActionPerformed(evt);
            }
        });
        jPanel1.add(payOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 590, 90, 40));

        deleteOrderBtn.setBackground(new java.awt.Color(255, 51, 51));
        deleteOrderBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        deleteOrderBtn.setText("DELETE");
        deleteOrderBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));
        deleteOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrderBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 110, 50));

        clearBtn.setBackground(new java.awt.Color(204, 204, 204));
        clearBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        clearBtn.setText("CLEAR");
        clearBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 110, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 3, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDropdown.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tableDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Table 1", "Table 2", "Table 3", "Table 4", "Table 5" }));
        tableDropdown.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tableDropdownItemStateChanged(evt);
            }
        });
        tableDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableDropdownActionPerformed(evt);
            }
        });
        jPanel3.add(tableDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 120, 43));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setText("Table No.");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 26, 88, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setText("Price:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, 30));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setText("Quantity:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 96, 44));

        menuDropdown.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        menuDropdown.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                menuDropdownItemStateChanged(evt);
            }
        });
        menuDropdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDropdownMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuDropdownMouseEntered(evt);
            }
        });
        menuDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDropdownActionPerformed(evt);
            }
        });
        menuDropdown.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                menuDropdownPropertyChange(evt);
            }
        });
        jPanel3.add(menuDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 120, 43));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel12.setText("Menu:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 62, -1));
        jPanel3.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 120, 44));

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        jPanel3.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 260, 260));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Amount Tendered:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 140, 20));

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 770));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/order.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 380, 130));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Orders for:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 80, 50));

        amountTendered.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        amountTendered.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        amountTendered.setText("0");
        jPanel1.add(amountTendered, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 520, 90, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Subtotal:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, 70, 20));

        subtotal.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        subtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, 90, 30));

        editOrderBtn.setBackground(new java.awt.Color(0, 51, 255));
        editOrderBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        editOrderBtn.setText("EDIT");
        editOrderBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        editOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editOrderBtnActionPerformed(evt);
            }
        });
        jPanel1.add(editOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 110, 50));

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        changeTxtField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        changeTxtField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 2, true));
        jPanel1.add(changeTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, 160, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("ORDER");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 90, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-small.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 290, 210));

        order_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_idActionPerformed(evt);
            }
        });
        jPanel1.add(order_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 180, 30));

        nameTxtField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nameTxtField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 2, true));
        jPanel1.add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 280, 50));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Customer Name:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 120, 30));

        tableNameTxtField.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tableNameTxtField.setText("Table 1");
        tableNameTxtField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 2, true));
        jPanel1.add(tableNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 310, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderBtnActionPerformed
        String table = this.tableNameTxtField.getText();
        Object menu = this.menuDropdown.getSelectedItem();
        String quantity = (this.quantity.getValue()).toString();
        int price = parseInt(this.price.getText());
        int amount = parseInt(quantity)*price;
        try {
            Class.forName("com.mysql.jdbc.Driver"); //load the driver
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/torresjavarms", "root", "");
            Statement stmt = (Statement) conn.createStatement();
            String query = "INSERT INTO `order_table`(`table_name`,`product_name`, `product_price`, `product_quantity`, `amount`) VALUES ('" + table + "','" + menu + "','" + price + "','" + quantity + "','" + amount + "')";
            stmt.executeUpdate(query);
            conn.close();
            JOptionPane.showMessageDialog(this, "Successfully Added.");
            orderTable();
            getTotal();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_addOrderBtnActionPerformed
   
    private void payOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payOrderBtnActionPerformed
        String table = this.tableNameTxtField.getText();
        String name = this.nameTxtField.getText();
        int subtotal = parseInt(this.subtotal.getText());
        String change = changeTxtField.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver"); //load the driver
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/torresjavarms", "root", "");
            Statement stmt = (Statement) conn.createStatement();
            String query = "INSERT INTO `sales_table`(`customer_name`, `table_name`,`subtotal`) VALUES ('" + name + "','" + table + "','" + subtotal + "')";
            stmt.executeUpdate(query);
            conn.close();
            JOptionPane.showMessageDialog(this, "Successfully Added." + change);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_payOrderBtnActionPerformed

    private void tableDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableDropdownActionPerformed

    private void editOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editOrderBtnActionPerformed
        String table = this.tableNameTxtField.getText();
        Object menu = this.menuDropdown.getSelectedItem();
        String quantity = (this.quantity.getValue()).toString();
        int price = parseInt(this.price.getText());
        int amount = parseInt(quantity)*price;

        if (menu.equals("")) {
            JOptionPane.showMessageDialog(this, "Please click the table first...");
        } else {
            try {
                int id = parseInt(changeTxtField.getText());
                Class.forName("com.mysql.jdbc.Driver");

                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/torresjavarms", "root", "");
                pstmt = conn.prepareStatement("UPDATE order_table SET table_name= ? , product_name=? , product_price=?, product_quantity=?, amount=? WHERE order_id=? ");

                pstmt.setObject(1, table);
                pstmt.setObject(2, menu);
                pstmt.setInt(3, price);
                pstmt.setString(4, quantity);
                pstmt.setInt(5, amount);
                pstmt.setInt(6, id);

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Succesfully Updated");
                orderTable();
                getTotal();

                conn.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_editOrderBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        //this.changeTxtField.setText("");
        this.tableDropdown.setSelectedItem("Table 1");
        this.menuDropdown.setSelectedItem("Lechon Belly");
        this.price.setText("650");
        this.quantity.setValue(0);
    }//GEN-LAST:event_clearBtnActionPerformed

    private void menuDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDropdownActionPerformed

    private void menuDropdownMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDropdownMouseEntered
        //getPrice();
    }//GEN-LAST:event_menuDropdownMouseEntered

    private void menuDropdownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDropdownMouseClicked
        //getPrice();
    }//GEN-LAST:event_menuDropdownMouseClicked

    private void menuDropdownPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_menuDropdownPropertyChange
        // TODO add your handling code here:     
    }//GEN-LAST:event_menuDropdownPropertyChange

    private void orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        int selectedIndex = orderTable.getSelectedRow();
        changeTxtField.setText(model.getValueAt(selectedIndex, 0).toString());
        tableDropdown.setSelectedItem(model.getValueAt(selectedIndex, 1).toString());
        menuDropdown.setSelectedItem(model.getValueAt(selectedIndex, 2).toString());
        quantity.setValue(Integer.parseInt((String)model.getValueAt(selectedIndex, 4).toString()));
        price.setText(model.getValueAt(selectedIndex, 3).toString());
    }//GEN-LAST:event_orderTableMouseClicked

    private void deleteOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrderBtnActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete the record?", "Warning", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                int id = parseInt(changeTxtField.getText());
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/torresjavarms", "root", "");
                pstmt = conn.prepareStatement("DELETE FROM order_table WHERE order_id=? ");
                pstmt.setInt(1, id);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Succesfully Deleted");
                orderTable();
                getTotal();
                conn.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_deleteOrderBtnActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void order_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_order_idActionPerformed

    private void tableDropdownItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tableDropdownItemStateChanged
        Object table = this.tableDropdown.getSelectedItem();
        tableNameTxtField.setText((String)table);
    }//GEN-LAST:event_tableDropdownItemStateChanged

    private void menuDropdownItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_menuDropdownItemStateChanged
        getPrice();
    }//GEN-LAST:event_menuDropdownItemStateChanged

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
            java.util.logging.Logger.getLogger(AddSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrderBtn;
    private javax.swing.JTextField amountTendered;
    private javax.swing.JTextField changeTxtField;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteOrderBtn;
    private javax.swing.JButton editOrderBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> menuDropdown;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField order_id;
    private javax.swing.JButton payOrderBtn;
    private javax.swing.JTextField price;
    private javax.swing.JSpinner quantity;
    private javax.swing.JTextField subtotal;
    private javax.swing.JComboBox<String> tableDropdown;
    private javax.swing.JTextField tableNameTxtField;
    // End of variables declaration//GEN-END:variables

    private void getMenu() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/torresjavarms", "root", "");
            Statement stmt = conn.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT * FROM product_table");
            while (rs.next()) {
                String product = rs.getString("product_name");
                menuDropdown.addItem(product);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void getPrice() {
         Object menu = menuDropdown.getSelectedItem();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/torresjavarms", "root", "");
            Statement stmt = conn.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT product_price FROM product_table WHERE product_name='"+menu.toString()+"'");
            if (rs.next()) {
                //System.out.println(rs.getString("product_price"));
                price.setText(rs.getString("product_price"));
                price.setEditable(false);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void orderTableSize(){
        orderTable.getColumnModel().getColumn(0).setMinWidth(0);
        orderTable.getColumnModel().getColumn(0).setMaxWidth(0);
        orderTable.getColumnModel().getColumn(0).setWidth(0);
    }
      
    private void orderTable() {
        DefaultTableModel dm = (DefaultTableModel) orderTable.getModel();
        dm.setRowCount(0);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/torresjavarms", "root", "");
            
            PreparedStatement insert = con.prepareStatement("select * from order_table");
            ResultSet result = insert.executeQuery();

            DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
            while (result.next()) {
                model.addRow(new Object[]{result.getInt(1), result.getString(3), result.getString(4), result.getString(5), result.getString(6)});
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void getTotal(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/torresjavarms", "root", "");
            PreparedStatement stmt = con.prepareStatement("SELECT sum(amount) as totalPayment FROM order_table"); 
            ResultSet result = stmt.executeQuery();
            if (result.next()) {
                subtotal.setText(result.getString("totalPayment"));
                subtotal.setEditable(false);
            }
            con.close();
        } catch (Exception e) {
           System.out.println(e.getMessage());
        } 
    }
    
    private void getChange(){
        String subtotal = this.subtotal.getText();
        String amountTendered = this.amountTendered.getText();
        System.out.println(subtotal);
        System.out.println(amountTendered);
        int Change = Integer.parseInt(amountTendered) - Integer.parseInt(subtotal);
        String changeValue = String.format("%d", Change);;
        changeTxtField.setText(changeValue);
        changeTxtField.setEditable(false);
        System.out.println("the change is: " + changeValue);
    }
}
