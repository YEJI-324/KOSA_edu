package quiz;

import java.util.Scanner;

//문제 2
//다음을 입력 받아서 출력하는 프로그램 작성
//이름, 국어, 영어, 전산 점수 입력 받아서
//총점, 평균 까지 출력하는
public class Quiz_4 {
	public static void main(String[] args) {
		String name;
		int kor, eng, cs;
		int sum;
		float avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		name = sc.next();
		System.out.println("국어 : ");
		kor = sc.nextInt();
		System.out.println("영어 : ");
		eng = sc.nextInt();
		System.out.println("전산 : ");
		cs = sc.nextInt();
		
		sum = kor + eng + cs;
		avg = sum/3;
		
		System.out.println(name + "님의 성적표********");
		System.out.println("국어 : "+ kor + ", 영어 : " + eng + ", 전산 : " + cs);
		System.out.println("총점 : " + sum + ", 평균 : " + avg);
	}
}
