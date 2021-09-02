package ex04.io;

import java.io.*;

public class MainEntry {
	public static void main(String[] args) {
		// 표준 입력 System.in
		InputStream is = System.in;
		
		try {
			System.out.print("단일 문자 입력 : ");
			int num1 = is.read() - 48; // 예외발생. '0'~'9' : 48~57(ASCII)
			// read()의 리턴타입이 int이므로 문자로 입력받을 수 없음.
			is.read(); is.read();
			int num2 = is.read() - 48;
			
			System.out.println(num1); // 아스키 코드로 출력됨. -> char로 보고 싶으면 형변화 필요.
			// 숫자 -> 숫자로 출력하려면 48을 빼주면 됨.
			System.out.println(num2);
			System.out.println(num1+num2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
