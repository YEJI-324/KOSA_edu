package ex01.scanner;

import java.util.Scanner;

public class MainEntry {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 객체 생성, 메모리에 할당(heap 영역), 생성자 함수 자동 호출됨. 
		
		System.out.println("string input : ");
		
		String str = sc.next();
		String msg = sc.nextLine();
		
		System.out.println("string next() is : " + str);
		System.out.println("string nextLine() is : " + msg);
	}
}
