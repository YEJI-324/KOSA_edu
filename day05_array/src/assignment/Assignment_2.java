package assignment;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		int days = 0;
		double sum = 0.0, avg;
		
		System.out.print("입력할 일 수 : ");
		days = new Scanner(System.in).nextInt();
		
		double[] percipitations = new double[days];
		
		for(int i = 0;i<days;i++) {
			System.out.print("강수량을 입력해주세요 : ");
			percipitations[i] = new Scanner(System.in).nextDouble();
			
			sum += percipitations[i];
		}
		
		avg = sum/30;
		
		System.out.printf("평균 강수량(30일 기준) : %.2f", avg);
	}
}
