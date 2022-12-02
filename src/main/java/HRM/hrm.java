/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HRM;

import Logins.login_H;
import department.Add_dep;
import Employees.Add_emp;
import javax.swing.JOptionPane;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author KAVI
 */
public class hrm extends javax.swing.JFrame {
    
    private static Readable File(String filepath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form hrm
     */
    public hrm() {
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

        jPanel1 = new javax.swing.JPanel();
        jClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbtnDepartment = new javax.swing.JButton();
        jbtnEmployee = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        rbname = new javax.swing.JRadioButton();
        rbEPF = new javax.swing.JRadioButton();
        rbemail = new javax.swing.JRadioButton();
        rbdep = new javax.swing.JRadioButton();
        rbdes = new javax.swing.JRadioButton();
        txtdes = new javax.swing.JTextField();
        txtdep = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtEPF = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblemployees = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jClose.setText("X");
        jClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCloseMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HR Manager");

        jMin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMin.setText("-");
        jMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jMin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jClose)
                    .addComponent(jMin))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 60));

        jbtnDepartment.setBackground(new java.awt.Color(204, 204, 255));
        jbtnDepartment.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtnDepartment.setText("Department");
        jbtnDepartment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDepartmentActionPerformed(evt);
            }
        });

        jbtnEmployee.setBackground(new java.awt.Color(204, 204, 255));
        jbtnEmployee.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtnEmployee.setText("Employee");
        jbtnEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEmployeeActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        rbname.setForeground(new java.awt.Color(255, 255, 255));
        rbname.setText("Name");
        rbname.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rbEPF.setForeground(new java.awt.Color(255, 255, 255));
        rbEPF.setText("EPF No");
        rbEPF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbEPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEPFActionPerformed(evt);
            }
        });

        rbemail.setForeground(new java.awt.Color(255, 255, 255));
        rbemail.setText("Email");
        rbemail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rbdep.setForeground(new java.awt.Color(255, 255, 255));
        rbdep.setText("Department");
        rbdep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbdep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdepActionPerformed(evt);
            }
        });

        rbdes.setForeground(new java.awt.Color(255, 255, 255));
        rbdes.setText("Designation");
        rbdes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdesActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbtnClear.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        jbtnClear.setText("Clear");
        jbtnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });

        jtblemployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblemployees);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(76, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtname)
                                    .addComponent(rbname, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rbEPF, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(txtEPF))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtemail)
                                    .addComponent(rbemail, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtdep)
                                    .addComponent(rbdep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rbdes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtdes)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jbtnEmployee, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnDepartment, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbname)
                    .addComponent(rbEPF)
                    .addComponent(rbemail)
                    .addComponent(rbdep)
                    .addComponent(rbdes))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtnDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jbtnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jCloseMouseClicked

    private void jMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jMinMouseClicked

    private void jbtnDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDepartmentActionPerformed
        Add_dep ad = new Add_dep();
        ad.setVisible(true);
        ad.pack();
        ad.setLocationRelativeTo(null);
        ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.toBack();
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jbtnDepartmentActionPerformed

    private void jbtnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEmployeeActionPerformed
        Add_emp ae = new Add_emp();
        ae.setVisible(true);
        ae.pack();
        ae.setLocationRelativeTo(null);
        ae.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jbtnEmployeeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.toBack();
        this.setVisible(false);
        new login_H().toFront();
        new login_H().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbEPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEPFActionPerformed

    private void rbdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbdesActionPerformed

    private void rbdepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbdepActionPerformed

    private void userSearch(String userDetails, String SType, int colnu)
    {
        //cat=String.valueOf(cmbCCatagory.getSelectedItem());
          DefaultTableModel mytblmodle=(DefaultTableModel)jtblemployees.getModel();
          mytblmodle.setRowCount(0);
          try
          {
            BufferedReader br = null;
            File file = new File("C:\\Users\\KAVI\\Desktop\\search.txt");
            FileReader fr = new FileReader(file); // java.io.FileReader
            br = new BufferedReader(fr); // java.io.BufferedReader
            String headingline = br. readLine().trim(); //read the file heading
            String[] colName=headingline.split("\\t");
            Object[] fileLines=br.lines().toArray();
            mytblmodle.setColumnIdentifiers(colName);
                for (int count=0;count<=fileLines.length-1;count++)
                {
                  String currentLine=fileLines[count].toString().trim();
                  String[] row=currentLine.split("\\t");

                  for (int x=0;x<=row.length-1;x++)
                  {          
                        if (row[colnu].equals(userDetails)) 
                        {
                            JOptionPane.showMessageDialog(this, "User Found!","User Found!", HEIGHT);
                            mytblmodle.addRow(row);          
                            break;
                        }
                    break;
                  }
                }
          }
          catch (FileNotFoundException ex) {
          JOptionPane.showMessageDialog(this, "Check selected User File!","User File Error", HEIGHT);
         // Logger.getLogger(frmHRM.class.getName()).log(Level.SEVERE, null, ex);
          }
          catch (IOException ex)
          {
         // Logger.getLogger(frmHRM.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(rbEPF.isSelected())
        {
            this.userSearch(txtEPF.getText(),rbEPF.getText(),0);
        }
        else if(rbname.isSelected())
        {
            this.userSearch(txtname.getText(),rbname.getText(),1);
        }
        else if(rbemail.isSelected())
        {
            this.userSearch(txtemail.getText(),rbemail.getText(),2);
        }
        else if(rbdep.isSelected())
        {
            this.userSearch(txtdep.getText(),rbdep.getText(),3);
        }
        else if(rbdes.isSelected())
        {
            this.userSearch(txtdes.getText(),rbdes.getText(),4);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
        txtname.setText(null);
        txtEPF.setText(null);
        txtemail.setText(null);
        txtdep.setText(null);
        txtdes.setText(null);
        rbname.setSelected(false);
        rbEPF.setSelected(false);
        rbemail.setSelected(false);
        rbdep.setSelected(false);
        rbdes.setSelected(false);
        jtblemployees.setToolTipText(null);
    }//GEN-LAST:event_jbtnClearActionPerformed

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
            java.util.logging.Logger.getLogger(hrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnDepartment;
    private javax.swing.JButton jbtnEmployee;
    private javax.swing.JTable jtblemployees;
    private javax.swing.JRadioButton rbEPF;
    private javax.swing.JRadioButton rbdep;
    private javax.swing.JRadioButton rbdes;
    private javax.swing.JRadioButton rbemail;
    private javax.swing.JRadioButton rbname;
    private javax.swing.JTextField txtEPF;
    private javax.swing.JTextField txtdep;
    private javax.swing.JTextField txtdes;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables

}
