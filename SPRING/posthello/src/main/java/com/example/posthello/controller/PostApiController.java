package com.example.posthello.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostApiController {

	@PostMapping("/post")
	public void post(@RequestBody Map<String, Object> requestData) {
		requestData.entrySet().forEach(strObjectEntry -> {
			System.out.println("key : " + strObjectEntry.getKey());
			System.out.println("value : " + strObjectEntry.getValue());
		});
	}
}
