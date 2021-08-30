package Assignment;

class Employee{
	
	// member variables
	private String name;
	private String rank;
	private String depart;
	private int salary;
	private String tel;
	
	// constructors
	public Employee() {}

	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(String name, String rank, String depart, int salary, String tel) {
		this.name = name;
		this.rank = rank;
		this.depart = depart;
		this.salary = salary;
		this.tel = tel;
	}
	
	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	// output method
	public void display() {
		System.out.println("이름 : " + name);
		System.out.println("직급 : " + rank);
		System.out.println("부서 : " + depart);
		System.out.println("급여 : " + salary + "만원");
		System.out.println("연락처 : " + tel);
	}
	
}

public class Assignment_1 {
	public static void main(String[] args) {
		Employee emp = new Employee("김예지", "사원", "개발", 300, "010-0000-0000");
		emp.display();	
	}
}
