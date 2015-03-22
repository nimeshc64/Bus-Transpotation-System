/*
 *route class
 *save,update,delete,table fill
 *
 */

package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nimesh
 */
public class Route {
    private int id;
    private int Rt_no;
    private String startpalce;
    private String stopplace;
    private int bus_id;
    private int sch_id;

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
     * @return the Rt_no
     */
    public int getRt_no() {
        return Rt_no;
    }

    /**
     * @param Rt_no the Rt_no to set
     */
    public void setRt_no(int Rt_no) {
        this.Rt_no = Rt_no;
    }

    /**
     * @return the startpalce
     */
    public String getStartpalce() {
        return startpalce;
    }

    /**
     * @param startpalce the startpalce to set
     */
    public void setStartpalce(String startpalce) {
        this.startpalce = startpalce;
    }

    /**
     * @return the stopplace
     */
    public String getStopplace() {
        return stopplace;
    }

    /**
     * @param stopplace the stopplace to set
     */
    public void setStopplace(String stopplace) {
        this.stopplace = stopplace;
    }

    /**
     * @return the bus_id
     */
    public int getBus_id() {
        return bus_id;
    }

    /**
     * @param bus_id the bus_id to set
     */
    public void setBus_id(int bus_id) {
        this.bus_id = bus_id;
    }

    /**
     * @return the sch_id
     */
    public int getSch_id() {
        return sch_id;
    }

    /**
     * @param sch_id the sch_id to set
     */
    public void setSch_id(int sch_id) {
        this.sch_id = sch_id;
    }
    
    //save data to db
      public int save(){
        PreparedStatement ps=null;
        int status = 0;
        try {                    
            Connection con = DB.mycon();
            ps = con.prepareStatement("INSERT INTO tbl_route(route_id,number,start_place,stop_place,bus_id,sch_id) VALUES(?, ?, ?, ?, ?, ?)");       
            ps.setInt(1,getId());
            ps.setInt(2,getRt_no());
            ps.setString(3,getStartpalce());
            ps.setString(4,getStopplace());
            ps.setInt(5,getBus_id());
            ps.setInt(6,getSch_id());
            status=ps.executeUpdate();        
            con.close();
        } catch (Exception ex) {
           System.err.println("Got an exception!");
           System.err.println(ex.getMessage());
        }            
        return status;
          
    }    
   
    //update data to db
    public int update(int idn){
        PreparedStatement ps=null;
        int status=0;
        try {                    
            Connection con = DB.mycon();
            ps = con.prepareStatement("UPDATE tbl_route SET route_id=?,number=?,start_place=?,stop_place=?,bus_id=?,sch_id=? WHERE route_id="+idn+"");
            ps.setInt(1,getId());
            ps.setInt(2,getRt_no());
            ps.setString(3,getStartpalce());
            ps.setString(4,getStopplace());
            ps.setInt(5,getBus_id());
            ps.setInt(6,getSch_id());
            status=ps.executeUpdate();
            con.close();
        } catch (Exception ex) {
           System.err.println("Got an exception!");
           System.err.println(ex.getMessage());
        }
            return status;
    }
    
    //delete db data
    public int delete(int idn){
        PreparedStatement ps=null;
        int status=0;
        try {                    
            Connection con = DB.mycon();
            ps = con.prepareStatement("DELETE FROM tbl_route WHERE route_id="+idn+"");
            status=ps.executeUpdate();
            con.close();
        } catch (Exception ex) {
           System.err.println("Got an exception!");
           System.err.println(ex.getMessage());
        }
            return status;
    }
    
    //get db data to array list and return
    public ArrayList search(int id){
        PreparedStatement ps=null;
        ResultSet rs=null;
        ArrayList <String> fileArray = new ArrayList <String>();
        
        try{
           Connection con=DB.mycon();
           ps=con.prepareStatement("SELECT * FROM tbl_route WHERE route_id='"+id+"'");
           rs=ps.executeQuery();
                      
           while(rs.next()){  
            fileArray.add(rs.getString("route_id"));
            fileArray.add(rs.getString("number"));
            fileArray.add(rs.getString("start_place"));
            fileArray.add(rs.getString("stop_place"));
            fileArray.add(rs.getString("bus_id"));
            fileArray.add(rs.getString("sch_id"));
           }
         con.close();
        }
        catch(Exception ex){
            System.out.println("error");
        }
       return fileArray;
    }
    
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
