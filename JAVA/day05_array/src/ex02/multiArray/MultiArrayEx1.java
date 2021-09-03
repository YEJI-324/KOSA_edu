package ex02.multiArray;

import java.util.Scanner;

public class MultiArrayEx1 {

	public static void main(String[] args) {
		int[][] arr2 = {{1,2,3},{1,2,3}};
		
		for(int i = 0;i<arr2.length;i++) {
			for(int j = 0;j<arr2[0].length;j++) {
				System.out.print(arr2[i][j]+ "\t");
			}
			System.out.println();
		}
		
		// 2차원 배열에 임의의 데이터 입력받기
		// 값 출력, 행별 합 출력
		int[][] b = new int[2][3];
		for(int i = 0;i<b.length;i++) {
			for(int j = 0;j<b[0].length;j++) {
				System.out.print("b["+i+"]["+j+"] 입력 : ");
				b[i][j] = new Scanner(System.in).nextInt();
			}
		}
		
		int[] sum = new int[b.length];
		
		for(int i = 0;i<b.length;i++) {
			for(int j = 0;j<b[0].length;j++) {
				sum[i] += b[i][j];
			}
			System.out.println(i+"행의 합 : "+sum[i]);
		}
	}
}
