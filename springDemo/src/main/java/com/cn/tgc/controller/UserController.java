package com.cn.tgc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.tgc.pojo.User;
import com.cn.tgc.service.impl.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	Logger log = LoggerFactory.getLogger(UserController.class);
	@Resource(name="userService")
	private UserService userService;
	
	@RequestMapping("/query/{userId}")
	public String getUserById(@PathVariable("userId") Integer userId, ModelMap map){
		User user = userService.getUserById(userId);
		map.put("user", user);
		return "user";
	}
	
	@RequestMapping("/query/all")
	public String getAllUser(ModelMap map){
		List<User> userList = userService.getAllUser();
		map.put("userList", userList);
		return "allUser";
	}
	
	@RequestMapping(value="/addResult")
	public String addUserResult(@ModelAttribute("user") User user){
		String userName = user.getUserName();
		String passWord = user.getPassWord();
		Integer age = user.getAge();
		log.info("username:{},password:{},age:{}",userName,passWord,age);
		userService.addUser(user);
		return "addUserResult";
	}
	
	@RequestMapping(value="/add")
	public String addUser(){
		return "addUser";
	}
	
	@RequestMapping("/query/showUser")
	public @ResponseBody List<User> showUser(){
		List<User> userList = userService.getAllUser();
		log.info("userList:{}",userList);
		return userList;
	}
}
