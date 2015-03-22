/*
 *tempory driverclass
 *save,update,delete,table fill
 *driver sub class
 */

package Classes;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nimesh
 */
public class TemporyDrivers extends Driver{//inherit from driver super class
    private int workinghours;

    
      /**
     * @return the workinghours
     */
    public int getWorkinghours() {//using getters setters
        return workinghours;
    }

    /**
     * @param workinghours the workinghours to set
     */
    public void setWorkinghours(int workinghours) {
        this.workinghours = workinghours;
    }
    
    /**
     *
     * @return
     */
    @Override//overiding method and save data to db
     public int save(){
        
        PreparedStatement ps=null;
        int status = 0;
        try {                    
            Connection con = DB.mycon();
            ps = con.prepareStatement("INSERT INTO tbl_driver(driver_id,fname,lname,licen_no,nic,type,workingdays,workinghours) VALUES(?, ?, ?, ?, ?, ?, ?, ?)");       
            ps.setInt(1,getId());
            ps.setString(2,getFname());
            ps.setString(3,getLname());
            ps.setInt(4,getLicno());
            ps.setString(5,getNic());
            ps.setString(6,getType());
            ps.setInt(7,getWorkingdays());
            ps.setInt(8,getWorkinghours());
       
            status=ps.executeUpdate();        
            con.close();
        } catch (Exception ex) {
           System.err.println("Got an exception!");
           System.err.println(ex.getMessage());
        }            
        return status;
          
    }    
   
    /**
     *
     * @param idn
     * @return
     */
    @Override//overiding method and update db data
    public int update(int idn){
        PreparedStatement ps=null;
        int status=0;
        try {                    
            Connection con = DB.mycon();
            ps = con.prepareStatement("UPDATE tbl_driver SET driver_id=?,fname=?,lname=?,licen_no=?,Nic=?,type=?,workingdays=?,workinghours=? WHERE driver_id="+idn+"");
            ps.setInt(1,getId());
            ps.setString(2,getFname());
            ps.setString(3,getLname());
            ps.setInt(4,getLicno());
            ps.setString(5,getNic());
            ps.setString(6,getType());
            ps.setInt(7,getWorkingdays());
            ps.setInt(8,getWorkinghours());
            status=ps.executeUpdate();
            con.close();
        } catch (Exception ex) {
           System.err.println("Got an exception!");
           System.err.println(ex.getMessage());
        }
            return status;
    }
    
    /**
     *
     * @param idn
     * @return
     */
    @Override//overiding method and delete db data
    public int delete(int idn){
        PreparedStatement ps=null;
        int status=0;
        try {                    
            Connection con = DB.mycon();
            ps = con.prepareStatement("DELETE FROM tbl_driver WHERE driver_id="+idn+"");
            status=ps.executeUpdate();
            con.close();
        } catch (Exception ex) {
           System.err.println("Got an exception!");
           System.err.println(ex.getMessage());
        }
            return status;
    }
       
    /**
     *
     * @param id
     * @return
     */
    @Override//overiding method and get db data to array list and return
    public ArrayList search(int id){
        PreparedStatement ps=null;
        ResultSet rs=null;
        ArrayList <String> fileArray = new ArrayList <String>();
        
        try{
           Connection con=DB.mycon();
           ps=con.prepareStatement("SELECT * FROM tbl_driver WHERE driver_id='"+id+"'");
           rs=ps.executeQuery();
                      
           while(rs.next()){               
            fileArray.add(rs.getString("driver_id"));
            fileArray.add(rs.getString("fname"));
            fileArray.add(rs.getString("lname"));
            fileArray.add(rs.getString("licen_no"));
            fileArray.add(rs.getString("nic"));
            fileArray.add(rs.getString("type"));
            fileArray.add(rs.getString("workingdays"));
            fileArray.add(rs.getString("workinghours"));
           }
         con.close();
        }
        catch(Exception ex){
            System.out.println("error");
        }
       return fileArray;
    }
  
    @Override//overiding method and get data from db
    public ResultSet tablefill(String sql){
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            Connection con=DB.mycon();
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            
        } catch (Exception ex) {
            Logger.getLogger(Attendence.class.getName()).log(Level.SEVERE, null, ex);
        }
               
        return rs;  
      }
}
