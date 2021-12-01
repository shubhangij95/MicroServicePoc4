package com.neosoft.main.Service;

import java.util.List;

import com.neosoft.main.Model.User;

public interface UserServiceI {
	
	
	public void saveUser(User user);
	
	public List<User> getAllUser();
	
	public User getUser(Long userId);

}
