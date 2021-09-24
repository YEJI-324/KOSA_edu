package ex05.spring.aop;

public class Employee implements Print {

	private String name;
	private String job;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void show() {
		System.out.println("name : " + name + " job : " + job + " age : " + age);
	}

}
