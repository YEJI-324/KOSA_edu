package ex03.Abstract;

abstract class Shape{
	double result = 0;
	public abstract double calc(); // 추상 메소드
	public abstract void draw();
	
	public void show() { // 일반 메소드
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
		System.out.println("원의 넓이 :" + result + " 인 원을 그렸습니다.");
		
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
		System.out.println("삼각형의 넓이 : " + result+" 인 삼각형을 그렸습니다.");
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
		System.out.println("사각형의 넓이 : " + result + " 인 사각형을 그렸습니다.");
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
