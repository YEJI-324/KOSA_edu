package ex05.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 7, 9, 2, 3, 5 };
		int temp;
		int flag = -1;
		
		System.out.println("before sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}

		while(flag!=0) {
			flag = 0;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					flag++;
				}
			}
		}

		System.out.println("\n\n after sort");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
