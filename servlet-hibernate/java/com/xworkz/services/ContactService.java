package com.xworkz.services;

import java.util.List;

import com.xworkz.entity.ContactForm;

public interface ContactService {
	public boolean validateAndSave(ContactForm entity);
	public Object  validateAndFindByName(String name);
	public ContactForm validatefindByEmail(String email);
	public List<ContactForm> getAll();

}
