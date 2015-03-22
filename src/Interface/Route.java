/*
 * route Form 
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
public class Route extends javax.swing.JFrame {

    /**
     * Creates new form Route
     */
    public Route() {
        initComponents();
        combo("tbl_route","route_id",1);
        combo("tbl_bus","bus_id",2);
        combo("tbl_schedual","sch_id",3);
        maxid();
        tblfill();
    }
        Classes.Route routc=new Classes.Route();//create object from route class
        DB db=new DB();//create object from databse connection class
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        routedelete = new javax.swing.JButton();
        routeupdate = new javax.swing.JButton();
        routesave = new javax.swing.JButton();
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
        jLabel7 = new javax.swing.JLabel();
        routeid = new javax.swing.JTextField();
        routenumber = new javax.swing.JTextField();
        routestart = new javax.swing.JTextField();
        routestop = new javax.swing.JTextField();
        rutesearch = new javax.swing.JComboBox();
        routesearch = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        busselect = new javax.swing.JComboBox();
        scheduselect = new javax.swing.JComboBox();
        busids = new javax.swing.JLabel();
        schids = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblrot = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(740, 565));
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(214, 195, 41));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        routedelete.setText("DELETE");
        routedelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routedeleteActionPerformed(evt);
            }
        });
        jPanel6.add(routedelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 80, 40));

        routeupdate.setText("UPDATE");
        routeupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeupdateActionPerformed(evt);
            }
        });
        jPanel6.add(routeupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 80, 40));

        routesave.setText("SAVE");
        routesave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routesaveActionPerformed(evt);
            }
        });
        jPanel6.add(routesave, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 80, 40));

        jButton10.setBackground(new java.awt.Color(214, 195, 41));
        jButton10.setForeground(new java.awt.Color(238, 117, 68));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Homei.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jButton14.setBackground(new java.awt.Color(214, 195, 41));
        jButton14.setForeground(new java.awt.Color(238, 117, 68));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/schedulei.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jButton13.setBackground(new java.awt.Color(214, 195, 41));
        jButton13.setForeground(new java.awt.Color(238, 117, 68));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/busi.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jButton12.setBackground(new java.awt.Color(214, 195, 41));
        jButton12.setForeground(new java.awt.Color(238, 117, 68));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/driveri.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jButton11.setBackground(new java.awt.Color(214, 195, 41));
        jButton11.setForeground(new java.awt.Color(238, 117, 68));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Useri.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jButton15.setBackground(new java.awt.Color(214, 195, 41));
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
        jLabel3.setText("Route ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Route Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Start Place");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Stop Place");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Schedual Select");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        routeid.setEditable(false);
        jPanel1.add(routeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 120, -1));

        routenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routenumberActionPerformed(evt);
            }
        });
        jPanel1.add(routenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 120, -1));
        jPanel1.add(routestart, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 350, -1));
        jPanel1.add(routestop, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 350, -1));

        jPanel1.add(rutesearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 80, 30));

        routesearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search-Find-48.png"))); // NOI18N
        routesearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routesearchActionPerformed(evt);
            }
        });
        jPanel1.add(routesearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 40, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Bus Select");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jPanel1.add(busselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 180, -1));

        jPanel1.add(scheduselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 180, -1));

        busids.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        busids.setText("...");
        busids.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(busids, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        schids.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        schids.setText("...");
        schids.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(schids, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        tblrot.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblrot);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 670, 80));

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 80, 30));

        jPanel3.setBackground(new java.awt.Color(214, 195, 41));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(243, 156, 18));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/map.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 290, 90));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Route Maintenance");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

     public String combo(String tblname,String colmname,int set)
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
                
                rutesearch.addItem(id);               
                }
            }
            if(set==2){
              while(rs.next())
                {
                id=rs.getString(colmname);                
                busselect.addItem(id);                
                }  
            }
            if(set==3){
                while(rs.next())
                {
                id=rs.getString(colmname);                
                scheduselect.addItem(id);
                }  
            }
            con.close();
        }
        catch(Exception ex){	
            System.out.println(ex);
        }
        return id;
    }
     
     
    
    public void maxid()
    {     
       routeid.setText(Integer.toString(db.Getlastid("route_id","tbl_route")));      
    }
    
    public void tblfill(){
        ResultSet rs=routc.tablefill("SELECT * FROM  tbl_route");
        tblrot.setModel(DbUtils.resultSetToTableModel(rs));
    }
    
    public void clear()//clear all text box
    {
        routenumber.setText("");
        routestart.setText("");
        routestop.setText("");
        busids.setText("...");
        schids.setText("...");
    }
    
    private void routenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routenumberActionPerformed
    //save data to DB route table
    private void routesaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routesaveActionPerformed
        
        routc.setId(Integer.parseInt(routeid.getText()));
        routc.setRt_no(Integer.parseInt(routenumber.getText()));
        routc.setStartpalce(routestart.getText());
        routc.setStopplace(routestop.getText());
        routc.setBus_id(Integer.parseInt(busselect.getSelectedItem().toString()));
        routc.setSch_id(Integer.parseInt(scheduselect.getSelectedItem().toString()));
        
        int status=routc.save();
        
         if(status>0){
             JOptionPane.showMessageDialog(null,"Data Saved","Message",JOptionPane.INFORMATION_MESSAGE);
             maxid();
             rutesearch.removeAllItems();
             combo("tbl_route","route_id",1);
             clear();
             tblfill();
         }
         else{
             JOptionPane.showMessageDialog(null,"Data Not Saved","Message",JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_routesaveActionPerformed
    //update data  DB route table
    private void routeupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeupdateActionPerformed
        
        routc.setId(Integer.parseInt(routeid.getText()));
        routc.setRt_no(Integer.parseInt(routenumber.getText()));
        routc.setStartpalce(routestart.getText());
        routc.setStopplace(routestop.getText());
        routc.setBus_id(Integer.parseInt(busselect.getSelectedItem().toString()));
        routc.setSch_id(Integer.parseInt(scheduselect.getSelectedItem().toString()));
        
       int status=routc.update(Integer.parseInt(routeid.getText()));        
         if(status>0){
             JOptionPane.showMessageDialog(null,"Data Updated","Message",JOptionPane.INFORMATION_MESSAGE);
             maxid();
             rutesearch.removeAllItems();
             combo("tbl_route","route_id",1);
             clear();
             tblfill();
         }
         else{
             JOptionPane.showMessageDialog(null,"Data Not Updates","Message",JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_routeupdateActionPerformed
    //delete data  DB route table
    private void routedeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routedeleteActionPerformed
         
        int status=routc.delete(Integer.parseInt(routeid.getText()));        
         if(status>0){
             JOptionPane.showMessageDialog(null,"Data Deleted","Message",JOptionPane.INFORMATION_MESSAGE);
             maxid();
             rutesearch.removeAllItems();
             combo("tbl_route","route_id",1);
             clear();
             tblfill();
         }
         else{
            JOptionPane.showMessageDialog(null,"Data Not Deleted","Message",JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_routedeleteActionPerformed
    //search data from DB route table
    private void routesearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routesearchActionPerformed
        
         try{
        ArrayList Data=new ArrayList();
        Data=routc.search(Integer.parseInt(rutesearch.getSelectedItem().toString()));
        routeid.setText(Data.get(0).toString());
        routenumber.setText(Data.get(1).toString());
        routestart.setText(Data.get(2).toString());
        routestop.setText(Data.get(3).toString());
        busids.setText(Data.get(4).toString());
        schids.setText(Data.get(5).toString());
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_routesearchActionPerformed

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
        Bus busi=new Bus();
        busi.setVisible(true);
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
        Attendence atti=new Attendence();
        atti.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clear();
        maxid();
        rutesearch.removeAllItems();
        combo("tbl_route","route_id",1);
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
            java.util.logging.Logger.getLogger(Route.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Route.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Route.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Route.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Route().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel busids;
    private javax.swing.JComboBox busselect;
    private javax.swing.JButton clear;
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
    private javax.swing.JButton routedelete;
    private javax.swing.JTextField routeid;
    private javax.swing.JTextField routenumber;
    private javax.swing.JButton routesave;
    private javax.swing.JButton routesearch;
    private javax.swing.JTextField routestart;
    private javax.swing.JTextField routestop;
    private javax.swing.JButton routeupdate;
    private javax.swing.JComboBox rutesearch;
    private javax.swing.JComboBox scheduselect;
    private javax.swing.JLabel schids;
    private javax.swing.JTable tblrot;
    // End of variables declaration//GEN-END:variables
}
