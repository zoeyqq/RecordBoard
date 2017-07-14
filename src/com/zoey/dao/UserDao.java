package com.zoey.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.zoey.mapper.UserMapper;
import com.zoey.model.User;
import com.zoey.utils.DBAccess;

public class UserDao implements UserMapper{

	@Override
	public void addUser(User u) throws Exception {
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		
		sqlSession = dbAccess.getSqlSession();		
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			userMapper.addUser(u);
			sqlSession.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
		}
		sqlSession.close();
		
	}

	@Override
	public User find(String username, String password) throws Exception {

		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		User u = null;		
		sqlSession = dbAccess.getSqlSession();		
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			u = userMapper.find(username, password);
			sqlSession.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
		}	
		sqlSession.close();
		return u;
	}

}
