package com.cn.tgc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.tgc.dao.UserDao;
import com.cn.tgc.pojo.User;

@Service("userService")
public class UserService {
	@Resource
	private UserDao userDao;
	
	public User getUserById(int id){
		return userDao.getUserById(id);
	}
	
	public List<User> getAllUser(){
		return userDao.getAllUser();
	}
	
	public void addUser(User user){
		 userDao.addUser(user);
	}

}
