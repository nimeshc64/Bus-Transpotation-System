/*
 * driver Form 
 * save,update,delete,search
 */

package Interface;

import Classes.DB;
import Classes.TemporyDrivers;
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
public final class Driver extends javax.swing.JFrame {

    /**
     * Creates new form Driver
     */
    public Driver() {
        initComponents();
        combo();
        maxid();
        workingtype();
        tblfill();
    }
      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        driverdelete = new javax.swing.JButton();
        driverupdate = new javax.swing.JButton();
        driversave = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        workingdaylbl = new javax.swing.JLabel();
        driverid = new javax.swing.JTextField();
        driverfname = new javax.swing.JTextField();
        driverlname = new javax.swing.JTextField();
        driverdh = new javax.swing.JTextField();
        drivsech = new javax.swing.JComboBox();
        driversearch = new javax.swing.JButton();
        driverlic = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        drivernic = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dperm = new javax.swing.JRadioButton();
        dtemp = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldriv = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(740, 565));
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(155, 89, 182));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        driverdelete.setText("DELETE");
        driverdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverdeleteActionPerformed(evt);
            }
        });
        jPanel6.add(driverdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 80, 40));

        driverupdate.setText("UPDATE");
        driverupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverupdateActionPerformed(evt);
            }
        });
        jPanel6.add(driverupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 80, 40));

        driversave.setText("SAVE");
        driversave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driversaveActionPerformed(evt);
            }
        });
        jPanel6.add(driversave, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 80, 40));

        jButton10.setBackground(new java.awt.Color(155, 89, 182));
        jButton10.setForeground(new java.awt.Color(238, 117, 68));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Homei.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jButton14.setBackground(new java.awt.Color(155, 89, 182));
        jButton14.setForeground(new java.awt.Color(238, 117, 68));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/schedulei.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jButton13.setBackground(new java.awt.Color(155, 89, 182));
        jButton13.setForeground(new java.awt.Color(238, 117, 68));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Mapii.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jButton12.setBackground(new java.awt.Color(155, 89, 182));
        jButton12.setForeground(new java.awt.Color(238, 117, 68));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/busi.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jButton11.setBackground(new java.awt.Color(155, 89, 182));
        jButton11.setForeground(new java.awt.Color(238, 117, 68));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Useri.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jButton15.setBackground(new java.awt.Color(155, 89, 182));
        jButton15.setForeground(new java.awt.Color(238, 117, 68));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Calendair.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Driver ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Last Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("License Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        workingdaylbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        workingdaylbl.setText("Working Days");
        workingdaylbl.setToolTipText("");
        jPanel1.add(workingdaylbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        driverid.setEditable(false);
        jPanel1.add(driverid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 120, -1));

        driverfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverfnameActionPerformed(evt);
            }
        });
        jPanel1.add(driverfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 350, -1));
        jPanel1.add(driverlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 350, -1));
        jPanel1.add(driverdh, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 200, -1));

        jPanel1.add(drivsech, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 80, 30));

        driversearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search-Find-48.png"))); // NOI18N
        driversearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driversearchActionPerformed(evt);
            }
        });
        jPanel1.add(driversearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 40, 30));
        jPanel1.add(driverlic, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 200, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("NIC Number");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));
        jPanel1.add(drivernic, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 200, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Driver Type");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        buttonGroup1.add(dperm);
        dperm.setSelected(true);
        dperm.setText("Permenent");
        dperm.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dpermStateChanged(evt);
            }
        });
        jPanel1.add(dperm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        buttonGroup1.add(dtemp);
        dtemp.setText("Tempory");
        dtemp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dtempStateChanged(evt);
            }
        });
        jPanel1.add(dtemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        tbldriv.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbldriv);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 670, 80));

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 80, 30));

        jPanel3.setBackground(new java.awt.Color(155, 89, 182));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hris-pips.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 200, 250));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Drivers Maintenance");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

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
     Classes.TemporyDrivers drivc=new Classes.TemporyDrivers();//create object from driver class
     DB db=new DB();//create object from database connection class
        
        
        public String type;
    @SuppressWarnings("unchecked")
    public void combo()
    {
        try{
            drivsech.removeAllItems();
            Connection con=DB.mycon();
            String sql="SELECT driver_id,fname FROM tbl_driver";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String id1=rs.getString("driver_id");
                       
                drivsech.addItem(id1);
            }
            con.close();
        }
        catch(Exception ex){	
            System.out.println(ex);
        }
    }
    
    public void maxid()
    {     
       driverid.setText(Integer.toString(db.Getlastid("driver_id","tbl_driver")));      
    }
    
    public void tblfill(){
        ResultSet rs=drivc.tablefill("SELECT * FROM  tbl_driver");
        tbldriv.setModel(DbUtils.resultSetToTableModel(rs));
    }
    
    public void clear(){//clear all textbox
        driverfname.setText("");
        driverlname.setText("");
        driverlic.setText("");
        drivernic.setText("");
        buttonGroup1.clearSelection();
        driverdh.setText("");
    }
    
    public String workingtype(){
        if(!(!dperm.isSelected()==true)){
            type="perm";
            workingdaylbl.setText("Working Days");
        }
        else{
            workingdaylbl.setText("Working Hours");
            type="temp";
        }
        return type;
    }
    
    private void driverfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driverfnameActionPerformed
     //save data to DB driver table
    private void driversaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driversaveActionPerformed
        
        drivc.setId(Integer.parseInt(driverid.getText()));
        drivc.setFname(driverfname.getText());
        drivc.setLname(driverlname.getText());
        drivc.setLicno(Integer.parseInt(driverlic.getText()));
        drivc.setNic(drivernic.getText());
        drivc.setType(workingtype());
        if("perm"==workingtype()){
           drivc.setWorkingdays(Integer.parseInt(driverdh.getText())); 
        }
        else{
           drivc.setWorkinghours(Integer.parseInt(driverdh.getText()));  
        }
       
        int status=drivc.save();   
         if(status>0){
             JOptionPane.showMessageDialog(null,"Data Saved","Message",JOptionPane.INFORMATION_MESSAGE);
             drivsech.removeAllItems();
             combo();
             clear();
             maxid();
             tblfill();
       }
         else{
             JOptionPane.showMessageDialog(null,"Data Not Saved","Message",JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_driversaveActionPerformed

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
        Bus busi=new Bus();
        busi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Conductor coni=new Conductor();
        coni.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Attendence atti=new Attendence();
        atti.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void dpermStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dpermStateChanged
        workingtype();
    }//GEN-LAST:event_dpermStateChanged

    private void dtempStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dtempStateChanged
        workingtype();
    }//GEN-LAST:event_dtempStateChanged
    //update data to DB driver table
    private void driverupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverupdateActionPerformed
       
       
       drivc.setId(Integer.parseInt(driverid.getText()));
        drivc.setFname(driverfname.getText());
        drivc.setLname(driverlname.getText());
        drivc.setLicno(Integer.parseInt(driverlic.getText()));
        drivc.setNic(drivernic.getText());
        drivc.setType(workingtype());
        
        if("perm"==workingtype()){
           drivc.setWorkingdays(Integer.parseInt(driverdh.getText())); 
        }
        else{
           drivc.setWorkinghours(Integer.parseInt(driverdh.getText()));  
        }
        
       int status=drivc.update(Integer.parseInt(driverid.getText()));  
       
       if(status>0){
             JOptionPane.showMessageDialog(null,"Data Updated","Message",JOptionPane.INFORMATION_MESSAGE);
             drivsech.removeAllItems();
             combo();
             clear();
             maxid();
             tblfill();
         }
         else{
            JOptionPane.showMessageDialog(null,"Data Not Updates","Message",JOptionPane.WARNING_MESSAGE);
         }
      
       
      
    }//GEN-LAST:event_driverupdateActionPerformed
     //delete data DB driver table
    private void driverdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverdeleteActionPerformed
       
         int status=drivc.delete(Integer.parseInt(driverid.getText()));        
         if(status>0){
             JOptionPane.showMessageDialog(null,"Data Deleted","Message",JOptionPane.INFORMATION_MESSAGE);
             drivsech.removeAllItems();
             combo();
             clear();
             maxid();
             tblfill();
         }
         else{
             JOptionPane.showMessageDialog(null,"Data Not Deleted","Message",JOptionPane.WARNING_MESSAGE);
         }
      
    }//GEN-LAST:event_driverdeleteActionPerformed
     //search data from DB driver table
    private void driversearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driversearchActionPerformed
       
        String radio=null;
        try{
        ArrayList Data=new ArrayList();
        Data=drivc.search(Integer.parseInt(drivsech.getSelectedItem().toString()));
        driverid.setText(Data.get(0).toString());
        driverfname.setText(Data.get(1).toString());
        driverlname.setText(Data.get(2).toString());
        driverlic.setText(Data.get(3).toString());
        drivernic.setText(Data.get(4).toString());
        radio=(Data.get(5).toString());
   
        if("perm".equals(radio))
        {
            dperm.setSelected(true);
            workingdaylbl.setText("Working Days");
            driverdh.setText(Data.get(6).toString());
        }
        else
        {
            dtemp.setSelected(true);
            workingdaylbl.setText("Working Hours");
            driverdh.setText(Data.get(7).toString());
        }       
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_driversearchActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clear();
        maxid();
        drivsech.removeAllItems();
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
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Driver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton clear;
    private javax.swing.JRadioButton dperm;
    private javax.swing.JButton driverdelete;
    private javax.swing.JTextField driverdh;
    private javax.swing.JTextField driverfname;
    private javax.swing.JTextField driverid;
    private javax.swing.JTextField driverlic;
    private javax.swing.JTextField driverlname;
    private javax.swing.JTextField drivernic;
    private javax.swing.JButton driversave;
    private javax.swing.JButton driversearch;
    private javax.swing.JButton driverupdate;
    private javax.swing.JComboBox drivsech;
    private javax.swing.JRadioButton dtemp;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbldriv;
    private javax.swing.JLabel workingdaylbl;
    // End of variables declaration//GEN-END:variables
}
