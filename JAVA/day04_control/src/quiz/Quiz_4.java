package quiz;

import java.util.Scanner;

// for문 문제
public class Quiz_4 {
	public static void main(String[] args) {
		// 1. 원하는 단 입력 받아서 구구단 출력
		
		System.out.println("구구단 입력 : ");
		int num = new Scanner(System.in).nextInt();
		
		for(int i = 1;i<10;i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		
		System.out.println("\n==========================\n");
		
		// 2. 전체 구구단 출력
		for(int i = 1;i<10;i++) {
			System.out.println(i+"단");
			for(int j= 1;j<10;j++) {
				System.out.println(i + " * "+ j + " = " + (i*j));
			}
		}
	}
}
