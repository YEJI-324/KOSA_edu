package assignment;

public class Regular extends Employee {
	private int salary;
	
		public Regular(int salary) {
		super();
		this.salary = salary;
	}
	
	public Regular(String name, String tel, String depart, String rank, int salary) {
		super(name, tel, depart, rank);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void display() {
		super.display();
		System.out.println("급여 : " + salary);
	}
}
