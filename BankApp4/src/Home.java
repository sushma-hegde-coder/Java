

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Home
 */
public class Home extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		 int cusID=Integer.parseInt(request.getParameter("cusID"));
		 String cusPwd=request.getParameter("cusPwd");
		
		    DAOModel dm=new DAOModel();
		    
		    dm.setCusID(cusID);
		    dm.setCusPwd(cusPwd);
	        
	        boolean b=dm.verify();
	        int accno=dm.getAccno();
	        
	        HttpSession session=request.getSession(true);
	        session.setAttribute("accno",accno);
	        
	         try
	         {
	        
	            if(b==true)
	           {
	        	response.sendRedirect("/BankApp3/success.jsp");
	           }
	         
	           else
	           {
	        	response.sendRedirect("/BankApp3/failure.jsp");
	           }
			}
			catch(Exception e)
			{
				e.printStackTrace();
			
			}
	        

	}
}
