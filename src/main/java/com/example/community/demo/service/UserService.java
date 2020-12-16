package com.example.community.demo.service;

import com.example.community.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
	//分页查询所有数据
	public List<User> queryData();
}
