package quiz;

import java.util.Scanner;

// for�� ����
public class Quiz_4 {
	public static void main(String[] args) {
		// 1. ���ϴ� �� �Է� �޾Ƽ� ������ ���
		
		System.out.println("������ �Է� : ");
		int num = new Scanner(System.in).nextInt();
		
		for(int i = 1;i<10;i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		
		System.out.println("\n==========================\n");
		
		// 2. ��ü ������ ���
		for(int i = 1;i<10;i++) {
			System.out.println(i+"��");
			for(int j= 1;j<10;j++) {
				System.out.println(i + " * "+ j + " = " + (i*j));
			}
		}
	}
}
