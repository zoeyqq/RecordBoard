package com.zoey.service.impl;

import com.zoey.dao.UserDao;
import com.zoey.mapper.UserMapper;
import com.zoey.model.User;
import com.zoey.service.BusinessService;

public class BusinessServiceImpl implements BusinessService{
	private UserMapper userDao = new UserDao();

	@Override
	public void register(User u) throws Exception {
		// TODO Auto-generated method stub
		userDao.addUser(u);
	}

	@Override
	public User login(String username, String password) throws Exception {
		return userDao.find(username, password);
	}


}
