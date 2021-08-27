package ex01.array;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		System.out.println("a[0] = " + a[0]);
		
		for(int i = 0;i<a.length;i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
		
		int[] arr = new int[15];
		for(int i = 0;i<arr.length;i++) {
			arr[i]= i+1;
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + "\t");
			if(i%5 == 4) System.out.println();
		}
		
		System.out.println("====================");
		
		// 임의 숫자 입력받고 숫자 출력, 합 출력
		int[] b = new int[5];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<b.length;i++) {
			System.out.print((i+1)+"번 째 숫자 입력 : ");
			b[i] = sc.nextInt();
			sum += b[i];
		}
		
		// 숫자 출력
		for(int i = 0;i<b.length;i++) {
			System.out.println((i+1)+"번 째 숫자 : " + b[i]);
		}
		System.out.println("총합 : "+ sum);
	}
}
