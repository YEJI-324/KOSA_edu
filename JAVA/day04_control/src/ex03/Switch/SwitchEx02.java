package ex03.Switch;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� s, d, b, j");
		char city = sc.nextLine().charAt(0);
		
		switch(city) {
		case 's': System.out.print("����"); break;
		case 'd': System.out.print("�뱸"); break;
		case 'b': System.out.print("�λ�"); break;
		case 'j': System.out.print("����"); break;
		default:
			System.out.print("s, d, b, j �߿��� ����");
			System.exit(0);
		}
		
		System.out.println("��(��) ����");
	}
}
