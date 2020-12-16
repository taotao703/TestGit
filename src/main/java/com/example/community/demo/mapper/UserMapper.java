package com.example.community.demo.mapper;

import com.example.community.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserMapper {
	//分页查询所有数据
	public List<User> queryData();
}
