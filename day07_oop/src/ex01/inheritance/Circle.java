package ex01.inheritance;

public class Circle extends Point {

	private int r;

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	public Circle(int r) {
		super();
		this.r = r;
	}

	public Circle() {
		super();
	}

	public Circle(int x, int y) {
		super(x, y);
		this.r = 10;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}
	
	public void disp() {
		super.disp();
		System.out.print(", " + r);
	}
	
}
