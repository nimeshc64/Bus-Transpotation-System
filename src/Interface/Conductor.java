/*
 * conductor Form 
 * save,update,delete,search
 */

package Interface;

import Classes.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Nimesh
 */
public class Conductor extends javax.swing.JFrame {

    /**
     * Creates new form Conductor
     */
    public Conductor() {
        initComponents();
        combo();
        maxid();
        tblfill();
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        conducid = new javax.swing.JTextField();
        condfname = new javax.swing.JTextField();
        condlname = new javax.swing.JTextField();
        condnic = new javax.swing.JTextField();
        condcombo = new javax.swing.JComboBox();
        condsearch = new javax.swing.JButton();
        condlic = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcond = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        contdelete = new javax.swing.JButton();
        condupdate = new javax.swing.JButton();
        condsave = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(740, 500));
        setMinimumSize(new java.awt.Dimension(740, 565));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(45, 62, 78));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hris-pips.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 200, 250));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Conductors Maintenance");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Conductor ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Last Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("License Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("NIC Number");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        conducid.setEditable(false);
        jPanel1.add(conducid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 120, -1));

        condfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condfnameActionPerformed(evt);
            }
        });
        jPanel1.add(condfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 350, -1));
        jPanel1.add(condlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 350, -1));
        jPanel1.add(condnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 190, -1));

        jPanel1.add(condcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 90, 30));

        condsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search-Find-48.png"))); // NOI18N
        condsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condsearchActionPerformed(evt);
            }
        });
        jPanel1.add(condsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 40, 30));
        jPanel1.add(condlic, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 190, -1));

        tblcond.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblcond);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 670, 80));

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 80, 30));

        jPanel6.setBackground(new java.awt.Color(45, 62, 78));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contdelete.setText("DELETE");
        contdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contdeleteActionPerformed(evt);
            }
        });
        jPanel6.add(contdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 80, 40));

        condupdate.setText("UPDATE");
        condupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condupdateActionPerformed(evt);
            }
        });
        jPanel6.add(condupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 80, 40));

        condsave.setText("SAVE");
        condsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condsaveActionPerformed(evt);
            }
        });
        jPanel6.add(condsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 80, 40));

        jButton10.setBackground(new java.awt.Color(45, 62, 78));
        jButton10.setForeground(new java.awt.Color(238, 117, 68));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Homei.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jButton14.setBackground(new java.awt.Color(45, 62, 78));
        jButton14.setForeground(new java.awt.Color(238, 117, 68));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/schedulei.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jButton13.setBackground(new java.awt.Color(45, 62, 78));
        jButton13.setForeground(new java.awt.Color(238, 117, 68));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Mapii.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jButton12.setBackground(new java.awt.Color(45, 62, 78));
        jButton12.setForeground(new java.awt.Color(238, 117, 68));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/driveri.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jButton11.setBackground(new java.awt.Color(45, 62, 78));
        jButton11.setForeground(new java.awt.Color(238, 117, 68));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/busi.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jButton15.setBackground(new java.awt.Color(45, 62, 78));
        jButton15.setForeground(new java.awt.Color(238, 117, 68));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Calendair.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        Classes.Conductor condc=new Classes.Conductor();//create object from conductor class
        DB db=new DB();//create object from database connection class
    
     public void combo()
    {
        try{
            Connection con=DB.mycon();
            String sql="SELECT * FROM tbl_conductor";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String id=rs.getString("cond_id");
            
                condcombo.addItem(id);
            }
            con.close();
        }
        catch(Exception ex){	
            System.out.println(ex);
        }
    }
    
    public void maxid(){     
       conducid.setText(Integer.toString(db.Getlastid("cond_id","tbl_conductor")));
    }
    
    public void tblfill(){
        ResultSet rs=condc.tablefill("SELECT * FROM  tbl_conductor");
        tblcond.setModel(DbUtils.resultSetToTableModel(rs));
    }
    
    public void clear(){//clear all text box
        condfname.setText("");
        condlname.setText("");
        condlic.setText("");
        condnic.setText("");
    }
    
    private void condfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_condfnameActionPerformed
    //save data to DB conductor table
    private void condsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condsaveActionPerformed
       
         condc.setId(Integer.parseInt(conducid.getText()));
         condc.setFname(condfname.getText());
         condc.setLname(condlname.getText());
         condc.setLicno(Integer.parseInt(condlic.getText()));
         condc.setNic(condnic.getText());
         
         int status=condc.save();
         maxid();
                
         if(status>0){
             JOptionPane.showMessageDialog(null,"Data Saved","Message",JOptionPane.INFORMATION_MESSAGE);
             condcombo.removeAllItems();
             combo();
             clear();
             maxid();
             tblfill();
         }
         else{
             JOptionPane.showMessageDialog(null,"Data Not Saved","Message",JOptionPane.WARNING_MESSAGE);
         }
         
    }//GEN-LAST:event_condsaveActionPerformed
    //update data to DB conductor table
    private void condupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condupdateActionPerformed
        
        condc.setId(Integer.parseInt(conducid.getText()));
        condc.setId(Integer.parseInt(conducid.getText()));
        condc.setFname(condfname.getText());
        condc.setLname(condlname.getText());
        condc.setLicno(Integer.parseInt(condlic.getText()));
        condc.setNic(condnic.getText());
        
       int status=condc.update(Integer.parseInt(conducid.getText()));        
         if(status>0){
             JOptionPane.showMessageDialog(null,"Data Updated","Message",JOptionPane.INFORMATION_MESSAGE);
            condcombo.removeAllItems();
            combo();
            clear();
            maxid();
            tblfill();
         }
         else{
              JOptionPane.showMessageDialog(null,"Data Not Updates","Message",JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_condupdateActionPerformed
    //delete data  DB conductor table
    private void contdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contdeleteActionPerformed
       
         int status=condc.delete(Integer.parseInt(conducid.getText()));        
         if(status>0){
             JOptionPane.showMessageDialog(null,"Data Deleted","Message",JOptionPane.INFORMATION_MESSAGE);
             condcombo.removeAllItems();
             combo();
             clear();
             maxid();
             tblfill();
         }
         else{
             JOptionPane.showMessageDialog(null,"Data Not Deleted","Message",JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_contdeleteActionPerformed
    //search data from DB conductor table
    private void condsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condsearchActionPerformed
        
        try{
        ArrayList Data=new ArrayList();
        Data=condc.search(Integer.parseInt(condcombo.getSelectedItem().toString()));
        conducid.setText(Data.get(0).toString());
        condfname.setText(Data.get(1).toString());
        condlname.setText(Data.get(2).toString());
        condlic.setText(Data.get(3).toString());
        condnic.setText(Data.get(4).toString());
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_condsearchActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        Home homf=new Home();
        homf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        Schedual schi=new Schedual();
        schi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Route roui=new Route();
        roui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Driver driv=new Driver();
        driv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Bus busi=new Bus();
        busi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Attendence atti=new Attendence();
        atti.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clear();
        maxid();
        condcombo.removeAllItems();
        combo();
        tblfill();
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(Conductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JComboBox condcombo;
    private javax.swing.JTextField condfname;
    private javax.swing.JTextField condlic;
    private javax.swing.JTextField condlname;
    private javax.swing.JTextField condnic;
    private javax.swing.JButton condsave;
    private javax.swing.JButton condsearch;
    private javax.swing.JTextField conducid;
    private javax.swing.JButton condupdate;
    private javax.swing.JButton contdelete;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblcond;
    // End of variables declaration//GEN-END:variables
}
