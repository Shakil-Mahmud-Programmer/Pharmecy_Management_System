/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Desktop;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    ResultSet r;
    public Login() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabellogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextuserid = new javax.swing.JTextField();
        jTextpass = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonlogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonregister = new javax.swing.JButton();
        jButtoncancel = new javax.swing.JButton();
        lb = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/logo.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 80, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 51, 255));
        jLabel6.setText("Library Management System");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Online-Librarym.jpg"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 142, 280, 180));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/facebook-24.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/facebook-24.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/github24.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/facebook-24.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel12.setText("Hasna Hena");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel13.setText("Sadia Khanum");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel14.setText("Md. Rakib Mia");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 110, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel15.setText("Rayhan Khan");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabellogin.setFont(new java.awt.Font("Segoe UI Light", 3, 22)); // NOI18N
        jLabellogin.setForeground(new java.awt.Color(204, 51, 255));
        jLabellogin.setText("Login");
        jPanel3.add(jLabellogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 71, 34));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 255));
        jLabel1.setText("User Id");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 107, 72, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 255));
        jLabel2.setText("Password");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 166, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 255));
        jLabel3.setText("Role");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 236, 52, -1));

        jTextuserid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 51, 255)));
        jPanel3.add(jTextuserid, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 111, 140, 25));

        jTextpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 51, 255)));
        jPanel3.add(jTextpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 175, 140, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(204, 102, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Instructor", "Student", "Teacher" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 255)));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jButtonlogin.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jButtonlogin.setForeground(new java.awt.Color(204, 102, 255));
        jButtonlogin.setText("login ");
        jButtonlogin.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonloginActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 102, 255));
        jLabel4.setText("If you are not registered? register now!!");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jButtonregister.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jButtonregister.setForeground(new java.awt.Color(204, 102, 255));
        jButtonregister.setText("Registration");
        jButtonregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonregisterActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 140, 30));

        jButtoncancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtoncancel.setForeground(new java.awt.Color(204, 102, 255));
        jButtoncancel.setText("X");
        jButtoncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncancelActionPerformed(evt);
            }
        });
        jPanel3.add(jButtoncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 10, 50, 30));
        jPanel3.add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 110, 20));
        jPanel3.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 110, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/user-1.jpg"))); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/lock-1.jpg"))); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
         Desktop browser=Desktop.getDesktop();
        try{
           
           browser.browse(new URI ("https://www.facebook.com/hasna.henatori") );
        } 
        catch(Exception e)
        {}
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        Desktop browser=Desktop.getDesktop();
        try{
         
           browser.browse(new URI ("https://www.facebook.com/sadia.khanam.9406") );
        } 
        catch(Exception e)
        {}
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
         Desktop browser=Desktop.getDesktop();
        try{
            browser.browse(new URI("http://www.facebook.com/profile.php?id=100077042418367"));
          
        } 
        catch(Exception e)
        {}
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
         Desktop browser=Desktop.getDesktop();
        try{
            browser.browse(new URI("https://github.com/rkrakibhasan680"));}
        catch( Exception e){}
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButtonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonloginActionPerformed
        // TODO add your handling code here:
        if ( jTextuserid.getText().trim().isEmpty() && jTextpass.getText().trim().isEmpty() )
        {
           lb.setText(" User id is empty ");
           lb1.setText(" password is empty ");
        }
        else if(jTextuserid.getText().trim().isEmpty())
        {
           lb.setText(" User id is empty ");
        }
        else if(jTextpass.getText().trim().isEmpty())
        {
             lb1.setText(" password is empty ");
        }
        else{
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_Management","root","");
        String sql="SELECT * FROM `user_registration` where User_id=? and User_password=? and Role=? ";
        PreparedStatement ptst = conn.prepareStatement(sql);
        ptst.setString(1,jTextuserid.getText()) ;
        ptst.setString(2,jTextpass.getText()) ;
        ptst.setString(3,jComboBox1.getSelectedItem().toString()) ;
        r=ptst.executeQuery();
        if(r.next()){
        JOptionPane.showMessageDialog(this, "login successfully");
        if(jComboBox1.getSelectedItem().toString()=="Instructor"){
       Homepage b = new Homepage();
        b.setVisible(true);
        setVisible(false);
        
        }
        else
        {
          membersafterlogin m=new membersafterlogin();
          m.setVisible(true);
        setVisible(false);
        }
        
        }
        else
        {JOptionPane.showMessageDialog(this, "login failed");  }
         
        }
        catch(Exception e)
        {
        }
        }
    }//GEN-LAST:event_jButtonloginActionPerformed

    private void jButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtoncancelActionPerformed

    private void jButtonregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonregisterActionPerformed
        // TODO add your handling code here:
        new Registration().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonregisterActionPerformed
private void lbKeyReleased(java.awt.event.KeyEvent evt) {                               
        // TODO add your handling code here:
        lb.setText("");
    }                              

    private void lb1KeyReleased(java.awt.event.KeyEvent evt) {                                
        // TODO add your handling code here:
        lb1.setText("");
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);}
            });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncancel;
    private javax.swing.JButton jButtonlogin;
    private javax.swing.JButton jButtonregister;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabellogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextpass;
    private javax.swing.JTextField jTextuserid;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    // End of variables declaration//GEN-END:variables
}