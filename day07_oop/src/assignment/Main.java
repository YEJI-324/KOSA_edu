package assignment;

public class Main {
	public static void main(String[] args) {
		Regular r = new Regular("김예지", "010-0000-0000", "개발", "사원", 300);
		r.display();
		
		System.out.println("===================================");
		
		Sales s = new Sales("김예지", "010-0000-0000", "개발", "사원", 300, 0.5);
		s.display();
		
		System.out.println("===================================");
		
		PartTime p = new PartTime("김예지", "010-0000-0000", "개발", "사원", 8, 20, 8720);
		p.display();
	}
}
