package com.example.simple_signin_login.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Table(name = "BootUser")
@Data
@Entity
@ToString
public class UserDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long no;
	
	private String email;
	private String password;
}
