package assignment;

import java.util.Scanner;

//과제7]  대문자 <--> 소문자 변경 프로그램 작성 ( if ) 
public class Assignment_3 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 char ch=' ';
		 
		 while(true) {
			 System.out.println("알파벳 입력. '!'입력시 종료");
			 ch = sc.next().charAt(0);
			 //a 97 122
			 //A 65 90
			 if(ch > 96 && ch < 123) {
				 // lower case
				 ch -= 32;
			 } else {
				 // upper case
				 ch += 32;
			 }
			 
			 System.out.println(ch);
			 
			 if(ch == '!') break;
		 }
	}
}
