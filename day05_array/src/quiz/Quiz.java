package quiz;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		
		int STUDENTS_NUM = 7;
		int SUBJECTS_NUM = 3;
		
		String[] name = new String[STUDENTS_NUM];
		String[] sub = {"국어","영어","전산"};
		
		int[][] score = new int[STUDENTS_NUM][SUBJECTS_NUM];
		int[] sum = {0,0,0,0,0,0,0};
		double avg = 0;
		char grade = ' ';
		
		Scanner sc = new Scanner(System.in);

		try {
			// input
			for(int i = 0;i<STUDENTS_NUM;i++) {
				// input name
				System.out.print("이름 입력 : ");
				name[i] = sc.next();
			
				// input scores
				for(int j = 0;j<SUBJECTS_NUM;j++) {
					while(true) {
						System.out.print(sub[j]+" 점수 입력(0~100) : ");
						score[i][j] = sc.nextInt();
						if(score[i][j] >= 0 && score[i][j]<=100) break;
					}
				}
			}
			
			for(int i = 0;i<STUDENTS_NUM;i++) {
				for(int j = 0;j<SUBJECTS_NUM;j++) {
					sum[i] += score[i][j];
				}
				
				avg = (double)sum[i]/SUBJECTS_NUM;
				
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
				
				// print name, score, grade
				System.out.println(name[i]+"님의 성적표*********");
				System.out.printf("총점 : + %d 평균 : %.2f 학점 : %c", sum[i], avg , grade);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
