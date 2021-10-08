package com.example.response.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.dto.User;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	// Text
	// http://localhost:8080/api/text?account=user100
	@GetMapping("/text")
	public String text(@RequestParam String account) {
		return account;
	}
	
	// Json
	@PostMapping("/json")
	// request -> object 타입으로 매핑됨 -> object -> method -> object -> object mapper -> json 타입 -> response
	public User json(@RequestBody User user) {
		System.out.println(user);
		return user;
	}
	
	// ResponseEntity
	@PutMapping("/put") // PUT, http://localhost:8080/api/put
	public ResponseEntity<User> put(@RequestBody User user) { // ResponseEntity 제네릭 타입으로 보내줌.
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
		// body(user) : object mapper를 통해서 object로 매핑됨.
	}
}

/*
 {
 	"name":"yeji",
 	"age":10,
 	"phone_number":"010-0000-0000",
 	"address":"seoul"
 }
 */
