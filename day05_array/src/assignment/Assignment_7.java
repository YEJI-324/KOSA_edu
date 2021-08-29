package assignment;

import java.util.Scanner;

public class Assignment_7 {

	public static void main(String[] args) {
		System.out.println("max : "+ max());
	}
	
	public static int max() {
		int num1, num2;
		System.out.println("두 정수 입력: ");
		num1 = new Scanner(System.in).nextInt();
		num2 = new Scanner(System.in).nextInt();
		
		return (num1>num2)?num1:num2;
	}
}
