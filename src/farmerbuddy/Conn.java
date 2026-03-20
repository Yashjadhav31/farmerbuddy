
package farmerbuddy;
import java.sql.*;


public class Conn {
    
    Connection c;
    Statement s;
    Conn() {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///farmerbuddy","root", "Yash@1031");
            s = c.createStatement();
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }   
}
