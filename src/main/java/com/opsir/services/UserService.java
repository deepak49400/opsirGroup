package com.opsir.services;


import java.util.List;

import com.opsir.entity.User;

public interface UserService {
	
	public User addUser(User user);

	public List<User> getAllUsers();

}
