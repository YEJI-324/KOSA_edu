package ex09.api;

// Object class is the root of the class hierarchy.

class Point{
	
}

public class MainEntry {
	public static void main(String[] args) {
		Point pt1 = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt1.getClass());
		System.out.println("hash code : " + pt1.hashCode()); //10���� 2111991224
		System.out.println("Object String(toString()) : " + pt1.toString());
		System.out.println("Object String(toString ����) : " + pt1); //16���� 7de26db8
		
		// ����
		//System.out.printf("10���� %d\n", 0x7de26db8); // 0x-16����, 0-8����
		
		System.out.println("===================================");
		
		Point pt2 = new Point();
		System.out.println("Point pt2 information");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2.hashCode()); //10���� 2111991224
		System.out.println("Object String(toString()) : " + pt2.toString());
		
		System.out.println("===================================");
				
		System.out.println("pt2.toString : toString()�� �ǹ�");
		System.out.println(pt2.getClass().getName() + '@' + Integer.toHexString(pt2.hashCode()));
	
		System.out.println("===================================");
		
		Point pt3 = new Point();
			if(pt1.hashCode() == pt3.hashCode()) {
			System.out.println("����.");
		} else {
			System.out.println("�ٸ���.");
		}
		
		Point pt4;
		pt4 = pt1;
		if(pt1.hashCode() == pt4.hashCode()) {
			System.out.println("����.");
		} else {
			System.out.println("�ٸ���.");
		}	
	}
}
