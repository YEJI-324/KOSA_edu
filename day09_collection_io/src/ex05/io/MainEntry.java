package ex05.io;

import java.io.*;

public class MainEntry {
	public static void main(String[] args) throws IOException {
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(reader);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("charactor input = ");
		//String str = br.readLine(); // 예외발생. 여러개 데이터 입력 받기
		// 입력된 전체가 String이므로 파싱 필요
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		System.out.println(num1 + num2);
	}
}
