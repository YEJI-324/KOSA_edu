package assignment;

import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	static Vector<Customer> customers = new Vector<Customer>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {


		int command = 0;

		while (command != 5) {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println(" 1. �� �߰�\n 2. �� ����\n 3. �� ����Ʈ ���\n 4. �� ����\n 5. ����");
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
				System.out.println("1~5�� �޴� �߿��� �������ּ���.");
			}
		}
	}
	
	public static void addCustomer() {
		System.out.print("�� �̸� : ");
		String name = sc.next();
		System.out.print("�� �ּ� : ");
		String address = sc.next();
		System.out.print("�� ����ó : ");
		String tel = sc.next();
		customers.add(new Customer(name, address, tel));
		System.out.println(name + "�� �߰��Ǿ����ϴ�.");
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
