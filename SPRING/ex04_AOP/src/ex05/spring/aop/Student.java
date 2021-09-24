package ex05.spring.aop;

public class Student implements Print {

	private String name;
	private String grade;
	private String group;
	private int age;

	public Student() {	}

	public Student(String name, String grade, String group, int age) {
		this.name = name;
		this.grade = grade;
		this.group = group;
		this.age = age;
	}
	
	@Override
	public void show() {
		System.out.println("name : " + name + " grade : " + grade + "groud : " + group + " age : " + age);
	}

}
