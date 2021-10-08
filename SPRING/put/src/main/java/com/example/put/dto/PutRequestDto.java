package com.example.put.dto;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PutRequestDto {
	
	private String name;
	private int age;
	
//	@JsonProperty("car_list")
	private List<CarDto> carList;

//	@Override
//	public String toString() {
//		return "PutRequestDto [name=" + name + ", age=" + age + ", carList=" + carList + "]";
//	}
}
