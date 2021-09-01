package ex02.wraper;

class Point {}

public class MainEntry {
	public static void main(String[] args) {
		Integer iA = new Integer(10);
		Integer iB = new Integer("10");
		
		String num = "30";
		Point pt = new Point();
		
		
		System.out.println(iA.MAX_VALUE);
		System.out.println(iA.MIN_VALUE);
		
		System.out.println(pt);
		System.out.println(pt.toString());
		System.out.println(iA);
		System.out.println(iA.getClass().getName()+'@'+Integer.toHexString(iA.hashCode()));
		
		int x = 77;
		double y = 5.5;
		System.out.println(x + ", " + y);
		x = (int)y;
		System.out.println(x + ", " + y);
		
		// Boxing vs UnBoxing
		int c = iA.intValue(); // jdk 4.x 이전에 사용하던 메소드
		int d = iB; // jdk 5.x 이후로부터 autoboxing, unboxing
		int num2 = Integer.parseInt(num);
		
		System.out.println(c + num2);
		System.out.println(c+d);
		
		int e = Integer.parseInt("123");
		int f = Integer.parseInt("1111111", 2);
		
		System.out.println(e+20);
		System.out.println(f);
		
		
	}
}
