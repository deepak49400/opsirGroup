package com.opsir.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opsir.entity.User;

import com.opsir.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public User addUser(User user) {

		User save = userRepository.save(user);

		return save;
	}

	@Override
	public List<User> getAllUsers() {

		List<User> users = userRepository.findAll();

		return users;
	}
	
	

}
