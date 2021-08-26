package ex02.IF;

import java.util.Scanner;

// 윤년/평년 판정 프로그램 작성
// 4년마다 한번씩
// 100으로 나눠지지 않거나 400으로 나눴을 때 나머지 0
public class MainEntry {
	public static void main(String[] args) {
		System.out.println("year = ");
		int year = new Scanner(System.in).nextInt();
		
		boolean flag = false;
		String msg = null;
		
		if(year % 4 == 0) {
			if(year % 100 != 0 | year % 400 == 0) {
				//윤년
				flag = true;
			}
		}
		
		msg = flag == true ? "윤년":"평년";
		
		System.out.println(msg);
	}
}
