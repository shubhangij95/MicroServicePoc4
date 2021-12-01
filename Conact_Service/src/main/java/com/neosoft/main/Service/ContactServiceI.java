package com.neosoft.main.Service;

import java.util.List;

import com.neosoft.main.Model.Contact;

public interface ContactServiceI {
	

	public void saveContact(Contact contact);
	
	public List<Contact> getAllContact();
	
	public List<Contact> getContact(Long userId);


}
