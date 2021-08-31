package ex02.constructor;

// default constructor, API 만들기
public class MainEntry {
	
	/*
	 * @param args 메인은 아무값도 넘겨받지 않습니다.
	 * @param x 곱을 구하는 것의 첫번째 정수형 변수
	 * @param y 곱을 구하는 것의 두번째 정수형 변수
	 * @param mul 변수는 x와 y 두 정수의 곱을 저장하는 변수
	 * */
	
	public static void main(String[] args) {
		int x, y, mul = 1;
		char ch = 'A';
		String msg;
		
		x = 5; y = 10;
		msg = "나는 멋쟁이";
		
		mul = mul(x,y);
		System.out.println(ch);
		System.out.println(msg);
		System.out.println(x + " * " + y + " = " + mul);
	}
	
	public static int mul(int x, int y) {
		return x * y;
	}
}
