/*
 * Bus Form 
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
public class Bus extends javax.swing.JFrame {

    /**
     * Creates new form Bus
     */
    public Bus() {
        initComponents();
        combo();
        maxid();
        tblfill();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        busdelete = new javax.swing.JButton();
        busupdate = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        bussave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combname = new javax.swing.JLabel();
        busid = new javax.swing.JTextField();
        busmodel = new javax.swing.JTextField();
        busregi = new javax.swing.JTextField();
        buscapaci = new javax.swing.JTextField();
        busac = new javax.swing.JRadioButton();
        busnon = new javax.swing.JRadioButton();
        buscombo = new javax.swing.JComboBox();
        Bussearch = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbus = new javax.swing.JTable();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(740, 565));
        setPreferredSize(new java.awt.Dimension(740, 565));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(192, 57, 43));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gr.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 0, 280, 100));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Bus Maintenance");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jPanel6.setBackground(new java.awt.Color(192, 57, 43));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        busdelete.setText("DELETE");
        busdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busdeleteActionPerformed(evt);
            }
        });
        jPanel6.add(busdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 80, 40));

        busupdate.setText("UPDATE");
        busupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busupdateActionPerformed(evt);
            }
        });
        jPanel6.add(busupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 80, 40));

        jButton10.setBackground(new java.awt.Color(238, 117, 68));
        jButton10.setForeground(new java.awt.Color(238, 117, 68));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Homei.png"))); // NOI18N
        jButton10.setToolTipText("Home");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jButton11.setBackground(new java.awt.Color(238, 117, 68));
        jButton11.setForeground(new java.awt.Color(238, 117, 68));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Useri.png"))); // NOI18N
        jButton11.setToolTipText("Conductor");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jButton12.setBackground(new java.awt.Color(238, 117, 68));
        jButton12.setForeground(new java.awt.Color(238, 117, 68));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/driveri.png"))); // NOI18N
        jButton12.setToolTipText("Driver");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jButton13.setBackground(new java.awt.Color(238, 117, 68));
        jButton13.setForeground(new java.awt.Color(238, 117, 68));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Mapii.png"))); // NOI18N
        jButton13.setToolTipText("Route");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jButton14.setBackground(new java.awt.Color(238, 117, 68));
        jButton14.setForeground(new java.awt.Color(238, 117, 68));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/schedulei.png"))); // NOI18N
        jButton14.setToolTipText("Schedual");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jButton15.setBackground(new java.awt.Color(238, 117, 68));
        jButton15.setForeground(new java.awt.Color(238, 117, 68));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Calendair.png"))); // NOI18N
        jButton15.setToolTipText("Attendance");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        bussave.setText("SAVE");
        bussave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bussaveActionPerformed(evt);
            }
        });
        jPanel6.add(bussave, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 80, 40));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Bus ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Model");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Register Number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Capacity");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        combname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(combname, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 50, 30));

        busid.setEditable(false);
        jPanel1.add(busid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 120, -1));

        busmodel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busmodelActionPerformed(evt);
            }
        });
        jPanel1.add(busmodel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 350, -1));
        jPanel1.add(busregi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 350, -1));
        jPanel1.add(buscapaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 350, -1));

        buttonGroup1.add(busac);
        busac.setText("AC");
        jPanel1.add(busac, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        buttonGroup1.add(busnon);
        busnon.setText("NON-AC");
        jPanel1.add(busnon, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        jPanel1.add(buscombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 100, 30));

        Bussearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search-Find-48.png"))); // NOI18N
        Bussearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BussearchActionPerformed(evt);
            }
        });
        jPanel1.add(Bussearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 40, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Feature");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        tblbus.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblbus);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 670, 80));

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 80, 30));

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String actype=null;
    Classes.Bus busc=new Classes.Bus(WIDTH, actype, WIDTH, WIDTH, actype);//create object from bus class
    DB db=new DB();//create object from database connection class
    
    public void combo()
    {
        try{
            
            Connection con=DB.mycon();
            String sql="SELECT * FROM tbl_bus";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String id=rs.getString("bus_id"); 
                buscombo.addItem(id);
            }
            con.close();
        }
        catch(Exception ex){	
            System.out.println(ex);
        }
       
    }
          
    
    public void maxid()
    {      
        busid.setText(Integer.toString(db.Getlastid("bus_id","tbl_bus")));     
    }
    
    public void tblfill()
    {
        ResultSet rs=busc.tablefill("SELECT * FROM  tbl_bus");
        tblbus.setModel(DbUtils.resultSetToTableModel(rs));//fill data table
    }
    
    public void SetData()//use constructor and pass text box value
    {
      busc=new Classes.Bus(Integer.parseInt(busid.getText()),busmodel.getText(),Integer.parseInt(busregi.getText()),Integer.parseInt(buscapaci.getText()),actype); 
    }
    
    public String accheck()
    {
    if(busac.isSelected())
    {
        actype="ac";
    }    
    else{
        actype="nonac";
    }
    return actype;
    }
    
    public void clear(){//clear all text box and radio button
       
        busid.setText("");
        busmodel.setText("");
        busregi.setText("");
        buscapaci.setText("");
        buttonGroup1.clearSelection();
    }
    
    private void busmodelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busmodelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busmodelActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
     
        Home homf=new Home();
        homf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed
    //search data from DB bus table
    private void BussearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BussearchActionPerformed
         
        String radio=null;
        try{
        ArrayList Data=new ArrayList();
        Data=busc.search(Integer.parseInt(buscombo.getSelectedItem().toString()));
        busid.setText(Data.get(0).toString());
        busmodel.setText(Data.get(1).toString());
        busregi.setText(Data.get(2).toString());
        buscapaci.setText(Data.get(3).toString());
        radio=(Data.get(4).toString());
        
        if("ac".equals(radio))
        {
            busac.setSelected(true);
        }
        else
        {
            busnon.setSelected(true);
        }       
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_BussearchActionPerformed
    //update data to DB bus table
    private void busupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busupdateActionPerformed
        
       accheck();
       SetData();
       int status=busc.update(Integer.parseInt(busid.getText()));  
       
       if(status>0){
             System.out.println("Update");
              clear();       
            maxid();
            buscombo.removeAllItems();
            combo();
            tblfill();
         }
         else{
             System.out.println("Not Update");
         }
       
    }//GEN-LAST:event_busupdateActionPerformed
    //delete data  DB bus table
    private void busdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busdeleteActionPerformed
        
        int status=busc.delete(Integer.parseInt(busid.getText()));        
         if(status>0){
             System.out.println("Delete");
              clear();       
            maxid();
            buscombo.removeAllItems();
            combo();
            tblfill();
         }
         else{
             System.out.println("Not delete");
         }
        
    }//GEN-LAST:event_busdeleteActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Conductor coni=new Conductor();
        coni.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Driver driv=new Driver();
        driv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Route roui=new Route();
        roui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        Schedual schi=new Schedual();
        schi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Attendence atti=new Attendence();
        atti.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clear();
        maxid();
        buscombo.removeAllItems();
        combo();
        tblfill();
    }//GEN-LAST:event_clearActionPerformed
    //save data to DB bus table
    private void bussaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bussaveActionPerformed

        accheck();
        SetData();
        int status=busc.save();

        if(status>0){
            JOptionPane.showMessageDialog(null,"Data Saved","Message",JOptionPane.INFORMATION_MESSAGE);
            clear();
            maxid();
            buscombo.removeAllItems();
            combo();
            tblfill();
        }
        else{
            JOptionPane.showMessageDialog(null,"Data Not Saved","Message",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bussaveActionPerformed

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
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bussearch;
    private javax.swing.JRadioButton busac;
    private javax.swing.JTextField buscapaci;
    private javax.swing.JComboBox buscombo;
    private javax.swing.JButton busdelete;
    private javax.swing.JTextField busid;
    private javax.swing.JTextField busmodel;
    private javax.swing.JRadioButton busnon;
    private javax.swing.JTextField busregi;
    private javax.swing.JButton bussave;
    private javax.swing.JButton busupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JLabel combname;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblbus;
    // End of variables declaration//GEN-END:variables
}
