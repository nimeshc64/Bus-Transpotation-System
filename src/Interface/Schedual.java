/*
 * Schdedual Form 
 * save,update,delete,search
 */
package Interface;

/**
 *
 * @author Nimesh
 */
import Classes.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public final class Schedual extends javax.swing.JFrame {
   

    /**
     * Creates new form Schedual
     */
    public Schedual() {
        initComponents();
        combo();
        maxid();
        tblfill();
    }

   
    Classes.Schedual sch=new Classes.Schedual();//create object from schedual class
    DB db=new DB();//create object from database connection class
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        seduIdl = new javax.swing.JLabel();
        seduId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sedust = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sedustop = new javax.swing.JTextField();
        sehSearch = new javax.swing.JButton();
        seduCombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsch = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        seduSave = new javax.swing.JButton();
        seduUpdate = new javax.swing.JButton();
        seduDelete = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(740, 565));
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seduIdl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seduIdl.setText("ID");
        jPanel2.add(seduIdl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        seduId.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        seduId.setForeground(new java.awt.Color(255, 255, 255));
        seduId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        seduId.setEnabled(false);
        seduId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seduIdActionPerformed(evt);
            }
        });
        jPanel2.add(seduId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 70, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Start Time");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel2.add(sedust, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 350, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Stop Time");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        jPanel2.add(sedustop, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 350, 30));

        sehSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search-Find-48.png"))); // NOI18N
        sehSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sehSearchActionPerformed(evt);
            }
        });
        jPanel2.add(sehSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 40, 30));

        jPanel2.add(seduCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 160, 30));

        tblsch.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblsch);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 670, 100));

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel2.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 80, 30));

        jPanel3.setBackground(new java.awt.Color(52, 152, 219));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/schedule.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, -10, 140, 130));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Schedual Maintenance");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jPanel6.setBackground(new java.awt.Color(52, 152, 219));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seduSave.setText("Save");
        seduSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seduSaveActionPerformed(evt);
            }
        });
        jPanel6.add(seduSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 80, 40));

        seduUpdate.setText("Update");
        seduUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seduUpdateActionPerformed(evt);
            }
        });
        jPanel6.add(seduUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 90, 40));

        seduDelete.setText("Delete");
        seduDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seduDeleteActionPerformed(evt);
            }
        });
        jPanel6.add(seduDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 90, 40));

        jButton10.setBackground(new java.awt.Color(52, 152, 219));
        jButton10.setForeground(new java.awt.Color(238, 117, 68));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Homei.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jButton14.setBackground(new java.awt.Color(52, 152, 219));
        jButton14.setForeground(new java.awt.Color(238, 117, 68));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/busi.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jButton13.setBackground(new java.awt.Color(52, 152, 219));
        jButton13.setForeground(new java.awt.Color(238, 117, 68));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Mapii.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jButton12.setBackground(new java.awt.Color(52, 152, 219));
        jButton12.setForeground(new java.awt.Color(238, 117, 68));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/driveri.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jButton11.setBackground(new java.awt.Color(52, 152, 219));
        jButton11.setForeground(new java.awt.Color(238, 117, 68));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Useri.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jButton15.setBackground(new java.awt.Color(52, 152, 219));
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    public void combo()
    {
        try{
            Connection con=DB.mycon();
            String sql="SELECT * FROM tbl_schedual";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String id=rs.getString("sch_id");
                
                seduCombo.addItem(id);
            }
            con.close();
        }
        catch(Exception ex){	
            System.out.println(ex);
        }
    }
    
    public void maxid(){     
       seduId.setText(Integer.toString(db.Getlastid("Sch_id","tbl_schedual")));
      
    }
    
    public void clear()//clear all textbox
    {
        sedust.setText("");
        sedustop.setText("");
    }
    
     public void tblfill(){
        ResultSet rs=sch.tablefill("SELECT * FROM  tbl_schedual");
        tblsch.setModel(DbUtils.resultSetToTableModel(rs));
    }
     
     public void valueset(){
         
     }
    
    private void seduIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seduIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seduIdActionPerformed
    //save data to DB schedual table 
    private void seduSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seduSaveActionPerformed
         
        sch.setId(Integer.parseInt(seduId.getText()));
       sch.setStartTime(sedust.getText());
       sch.setEndTime(sedustop.getText());        
         int status=sch.save();         
         
         if(status>0){
             JOptionPane.showMessageDialog(null,"Data Saved","Message",JOptionPane.INFORMATION_MESSAGE);
             sedust.setText("");
             sedustop.setText("");
             seduCombo.removeAllItems();
             combo();
             maxid();
             tblfill();
         }
         else{
             JOptionPane.showMessageDialog(null,"Data Not Saved","Message",JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_seduSaveActionPerformed
    //update data  DB schedual table
    private void seduUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seduUpdateActionPerformed
      
        sch.setId(Integer.parseInt(seduId.getText()));
       sch.setStartTime(sedust.getText());
       sch.setEndTime(sedustop.getText());
       sch.update(Integer.parseInt(seduId.getText()));
       int status=sch.update(Integer.parseInt(seduId.getText()));        
         if(status>0){
             JOptionPane.showMessageDialog(null,"Data Updated","Message",JOptionPane.INFORMATION_MESSAGE);
             sedust.setText("");
             sedustop.setText("");
             seduCombo.removeAllItems();
             combo();
             maxid();
             tblfill();
         }
         else{
            JOptionPane.showMessageDialog(null,"Data Not Updates","Message",JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_seduUpdateActionPerformed
    //delete data  DB schedual table
    private void seduDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seduDeleteActionPerformed
        
        int status=sch.delete(Integer.parseInt(seduId.getText()));        
         if(status>0){
             JOptionPane.showMessageDialog(null,"Data Deleted","Message",JOptionPane.INFORMATION_MESSAGE);
             sedust.setText("");
             sedustop.setText("");
             seduCombo.removeAllItems();
             combo();
             maxid();
         }
         else{
            JOptionPane.showMessageDialog(null,"Data Not Deleted","Message",JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_seduDeleteActionPerformed
    //search data from DB schedual table
    private void sehSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sehSearchActionPerformed
        try{
        ArrayList Data=new ArrayList();
        Data=sch.search(Integer.parseInt(seduCombo.getSelectedItem().toString()));
        sedust.setText(Data.get(0).toString());
        sedustop.setText(Data.get(1).toString());
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_sehSearchActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        Home homf=new Home();
        homf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        Bus busi=new Bus();
        busi.setVisible(true);
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
        Attendence atti=new Attendence();
        atti.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clear();
        maxid();
        seduCombo.removeAllItems();
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
            java.util.logging.Logger.getLogger(Schedual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Schedual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Schedual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Schedual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Schedual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox seduCombo;
    private javax.swing.JButton seduDelete;
    private javax.swing.JTextField seduId;
    private javax.swing.JLabel seduIdl;
    private javax.swing.JButton seduSave;
    private javax.swing.JButton seduUpdate;
    private javax.swing.JTextField sedust;
    private javax.swing.JTextField sedustop;
    private javax.swing.JButton sehSearch;
    private javax.swing.JTable tblsch;
    // End of variables declaration//GEN-END:variables
}
