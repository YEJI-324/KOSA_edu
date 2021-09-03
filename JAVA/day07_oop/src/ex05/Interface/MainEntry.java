package ex05.Interface;

interface A { // interface - abstract method + final field
	int x = 99; // final static int x = 99; 와 같음
	final int y = 777;
	char ch = 'A';

	// abstract method에서 abstract 생략가능 - 무조건 추상메소드임.
	public void show();

	public abstract void disp();
}

interface B {
	void bView();
}

interface C {
	String name = "happy";

	public void cDraw();
}

// interface 간에도 상속 가능 extends 키워드 사용.
interface D extends B {
	void dView();
}

class Circle implements C{
	@Override
	public void cDraw() {
		
	}
}

class Rect implements D {

	@Override
	public void bView() { // from B interface

	}

	@Override
	public void dView() { // from D interface

	}

	public int plus(int x, int y) {
		return x + y;
	}
}

// 다중 구현
class Shape {

}

class Multi extends Shape implements B,C,A{
//class Multi implements B, C, A extends Shape { 클래스가 상속과 구현을 모두할 때, extends를 먼저 해야한다. 클래스 상속받은 뒤 인터페이스 구현하기. 

	@Override
	public void show() {
		System.out.println(x);
//		x = 8; interface는 final이기 때문에 값을 변경할 수 없다.	
	}

	@Override
	public void disp() {
		System.out.println("A interface");
	}

	@Override
	public void bView() {
		System.out.println("B interface");
	}

	@Override
	public void cDraw() {
		System.out.println("C interface");
	}

}

public class MainEntry {

	public static void main(String[] args) {
		B b = new Multi();
		b.bView(); // interface B

		A a = new Multi();
		a.disp(); // interface A

		Multi m = new Multi();
		m.cDraw(); // interface C
		m.bView(); // interface B
		m.disp(); // interface A
		
		Circle c = new Circle();
		c.cDraw();
	}
}
