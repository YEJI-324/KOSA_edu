package com.example.put.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.put.dto.PutRequestDto;

@RestController
@RequestMapping("/api") // PUT, http://locatlhost:8080/api/
public class PutApiController {
	
	@PutMapping("/put")
	public PutRequestDto put(@RequestBody PutRequestDto dto) {
		System.out.println(dto.toString());
		
		return dto;
	}

    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }
}

/*
 {
 	"name":"yeji",
 	"age":22,
 	"car_list": [
 		{
 			"name":"BMW",
 			"car_number":"11가8234"
 		},
 		{
 			"name":"A4",
 			"car_number":"98아2344"
 		}
 	]
 }
 */
