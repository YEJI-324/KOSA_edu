package ex03.Switch;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도시 선택 s, d, b, j");
		char city = sc.nextLine().charAt(0);
		
		switch(city) {
		case 's': System.out.print("서울"); break;
		case 'd': System.out.print("대구"); break;
		case 'b': System.out.print("부산"); break;
		case 'j': System.out.print("제주"); break;
		default:
			System.out.print("s, d, b, j 중에서 선택");
			System.exit(0);
		}
		
		System.out.println("를(을) 선택");
	}
}
