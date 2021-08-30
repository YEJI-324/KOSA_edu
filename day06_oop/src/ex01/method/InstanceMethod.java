package ex01.method;

class B{
	int x, y;
	
	// instance method
	public void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
}

public class InstanceMethod {
	public static void main(String[] args) {
		B b = new B();
		
		b.setData(324,435);
	}
}
