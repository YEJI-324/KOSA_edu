package ex04.For;


public class MainEntry {
	public static void main(String[] args) {
		
		for(int i = 0;i<5;i++) {
			System.out.println("hello~ " + (i+1));
		}
		
		// �ʱⰪ, �������� 2�� �̻� ����, ������ ���� 1���� ����!
		int a, b;
		for(a = 1, b=2;a+b<=10;a++,b+=2) {
			System.out.println("hello~~ "+ a + " " + b);
		}
		
		// �ʱⰪ, �������� ��������, ������ �����ϸ� ���ѷ���
		a = 1; b = 2;
		for(;a<20;) {
			System.out.println("hello~~~~~~~~ " + a);
			a+=4;
		}
		
		//���ѷ��� for��
		for(;;) {
			System.out.println("���ѷ���!!!!!!!");
			if(true) break; // Ż�ⱸ��
		}
	}
}
