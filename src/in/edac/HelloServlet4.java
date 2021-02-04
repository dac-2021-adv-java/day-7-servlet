package in.edac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet-4")
public class HelloServlet4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			PrintWriter out = response.getWriter();

			out.println("Servlet 4");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
