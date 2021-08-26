package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

// ����8]  �μ� �Է� �޾Ƽ� ������ �ϴ� ���α׷� �ۼ� (����ó��)

public class Assignment_4 {

	public static void main(String[] args) {
		try {

			int num1, num2;
			Scanner sc = new Scanner(System.in);

			System.out.println("�� �� �Է� : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			System.out.println(num1 + " / " + num2 + " = " + num1 / num2);

		} catch (InputMismatchException e) {
			System.out.println("������ �Է��ϼ���.");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
