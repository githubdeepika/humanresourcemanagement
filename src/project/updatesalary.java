/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class updatesalary extends javax.swing.JFrame {
    Connection conn;
ResultSet rs;
PreparedStatement pst;

   
    public updatesalary() {
        initComponents();
        conn=javaconnect.ConnecrDB();
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
        txt_search = new javax.swing.JTextField();
        JLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_empid = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        txt_dob = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        txt_department = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_d1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_d2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        r_percentage = new javax.swing.JRadioButton();
        r_amount = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\private13.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 230);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Employee ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 270, 90, 15);

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel1.add(txt_search);
        txt_search.setBounds(200, 260, 270, 30);

        JLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLabel.setText("Employee ID:");
        jPanel1.add(JLabel);
        JLabel.setBounds(60, 330, 90, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("First Name:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 370, 80, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Surname:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 410, 80, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Date of Birth:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(390, 320, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("BasicSalary:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(390, 370, 80, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Department:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(390, 410, 90, 30);

        txt_empid.setEditable(false);
        jPanel1.add(txt_empid);
        txt_empid.setBounds(190, 330, 120, 30);

        txt_firstname.setEditable(false);
        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_firstname);
        txt_firstname.setBounds(190, 370, 120, 30);

        txt_surname.setEditable(false);
        jPanel1.add(txt_surname);
        txt_surname.setBounds(190, 410, 120, 30);

        txt_dob.setEditable(false);
        txt_dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dobActionPerformed(evt);
            }
        });
        jPanel1.add(txt_dob);
        txt_dob.setBounds(520, 320, 140, 30);

        txt_salary.setEditable(false);
        jPanel1.add(txt_salary);
        txt_salary.setBounds(520, 360, 140, 30);

        txt_department.setEditable(false);
        jPanel1.add(txt_department);
        txt_department.setBounds(520, 410, 140, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Percentage:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 520, 80, 20);

        txt_d1.setEditable(false);
        jPanel1.add(txt_d1);
        txt_d1.setBounds(150, 520, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Amount:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(320, 520, 60, 30);

        txt_d2.setEditable(false);
        jPanel1.add(txt_d2);
        txt_d2.setBounds(390, 520, 130, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Update Salary By:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 470, 120, 15);

        r_percentage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r_percentage.setText("Percentage(%)");
        r_percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_percentageActionPerformed(evt);
            }
        });
        jPanel1.add(r_percentage);
        r_percentage.setBounds(210, 470, 130, 23);

        r_amount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r_amount.setText("Amount");
        r_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_amountActionPerformed(evt);
            }
        });
        jPanel1.add(r_amount);
        r_amount.setBounds(340, 470, 75, 23);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(540, 520, 77, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(640, 520, 61, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void r_percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_percentageActionPerformed
        // TODO add your handling code here:
        r_percentage.setSelected(true);
        r_amount.setSelected(false);
        txt_d2.setEnabled(false);
        txt_d1.setEditable(true);
        txt_d1.setEnabled(true);
        txt_d2.setText("");
        
        
        
    }//GEN-LAST:event_r_percentageActionPerformed

    private void r_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_amountActionPerformed
        // TODO add your handling code here:
        r_amount.setSelected(true);
        r_percentage.setSelected(false);
        txt_d1.setEnabled(false);
        txt_d2.setEditable(true);
        txt_d2.setEnabled(true);
        txt_d1.setText("");
        
        
        
    }//GEN-LAST:event_r_amountActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         setVisible(false);
        humanresource ob=new humanresource();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dobActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        
        try{
            String sql="select * from newemployee1 where Emp_id=?";
             pst=conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
           rs= pst.executeQuery();
           
           
           String add1=rs.getString("Emp_id");
           txt_empid.setText(add1);
           
           String add2=rs.getString("FirstName");
           txt_firstname.setText(add2);
           
           String add3=rs.getString("Surname");
           txt_surname.setText(add3);
           
           String add4=rs.getString("dob");
           txt_dob.setText(add4);
           
            String add14=rs.getString("BasicSalary");
           txt_salary.setText(add14);
          
          String add12=rs.getString("Department");
           txt_department.setText(add12);
          
          
         
         
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        finally
        {
            try{
                rs.close();
                pst.close();
            }
            catch(Exception e)
            {
                
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_txt_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int salary = Integer.parseInt(txt_salary.getText());
        
       
        if(r_percentage.isSelected()==true)
        {
         
         int getPercentage=Integer.parseInt(txt_d1.getText());
        int calcPercentage=salary/100 + getPercentage +salary;
        String xp=String.valueOf(calcPercentage);
        txt_salary.setText(xp);
        
        
        
        }else if(r_amount.isSelected()==true)
        {
        int getAmount=Integer.parseInt(txt_d2.getText());
        int calcAmount=salary +getAmount;
        String xA=String.valueOf(calcAmount);
        txt_salary.setText(xA);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

        try{
            String value1=txt_empid.getText();
            String value2=txt_salary.getText();
            
            String sql="update newemployee1 set Emp_id = '"+value1+"',BasicSalary = '"+value2+"' where Emp_id = '"+value1+"'";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Record updated");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
            finally{
 try{
     rs.close();
     pst.close();
 }   catch(Exception e)
 {
     
 }
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
            java.util.logging.Logger.getLogger(updatesalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatesalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatesalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatesalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatesalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton r_amount;
    private javax.swing.JRadioButton r_percentage;
    private javax.swing.JTextField txt_d1;
    private javax.swing.JTextField txt_d2;
    private javax.swing.JTextField txt_department;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_empid;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
}
