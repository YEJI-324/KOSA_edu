package ex08.staticMember;

class Atm {
	int count; // instance member
	static int total; // static member

	public Atm(int amount) { // constructor
		count += amount;
		total += amount;
	}
	
	public static void view() {
		total += 100;
	}
	
	public static void show(int count, int total) {
//		this.count = count;
//		this.total = total;
	}
	
	public void display() {
		System.out.println("count : " + count + "\ntotal : " + total);
	}
}

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total);
		
		Atm at1 = new Atm(1000);
		at1.display(); // count : 1000, total : 1000
		System.out.println("========================");
		
		Atm at2 = new Atm(1000);
		at2.display(); // count : 1000, total : 2000
		System.out.println("========================");
		
		Atm at3 = new Atm(1000);
		at3.display(); // count : 1000, total : 3000
		System.out.println("========================");
		
	}
}
