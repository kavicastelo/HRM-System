/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author KAVI
 */
package Create;

import permission.admin_per;
import addAccounts.add_HR;
import Logins.login_H;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class create_acc extends javax.swing.JFrame {

    /**
     * Creates new form create_acc
     */
    public create_acc() {
        initComponents();
        this.setLocationRelativeTo(null); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbtnCreate = new javax.swing.JButton();
        jbtnLogin = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMin = new javax.swing.JLabel();
        jClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setLocationByPlatform(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel1.setText("WELCOME COLOMBO INSTITUTE OF STUDIES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 40, 630, 70);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 15));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jbtnCreate.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jbtnCreate.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        jbtnCreate.setText("Create New Account");
        jbtnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCreateActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCreate);
        jbtnCreate.setBounds(50, 30, 272, 48);

        jbtnLogin.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jbtnLogin.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        jbtnLogin.setText("Login");
        jbtnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnLogin);
        jbtnLogin.setBounds(50, 120, 272, 46);

        jbtnExit.setBackground(javax.swing.UIManager.getDefaults().getColor("nb.errorForeground"));
        jbtnExit.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnExit);
        jbtnExit.setBounds(50, 210, 272, 44);

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 560, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(62, 98, 580, 320);

        jMin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMin.setText("-");
        jMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMinMouseClicked(evt);
            }
        });
        getContentPane().add(jMin);
        jMin.setBounds(630, 20, 20, 22);

        jClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jClose.setText("X");
        jClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCloseMouseClicked(evt);
            }
        });
        getContentPane().add(jClose);
        jClose.setBounds(660, 20, 20, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCreateActionPerformed
        
        close();
        admin_per ah = new admin_per();
        ah.setVisible(true);
        ah.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        dispose();
    }//GEN-LAST:event_jbtnCreateActionPerformed

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed

        login_H lh = new login_H();
        lh.setVisible(true);
        lh.pack();
        lh.setLocationRelativeTo(null);
        lh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jbtnLoginActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jCloseMouseClicked

    private void jMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jMinMouseClicked

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
            java.util.logging.Logger.getLogger(create_acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(create_acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(create_acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(create_acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new create_acc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnCreate;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnLogin;
    // End of variables declaration//GEN-END:variables

    public void close()
    {
        WindowEvent WinClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(WinClosingEvent);
        
    }
}