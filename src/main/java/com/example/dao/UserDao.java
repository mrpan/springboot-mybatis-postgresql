package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.User;


public interface UserDao {

	public List<User> queryUsers() throws Exception;
	
}
