package com.xhhy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xhhy.domain.UserBean;
import com.xhhy.service.UserService;


@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("list.do")
	public String listUser(Model model){
		List<UserBean> users = userService.queryAll();
		System.out.println(users);
		model.addAttribute("users", users);
		System.out.println("list 。。。。。。。。");
		return "/index.jsp";
	}

	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
