package com.neosoft.main.FeignClientService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.neosoft.main.Model.Contact;

@FeignClient(name="contact-service",url="http://localhost:8081/contact")
public interface UserFeignClientService 
{
	@GetMapping("/User/{userId}")
	public List<Contact> getContact(@PathVariable Long userId);
	
}
