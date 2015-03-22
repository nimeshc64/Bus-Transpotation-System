/*
 * Attendence class
 *save,update,delete,table fill
 *
 */

package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nimesh
 */
public class Attendence {
    private int id;
    private int routeid;
    private String driverid;
    private String conducid;
    private String date;
    private String time;
    /**
     * @return the id
     */
    public int getId() {//using getters setters
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the routeid
     */
    public int getRouteid() {
        return routeid;
    }

    /**
     * @param routeid the routeid to set
     */
    public void setRouteid(int routeid) {
        this.routeid = routeid;
    }

    /**
     * @return the driverid
     */
    public String getDriverid() {
        return driverid;
    }

    /**
     * @param driverid the driverid to set
     */
    public void setDriverid(String driverid) {
        this.driverid = driverid;
    }

    /**
     * @return the conducid
     */
    public String getConducid() {
        return conducid;
    }

    /**
     * @param conducid the conducid to set
     */
    public void setConducid(String conducid) {
        this.conducid = conducid;
    }
    
     /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }
    //insert data to db
     public int save(){
        PreparedStatement ps=null;
        int status = 0;
        try {                    
            Connection con = DB.mycon();
            ps = con.prepareStatement("INSERT INTO tbl_attendence(atd_id,route_id,Driver_Fname,conductor_Fname,date,time) VALUES(?, ?, ?, ?, ?, ?)");       
            ps.setInt(1,id);
            ps.setInt(2,routeid);
            ps.setString(3,driverid);
            ps.setString(4,conducid);
            ps.setString(5,date);
            ps.setString(6,time);
            status=ps.executeUpdate();        
            con.close();
        } catch (Exception ex) {
           System.err.println("Got an exception!");
           System.err.println(ex.getMessage());
        }            
        return status;
     }
    //update db data
     public int update(int idn){
        PreparedStatement ps=null;
        int status=0;
        try {                    
            Connection con = DB.mycon();
            ps = con.prepareStatement("UPDATE tbl_schedual SET atd_id=?,route_id=?,driver_id=?,cond_id=?,date=?,time=? WHERE atd_id="+idn+"");
            ps.setInt(1,id);
            ps.setInt(2,routeid);
            ps.setString(3,driverid);
            ps.setString(3,conducid);
            ps.setString(3,date);
            ps.setString(3,time);
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
     * @return
     */
      
    //get data from db 
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
