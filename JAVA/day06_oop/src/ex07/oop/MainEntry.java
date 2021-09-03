package ex07.oop;

public class MainEntry {

	public static void main(String[] args) {
		Point pt = new Point();
		pt.display();
		pt.setX(1);
		pt.setY(2);
		pt.display();
		
		Circle c = new Circle();
		c.setR(5);
		c.setX(1231);
		c.setY(3412);
		
		c.display();
		
		Rectangle rec = new Rectangle();
		rec.setX1(2);
		rec.setY1(2);
		rec.setX2(4);
		rec.setY2(4);
		
		rec.display();
	}
}
