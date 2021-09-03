package ex03.Switch;

import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1, 2, 3 선택 : "); // 1,2,3 외에 예외처리 하기
		int point = sc.nextInt();
		
		switch(point) {
		case 1:
			System.out.print("집 "); break;
		case 2:
			System.out.print("피아노 "); break;
		case 3:
			System.out.print("우산 "); break;
			default:
				System.out.println("잘못입력.");
				System.exit(0);
		}
		
		System.out.println("당첨~~");
	}
}
