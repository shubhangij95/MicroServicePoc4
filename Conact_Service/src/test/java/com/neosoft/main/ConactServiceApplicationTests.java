package com.neosoft.main;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.neosoft.main.Model.Contact;
import com.neosoft.main.Repository.ContactRepository;

@SpringBootTest
class ConactServiceApplicationTests {

	@Autowired
	private  ContactRepository crepo;
	
	@Test
	@Order(1)
	public void saveContactTest()
	
	{
		Contact contact= new Contact();
	
		contact.setcId(1L);;
		contact.setContactName("Idea");
		contact.setEmail("shubhangi@gmail.com");

		contact.setUserId(2L);
		
		crepo.save(contact);
		assertNotNull(crepo.findByUserId(1L));
		
		}
	
	
	@Test
	@Order(2)
	public void GetAllContactTest () {
		List list = (List) crepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	
	
	@Test
	@Order(3)
	public void getSingleContactTest () {
		Contact c = crepo.findById(1L).get();
		assertEquals(2L, c.getUserId());
	}

}
