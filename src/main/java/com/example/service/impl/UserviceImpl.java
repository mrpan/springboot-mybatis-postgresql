package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.domain.User;
import com.example.service.UserService;


@Service
public class UserviceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public List<User> queryUsers() throws Exception {
		return userDao.queryUsers();
	}




}
