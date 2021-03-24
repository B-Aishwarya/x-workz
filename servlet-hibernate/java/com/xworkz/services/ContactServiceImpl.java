package com.xworkz.services;

import java.util.List;

import javax.persistence.NoResultException;

import com.xworkz.dao.ContactDaoImpl;
import com.xworkz.dao.ContactFormDao;
import com.xworkz.entity.ContactForm;

public class ContactServiceImpl implements ContactService {
	
	ContactFormDao dao=new ContactDaoImpl();
	
	public ContactServiceImpl() {
		System.out.println("created Contact  Service Impl");
	}

	@Override
	public boolean validateAndSave(ContactForm entity) {
		System.out.println("invoked validate and save");
		System.out.println("enity :" + entity);
		boolean valid = true;
		if (entity != null) {
			if (valid) {
				String name = entity.getName();
				if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 20) {
					System.out.println("Name is valid ");
					valid = true;
				} else {
					System.out.println("name is not valid");
					valid = false;
				}
			}
			if (valid) {
				String email = entity.getEmail();
				if (email != null && !email.isEmpty() && email.contains("@") && email.endsWith(".com")) {

					System.out.println("email is valid ");
					valid = true;
				} else {
					System.out.println("email is not valid ");
					valid = false;
				}
			}
			
		

			if (valid) {
				String self = entity.getYourself();
				if (self != null && !self.isEmpty()) {

					System.out.println("self is valid ");
					valid = true;
				} else {
					System.out.println("self is not valid");
					valid = false;
				}
			}

		}
		if (valid) {
			ContactFormDao dao = new ContactDaoImpl();

			dao.save(entity);
			System.out.println("Contact is saved");
		} else {
			System.out.println("contact is not saved");
		}

		return valid;

	}

	@Override
	public Object validateAndFindByName(String name) {
		System.out.println("invoked validateAndFindByName");
		if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<25) {
			System.out.println("name is valid ");
			 Object names=this.dao.findByName(name);
			 System.out.println("Detailes "+names);
			
		}else {
			System.out.println("name is invalid");
		}
		return name;
		
	}

	@Override
	public ContactForm validatefindByEmail(String email) {
		System.out.println("invoked validateAndFindByName");
		try {
		if(email!=null && !email.isEmpty() && email.contains("@") && email.endsWith(".com")) {
			System.out.println("email is valid ");
			ContactForm entity=(ContactForm) this.dao.findByEmail(email);
			 System.out.println("Detailes "+entity);
			 return entity;
				
				
		}else {
			System.out.println("email is invalid");
			return null;
		}
		}catch (NoResultException e) {
			return null;
			
		
		}
		
}
	@Override
	public List<ContactForm> getAll() {
		System.out.println("invoked get all from service");
		return this.dao.findAll();
	}
}