package Sender;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ActivityCodeChecker")
public class ActivityCodeChecker extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Activation_code = request.getParameter("acode");
		
		checker cc = new checker();
		cc.getActivationCode(Activation_code);
		
		int result = cc.getResult();
		
		if(result==1) {
			response.sendRedirect("confim.jsp");
		}
		else {
			response.sendRedirect("error.jsp");
		}
		
		//PrintWriter out = response.getWriter();
		//out.println();
		
		
		
			
	}

}
