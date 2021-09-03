package ex04.Abstract;

public abstract class Shape {
	protected double result = 0.0; // 접근 지정자 쓰지 않으면 default가 기본 접근 지정자
	public abstract double calc(double x);
	public abstract void show(String name);
	
	public void view() {
		System.out.println("Super class Shape");
	}
}
