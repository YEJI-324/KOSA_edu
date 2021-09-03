package ex04.exception;

import java.util.Scanner;

// 예외처리 위임 throw 사용
public class ExceptionEx2 {
	public static void main(String[] args) throws Exception {

		System.out.println("x, y integer data input: ");
		int x, y, result = 0;
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();

		result = x / y;

		System.out.println(result);
	}
}
