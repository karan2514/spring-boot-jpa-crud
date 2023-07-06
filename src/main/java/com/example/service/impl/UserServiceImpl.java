package com.example.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	@Override
	public List<User> userList() {
		
		return userRepository.findAll();
	}



	@Override
	public User findOne(Long id) {
		
		return userRepository.findById(id).get();
		
	}



	@Override
	public User addUser(User user) {
		
		return userRepository.save(user);
	}



	@Override
	public String deleteUser(Long id) {
		userRepository.deleteById(id);
		return "{'message':'User deleted successfully.'}";
	}

}
