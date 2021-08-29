package ex05.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {7, 9, 2, 3, 5};
		int temp;
		
		System.out.println("before sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("\n\n after sort");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
