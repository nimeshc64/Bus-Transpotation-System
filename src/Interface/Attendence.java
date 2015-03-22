/*
 * Attendance Form 
 * save,update,delete,search
 * 
 */

package Interface;

import Classes.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;//using for fill table

/**
 *
 * @author Nimesh
 */
public final class Attendence extends javax.swing.JFrame {

    /**
     * Creates new form Attendence
     */
    DateFormat date = new SimpleDateFormat("yyyy/MM/dd");
    DateFormat time = new SimpleDateFormat("hh:mm");
    Calendar cal = Calendar.getInstance();
    
    public Attendence() {
        initComponents();        
        datet.setText(date.format(cal.getTime()));       
        timet.setText(time.format(cal.getTime()));
        maxid();
        combo("tbl_attendence","time",1);
        combo("tbl_Attendence","date",2);
        combo("tbl_driver","fname",3);
        combo("tbl_conductor","fname",4);
        combo("tbl_route","route_id",5);
        tblfill();
    }
        Classes.Attendence atten=new Classes.Attendence();//Create Object Attendence Class
        DB db=new DB();//create object from database connection class
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        attendid = new javax.swing.JTextField();
        attsearchiT = new javax.swing.JComboBox();
        attenSearch = new javax.swing.JButton();
        drverid = new javax.swing.JComboBox();
        condid = new javax.swing.JComboBox();
        routeid = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        attentable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        datet = new javax.swing.JLabel();
        timet = new javax.swing.JLabel();
        attsearchiD = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        attupdate = new javax.swing.JButton();
        attsave = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(740, 500));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Attendence ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Driver Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Conductor Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Route ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Time");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        attendid.setEditable(false);
        jPanel1.add(attendid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 120, -1));

        attsearchiT.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Time" }));
        jPanel1.add(attsearchiT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 110, 30));

        attenSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search-Find-48.png"))); // NOI18N
        attenSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attenSearchActionPerformed(evt);
            }
        });
        jPanel1.add(attenSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 40, 30));

        jPanel1.add(drverid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 120, -1));

        jPanel1.add(condid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 120, -1));

        jPanel1.add(routeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 120, -1));

        attentable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(attentable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 380, 150));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        datet.setFont(new java.awt.Font("Arial Narrow", 2, 14)); // NOI18N
        datet.setText("...");
        jPanel1.add(datet, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        timet.setFont(new java.awt.Font("Arial Narrow", 2, 14)); // NOI18N
        timet.setText("...");
        jPanel1.add(timet, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        attsearchiD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date" }));
        jPanel1.add(attsearchiD, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 110, 30));

        jPanel3.setBackground(new java.awt.Color(210, 226, 228));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Calendar.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 130, 90));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Attendence Maintenance");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jPanel6.setBackground(new java.awt.Color(210, 226, 228));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        attupdate.setText("UPDATE");
        attupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attupdateActionPerformed(evt);
            }
        });
        jPanel6.add(attupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 80, 40));

        attsave.setText("SAVE");
        attsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attsaveActionPerformed(evt);
            }
        });
        jPanel6.add(attsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 80, 40));

        jButton10.setBackground(new java.awt.Color(210, 226, 228));
        jButton10.setForeground(new java.awt.Color(238, 117, 68));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Homei.png"))); // NOI18N
        jButton10.setToolTipText("Home");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jButton14.setBackground(new java.awt.Color(210, 226, 228));
        jButton14.setForeground(new java.awt.Color(238, 117, 68));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/schedulei.png"))); // NOI18N
        jButton14.setToolTipText("Schedual");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jButton13.setBackground(new java.awt.Color(210, 226, 228));
        jButton13.setForeground(new java.awt.Color(238, 117, 68));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Mapii.png"))); // NOI18N
        jButton13.setToolTipText("Route");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jButton12.setBackground(new java.awt.Color(210, 226, 228));
        jButton12.setForeground(new java.awt.Color(238, 117, 68));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/driveri.png"))); // NOI18N
        jButton12.setToolTipText("Driver");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jButton11.setBackground(new java.awt.Color(210, 226, 228));
        jButton11.setForeground(new java.awt.Color(238, 117, 68));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Useri.png"))); // NOI18N
        jButton11.setToolTipText("Conductor");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jButton15.setBackground(new java.awt.Color(210, 226, 228));
        jButton15.setForeground(new java.awt.Color(238, 117, 68));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/busi.png"))); // NOI18N
        jButton15.setToolTipText("Bus");
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void clear(){//clear all combobox and refill
        attsearchiT.removeAllItems();
        combo("tbl_attendence","time",1);
        attsearchiD.removeAllItems();
        combo("tbl_Attendence","date",2);
        drverid.removeAllItems();
        combo("tbl_driver","fname",3);
        condid.removeAllItems();
        combo("tbl_conductor","fname",4);
        routeid.removeAllItems();
        combo("tbl_route","route_id",5);
    }
    //save data to DB attendance table
    private void attsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attsaveActionPerformed
        
        atten.setId(Integer.parseInt(attendid.getText()));
        atten.setRouteid(Integer.parseInt(routeid.getSelectedItem().toString()));
        atten.setDriverid(drverid.getSelectedItem().toString());
        atten.setConducid(condid.getSelectedItem().toString());
        atten.setDate(datet.getText());
        atten.setTime(timet.getText());
        
        int status=atten.save();
           
         if(status>0){//check saved
             JOptionPane.showMessageDialog(null,"Data Saved","Message",JOptionPane.INFORMATION_MESSAGE);
             tblfill();
             maxid();
             clear();
         }
         else{
             JOptionPane.showMessageDialog(null,"Data Not Saved","Message",JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_attsaveActionPerformed
     //update data to DB attendance table
    private void attupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attupdateActionPerformed
        
        atten.setId(Integer.parseInt(attendid.getText()));
        atten.setRouteid(Integer.parseInt(routeid.getSelectedItem().toString()));
        atten.setDriverid(drverid.getSelectedItem().toString());
        atten.setConducid(condid.getSelectedItem().toString());
        atten.setDate(datet.getText());
        atten.setTime(timet.getText());
        
       int status=atten.update(Integer.parseInt(attendid.getText()));        
         if(status>0){//check updated
            JOptionPane.showMessageDialog(null,"Data Updated","Message",JOptionPane.INFORMATION_MESSAGE);
            tblfill();
            maxid();
            clear();
         }
         else{
            JOptionPane.showMessageDialog(null,"Data Not Updates","Message",JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_attupdateActionPerformed
     //search data from DB attendance table
    private void attenSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attenSearchActionPerformed
        try{
        ResultSet rs=atten.tablefill("SELECT route_id AS 'Route Id',date AS 'Date',time AS 'Time',driver_fname AS 'Driver Name',conductor_fname AS 'Conductor Name' FROM  tbl_attendence WHERE time='"+attsearchiT.getSelectedItem().toString()+"' AND '"+attsearchiD.getSelectedItem().toString()+"' ");
        attentable.setModel(DbUtils.resultSetToTableModel(rs));//fill data table
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_attenSearchActionPerformed

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
        Conductor coni=new Conductor();
        coni.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Bus busi=new Bus();
        busi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed
    //fill all combobox
     public void combo(String tblname,String colmname,int set)
    {
        String id=null;
        try{
            Connection con=DB.mycon();
            String sql="SELECT * FROM "+tblname+"";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(set==1){
            while(rs.next())
                {
               
                id=rs.getString(colmname);                
                attsearchiT.addItem(id);               
                }
            }
            if(set==2){
              while(rs.next())
                {
                String name;     
                name=rs.getString(colmname);                 
                attsearchiD.addItem(name);                
                }  
            }
            if(set==3){
              while(rs.next())
                {
                String name;     
                name=rs.getString(colmname);                 
                drverid.addItem(name);                
                }  
            }
            if(set==4){
                while(rs.next())
                {
                String name;                  
                name=rs.getString(colmname);         
                condid.addItem(name);
                }  
            }
            if(set==5){
                while(rs.next())
                {                     
                id=rs.getString(colmname);                
                routeid.addItem(id);
                }
            }
            con.close();
        }
        catch(Exception ex){	
            System.out.println(ex);
        }
        
    }
     
   
    public void maxid(){      
        attendid.setText(Integer.toString(db.Getlastid("atd_id","tbl_attendence")));     
    }
    
    public void tblfill(){
        ResultSet rs=atten.tablefill("SELECT * FROM  tbl_bus");
        attentable.setModel(DbUtils.resultSetToTableModel(rs));
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
            java.util.logging.Logger.getLogger(Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attenSearch;
    private javax.swing.JTextField attendid;
    private javax.swing.JTable attentable;
    private javax.swing.JButton attsave;
    private javax.swing.JComboBox attsearchiD;
    private javax.swing.JComboBox attsearchiT;
    private javax.swing.JButton attupdate;
    private javax.swing.JComboBox condid;
    private javax.swing.JLabel datet;
    private javax.swing.JComboBox drverid;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox routeid;
    private javax.swing.JLabel timet;
    // End of variables declaration//GEN-END:variables
}
