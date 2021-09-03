package ex05.Interface;

interface A { // interface - abstract method + final field
	int x = 99; // final static int x = 99; �� ����
	final int y = 777;
	char ch = 'A';

	// abstract method���� abstract �������� - ������ �߻�޼ҵ���.
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

// interface ������ ��� ���� extends Ű���� ���.
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

// ���� ����
class Shape {

}

class Multi extends Shape implements B,C,A{
//class Multi implements B, C, A extends Shape { Ŭ������ ��Ӱ� ������ ����� ��, extends�� ���� �ؾ��Ѵ�. Ŭ���� ��ӹ��� �� �������̽� �����ϱ�. 

	@Override
	public void show() {
		System.out.println(x);
//		x = 8; interface�� final�̱� ������ ���� ������ �� ����.	
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
