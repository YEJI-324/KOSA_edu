package ex03.IF;

import java.util.Scanner;

// if ~ else
public class MainIF {
	public static void main(String[] args) {
		int score;
		
		System.out.println("점수 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		// 평점 구하기
		// 100 ~ 90 A 89~80 B ,,,
		if(score>=90) {
			System.out.println("A");
		}
		else if(score>=80) {
			System.out.println("B");
		}
		else if(score>=70) {
			System.out.println("C");
		}
		else if(score>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
	
}
