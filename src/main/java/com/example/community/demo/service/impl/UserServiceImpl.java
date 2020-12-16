package com.example.community.demo.service.impl;

import com.example.community.demo.entity.User;
import com.example.community.demo.mapper.UserMapper;
import com.example.community.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	@Override
	public List<User> queryData() {
		List<User> users = userMapper.queryData();
		return users;
	}
}
