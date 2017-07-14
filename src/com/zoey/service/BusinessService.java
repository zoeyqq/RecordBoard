package com.zoey.service;

import com.zoey.model.User;

public interface BusinessService {
	void register(User u) throws Exception;
	User login(String username,String password) throws Exception;

}
