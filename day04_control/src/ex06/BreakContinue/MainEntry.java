package ex06.BreakContinue;

import java.util.Iterator;

public class MainEntry {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			if (i == 7)
				break; // exit loop

			System.out.println(i);
		}

		System.out.println("============================");

		for (int i = 0; i < 10; i++) {

			if (i == 7)
				continue; // jump loop

			System.out.println(i);
		}

//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.println(j);
//
//				if (j == 3)
//					break;
//			}
//			System.out.println();
//		}
	}
}
