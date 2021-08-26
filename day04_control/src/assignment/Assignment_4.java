package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

// 과제8]  두수 입력 받아서 나눗셈 하는 프로그램 작성 (예외처리)

public class Assignment_4 {

	public static void main(String[] args) {
		try {

			int num1, num2;
			Scanner sc = new Scanner(System.in);

			System.out.println("두 수 입력 : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			System.out.println(num1 + " / " + num2 + " = " + num1 / num2);

		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하세요.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
