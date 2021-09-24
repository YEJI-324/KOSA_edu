package quiz;

public class Employee {

	private String name;
	private String depart;
	private String rank;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public void print() {
		System.out.println("name : " + name + " depart : " + depart + " rank : " + rank);
	} 
}
