
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
	
     Connection getConnection()
    {
    	Connection con=null;
     	   try
 	   {
 		   Class.forName("oracle.jdbc.driver.OracleDriver");
 		   con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","system");
 		   
 	   }
 	   catch(Exception e)
 	   {
 		   e.printStackTrace();
 		  
 	   }

      return con;

}
}


