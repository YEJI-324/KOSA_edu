package ex05.WhileDoWhile;

public class MainEntry {
	public static void main(String[] args) {
			
		int a = 1; // ���� �ʱ�ȭ
		
		while(a<11) { // ���ǽ�
			System.out.println("Hello "+a);
			a++; // ������
		}
		
		System.out.println("===================");
		
		int b = 1;
		
		do {
			System.out.println("Hello " + b);
			b++;
		} while(b<11);
		
	}
}
