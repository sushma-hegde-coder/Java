

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PasswordChange
 */
public class PasswordChange extends HttpServlet 
{ 
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
		   String opw=request.getParameter("opw");
		   String npw=request.getParameter("npw");
		    
		   DAOModel dm=new DAOModel();
		   
		   dm.setCusPwd(opw);
		  boolean b= dm.changePassword(npw);
		   if(b==true)
		   {
			   response.sendRedirect("/BankApp3/passwordChangeSuccess.jsp");
			   
		   }
		   else
		   {
			   response.sendRedirect("/BankApp3/passswordChangeFailure.jsp");
		   }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	
}
