package ex07.multiImplements;

import ex04.Abstract.Shape;
import ex06.Interface.IDraw;

public class MultiClass extends Shape 
						implements IDraw, Test {

	@Override
	public void tView() {
		System.out.println("Test interface");
	}

	@Override
	public void draw() {
		System.out.println("IDraw interface");
	}

	@Override
	public double calc(double x) {
		System.out.println("Shape class");
		return 5.5;
	}

	@Override
	public void show(String name) {
		System.out.println("Shape class");
	}

}
