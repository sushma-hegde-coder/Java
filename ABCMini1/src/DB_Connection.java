

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {
           Connection con;
           Connection getConnection()
           {
        	   try
        	   {
        		   Class.forName("oracle.jdbc.driver.OracleDriver");
        		   con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","system");
        		   return con;
        	   }
        	   catch(Exception e)
        	   {
        		   e.printStackTrace();
        		   return null;
        	   }



	}

}
