/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Homepage extends javax.swing.JFrame {

    /**
     * Creates new form booklist
     */
    Connection conn=null;
    PreparedStatement ptst=null;
    ResultSet r;
    public Homepage() {
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
        addbook = new javax.swing.JButton();
        userinfo = new javax.swing.JButton();
        booklist = new javax.swing.JButton();
        issuebook = new javax.swing.JButton();
        returnbook = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addbook.setBackground(new java.awt.Color(51, 255, 255));
        addbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/add-list-24.png"))); // NOI18N
        addbook.setText("Add Book");
        addbook.setBorder(new javax.swing.border.MatteBorder(null));
        addbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbookActionPerformed(evt);
            }
        });
        jPanel2.add(addbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 92, 36));

        userinfo.setBackground(new java.awt.Color(51, 255, 255));
        userinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/change-user-24.png"))); // NOI18N
        userinfo.setText("User Info");
        userinfo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 255, 255)));
        userinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userinfoActionPerformed(evt);
            }
        });
        jPanel2.add(userinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 99, 36));

        booklist.setBackground(new java.awt.Color(51, 255, 255));
        booklist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/books-24.png"))); // NOI18N
        booklist.setText("Booklist");
        booklist.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 255, 255)));
        booklist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booklistActionPerformed(evt);
            }
        });
        jPanel2.add(booklist, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 79, 36));

        issuebook.setBackground(new java.awt.Color(51, 255, 255));
        issuebook.setText("Issue Book");
        issuebook.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 255, 255)));
        issuebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuebookActionPerformed(evt);
            }
        });
        jPanel2.add(issuebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 92, 41));

        returnbook.setBackground(new java.awt.Color(51, 255, 255));
        returnbook.setText("Return Book");
        returnbook.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 255, 255)));
        returnbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbookActionPerformed(evt);
            }
        });
        jPanel2.add(returnbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 99, 41));

        logout.setBackground(new java.awt.Color(51, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/account-logout-24.png"))); // NOI18N
        logout.setText("Log out");
        logout.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 255, 255)));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 79, 41));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home Page");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 134, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setText("Members");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 90, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/home.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 370));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbookActionPerformed
        // TODO add your handling code here:
        Addbook a=new Addbook();
        a.setVisible(true);
        
    }//GEN-LAST:event_addbookActionPerformed

    private void booklistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booklistActionPerformed
        // TODO add your handling code here:
        book bo=new book();
        bo.setVisible(true);
     
    }//GEN-LAST:event_booklistActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Login l=new Login();
        l.setVisible(true);
       
    }//GEN-LAST:event_logoutActionPerformed

    private void userinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userinfoActionPerformed
        // TODO add your handling code here:
       userinfo u=new userinfo();
       u.setVisible(true);
      
    }//GEN-LAST:event_userinfoActionPerformed

    private void issuebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuebookActionPerformed
        // TODO add your handling code here:
        issuebook i=new issuebook();
        i.setVisible(true);
      
    }//GEN-LAST:event_issuebookActionPerformed

    private void returnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbookActionPerformed
        // TODO add your handling code here:
        returnbook re=new returnbook();
        re.setVisible(true);
       
    }//GEN-LAST:event_returnbookActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Member m=new Member();
        m.setVisible(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbook;
    private javax.swing.JButton booklist;
    private javax.swing.JButton issuebook;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logout;
    private javax.swing.JButton returnbook;
    private javax.swing.JButton userinfo;
    // End of variables declaration//GEN-END:variables
}
