package quiz;

import java.util.Scanner;

// 퀴즈 2 -> switch case로 수정

/*
  전산, 영어, 국어 입력 받아서 평균 60점 이상
  각 과목 과락 40점 이하면 불합격 -> 어떤 과목으로 불합격인지
 */
public class Quiz_3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int cs, eng, kor;
		double avg = 0;
		
		System.out.println("전산 : ");
		cs = sc.nextInt();
		System.out.println("영어 : ");
		eng = sc.nextInt();
		System.out.println("국어 : ");
		kor = sc.nextInt();
		avg = (double) (cs + eng + kor) / 3;
		
		if(avg >= 60) {
			if(cs >= 40 && eng >= 40 && kor >=40) {
				System.out.println("합격");
			}
			else {
				if(cs<40) {
					System.out.println("전산 점수 40점 미만으로 불합격");
				}
				if(eng<40) {
					System.out.println("영어 점수 40점 미만으로 불합격");					
				}
				if(kor<40) {
					System.out.println("국어 점수 40점 미만으로 불합격");
				}
			}
		}
		else {
			if(cs >= 40 && eng >= 40 && kor >=40) {
				System.out.printf("평균 %.2f점으로 불합격\n", avg);	
			}
			else {
				if(cs<40) {
					System.out.println("전산 점수 40점 미만으로 불합격");
				}
				if(eng<40) {
					System.out.println("영어 점수 40점 미만으로 불합격");					
				}
				if(kor<40) {
					System.out.println("국어 점수 40점 미만으로 불합격");
				}
			}
		}

		switch((int)avg/10) {
		case 10:
		case 9:
		case 8:
		case 7:
		case 6: // 각 과목 40점 이상인지 체크
			switch(cs/40) {
			case 0:
			case 1:
			default:
			}
			switch(eng/40) {
			
			}
			switch(kor/40) {
			
			}
			break;
		default:
		}
	}
}
