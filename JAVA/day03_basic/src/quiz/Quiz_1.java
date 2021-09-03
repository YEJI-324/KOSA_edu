package quiz;

public class Quiz_1 {
	
	public static void main(String[] args) {
			int pay = 567890;
			
			System.out.println("만원 : " + pay/10000 + "장");
			pay %= 10000;
			System.out.println("천원 : " + pay/1000 + "장");
			pay %= 1000;
			System.out.println("백원 : " + pay/100 + "개");
			pay %= 100;
			System.out.println("만원 : " + pay/10 + "개");
	}
}
