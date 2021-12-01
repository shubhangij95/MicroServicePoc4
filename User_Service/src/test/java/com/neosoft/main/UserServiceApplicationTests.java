package com.neosoft.main;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.neosoft.main.Model.Contact;
import com.neosoft.main.Model.User;
import com.neosoft.main.Repository.UserRepository;

@SpringBootTest
class UserServiceApplicationTests {

	@Autowired
	private  UserRepository urepo;
	
	@Test
	@Order(1)
	public void saveUserTest()
	
	{
		User u= new User();
	
		u.setUserId(2L);
		u.setName("Shubhangi Jadhav");
		u.setPhone("54345");

		u.setContacts(new ArrayList<Contact>());
		
		urepo.save(u);
		assertNotNull(urepo.findById(2L));
		
		}
	
	
	@Test
	@Order(2)
	public void GetAllUserTest () {
		List list = (List) urepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	
	
	@Test
	@Order(3)
	public void getSingleUserTest () {
		User u = urepo.findById(2L).get();
		assertEquals("Shubhangi Jadhav", u.getName());
	}
}
