package com.example.emp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "BootEmp")
@Data
public class EmpDto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empno;
	
	private String ename;
	private String sal;
	
}
