package com.cn.tgc.dao;

import java.util.List;

import com.cn.tgc.pojo.User;

public interface UserDao {
	
	public User getUserById(int id);
	
	public void updateUserById(int id);
	
	public List<User> getAllUser();
	
	public void deleteUserById(int id);
	
	public void addUser(User user);

}
