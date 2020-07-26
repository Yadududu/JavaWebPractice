package com.lmj.service;

import com.lmj.model.User;

public interface UserService {
	
	public User FindUserByUsernameAndPassword(String username,String password);
	
	public boolean FindUserByUsername(String username);
	
	public String FindUsernameById(String id);
	
	public boolean InsertUser(User user);
	
	public boolean UpdateUserPassword(User user);
}
