package ex04.Abstract;

public class MainEntry {

	public static void main(String[] args) {
		// 1. �� Ŭ������ ��ü ����
		Circle c = new Circle();
		c.show("��");
		
		Rectangle r = new Rectangle();
		r.show("�簢��");
		
		Triangle t = new Triangle();
		t.show("�ﰢ��");
		
		System.out.println("=======================");
		
		// 2. Shape �θ� �߻� Ŭ������ �̿��ؼ� ��ü ����.
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
		
//		Shape s = new Circle(); // ������ ����
//		s.show("Circle");
	}
}
