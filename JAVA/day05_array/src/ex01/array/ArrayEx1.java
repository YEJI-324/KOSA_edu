package ex01.array;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 1.
		char[] ch; // 배열 선언
		ch = new char[4]; // 배열생성, 메모리 할당

		// 2.
		char[] ch2 = new char[4]; // 배열 선언 및 생성
		// 배열 초기화
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';

		// 3.
		char[] ch3 = { 'J', 'A', 'V', 'A' };

		// size of array
		System.out.println("배열의 길이(크기) : " + ch2.length);

		for (int i = 0; i < 4; i++) {
			System.out.println("char[] ch[" + i + "] = " + ch[i]);
		}

		for (int i = 0; i < ch.length; i++) {
			System.out.println("char[] ch[" + i + "] = " + ch[i]);
		}
	}
}
