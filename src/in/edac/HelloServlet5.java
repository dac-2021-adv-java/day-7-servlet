package in.edac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * web.xml
 * @author research
 */
public class HelloServlet5 extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			PrintWriter out = response.getWriter();
			out.println("Servlet 5");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
