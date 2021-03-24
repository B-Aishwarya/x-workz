package com.xworkz.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.entity.ContactForm;
import com.xworkz.services.ContactService;
import com.xworkz.services.ContactServiceImpl;

public class DisplayAllServlet extends HttpServlet {
	ContactService service;
	
	public DisplayAllServlet() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.service=new ContactServiceImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("</invoked do get from displayAll servlet");
		List<ContactForm> listFromService=this.service.getAll();
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		
		
		if(listFromService !=null && !listFromService.isEmpty()) {
			System.out.println("list is found with size"+listFromService.size());
			writer.println("<h1>Result found, Total:" +listFromService.size()+"</h1>");
			writer.println("<table border='1'>");
			
			Iterator<ContactForm> iterartor=listFromService.iterator();
			while (iterartor.hasNext()) {
				ContactForm itr=iterartor.next();
				writer.println("<tr>");
				writer.println("<td>"+itr.getName()+"</td>");
				writer.println("<td>"+itr.getEmail()+"</td>");
				writer.println("<td>"+itr.getPhone_number()+"</td>");
				writer.println("<td>"+itr.getYourself()+"</td>");
				
				writer.println("</tr>");
				
			}
			writer.println("</table>");
		}else {
			System.out.println("list is empty");
			writer.println("<h1>Results not found</h1>");
		}
		writer.println("</body>");
		writer.println("</html>");
	}

}
