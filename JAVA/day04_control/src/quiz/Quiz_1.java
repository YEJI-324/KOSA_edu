package quiz;

import java.util.Scanner;

//switch case example
//��Ģ���� ���α׷� - ������ 1, ���� 2 �Է�

public class Quiz_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
//		String op = sc.next();
		 char op = sc.next().charAt(0);
		
		int result = 0;
		
		switch(op) {
//		case "+":
//			result = num1 + num2;
//			break;
//		case "-":
//			result = num1 - num2;
//			break;
//		case "*":
//			result = num1 * num2;
//			break;
//		case "/":
//			result = num1 / num2;
//			break;
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("������ +, -, *, / �߿��� �Է�");
			System.exit(0);
		}
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + result );
	}
}
