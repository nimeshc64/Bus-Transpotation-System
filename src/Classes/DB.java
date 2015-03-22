/*
 *database connection class
 *get last id
 *
 */

package Classes;

/**
 *
 * @author Nimesh
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
    
    public static Connection mycon() throws Exception {       
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bus", "root", "");       
            return c;
    }
    
    public int Getlastid(String clm,String tbl){//get all table id column last id 
       String sql;
       int maxid = 0;
       ResultSet rs=null;
       PreparedStatement ps=null;
       
        try{
           Connection con=DB.mycon();                   
           ps=con.prepareStatement("select max("+clm+") from "+tbl+"");
           rs=ps.executeQuery(); 
           
           while(rs.next()){
               maxid=rs.getInt(1);
           }          
            con.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
        return maxid+1; //get last id and add 1 to id(10+1=11)
    }
    
}
