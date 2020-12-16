package com.example.community.demo.controller;

import com.example.community.demo.entity.User;
import com.example.community.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping("/query")
	public List<User> queryData(){
		return userService.queryData();
	}
}
