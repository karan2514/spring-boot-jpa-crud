package com.example.service;

import java.util.List;

import com.example.model.User;

public interface UserService {
	
	List<User> userList();
	
	User findOne(Long id);
	
	User addUser(User user);
	
	String deleteUser(Long id);

}
