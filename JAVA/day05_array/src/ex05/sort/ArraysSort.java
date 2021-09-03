package ex05.sort;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int[] a = { 7, 9, 2, 3, 5 };
		
		System.out.println("before sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}

		//sort
		//오름차순
		Arrays.sort(a);

		System.out.println("\n\nafter sort");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		System.out.println("\n내림차순");
		//내림차순
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i] + "\t");
		}
	}
}
