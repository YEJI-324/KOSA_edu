package quiz;

import java.util.Scanner;

/*과제 성적 처리 프로그램 작성
input : 이름, 국어, 전산, 영어점수
output : 총점, 평균, 학점
출력 예시) 
000님의 성적표****
국어 : 100, 전산 : 100, 영어 : 100
총점 : 300, 평균 : 100.00, 평점(학점) : A

조건)
-점수는 0~100 사이값만 입력 받기
-예외처리 : 정수에 문자 or 실수 입력 x
-무한루프를 사용
-y/n로 입력 계속할지 처리
 * */

public class Quiz_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			String name;
			int kor = -1, cs = -1, eng = -1;
			int sum;
			double avg;
			char grade;

			char flag = ' ';

			do {
				// 변수 초기화
				kor = -1;
				cs = -1;
				eng = -1;
				// 성적 입력
				System.out.print("name : ");
				name = sc.next();

				while (true) {
					System.out.print("kor(0~100) : ");
					kor = sc.nextInt();
					if (kor >= 0 && kor <= 100)
						break;
				}
				while (true) {
					System.out.print("cs(0~100) : ");
					cs = sc.nextInt();
					if (cs >= 0 && cs <= 100)
						break;
				}
				while (true) {
					System.out.print("eng(0~100) : ");
					eng = sc.nextInt();
					if (eng >= 0 && eng <= 100)
						break;
				}

				// 성적 구하기
				sum = kor + cs + eng;
				avg = (double) sum / 3;

				if (avg >= 90) {
					grade = 'A';
				} else if (avg >= 80) {
					grade = 'B';
				} else if (avg >= 70) {
					grade = 'C';
				} else if (avg >= 60) {
					grade = 'D';
				} else {
					grade = 'F';
				}

				// 성적표 출력
				System.out.println(name + " 님의 성적표********");
				System.out.println("국어 : " + kor + ",  전산 : " + cs + ", 영어 : " + eng);
				System.out.printf("총점 : %d, 평균 : %.2f, 평점(학점) : %c\n", sum, avg, grade);

				System.out.println("계속 입력하시겠습니까? (y/n)");
				flag = sc.next().charAt(0);

				if (flag == 'n')
					break;

			} while (true);

		} catch (Exception e) {
			System.out.println("0~100 점수 입력해주세요.");
		}

	}

}
