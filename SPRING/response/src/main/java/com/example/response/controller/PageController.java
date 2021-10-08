package com.example.response.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.response.dto.User;

@Controller
public class PageController {

	@RequestMapping("/main")
	public String main() {
		return "main.html";
	}
	
	@ResponseBody
	@GetMapping("/user")
	public User user() {
		User user = new User();
		// var user = new User(); // java 11버전부터 타입추론이 가능해서 var 써도 됨.
		user.setName("kiyoung");
		user.setAddress("ilsan");
		
		return user;
	}
}
