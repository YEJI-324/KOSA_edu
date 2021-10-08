package com.example.emp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="BootEmp")
@Entity
public class EmpDto implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empno;
	
	private String ename;
	private String sal;
//	public long getEmpno() {
//		return empno;
//	}
//	public void setEmpno(long empno) {
//		this.empno = empno;
//	}
//	public String getEname() {
//		return ename;
//	}
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//	public String getSal() {
//		return sal;
//	}
//	public void setSal(String sal) {
//		this.sal = sal;
//	}
//	public EmpDto(long empno, String ename, String sal) {
//		super();
//		this.empno = empno;
//		this.ename = ename;
//		this.sal = sal;
//	}
//	public EmpDto() {
//		super();
//	}
//	
//	
	
}
