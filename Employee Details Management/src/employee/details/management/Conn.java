package employee.details.management;

import java.sql.*;
import java.sql.SQLException;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "Kvlv!@204");
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
