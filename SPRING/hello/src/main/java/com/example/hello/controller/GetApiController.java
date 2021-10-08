package com.example.hello.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.dto.UserRequest;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
	
	@GetMapping("/hello")
	public String getHello() {
		return "get Hello";
	}
	
//	@GetMapping("/hi")
	@RequestMapping(path="/hi", method = RequestMethod.GET)
	public String hi() {
		return "hi";
	}
	
//	@GetMapping("/path-variable/{name}")
//	public String pathVariable(@PathVariable String name) {
//		System.out.println("path variable : " + name);
//		return name;
//	}
	
	@GetMapping("/path-variable/{Name}")
	public String pathVariable(@PathVariable(name = "name") String pathName) {
		System.out.println("path variable : " + pathName);
		return pathName;
	}
	
	
	//http://localhost:8080/api/get/query-param?user=yeji&email=kej@gmail.com&age=22
	@GetMapping("/query-param")
	public String queryParam(@RequestParam Map<String, String> queryParam) {
		
		StringBuffer sb = new StringBuffer();
		
		queryParam.entrySet().forEach(entry -> {
			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
			
			sb.append(entry.getKey() + " = " + entry.getValue()+"\n");
		});
		
		return sb.toString();
	}
	
	//http://localhost:8080/api/get/query-param02?name=yeji&email=kej%40gmail.com&age=22
	@GetMapping("/query-param02")
	public String queryParam02(
			@RequestParam String name,
			@RequestParam String email,
			@RequestParam int age) {
		System.out.println("name : " + name);
		System.out.println("email : " + email);
		System.out.println("age : " + age);
		
		return name + " " + email+ " " + age;
	}
	
	@GetMapping("/query-param03")
	public String queryParam03(UserRequest userReqeust) { // 객체 타입일 때는 annotation 안써도 됨.
		System.out.println("name : " + userReqeust.getName());
		System.out.println("email : " + userReqeust.getEmail());
		System.out.println("age : " + userReqeust.getAge());
		
		return userReqeust.toString();
	}
}
