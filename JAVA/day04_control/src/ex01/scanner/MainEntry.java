package ex01.scanner;

import java.util.Scanner;

public class MainEntry {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // ��ü ����, �޸𸮿� �Ҵ�(heap ����), ������ �Լ� �ڵ� ȣ���. 
		
		System.out.println("string input : ");
		
		String str = sc.next();
		String msg = sc.nextLine();
		
		System.out.println("string next() is : " + str);
		System.out.println("string nextLine() is : " + msg);
	}
}
