package ex02.constructor;

// default constructor, API �����
public class MainEntry {
	
	/*
	 * @param args ������ �ƹ����� �Ѱܹ��� �ʽ��ϴ�.
	 * @param x ���� ���ϴ� ���� ù��° ������ ����
	 * @param y ���� ���ϴ� ���� �ι�° ������ ����
	 * @param mul ������ x�� y �� ������ ���� �����ϴ� ����
	 * */
	
	public static void main(String[] args) {
		int x, y, mul = 1;
		char ch = 'A';
		String msg;
		
		x = 5; y = 10;
		msg = "���� ������";
		
		mul = mul(x,y);
		System.out.println(ch);
		System.out.println(msg);
		System.out.println(x + " * " + y + " = " + mul);
	}
	
	public static int mul(int x, int y) {
		return x * y;
	}
}
