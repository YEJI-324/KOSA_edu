package quiz;

import java.util.Scanner;

/*���� ���� ó�� ���α׷� �ۼ�
input : �̸�, ����, ����, ��������
output : ����, ���, ����
��� ����) 
000���� ����ǥ****
���� : 100, ���� : 100, ���� : 100
���� : 300, ��� : 100.00, ����(����) : A

����)
-������ 0~100 ���̰��� �Է� �ޱ�
-����ó�� : ������ ���� or �Ǽ� �Է� x
-���ѷ����� ���
-y/n�� �Է� ������� ó��
 * */

public class Quiz_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			String name;
			int kor = -1, cs = -1, eng = -1;
			int sum;
			double avg;
			char grade;

			char flag = ' ';

			do {
				// ���� �ʱ�ȭ
				kor = -1;
				cs = -1;
				eng = -1;
				// ���� �Է�
				System.out.print("name : ");
				name = sc.next();

				while (true) {
					System.out.print("kor(0~100) : ");
					kor = sc.nextInt();
					if (kor >= 0 && kor <= 100)
						break;
				}
				while (true) {
					System.out.print("cs(0~100) : ");
					cs = sc.nextInt();
					if (cs >= 0 && cs <= 100)
						break;
				}
				while (true) {
					System.out.print("eng(0~100) : ");
					eng = sc.nextInt();
					if (eng >= 0 && eng <= 100)
						break;
				}

				// ���� ���ϱ�
				sum = kor + cs + eng;
				avg = (double) sum / 3;

				if (avg >= 90) {
					grade = 'A';
				} else if (avg >= 80) {
					grade = 'B';
				} else if (avg >= 70) {
					grade = 'C';
				} else if (avg >= 60) {
					grade = 'D';
				} else {
					grade = 'F';
				}

				// ����ǥ ���
				System.out.println(name + " ���� ����ǥ********");
				System.out.println("���� : " + kor + ",  ���� : " + cs + ", ���� : " + eng);
				System.out.printf("���� : %d, ��� : %.2f, ����(����) : %c\n", sum, avg, grade);

				System.out.println("��� �Է��Ͻðڽ��ϱ�? (y/n)");
				flag = sc.next().charAt(0);

				if (flag == 'n')
					break;

			} while (true);

		} catch (Exception e) {
			System.out.println("0~100 ���� �Է����ּ���.");
		}

	}

}
