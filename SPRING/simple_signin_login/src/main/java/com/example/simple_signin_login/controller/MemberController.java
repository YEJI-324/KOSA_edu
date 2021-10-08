package com.example.simple_signin_login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.simple_signin_login.model.UserDto;

@Controller
public class MemberController {

	@RequestMapping("/") 
	public String index() {
		return "index.html";
	}
	
	@GetMapping("/members/signup")
	public String signupForm() {
		return "/members/signup.html";
	}
	
	@GetMapping("/members/login")
	public String loginForm() {
		return "/members/login.html";
	}
	
	@PostMapping("/members/create")
	@ResponseBody
	public String createMember(UserDto user) {
		System.out.println(user.toString());
		return user.toString();
	}
	
}
