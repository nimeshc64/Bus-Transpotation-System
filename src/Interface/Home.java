/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Nimesh
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        hdate.setText(date.format(cal.getTime())); 
        htime.setText(time.format(cal.getTime()));
    }  
    DateFormat date = new SimpleDateFormat("yyyy/MM/dd");
    DateFormat time = new SimpleDateFormat("hh:mm");
    Calendar cal = Calendar.getInstance();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        htime = new javax.swing.JLabel();
        hdate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        scheduleform = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        routeform = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        condutorfoem = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        attenform = new javax.swing.JButton();
        driverform = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        busform = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(740, 500));
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(41, 128, 185));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        htime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        htime.setText("time");
        jPanel6.add(htime, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        hdate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        hdate.setText("Date");
        jPanel6.add(hdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jPanel3.setBackground(new java.awt.Color(41, 128, 185));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home-icon.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 170, 100));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Express travels (Pvt.) Ltd");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(720, 756));
        jPanel2.setPreferredSize(new java.awt.Dimension(720, 756));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Schedule");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        scheduleform.setForeground(new java.awt.Color(238, 117, 62));
        scheduleform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/schedule.png"))); // NOI18N
        scheduleform.setToolTipText("");
        scheduleform.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        scheduleform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleformActionPerformed(evt);
            }
        });
        jPanel2.add(scheduleform, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 190, 140));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Route");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, -1));

        routeform.setForeground(new java.awt.Color(238, 117, 62));
        routeform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Mapi.png"))); // NOI18N
        routeform.setToolTipText("");
        routeform.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        routeform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeformActionPerformed(evt);
            }
        });
        jPanel2.add(routeform, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 190, 140));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Driver");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Conductor");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        condutorfoem.setForeground(new java.awt.Color(238, 117, 62));
        condutorfoem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User.png"))); // NOI18N
        condutorfoem.setToolTipText("");
        condutorfoem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        condutorfoem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condutorfoemActionPerformed(evt);
            }
        });
        jPanel2.add(condutorfoem, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 190, 140));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Attendance");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, -1));

        attenform.setForeground(new java.awt.Color(238, 117, 62));
        attenform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Calendar.png"))); // NOI18N
        attenform.setToolTipText("");
        attenform.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        attenform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attenformActionPerformed(evt);
            }
        });
        jPanel2.add(attenform, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 190, 140));

        driverform.setForeground(new java.awt.Color(238, 117, 62));
        driverform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/driver.png"))); // NOI18N
        driverform.setToolTipText("");
        driverform.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        driverform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverformActionPerformed(evt);
            }
        });
        jPanel2.add(driverform, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 190, 140));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bus");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Bus");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        busform.setForeground(new java.awt.Color(240, 240, 240));
        busform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bus.png"))); // NOI18N
        busform.setToolTipText("");
        busform.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        busform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busformActionPerformed(evt);
            }
        });
        jPanel2.add(busform, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 190, 140));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("jLabel10");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void busformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busformActionPerformed
        Bus busf=new Bus();
        busf.setVisible(true);
    }//GEN-LAST:event_busformActionPerformed

    private void scheduleformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleformActionPerformed
        Schedual schf=new Schedual();
        schf.setVisible(true);
    }//GEN-LAST:event_scheduleformActionPerformed

    private void routeformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeformActionPerformed
        Route ruf=new Route();
        ruf.setVisible(true);
    }//GEN-LAST:event_routeformActionPerformed

    private void driverformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverformActionPerformed
        Driver drif=new Driver();
        drif.setVisible(true);
    }//GEN-LAST:event_driverformActionPerformed

    private void condutorfoemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condutorfoemActionPerformed
       Conductor conf=new Conductor();
       conf.setVisible(true);
    }//GEN-LAST:event_condutorfoemActionPerformed

    private void attenformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attenformActionPerformed
        Attendence attf=new Attendence();
        attf.setVisible(true);
    }//GEN-LAST:event_attenformActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attenform;
    private javax.swing.JButton busform;
    private javax.swing.JButton condutorfoem;
    private javax.swing.JButton driverform;
    private javax.swing.JLabel hdate;
    private javax.swing.JLabel htime;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton routeform;
    private javax.swing.JButton scheduleform;
    // End of variables declaration//GEN-END:variables
}
