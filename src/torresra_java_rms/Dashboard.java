package torresra_java_rms;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raven Torres
 */
public class Dashboard extends javax.swing.JFrame {
    private Connection conn;
    private PreparedStatement pstmt;
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        getTodaySales();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        categoryBtn1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        menuBtn1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        dashboardBtn1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        addOrderBtn1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        logoutBtn1 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        salesTotal = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        timeLab = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateLab = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sales.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 490, 150));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-sm.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 300, 290));

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 10, 480));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Hello Admin Raven");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 230, 60));

        jPanel13.setBackground(new java.awt.Color(255, 51, 0));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        categoryBtn1.setBackground(new java.awt.Color(51, 51, 51));
        categoryBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryBtn1MouseClicked(evt);
            }
        });
        categoryBtn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category-icon (1).png"))); // NOI18N
        jLabel15.setText("jLabel2");
        categoryBtn1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, 55, 53));

        jLabel22.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("CATEGORY");
        categoryBtn1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 81, -1));

        jPanel13.add(categoryBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, 90));

        menuBtn1.setBackground(new java.awt.Color(51, 51, 51));
        menuBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBtn1MouseClicked(evt);
            }
        });
        menuBtn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu-icon.png"))); // NOI18N
        jLabel16.setText("jLabel2");
        menuBtn1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 67, 52));

        jLabel23.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("MENU");
        menuBtn1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 81, -1));

        jPanel13.add(menuBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 100, 90));

        dashboardBtn1.setBackground(new java.awt.Color(51, 51, 51));
        dashboardBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardBtn1MouseClicked(evt);
            }
        });
        dashboardBtn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dash-icon.png"))); // NOI18N
        jLabel18.setText("jLabel2");
        dashboardBtn1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, 55, 53));

        jLabel20.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("DASHBOARD");
        dashboardBtn1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 74, 81, -1));

        jPanel13.add(dashboardBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 90));

        addOrderBtn1.setBackground(new java.awt.Color(51, 51, 51));
        addOrderBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addOrderBtn1MouseClicked(evt);
            }
        });
        addOrderBtn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sale-icon.png"))); // NOI18N
        jLabel25.setText("jLabel2");
        addOrderBtn1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 65));

        jLabel21.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("ADD ORDER");
        addOrderBtn1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 81, -1));

        jPanel13.add(addOrderBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 100, -1));

        logoutBtn1.setBackground(new java.awt.Color(51, 51, 51));
        logoutBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtn1MouseClicked(evt);
            }
        });
        logoutBtn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout-icon.png"))); // NOI18N
        jLabel27.setText("jLabel2");
        logoutBtn1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 53, 65));

        jLabel9.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("LOG OUT");
        logoutBtn1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jPanel13.add(logoutBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 100, 90));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 770));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 153, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/peso.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 100, 130));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel5.setText("ADDED TODAY");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 270, 80));

        salesTotal.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        salesTotal.setForeground(new java.awt.Color(0, 102, 51));
        salesTotal.setText("sales");
        jPanel2.add(salesTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 200, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 440, 210));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 570, 0, 30));

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

        exitBtn.setBackground(new java.awt.Color(204, 204, 204));
        exitBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(0, 0, 204));
        exitBtn.setText("X");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addOrderBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addOrderBtn1MouseClicked
        setVisible(false);
        new AddOrder().setVisible(true);
    }//GEN-LAST:event_addOrderBtn1MouseClicked

    private void dashboardBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardBtn1MouseClicked
        setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_dashboardBtn1MouseClicked

    private void categoryBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryBtn1MouseClicked
        setVisible(false);
        new AddCategory().setVisible(true);
    }//GEN-LAST:event_categoryBtn1MouseClicked

    private void menuBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBtn1MouseClicked
        setVisible(false);
        new AddProduct().setVisible(true);
    }//GEN-LAST:event_menuBtn1MouseClicked

    private void logoutBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtn1MouseClicked
        setVisible(false);
        new AdminLogin().setVisible(true);
    }//GEN-LAST:event_logoutBtn1MouseClicked

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addOrderBtn1;
    private javax.swing.JPanel categoryBtn1;
    private javax.swing.JPanel dashboardBtn1;
    private javax.swing.JLabel dateLab;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel logoutBtn1;
    private javax.swing.JPanel menuBtn1;
    private javax.swing.JLabel salesTotal;
    private javax.swing.JLabel timeLab;
    // End of variables declaration//GEN-END:variables

    private void getTodaySales() {
        try {
            LocalDate today = LocalDate.now(); // Create a date object
            //JOptionPane.showMessageDialog(this, today);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/torresjavarms", "root", "");
            PreparedStatement stmt = con.prepareStatement("SELECT sum(subtotal) as totalSales FROM sales_table WHERE paid_at=?"); 
            stmt.setString(1, today.toString());
            ResultSet result = stmt.executeQuery();
            if (result.next()) {
               salesTotal.setText(result.getString("totalSales"));
            }
            con.close();
        } catch (Exception e) {
           System.out.println(e.getMessage());
        } 
    }
    
    public void showDate(){
        Date today = new Date();
        SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
        String strdate = s.format(today);
        dateLab.setText(strdate);;
    }
    public void showTime(){       
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

