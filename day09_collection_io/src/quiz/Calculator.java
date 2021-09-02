package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//퀴즈] 숫자 2개 입력 받고, 연산자 입력 -> 사칙연산 구하는 프로그램 만들기 (io 이용)

public class Calculator {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("사칙 연산식 입력 :");
//		String operation = br.readLine();
		Integer num1 = Integer.parseInt(br.readLine());
		Integer num2 = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력 : ");
		String op = br.readLine();
		
		switch(op) {
		case "+" :
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case "-":
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case "*":
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			break;
		case "/":
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			break;
		default:
			System.out.println("사칙 연산 입력");
		}
	}
	
}
