package assignment;

import java.util.Scanner;

public class Assignment_8 {
	
	static int STUDENT_NUM = 7;
	
	static String name;
	static int kor, eng, cs;
	
	public static void main(String[] args) {

		for(int i = 0;i<STUDENT_NUM;i++) {
			input();
			output();
		}
		
	}
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		name = sc.next();

		while (true) {
			System.out.print("국어 점수 (0~100) : ");
			kor = sc.nextInt();
			if (kor >= 0 && kor <= 100)
				break;
		}
		
		while (true) {
			System.out.print("영어 점수 (0~100) : ");
			eng = sc.nextInt();
			if (eng >= 0 && eng <= 100)
				break;
		}
		
		while (true) {
			System.out.print("전산 점수 (0~100) : ");
			cs = sc.nextInt();
			if (cs >= 0 && cs <= 100)
				break;
		}
			
		
	}
	
	public static int total(int kor, int eng, int cs) {
		int sum = kor + eng + cs;
		
		return sum;
	}
	
	public static double average(int sum) {
		double avg = sum/3.0;
		
		return avg;
	}
	
	public static char grade(double avg) {
		if (avg >= 90) {
			return 'A';
		} else if (avg >= 80) {
			return 'B';
		} else if (avg >= 70) {
			return 'C';
		} else if (avg >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}

	public static void output() {
		int sum = total(kor, eng, cs);
		double avg = average(sum);
		char grade = grade(avg);
		
		System.out.println(name +"님의 성적표******");
		System.out.printf("총점 : %d 평균 : %.2f 학점 : %c\n", sum, avg, grade);
		
	}
}
