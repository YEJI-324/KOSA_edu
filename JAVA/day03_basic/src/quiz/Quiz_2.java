package quiz;

import java.util.Scanner;

// 과제 1
// 3개 정수 입력 받아서 큰 순서대로 출력하는 프로그램 작성
public class Quiz_2 {
	public static void main(String[] args) {

		int x, y, z;

		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();

		if (x > y) {
			if(x>z) {
				if(y>z) {
					System.out.println(x + " > " + y + " > " + z);
				}
				else {
					System.out.println(x + " > " + z + " > " + y);
				}
			}
			else {
				System.out.println(z + " > " + x + " > " + y);
			}
		} else {
			if(y>z) {
				if(x>z) {
					System.out.println(y + " > " + x + " > " + z);
				}
				else {
					System.out.println(y + " > " + z + " > " + x);
				}
			}
			else {
				System.out.println(z + " > " + y + " > " + x);
			}
		}
	}
}
