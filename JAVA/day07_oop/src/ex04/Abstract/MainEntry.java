package ex04.Abstract;

public class MainEntry {

	public static void main(String[] args) {
		// 1. 각 클래스로 객체 생성
		Circle c = new Circle();
		c.show("원");
		
		Rectangle r = new Rectangle();
		r.show("사각혁");
		
		Triangle t = new Triangle();
		t.show("삼각혁");
		
		System.out.println("=======================");
		
		// 2. Shape 부모 추상 클래스를 이용해서 객체 생성.
		Shape s = new Circle();
		s.show("circle");
		
		s = new Rectangle();
		s.show("Rectangle");
		
		s = new Triangle();
		s.show("Triangle");	
		
		System.out.println("=======================");
		
		// 3.
		Shape[] ss = new Shape[3];
		ss[0] = new Circle();
		ss[1] = new Rectangle();
		ss[2] = new Triangle();
		String[] name = {"Circle", "Rectangle", "Triangle"};
		
		for(int i = 0;i<ss.length;i++) {
			ss[i].show(name[i]);
		}
		
//		Shape s = new Circle(); // 다형성 구현
//		s.show("Circle");
	}
}
