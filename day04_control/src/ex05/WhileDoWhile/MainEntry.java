package ex05.WhileDoWhile;

public class MainEntry {
	public static void main(String[] args) {
			
		int a = 1; // 변수 초기화
		
		while(a<11) { // 조건식
			System.out.println("Hello "+a);
			a++; // 증감식
		}
		
		System.out.println("===================");
		
		int b = 1;
		
		do {
			System.out.println("Hello " + b);
			b++;
		} while(b<11);
		
	}
}
