package in.edac;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet-7")
public class HelloServlet7 extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("Object Initialized!!!");
	}
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			System.out.println("I am new versino of service method!!!");
			PrintWriter out = response.getWriter();
			
			out.println("Hello World 7");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	@Override
	public void destroy()  {
		System.out.println("Object Destroyed!!!");
	}

}
