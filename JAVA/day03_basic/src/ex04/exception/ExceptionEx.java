package ex04.exception;

import java.util.Scanner;

// 예외처리 try.. catch문
public class ExceptionEx {
	public static void main(String[] args) {
		
		try {
			System.out.println("x, y integer data input: ");
			int x, y, result = 0;
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x/y;
			
			System.out.println(result);
		} catch (ArithmeticException e) {
			// 하위 예외처리 부터 순차적으로
		} catch (Exception e) {
//			System.out.println("0으로 나눌 수 없다.");
			e.printStackTrace();
		} finally {
			System.out.println("여긴 무조건 출력됨.");
		}
	}
}
