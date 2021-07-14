

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) {
		try {
		String name = request.getParameter("name");
		String un = request.getParameter("un");
		String pw = request.getParameter("pw");
		DAO_Model1 dm = new DAO_Model1();
		dm.setName(name);
		dm.setUn(un);
		dm.setPw(pw);
		boolean b = dm.register();
		if (b == true) {
		
				response.sendRedirect("/ABCMini1/successRegister.jsp");
			} 
	    else {
			response.sendRedirect("/ABCMini1/failureRegister.jsp");
		}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
