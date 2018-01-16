package library.management.system;

/**
 *
 * @author Yavuz
 */
import java.sql.* ;
import javax.swing.JOptionPane;

public class JavaConnect {

    Connection conn ;
    
    public static Connection connectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Yavuz\\Documents\\NetBeansProjects\\Library Management System\\LibraryNew.sqlite");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return  null ;
        }
    }
 
    
    
    
    

    
    
    
}
