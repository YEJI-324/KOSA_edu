package ex01.java.aop;

public class MainEntry {
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.add(1, 2));
		System.out.println(c.mul(1, 2));
	}
}
