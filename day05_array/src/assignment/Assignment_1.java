package assignment;

public class Assignment_1 {

	public static void main(String[] args) {
		int[] a = {7, 5, 4, 8, 2};
		int sum = 0;
		
		for(int i = 0;i<a.length;i++) {
			sum += a[i];
		}
		
		System.out.println("sum : " + sum);
	}
}
