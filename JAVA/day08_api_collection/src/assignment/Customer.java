package assignment;

public class Customer {
	private int idx;
	private String name;
	private String address;
	private String tel;

	public Customer() {}

	public Customer(String name, String address, String tel) {
		this.idx = idx;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
	public Customer(int idx, String name, String address, String tel) {
		this.idx = idx;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "고객 이름 : " + name + "\n주소 : " + address + "\n연락처=" + tel;
	}
}
