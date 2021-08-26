package quiz;

import java.util.Scanner;

//과제 2
//연산자(+, -, *, /)와 정수 2개 입력 받아 사칙연산 프로그램 작성

//문제1 사칙연산 프로그램 작성(예외처리하기)
//숫자 2개 입력 받고, 연산자(+, -, *, /) 1개 입력 받아서
//( if 이용 ) 
public class Quiz_3 {
	public static void main(String[] args) {
		String operation;
		int num1, num2;
		int result = 0;

		Scanner sc = new Scanner(System.in);

		operation = sc.next();
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (operation.equals("+")) {
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
		} else if (operation.equals("-")) {
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
		} else if (operation.equals("*")) {
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
		} else { // 나누기
			try {
				result = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + result);	
			} catch(Exception e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
	}
}