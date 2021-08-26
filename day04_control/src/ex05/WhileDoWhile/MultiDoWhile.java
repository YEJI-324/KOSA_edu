package ex05.WhileDoWhile;

public class MultiDoWhile {

	public static void main(String[] args) {

		int a = 1, b = 1; // initialization
		
		do {
			b = 1;
			do {
				System.out.print(b + "\t");
				b++;
			} while(b<=3);
			System.out.println();
			a++;
		} while(a<=2);
	}
}
