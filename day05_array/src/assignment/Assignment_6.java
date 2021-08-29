package assignment;

import java.util.Scanner;

public class Assignment_6 {

	public static void main(String[] args) {
		System.out.print("정수 입력 : ");
		int num = new Scanner(System.in).nextInt();

		System.out.println(num + "의 절댓값은 : " + abs(num));
	}

	public static int abs(int num) {
		return (num < 0) ? -num : num;
	}
}
