package assignment;

import java.util.Scanner;

//����7]  �빮�� <--> �ҹ��� ���� ���α׷� �ۼ� ( if ) 
public class Assignment_3 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 char ch=' ';
		 
		 while(true) {
			 System.out.println("���ĺ� �Է�. '!'�Է½� ����");
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
