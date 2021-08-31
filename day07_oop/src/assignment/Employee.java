package assignment;

public class Employee {
	private String name, tel, depart, rank;

	public Employee() {
		super();
	}

	public Employee(String name, String tel, String depart, String rank) {
		super();
		this.name = name;
		this.tel = tel;
		this.depart = depart;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public void display() {
		System.out.println("이름 : " + name);
		System.out.println("연락처 : " + tel);
		System.out.println("부서 : " + depart);
		System.out.println("직급 : " + rank);
	}
	
}
