package assignment;

public class Sales extends Employee {
	private int salary;
	private double commition;
	
	public Sales(int salary, double commition) {
		super();
		this.salary = salary;
		this.commition = commition;
	}

	public Sales(String name, String tel, String depart, String rank, int salary, double commition) {
		super(name, tel, "영업", rank);
		this.salary = salary;
		this.commition = commition;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getCommition() {
		return commition;
	}

	public void setCommition(double commition) {
		this.commition = commition;
	}
	
	public double calculateCommition() {
		return salary*(1+commition);
	}
	
	public void display() {
		super.display();
		System.out.println("기본급여 : " + salary);
		System.out.println("총 급여 : " + calculateCommition());
	}
}
