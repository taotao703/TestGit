package com.example.community.demo;

import com.example.community.demo.controller.UserController;
import com.example.community.demo.entity.User;
import com.example.community.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	UserController userController;
	@Test
	void contextLoads() {
		List<User> users = userController.queryData();
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i));
		}
	}

}
