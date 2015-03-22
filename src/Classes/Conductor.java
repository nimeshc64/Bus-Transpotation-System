/*
 *conductor class
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
public class Conductor {
    private int id;
    private String fname;
    private String lname;
    private int licno;
    private String nic;

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
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the licno
     */
    public int getLicno() {
        return licno;
    }

    /**
     * @param licno the licno to set
     */
    public void setLicno(int licno) {
        this.licno = licno;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }
    //save data to db
     public int save(){
        PreparedStatement ps=null;
        int status = 0;
        try {                    
            Connection con = DB.mycon();
            ps = con.prepareStatement("INSERT INTO tbl_conductor(cond_id,fname,lname,licen_no,nic) VALUES(?, ?, ?, ?, ?)");       
            ps.setInt(1,getId());
            ps.setString(2,getFname());
            ps.setString(3,getLname());
            ps.setInt(4,getLicno());
            ps.setString(5,getNic());
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
            ps = con.prepareStatement("UPDATE tbl_conductor SET cond_id=?,fname=?,lname=?,licen_no=?,nic=? WHERE cond_id="+idn+"");
            ps.setInt(1,getId());
            ps.setString(2,getFname());
            ps.setString(3,getLname());
            ps.setInt(4,getLicno());
            ps.setString(5,getNic());
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
            ps = con.prepareStatement("DELETE FROM tbl_conductor WHERE cond_id="+idn+"");
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
           ps=con.prepareStatement("SELECT * FROM tbl_conductor WHERE cond_id='"+id+"'");
           rs=ps.executeQuery();
                      
           while(rs.next()){  
            fileArray.add(rs.getString("cond_id"));   
            fileArray.add(rs.getString("fname"));
            fileArray.add(rs.getString("lname"));
            fileArray.add(rs.getString("licen_no"));
            fileArray.add(rs.getString("nic"));
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
