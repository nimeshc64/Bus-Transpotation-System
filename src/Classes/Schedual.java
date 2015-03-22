/*
 *schedual class
 *save,update,delete,table fill
 *
 */

package Classes;

/**
 *
 * @author Nimesh
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Schedual {
    private  int id;
    private  String startTime;
    private String endTime;

 /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
   
    //save data to db
    public int save(){
        PreparedStatement ps=null;
        int status = 0;
        try {                    
            Connection con = DB.mycon();
            ps = con.prepareStatement("INSERT INTO tbl_schedual(sch_id,Start_time,Stop_time) VALUES(?, ?, ?)");       
            ps.setInt(1, getId());
            ps.setString(2, getStartTime());
            ps.setString(3, getEndTime());
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
    //update db data
    public int update(int idn){
        PreparedStatement ps=null;
        int status=0;
        try {                    
            Connection con = DB.mycon();
            ps = con.prepareStatement("UPDATE tbl_schedual SET sch_id=?,Start_time=?,Stop_time=? WHERE sch_id="+idn+"");
            ps.setInt(1, getId());
            ps.setString(2, getStartTime());
            ps.setString(3, getEndTime());
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
            ps = con.prepareStatement("DELETE FROM tbl_schedual WHERE sch_id="+idn+"");
            status=ps.executeUpdate();
            con.close();
        } catch (Exception ex) {
           System.err.println("Got an exception!");
           System.err.println(ex.getMessage());
        }
            return status;
    }
        //public ArrayList<String> groupNames = new ArrayList<String>();

    /**
     *
     * @param id
     * @return
     */
    
    //get db data to array list and return
    public ArrayList search(int id){
        PreparedStatement ps=null;
        ResultSet rs=null;
        ArrayList <String> fileArray = new ArrayList <String>();
        
        try{
           Connection con=DB.mycon();
           ps=con.prepareStatement("SELECT * FROM tbl_schedual WHERE sch_id='"+id+"'");
           rs=ps.executeQuery();
                      
           while(rs.next()){               
            fileArray.add(rs.getString("Start_time"));
            fileArray.add(rs.getString("stop_time"));
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
