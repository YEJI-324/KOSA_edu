package ex01.objectClass;

class Rectangle{
	int x,y; // int : 0, double : 0.0, String : NULL 로 초기화
	
	public Rectangle() {
		x = y = 10;
	}
	
	public void display() {
		System.out.println(x + ", " + y);
	}

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
	
//	public String toString() {
//		return x + ", " + y;
//	}
}

public class ToStringMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.display();
		System.out.println(r); // 해당 객체의 메모리 위치 출력
		System.out.printf("메모리 위치값(10진수) : %d\n", 0x123a439b);
	}
}
