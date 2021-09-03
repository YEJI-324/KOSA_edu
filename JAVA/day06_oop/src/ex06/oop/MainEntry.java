package ex06.oop;

// 접근 지정자 : private < default < protected < public
class Point{
	private int x, y; // member variable
	
//	public void setXY(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
	
	// constructor
	public Point() { 
//		x = 100; y = 100;	
		this(10, 20);
	} // 매개변수 없는 생성자 함수 - default constructor
	public Point(int x) {
//		this.x = x;
//		y = 999;
		this(x, 999);
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) { this.x = x;}
	public int getX() { return x;}
	
	public void setY(int y) { this.y = y;}
	public int getY() { return y;}
	
	public void display() {
		System.out.println(getX() + ", " + getY());
	}
}

public class MainEntry {
	public static void main(String[] args) { // 메인 클래스에 주로 public
		Point pt = new Point();
		pt.display();
		
		Point pt2 = new Point(10);
		pt2.display();
	}
}
