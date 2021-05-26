
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.JOptionPane;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 471, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category (3).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 417, 107));

        clearBtn.setBackground(new java.awt.Color(204, 204, 204));
        clearBtn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        clearBtn.setText("CLEAR");
        clearBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 150, 40));

        addBtn.setBackground(new java.awt.Color(0, 204, 51));
        addBtn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        addBtn.setText("ADD");
        addBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 1, true));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 150, 40));

        deleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        deleteBtn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 150, 40));

        editBtn.setBackground(new java.awt.Color(0, 51, 255));
        editBtn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        editBtn.setText("EDIT");
        editBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        jPanel1.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 150, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("CATEGORY");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 160, 40));

        categoryTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        categoryTxtField.setText("    Enter Category...");
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
        jPanel1.add(categoryTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 330, 60));

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 740));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-small.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 290, 210));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

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

// TODO add your handling code here:
//        try {
//
//            Class.forName("com.mysql.jdbc.Driver"); //load the driver
//            //Connection con = DriverManager.getConnection("jdbc:mysql://192.168.0.2/torresRa", "torresRa", "ravenAccess");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/torresjavarms", "root", "");
//            Statement stmt = (Statement) con.createStatement(); //get the connection stream(connection port)
//            ResultSet querySelect = stmt.executeQuery("SELECT * FROM category_table");
//
//            while (querySelect.next()) {
//                while (querySelect.getString(2).equals(0)) {
//                    String query = "INSERT INTO `category_table`(`category`) VALUES ('" + this.categoryTxtField.getText() + "')";
//                    stmt.executeUpdate(query);
//                    con.close();
//                    JOptionPane.showMessageDialog(this, "Successfully Added.");
//                    DefaultTableModel model = (DefaultTableModel) categoryTable.getModel();
//                    model.setRowCount(0);
//                    data();
//                }
//                if (querySelect.getString(2).equals(categoryTxtField.getText())) {
//                    JOptionPane.showMessageDialog(this, "Category already exist.");
//                    con.close();
//                }
//
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
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
    private javax.swing.JTable categoryTable;
    private javax.swing.JTextField categoryTxtField;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
