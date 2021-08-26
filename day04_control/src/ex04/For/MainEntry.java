package ex04.For;


public class MainEntry {
	public static void main(String[] args) {
		
		for(int i = 0;i<5;i++) {
			System.out.println("hello~ " + (i+1));
		}
		
		// 초기값, 증감식은 2개 이상 가능, 조건은 오직 1개만 가능!
		int a, b;
		for(a = 1, b=2;a+b<=10;a++,b+=2) {
			System.out.println("hello~~ "+ a + " " + b);
		}
		
		// 초기값, 증감식은 생략가능, 조건은 생략하면 무한루프
		a = 1; b = 2;
		for(;a<20;) {
			System.out.println("hello~~~~~~~~ " + a);
			a+=4;
		}
		
		//무한루프 for문
		for(;;) {
			System.out.println("무한루프!!!!!!!");
			if(true) break; // 탈출구문
		}
	}
}
