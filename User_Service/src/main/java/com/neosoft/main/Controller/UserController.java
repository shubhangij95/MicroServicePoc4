package com.neosoft.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.neosoft.main.FeignClientService.UserFeignClientService;
import com.neosoft.main.Model.User;
import com.neosoft.main.Service.UserServiceI;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserServiceI uSi;
	
//	@Autowired
//	private RestTemplate restTemplate;
	
	@Autowired
	private UserFeignClientService userFeignClientService;
	
	@PostMapping("/saveUser")
	public String saveUser(@RequestBody User user)
	{
		uSi.saveUser(user);
		return "User Saved";
	}

	
	@GetMapping("/getUser/{userId}")
	public User getUser(@PathVariable Long userId)
	{
		User user=uSi.getUser(userId);
		
		//http://localhost:8081/contact/User/103
//		List contaList=this.restTemplate.getForObject("http://CONTACT-SERVICE/contact/User/"+ user.getUserId(), List.class);
		
		List contaList=userFeignClientService.getContact(userId);
		user.setContacts(contaList);
		
		return user;
	}
	
	@GetMapping("/getAllUser")
	public List<User> getAll()
	{
		List<User> user=uSi.getAllUser();
		return user;
	}
	
	
}
