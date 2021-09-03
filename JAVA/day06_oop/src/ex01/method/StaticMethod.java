package ex01.method;

class A{
	int x, y;
	public static void setData(int xx, int yy) {
		System.out.println(xx + ", "+ yy);
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		A.setData(23,34); // static method 이므로 A 객체 생성없이 호출 가능
	
		A a = new A(); // A 객체 생성.
		a.setData(32,54);
		a.x = 35; // 클래스의 멤버 변수에 직접 접근 할 수 있지만 권장 x
	}
}
