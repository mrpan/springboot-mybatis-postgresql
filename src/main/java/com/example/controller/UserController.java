package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.User;
import com.example.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/test")
	@ResponseBody
    public List<User> selectAll() throws Exception {
		List list =userService.queryUsers();
		User user=(User) list.get(0);
		System.out.println(user.getUserName());
        return list;
    }
}
