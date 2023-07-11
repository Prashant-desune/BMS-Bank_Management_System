package bms.bank.management.system;


//Import the sql libarary 
import java.sql.*;


public class Conn {
    
    Connection c;
    Statement s;
//    Create a class Constructor 
    public Conn(){
//       <<<<<<<< Using the try and catch method >>>>>>>>
        try{
//            Class.forName(com.mysql.cj.jdbc.Driver);
            
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Pr@shantk1998");
            
            s = c.createStatement();
            
        }catch(Exception e){
            
            System.out.println(e);
            
        }
    }
    
}
