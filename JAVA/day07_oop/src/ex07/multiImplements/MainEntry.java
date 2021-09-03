package ex07.multiImplements;

import ex04.Abstract.Shape;

public class MainEntry {
	public static void main(String[] args) {
		MultiClass mc = new MultiClass();
		mc.draw();
		System.out.println(mc.calc(12.34));
		mc.tView();
		mc.view();
		
		System.out.println("=========================");
		Shape s = new MultiClass();
		System.out.println(s.calc(12.34));
		s.view();

		System.out.println("=========================");
		Test t = new MultiClass();
		t.tView();
	}
}
