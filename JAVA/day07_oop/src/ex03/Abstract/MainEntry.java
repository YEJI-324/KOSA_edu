package ex03.Abstract;

abstract class Shape{
	double result = 0;
	public abstract double calc(); // �߻� �޼ҵ�
	public abstract void draw();
	
	public void show() { // �Ϲ� �޼ҵ�
		System.out.println("supper class shape");
	}
}

class Circle extends Shape{

	double r = 5.0;
	
	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("���� ���� :" + result + " �� ���� �׷Ƚ��ϴ�.");
		
	}
	
}

class Triangle extends Shape { // Sub class
	int w = 10, h = 20;
	
	@Override
	public double calc() {
		result = (w*h)/2;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("�ﰢ���� ���� : " + result+" �� �ﰢ���� �׷Ƚ��ϴ�.");
	}
	
}

class Rectangle extends Shape{
	int w = 10, h = 5;
	
	@Override
	public double calc() {
		result = w * h;
		return result;
	}
	
	@Override
	public void draw() {
		calc();
		System.out.println("�簢���� ���� : " + result + " �� �簢���� �׷Ƚ��ϴ�.");
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		
		Triangle t = new Triangle();
		t.draw();
		
		Rectangle r = new Rectangle();
		r.draw();
	}
}
