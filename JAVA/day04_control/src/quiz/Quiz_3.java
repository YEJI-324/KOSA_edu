package quiz;

import java.util.Scanner;

// ���� 2 -> switch case�� ����

/*
  ����, ����, ���� �Է� �޾Ƽ� ��� 60�� �̻�
  �� ���� ���� 40�� ���ϸ� ���հ� -> � �������� ���հ�����
 */
public class Quiz_3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int cs, eng, kor;
		double avg = 0;
		
		System.out.println("���� : ");
		cs = sc.nextInt();
		System.out.println("���� : ");
		eng = sc.nextInt();
		System.out.println("���� : ");
		kor = sc.nextInt();
		avg = (double) (cs + eng + kor) / 3;
		
		if(avg >= 60) {
			if(cs >= 40 && eng >= 40 && kor >=40) {
				System.out.println("�հ�");
			}
			else {
				if(cs<40) {
					System.out.println("���� ���� 40�� �̸����� ���հ�");
				}
				if(eng<40) {
					System.out.println("���� ���� 40�� �̸����� ���հ�");					
				}
				if(kor<40) {
					System.out.println("���� ���� 40�� �̸����� ���հ�");
				}
			}
		}
		else {
			if(cs >= 40 && eng >= 40 && kor >=40) {
				System.out.printf("��� %.2f������ ���հ�\n", avg);	
			}
			else {
				if(cs<40) {
					System.out.println("���� ���� 40�� �̸����� ���հ�");
				}
				if(eng<40) {
					System.out.println("���� ���� 40�� �̸����� ���հ�");					
				}
				if(kor<40) {
					System.out.println("���� ���� 40�� �̸����� ���հ�");
				}
			}
		}

		switch((int)avg/10) {
		case 10:
		case 9:
		case 8:
		case 7:
		case 6: // �� ���� 40�� �̻����� üũ
			switch(cs/40) {
			case 0:
			case 1:
			default:
			}
			switch(eng/40) {
			
			}
			switch(kor/40) {
			
			}
			break;
		default:
		}
	}
}
