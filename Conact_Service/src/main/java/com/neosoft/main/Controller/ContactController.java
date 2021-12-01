package com.neosoft.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.main.Model.Contact;
import com.neosoft.main.Service.ContactServiceI;

@RestController
@RequestMapping("/contact")
public class ContactController 
{
	@Autowired
	ContactServiceI cSi;
	
	
	
	@PostMapping("/saveContact")
	public String saveContact(@RequestBody Contact contact)
	{
		cSi.saveContact(contact);
		return "Contact Saved";
	}
	
	@GetMapping("/getAllContact")
	public List<Contact>getAllContact()
	{
		List<Contact> list=cSi.getAllContact();
		
		return list;
	}
	
	@GetMapping("/User/{userId}")
	public List<Contact>getContact(@PathVariable Long userId)
	{
		List<Contact> list=cSi.getContact(userId);
		
		return list;
	}

}
