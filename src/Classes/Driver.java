/*
 *driver class
 *save,update,delete,table fill
 *driver super class
 */

package Classes;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Nimesh
 */
public abstract class Driver {//create abstract class
    private int id;
    private String fname;
    private String lname;
    private int licno;
    private String nic;
    private int workingdays;
    private String type;
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
    
      /**
     * @return the workingdays
     */
    public int getWorkingdays() {
        return workingdays;
    }
    
     /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param workingdays the workingdays to set
     */
    public void setWorkingdays(int workingdays) {
        this.workingdays = workingdays;
    }
    
   
    
    //abstract method to data save,update,delete,search,table fill
    abstract public int save();
    abstract public int update(int idn);
    abstract public int delete(int idn);
    abstract public ArrayList search(int id);
    abstract ResultSet tablefill(String sql);
   
    
    
    
}
