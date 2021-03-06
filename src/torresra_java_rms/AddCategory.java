package torresra_java_rms;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Raven Torres
 */
public class AddCategory extends javax.swing.JFrame {

    private String Cat_id = "";
    private Connection conn;
    private PreparedStatement pstmt;

    /**
     * Creates new form AddCategory
     */
    public AddCategory() {
        initComponents();
        data();
        showDate();
        showTime();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        categoryTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        categoryBtn3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        menuBtn3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        dashboardBtn3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        addOrderBtn3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        logoutBtn3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        timeLab = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateLab = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        categoryTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category Id", "Available Category"
            }
        ));
        categoryTable.setRowMargin(2);
        categoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(categoryTable);
        if (categoryTable.getColumnModel().getColumnCount() > 0) {
            categoryTable.getColumnModel().getColumn(0).setMinWidth(110);
            categoryTable.getColumnModel().getColumn(0).setPreferredWidth(110);
            categoryTable.getColumnModel().getColumn(0).setMaxWidth(110);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 471, 260));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category (3).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 417, 107));

        clearBtn.setBackground(new java.awt.Color(204, 204, 204));
        clearBtn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        clearBtn.setText("CLEAR");
        clearBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 150, 40));

        addBtn.setBackground(new java.awt.Color(0, 204, 51));
        addBtn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        addBtn.setText("ADD");
        addBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 1, true));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 150, 40));

        deleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        deleteBtn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 150, 40));

        editBtn.setBackground(new java.awt.Color(0, 51, 255));
        editBtn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        editBtn.setText("EDIT");
        editBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        jPanel1.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 150, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("CATEGORY");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 160, 40));

        categoryTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        categoryTxtField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 3, true));
        categoryTxtField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryTxtFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                categoryTxtFieldMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                categoryTxtFieldMouseReleased(evt);
            }
        });
        categoryTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryTxtFieldActionPerformed(evt);
            }
        });
        jPanel1.add(categoryTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 330, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-small.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 290, 210));

        jPanel13.setBackground(new java.awt.Color(255, 51, 0));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        categoryBtn3.setBackground(new java.awt.Color(51, 51, 51));
        categoryBtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryBtn3MouseClicked(evt);
            }
        });
        categoryBtn3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category-icon (1).png"))); // NOI18N
        jLabel15.setText("jLabel2");
        categoryBtn3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, 55, 53));

        jLabel20.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("CATEGORY");
        categoryBtn3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 81, -1));

        jPanel13.add(categoryBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, 90));

        menuBtn3.setBackground(new java.awt.Color(51, 51, 51));
        menuBtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBtn3MouseClicked(evt);
            }
        });
        menuBtn3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu-icon.png"))); // NOI18N
        jLabel16.setText("jLabel2");
        menuBtn3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 67, 52));

        jLabel22.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("MENU");
        menuBtn3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 81, -1));

        jPanel13.add(menuBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 100, 90));

        dashboardBtn3.setBackground(new java.awt.Color(51, 51, 51));
        dashboardBtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardBtn3MouseClicked(evt);
            }
        });
        dashboardBtn3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dash-icon.png"))); // NOI18N
        jLabel18.setText("jLabel2");
        dashboardBtn3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, 55, 53));

        jLabel24.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("DASHBOARD");
        dashboardBtn3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 81, -1));

        jPanel13.add(dashboardBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 90));

        addOrderBtn3.setBackground(new java.awt.Color(51, 51, 51));
        addOrderBtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addOrderBtn3MouseClicked(evt);
            }
        });
        addOrderBtn3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sale-icon.png"))); // NOI18N
        jLabel25.setText("jLabel2");
        addOrderBtn3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 65));

        jLabel21.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("ADD ORDER");
        addOrderBtn3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 74, 81, -1));

        jPanel13.add(addOrderBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 100, -1));

        logoutBtn3.setBackground(new java.awt.Color(51, 51, 51));
        logoutBtn3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout-icon.png"))); // NOI18N
        jLabel27.setText("jLabel2");
        logoutBtn3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 53, 65));

        jLabel14.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("LOG OUT");
        logoutBtn3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jPanel13.add(logoutBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 100, 90));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 770));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 153, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 10, 50));

        timeLab.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        timeLab.setForeground(new java.awt.Color(0, 153, 51));
        timeLab.setText("time");
        jPanel7.add(timeLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 147, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Time:");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        dateLab.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dateLab.setForeground(new java.awt.Color(0, 102, 0));
        dateLab.setText("date");
        jPanel7.add(dateLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 130, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Date:");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 510, 70));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 60, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:

        String category = categoryTxtField.getText();

        if (category.isEmpty() || Cat_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please click the table first...");
        } else {
            try {
                int id = Integer.valueOf(Cat_id);
                Class.forName("com.mysql.jdbc.Driver");

                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/torresjavarms", "root", "");
                pstmt = conn.prepareStatement("UPDATE category_table SET category= ?  WHERE category_id=? ");

                pstmt.setString(1, category);
                pstmt.setInt(2, id);

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Succesfully Updated");
                data();

                conn.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }//GEN-LAST:event_editBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver"); //load the driver
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/torresjavarms", "root", "");
            Statement stmt = (Statement) conn.createStatement(); //get the connection stream(connection port)
            String query = "INSERT INTO `category_table`(`category`) VALUES ('" + this.categoryTxtField.getText() + "')";
            stmt.executeUpdate(query);
            conn.close();
            JOptionPane.showMessageDialog(this, "Successfully Added.");
            data();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void categoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTableMouseClicked
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) categoryTable.getModel();
        int selectedIndex = categoryTable.getSelectedRow();
        Cat_id = model.getValueAt(selectedIndex, 0).toString();
        categoryTxtField.setText(model.getValueAt(selectedIndex, 1).toString());

    }//GEN-LAST:event_categoryTableMouseClicked

    private void categoryTxtFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTxtFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryTxtFieldMouseClicked

    private void categoryTxtFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTxtFieldMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryTxtFieldMouseEntered

    private void categoryTxtFieldMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTxtFieldMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryTxtFieldMouseReleased

    private void categoryTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryTxtFieldActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:

        if (Cat_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please click the table first...");
        } else {
            try {
                int id = Integer.parseInt(Cat_id);
                int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete the record?", "Warning", JOptionPane.YES_NO_OPTION);
                if (dialogResult == JOptionPane.YES_OPTION) {

                    Class.forName("com.mysql.jdbc.Driver");
                    //con = DriverManager.getConnection("jdbc:mysql://192.168.0.2/torresRa", "torresRa", "ravenAccess");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/torresjavarms", "root", "");
                    pstmt = conn.prepareStatement("DELETE FROM category_table WHERE category_id=? ");

                    pstmt.setInt(1, id);

                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Succesfully Deleted");

                    data();

                    conn.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        this.categoryTxtField.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void addOrderBtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addOrderBtn3MouseClicked
        setVisible(false);
        new AddOrder().setVisible(true);
    }//GEN-LAST:event_addOrderBtn3MouseClicked

    private void dashboardBtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardBtn3MouseClicked
        setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_dashboardBtn3MouseClicked

    private void categoryBtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryBtn3MouseClicked
        setVisible(false);
        new AddCategory().setVisible(true);
    }//GEN-LAST:event_categoryBtn3MouseClicked

    private void menuBtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBtn3MouseClicked
        setVisible(false);
        new AddProduct().setVisible(true);
    }//GEN-LAST:event_menuBtn3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void data() {
        DefaultTableModel dm = (DefaultTableModel) categoryTable.getModel();
        dm.setRowCount(0);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/torresjavarms", "root", "");
            PreparedStatement insert = con.prepareStatement("select * from category_table");
            ResultSet result = insert.executeQuery();
            DefaultTableModel model = (DefaultTableModel) categoryTable.getModel();
            while (result.next()) {
                model.addRow(new Object[]{result.getInt(1), result.getString(2)});
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(AddCategory.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCategory.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCategory.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCategory.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel addOrderBtn3;
    private javax.swing.JPanel categoryBtn3;
    private javax.swing.JTable categoryTable;
    private javax.swing.JTextField categoryTxtField;
    private javax.swing.JButton clearBtn;
    private javax.swing.JPanel dashboardBtn3;
    private javax.swing.JLabel dateLab;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logoutBtn3;
    private javax.swing.JPanel menuBtn3;
    private javax.swing.JLabel timeLab;
    // End of variables declaration//GEN-END:variables
    public void showDate() {
        Date today = new Date();
        SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
        String strdate = s.format(today);
        dateLab.setText(strdate);
    }

    public void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date time = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                String strtime = s.format(time);
                timeLab.setText(strtime);
            }
        }).start();
    }

}
