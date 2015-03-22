/*
 *bus class
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
public class Bus {
    private int id;
    private String model;
    private int regno;
    private int capacity;
    private String feature;

    /**
     *
     * @param id
     * @param model
     * @param regno
     * @param capacity
     * @param feature
     */
    public Bus(int id,String model,int regno,int capacity,String feature)//use constructor for get text box data
{
    this.id=id;
    this.model=model;
    this.regno=regno;
    this.feature=feature;
    this.capacity=capacity;
}
    /**
     * @return the id
     */
    public int getId() { //using getters setters
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the regno
     */
    public int getRegno() {
        return regno;
    }

    /**
     * @param regno the regno to set
     */
    public void setRegno(int regno) {
        this.regno = regno;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the feature
     */
    public String getFeature() {
        return feature;
    }

    /**
     * @param feature the feature to set
     */
    public void setFeature(String feature) {
        this.feature = feature;
    }
    //save data to db
     public int save(){
        PreparedStatement ps=null;
        int status = 0;
        try {                    
            Connection con = DB.mycon();
            ps = con.prepareStatement("INSERT INTO tbl_bus(bus_id,model,reg_no,capasity,features) VALUES(?, ?, ?, ?, ?)");       
            ps.setInt(1,getId());
            ps.setString(2,getModel());
            ps.setInt(3,getRegno());
            ps.setInt(4,getCapacity());
            ps.setString(5,getFeature());
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
            ps = con.prepareStatement("UPDATE tbl_bus SET bus_id=?,model=?,reg_no=?,capasity=?,features=? WHERE bus_id="+idn+"");
            ps.setInt(1,getId());
            ps.setString(2,getModel());
            ps.setInt(3,getRegno());
            ps.setInt(4,getCapacity());
            ps.setString(5,getFeature());
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
            ps = con.prepareStatement("DELETE FROM tbl_bus WHERE bus_id="+idn+"");
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
           ps=con.prepareStatement("SELECT * FROM tbl_bus WHERE bus_id='"+id+"'");
           rs=ps.executeQuery();
                      
           while(rs.next()){ 
            fileArray.add(rs.getString("bus_id"));
            fileArray.add(rs.getString("model"));
            fileArray.add(rs.getString("reg_no"));
            fileArray.add(rs.getString("capasity"));
            fileArray.add(rs.getString("features"));          
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
