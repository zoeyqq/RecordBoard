package com.zoey.mapper;

import com.zoey.model.User;

public interface UserMapper {
	public void addUser(User u) throws Exception;
	public User find(String username,String password) throws Exception;
}
