package com.neosoft.main.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.main.Model.User;
import com.neosoft.main.Repository.UserRepository;
import com.neosoft.main.Service.UserServiceI;

@Service
public class UserServiceImpl implements UserServiceI
{
	
	@Autowired
	UserRepository uRepo;

	@Override
	public User getUser(Long userId) {

		User u=uRepo.findById(userId).get();
		return u;
	}

	@Override
	public void saveUser(User user) {

		uRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		List<User> user=uRepo.findAll();
		return user;
	}
	
	

}
