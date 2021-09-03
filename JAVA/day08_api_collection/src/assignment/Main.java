package assignment;

import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	static Vector<Customer> customers = new Vector<Customer>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {


		int command = 0;

		while (command != 5) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println(" 1. 고객 추가\n 2. 고객 삭제\n 3. 고객 리스트 출력\n 4. 고객 수정\n 5. 종료");
			command = sc.nextInt();
			
			switch(command) {
			case 1:
				addCustomer();
				break;
			case 2:
				deleteCustomer();
				break;
			case 3:
				printCustomer();
				break;
			case 4:
				editCustomer();
				break;
			default:
				System.out.println("1~5번 메뉴 중에서 선택해주세요.");
			}
		}
	}
	
	public static void addCustomer() {
		System.out.print("고객 이름 : ");
		String name = sc.next();
		System.out.print("고객 주소 : ");
		String address = sc.next();
		System.out.print("고객 연락처 : ");
		String tel = sc.next();
		customers.add(new Customer(name, address, tel));
		System.out.println(name + "고객 추가되었습니다.");
	}
	
	public static void deleteCustomer() {
		
	}
	
	public static void printCustomer() {
		//use Customer.toString() method
//		for()
			
			/*
			 * for (Integer item : hs2) {
			System.out.println(item);
		}*/
	}
	
	public static void editCustomer() {
		
	}
}
