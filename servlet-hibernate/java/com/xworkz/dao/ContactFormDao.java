package com.xworkz.dao;

import java.util.List;

import com.xworkz.entity.ContactForm;



public interface ContactFormDao {
	public void save(ContactForm entity);
	public Object findByName(String name); 
	public ContactForm findByEmail(String email); 
	public List<ContactForm> findAll();

}
