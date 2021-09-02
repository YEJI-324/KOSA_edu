package assignment;

public class Employee {
	String name;
	String rank;
	String depart;
	
	public Employee() {	}

	public Employee(String name, String rank, String depart) {
		super();
		this.name = name;
		this.rank = rank;
		this.depart = depart;
	}

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

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rank=" + rank + ", depart=" + depart + "]";
	}
	
}
