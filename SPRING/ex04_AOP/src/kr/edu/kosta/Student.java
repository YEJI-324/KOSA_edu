package kr.edu.kosta;

public class Student {
	private String name;
	private String group;
	private String grade;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void getStudentInfo() {
		System.out.println("name : " + name + " group : " + group + " grade : " + grade);
	}
}
