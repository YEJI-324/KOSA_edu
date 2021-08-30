package ex08.inheritance;

class Point{
	protected int x, y; //: Point 클래스를 상속하는 클래스에서 멤버변수에 접근 가능.
	
	public Point() {
		x = y = 10;
	}

	public Point(int x) {
		this.x = x;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void display() {
		System.out.println("x = " + x + ", y = " + y);
	}
}

class Circle extends Point {
	private int r;
	
	public Circle() {
		super();
		this.r = 10;
	}
	
	public Circle(int x, int y ) {
		super(x, y);
		r = 5;
	}
	
	public Circle(int r) {
		this.r = r;
	}
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}
	
	public void display() {
//		System.out.println("x = " + super.x + ", y = " + super.x + ", r = " + r);
		super.display();
		System.out.println("r = " + r);
	}
}

class Rectangle extends Point{
	int x2, y2;
	
	public Rectangle() {
		super();
	}

	public Rectangle(int x, int y) {
		super(x, y);
	}

	public Rectangle(int x) {
		super(x);
	}
	
	public Rectangle(int x, int y, int x2, int y2) {
		super(x, y);
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public void display() {
		super.display();
		System.out.println("x2 = " + x2 + ", y2 = " + y2);
	}
	
}

public class MainEntry {
	public static void main(String[] args) {
//		Point pt = new Point(1,2);
//		pt.display();
		
//		Circle c = new Circle();
//		c.display();
		
		Rectangle rec = new Rectangle(1,2,3,4);
		rec.display();
	}
}
