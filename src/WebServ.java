

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebServ
 */
@WebServlet("/WebServ")
public class WebServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WebServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	      // Set response content type
	      response.setContentType("text/html");

	      PrintWriter out = response.getWriter();
	      
	      out.println("<html bgcolor=\"red\">\n" +"<head><title>" + "Contact Form" +
	      "</title> </head>\n" +"<body bgcolor = \"Cornsilk\">\n" +"<h1 align = \"center\">" +
	      "Our Operators will resolve your query and reach to you within 24 hours" + 
	      "</h1>\n"+"<h2 align = \"center\">"+"Contact Details As Follow"+"<br>"+"</h2>"+"<h3 align = \"center\">" +"<b>Name : </b> " + request.getParameter("name") +"<br>"+
	      "<b>Mobile no. : </b> " + request.getParameter("mobile") +"<br>"+
	      "\n" +"  <b>Email :</b> "+ request.getParameter("email")+"</h3>" + "\n" +
	      "</body>" +"</html>"
	      );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
