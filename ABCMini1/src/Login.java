

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try {
		String un=request.getParameter("un");
		String pw=request.getParameter("pw");
		DAOModel2 dm=new DAOModel2();
		dm.setUn(un);
		dm.setPw(pw);
		boolean b=dm.validate();
		if(b==true)
		{
			response.sendRedirect("/ABCMini1/successLogin.jsp");
		}
		else
		{
			response.sendRedirect("/ABCMini1/failureLogin.jsp");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
