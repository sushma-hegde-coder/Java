

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DAO_Model1 {

	
		Connection con;
		PreparedStatement pstmt;
		private String name;
		private String un;
		private String pw;
        
		public Connection getCon() {
			return con;
		}
		public void setCon(Connection con) {
			this.con = con;
		}
		public PreparedStatement getPstmt() {
			return pstmt;
		}
		public void setPstmt(PreparedStatement pstmt) {
			this.pstmt = pstmt;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUn() {
			return un;
		}
		public void setUn(String un) {
			this.un = un;
		}
		public String getPw() {
			return pw;
		}
		public void setPw(String pw) {
			this.pw = pw;
		}
		
	  boolean register()
	  {
		  try
		  {
		  DB_Connection db=new DB_Connection();
		  con=db.getConnection();
		  pstmt=con.prepareStatement("INSERT INTO ABC VALUES(?,?,?)");
		  pstmt.setString(1, name);
		  pstmt.setString(2, un);
		  pstmt.setString(3, pw);
		  pstmt.executeUpdate();
		  System.out.println(name);
		  return true;
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
			  return false;
		  }
		  }
	  }
        
	



