package assignment;

public class Assignment_1 {
	public static void main(String[] args) {

		// ����� 1
		System.out.println("����� 1");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ����� 2
		System.out.println("\n����� 2");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ����� 3
		System.out.println("\n����� 3");
		for (int i = 0; i < 5; i++) {
			for (int j = 4 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// ����� 5
		System.out.println("\n����� 5");
		for (int i = 0; i < 5; i++) {
			for (int j = 4 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i+1)*2 -1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
