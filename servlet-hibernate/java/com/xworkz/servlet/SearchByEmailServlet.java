package com.xworkz.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.xworkz.entity.ContactForm;
import com.xworkz.services.ContactService;
import com.xworkz.services.ContactServiceImpl;

public class SearchByEmailServlet extends HttpServlet{
	private ContactService service;
	
	public SearchByEmailServlet() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.service=new ContactServiceImpl();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked dopost");
		String email=req.getParameter("email");
		System.out.println("email fromreq "+email);
		ContactForm entityFromService=this.service.validatefindByEmail(email);
		System.out.println("entity from service"+entityFromService);
		resp.setContentType("text/html");
	PrintWriter writer=resp.getWriter();
	writer.println("<html>");
	writer.println("<body>");
	writer.println("<h1> Search By Email</h1>");
	writer.println("<form action=\"searchByEmail\" method=\"post\">\r\n" + 
			"Search By Name <input type=\"email\" name=\"email\">\r\n" + 
			"<input type=\"submit\" value=\"search\">\r\n" + 
			"</form>");
	
	if(entityFromService !=null) {
		writer.println("<p> Search results found </br>"+entityFromService.getName()+"Email is :"+entityFromService.getEmail());
	}else {
		writer.println("<p style='color:red;'>No results found </p>");
	}
	writer.println("</body>");
	writer.println("</html>");
		
	}

}
