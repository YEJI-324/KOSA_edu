package com.example.hello.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client") // 밑에 다른 mapping의 공통 매핑이 됨. /api/client/hello까지 가야 getHello 실행
public class ApiController {
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello Spring boot";
	}
	
	@GetMapping("/data")
	public String getServerDate() {
		return "서버측 날짜는 "+ new Date() + " 입니다.";
	}
}
