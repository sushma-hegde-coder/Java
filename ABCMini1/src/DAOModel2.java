import java.sql.*;

public class DAOModel2 
{
	private String name;
	private String un;
	private String pw;
	Connection con;
	PreparedStatement pstmt;
	ResultSet res;
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
	
     boolean validate() 
	{
		
		DB_Connection db=new DB_Connection();
		con=db.getConnection();
		try
		{
		 pstmt=con.prepareStatement("SELECT * FROM ABC WHERE UNAME=?");
		pstmt.setString(1,un);
		res=pstmt.executeQuery();
		while(res.next()==true)
		 {
			name=res.getString(1);
			un=res.getString(2);
			pw=res.getString(3);
			return true;
		  }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		
		}
		return false;
		
		
	}
	

}
