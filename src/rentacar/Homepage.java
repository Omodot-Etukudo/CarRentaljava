/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacar;

import static java.awt.SystemColor.window;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author omodo_000
 */
public class Homepage extends javax.swing.JFrame {

    /**
     * Creates new form Home  page
     */
    
    public Homepage() {
        initComponents();
    }
    
    public Homepage(String para){
        initComponents();
        uname.setText(para);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        inside = new javax.swing.JLabel();
        outside = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        transmission = new javax.swing.JLabel();
        fuel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        speed = new javax.swing.JProgressBar();
        braking = new javax.swing.JProgressBar();
        acceleration = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        uname = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jFrame2.setAlwaysOnTop(true);

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RentACar");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(204, 51, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Available Cars---", "Mercedes", "Toyota", "Audi", "BMW", "Volkswagen" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 310, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(outside, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(inside, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inside, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
            .addComponent(outside, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        price.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        price.setForeground(new java.awt.Color(181, 42, 42));
        jPanel5.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 240, 30));

        model.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        model.setForeground(new java.awt.Color(197, 43, 43));
        jPanel5.add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 240, 30));

        transmission.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        transmission.setForeground(new java.awt.Color(181, 42, 42));
        jPanel5.add(transmission, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 240, 30));

        fuel.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        fuel.setForeground(new java.awt.Color(181, 42, 42));
        jPanel5.add(fuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 240, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("RentACar");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 500, 80, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/logo.png"))); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 480, -1, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("let's drive you....");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 530, 110, -1));

        jLabel4.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 0));
        jLabel4.setText("Welcome, ");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/cars/speed.png"))); // NOI18N
        jLabel5.setText("Speed");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/cars/accel.png"))); // NOI18N
        jLabel6.setText("Acceleration");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/cars/brake-disc .png"))); // NOI18N
        jLabel7.setText("Braking");

        speed.setForeground(new java.awt.Color(204, 51, 0));
        speed.setToolTipText("");

        braking.setForeground(new java.awt.Color(204, 51, 0));

        acceleration.setForeground(new java.awt.Color(204, 51, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(speed, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acceleration, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(braking, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(speed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acceleration, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(braking, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/cars/garage.png"))); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 30, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 51, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/cars/continue.png"))); // NOI18N
        jButton1.setText("Continue");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 51, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 130, 30));

        uname.setFont(new java.awt.Font("Vani", 0, 18)); // NOI18N
        uname.setForeground(new java.awt.Color(204, 51, 0));
        uname.setText("jLabel9");
        jPanel5.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 110, -1));

        jLabel10.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 51, 0));
        jLabel10.setText("Select a Vehicle to Continue");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 270, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/cars/settings.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/cars/logout.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 30, 30));

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 1050, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
      outside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/logo.png")));  
      jPanel2.setVisible(false);
      
        
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String selectedvalue=jComboBox1.getSelectedItem().toString();
        

        if (null != selectedvalue)switch (selectedvalue) {
            case "Toyota":
                outside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/cars/toyotaexterior.jpeg")));
                inside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/cars/toyotainterior.jpeg")));
                inside.setVisible(true);
                model.setText("Model: Toyota Tacoma, 2009");
                transmission.setText("Transmission: Manual");
                fuel.setText("Fuel Usage:12-15L/100km ");
                price.setText("Price:$25.50/day");
                jPanel2.setVisible(true);
                speed.setValue(50);
                acceleration.setValue(40);
                braking.setValue(70);
                break;
            case "Audi":
                outside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/cars/audiexterior.jpeg")));
                inside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/cars/audiinterior.jpeg")));
                inside.setVisible(true);
                model.setText("Model: Audi A3-Saloon, 2015");
                transmission.setText("Transmission: Automatic");
                fuel.setText("Fuel Usage:10-13L/100km ");
                price.setText("Price:$24.50/day");
                jPanel2.setVisible(true);
                speed.setValue(60);
                acceleration.setValue(70);
                braking.setValue(60);
                break;
            case "Mercedes":
                outside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/cars/mercedesexterior.jpeg")));
                inside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/cars/mercedesinterior.jpg")));
                inside.setVisible(true);
                model.setText("Model: Mercedes G-Wagon");
                transmission.setText("Transmission: Automatic");
                fuel.setText("Fuel Usage:11-14L/100km ");
                price.setText("Price:$25.50/day");
                jPanel2.setVisible(true);
                speed.setValue(65);
                acceleration.setValue(50);
                braking.setValue(65);
                break;
            case "BMW":
                outside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/cars/bmwexterior.jpg")));
                inside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/cars/bmwinterior.jpg")));
                inside.setVisible(true);
                model.setText("Model: BMW Sedan, 2015");
                transmission.setText("Transmission: Auntomatic");
                fuel.setText("Fuel Usage:10-12L/100km ");
                price.setText("Price:$25.50/day");
                jPanel2.setVisible(true);
                speed.setValue(50);
                acceleration.setValue(70);
                braking.setValue(80);
                break;
            case "Volkswagen":
                outside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/cars/volkswagenexterior.jpg")));
                inside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/cars/volkswageninterior.jpg")));
                inside.setVisible(true);
                model.setText("Model: Volkswagen Arteon, 2016");
                transmission.setText("Transmission: Automatic");
                fuel.setText("Fuel Usage:12-15L/100km ");
                price.setText("Price:$29.50/day");
                jPanel2.setVisible(true);
                speed.setValue(80);
                acceleration.setValue(55);
                braking.setValue(85);
                break;    
            case "---Available Cars---":
                outside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/logo.png")));
                inside.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentacar/images/logo.png")));
                model.setText("");
                transmission.setText("");
                fuel.setText("");
                price.setText("");
                jPanel2.setVisible(false);
                
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:
        jLabel12.setText("Account Settings");
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
        jLabel12.setText("");
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        // TODO add your handling code here:
        jLabel13.setText("Log Out");
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        // TODO add your handling code here:
        jLabel13.setText("");
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here
        
        Object [] message={"Are You Sure?"};
        Object [] options={"Yes","No"};
        int n=JOptionPane.showOptionDialog(new JFrame(), message, "Log Out", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if(n==JOptionPane.OK_OPTION){
            Login1 u=new Login1();
            u.setVisible(true);
            u.setSize(665, 450);
            this.setVisible(false);
        }
            
        
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name=uname.getText();
        String desc=model.getText();
        String price1=price.getText();
        
        
        try{
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/rentacar", "root", "edikan");
            Statement st = (Statement) con.createStatement();
            String sql;
            sql = "INSERT INTO cars VALUES (' " +name+ " ', ' " +desc+ " ',' " +price1+ " ')";
            st.executeUpdate(sql);
            con.close();   
            } 
            catch (SQLException e){
              JOptionPane.showMessageDialog(null, "An exception occurred!!"); 
        }
        
        String q=model.getText();
        String w=price.getText();
        payment pm= new payment(q,w);
        pm.setVisible(true);
        pm.setSize(530, 600);
        
        
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar acceleration;
    private javax.swing.JProgressBar braking;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel fuel;
    private javax.swing.JLabel inside;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel model;
    private javax.swing.JLabel outside;
    private javax.swing.JLabel price;
    private javax.swing.JProgressBar speed;
    private javax.swing.JLabel transmission;
    private javax.swing.JLabel uname;
    // End of variables declaration//GEN-END:variables
}
