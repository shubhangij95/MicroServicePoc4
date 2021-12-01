package com.neosoft.main.ServiceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neosoft.main.Model.Contact;
import com.neosoft.main.Repository.ContactRepository;
import com.neosoft.main.Service.ContactServiceI;

@Service
public class ContactServiceImpl implements ContactServiceI
{
	@Autowired
	ContactRepository cRepo;
	
	@Override
	public void saveContact(Contact contact) 
	{
		cRepo.save(contact);	
	}

	@Override
	public List<Contact> getAllContact() 
	{
		List<Contact> list=cRepo.findAll();
		return list;
	}

	@Override
	public List<Contact> getContact(Long userId) 
	{
		List<Contact> list=cRepo.findByUserId(userId);
		return list;
	}
	
	

}
