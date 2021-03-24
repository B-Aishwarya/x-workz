package com.xworkz.servlet;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.services.ContactService;
import com.xworkz.services.ContactServiceImpl;

public class SearchByNameServlet extends HttpServlet{
	
	private ContactService service;
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.service=new ContactServiceImpl();
		
	}
	
	
	public SearchByNameServlet() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		System.out.println(name);
		Object validate=this.service.validateAndFindByName(name);
		System.out.println("Validate: "+validate);
		
	}

}
