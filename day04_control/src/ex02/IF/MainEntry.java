package ex02.IF;

import java.util.Scanner;

// ����/��� ���� ���α׷� �ۼ�
// 4�⸶�� �ѹ���
// 100���� �������� �ʰų� 400���� ������ �� ������ 0
public class MainEntry {
	public static void main(String[] args) {
		System.out.println("year = ");
		int year = new Scanner(System.in).nextInt();
		
		boolean flag = false;
		String msg = null;
		
		if(year % 4 == 0) {
			if(year % 100 != 0 | year % 400 == 0) {
				//����
				flag = true;
			}
		}
		
		msg = flag == true ? "����":"���";
		
		System.out.println(msg);
	}
}
