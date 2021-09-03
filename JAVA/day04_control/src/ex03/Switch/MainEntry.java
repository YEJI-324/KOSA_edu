package ex03.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {

		System.out.println("num = ");
		int num = new Scanner(System.in).nextInt();

		String msg = null;

		switch (num % 2) {
		case 0:
			msg = "even";
			break;
		case 1:
			msg = "odd";
			break;
		default:
			msg = "error";
		}

		System.out.println("num is " + msg);
	}
}
