import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAOModel {
	private int custno;
	private int cusID;
	private String cusPwd;
	private int balance;
	private int accno;
	PreparedStatement pstmt;
	Connection con;
	ResultSet res;
	DAOModel()
	{
	   DBConnector db=new DBConnector();
	   con=db.getConnection();
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	
	public void setCustno(int custno) {
		this.custno = custno;
	}
	public void setCusID(int cusID) {
		this.cusID = cusID;
	}
	public void setCusPwd(String cusPwd) {
		this.cusPwd = cusPwd;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getCustno() {
		return custno;
	}
	public int getCusID() {
		return cusID;
	}
	public String getCusPwd() {
		return cusPwd;
	}
	public int getBalance() {
		return balance;
	}
	
	
	boolean verify()
	{
	
		try 
		{
		  String s="SELECT * FROM BANKDB WHERE CUSTOMERID=? AND PASSWORD=?";
		  pstmt=con.prepareStatement(s);
		  pstmt.setInt(1,cusID);
		  pstmt.setString(2,cusPwd);
		
		  res=pstmt.executeQuery();
		  while(res.next()==true)
		  {
			cusID=res.getInt(6);
			cusPwd=res.getString(3);
			accno=res.getInt(1);
		    return true;
		  }
		 
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
	
		}
		return false;
		
	}
		  

	
public boolean changePassword(String npw)
{
	try
	{
		
		String s="UPDATE BANKDB SET PASSWORD=? WHERE PASSWORD=?";
		con.prepareStatement(s);
		pstmt.setString(1,npw);
		pstmt.setString(2,cusPwd);
		int rows=pstmt.executeUpdate();
		if(rows==0)
		{
			return false;
		}
		else
		{
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


