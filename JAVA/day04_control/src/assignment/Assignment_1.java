package assignment;

public class Assignment_1 {
	public static void main(String[] args) {

		// º°Âï±â 1
		System.out.println("º°Âï±â 1");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// º°Âï±â 2
		System.out.println("\nº°Âï±â 2");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// º°Âï±â 3
		System.out.println("\nº°Âï±â 3");
		for (int i = 0; i < 5; i++) {
			for (int j = 4 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// º°Âï±â 5
		System.out.println("\nº°Âï±â 5");
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
