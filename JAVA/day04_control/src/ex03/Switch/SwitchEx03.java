package ex03.Switch;

import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1, 2, 3 ���� : "); // 1,2,3 �ܿ� ����ó�� �ϱ�
		int point = sc.nextInt();
		
		switch(point) {
		case 1:
			System.out.print("�� "); break;
		case 2:
			System.out.print("�ǾƳ� "); break;
		case 3:
			System.out.print("��� "); break;
			default:
				System.out.println("�߸��Է�.");
				System.exit(0);
		}
		
		System.out.println("��÷~~");
	}
}
