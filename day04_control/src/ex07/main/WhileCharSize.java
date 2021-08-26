package ex07.main;

import java.util.Scanner;

public class WhileCharSize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		String str = null;
		int count = 0;
		
		System.out.println("값 입력. '!'누르면 종료 : ");
		int num = 0;
		
		while(true) {
			str = sc.next();
			ch = str.charAt(0);
			
			if(ch == '!') break;
			
			count++;
			
//			System.out.println(count + "번 째 문자 : " + ch);
		}
		
		System.out.println("총 입력 받은 문자 갯수 : " + count + "개.");
		
		do {
			System.out.println("\n 0~100 정수 입력 : ");
			num = sc.nextInt();
		} while(num<0 || num > 100);
		
		System.out.println(num);
	}
}
