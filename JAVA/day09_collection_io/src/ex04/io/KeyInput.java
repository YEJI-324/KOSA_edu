package ex04.io;

import java.io.IOException;

public class KeyInput {
	public static void main(String[] args) throws IOException {

		int num1 = 0, num2 = 0;
		System.out.println("데이터 입력 끝은 Ctrl + z 누르세요.");
		
		while((num1 = System.in.read()) != -1) {
			
			if(num1 == 10||num1 == 13||num1 == 32) continue; // 스페이스바, 엔터면 넘어감
			if(num1 == 113||num1 == 81) break; // q,Q면 break
			
			System.out.print((char) num1 + " ");
		}
		System.out.println();
	}
}
