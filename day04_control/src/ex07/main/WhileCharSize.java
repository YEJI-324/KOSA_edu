package ex07.main;

import java.util.Scanner;

public class WhileCharSize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		String str = null;
		int count = 0;
		
		System.out.println("�� �Է�. '!'������ ���� : ");
		int num = 0;
		
		while(true) {
			str = sc.next();
			ch = str.charAt(0);
			
			if(ch == '!') break;
			
			count++;
			
//			System.out.println(count + "�� ° ���� : " + ch);
		}
		
		System.out.println("�� �Է� ���� ���� ���� : " + count + "��.");
		
		do {
			System.out.println("\n 0~100 ���� �Է� : ");
			num = sc.nextInt();
		} while(num<0 || num > 100);
		
		System.out.println(num);
	}
}
