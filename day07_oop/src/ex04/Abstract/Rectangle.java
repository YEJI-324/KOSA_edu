package ex04.Abstract;

public class Rectangle extends Shape {
	int w = 100;
	
	@Override
	public double calc(double x) {
		result = w * x;
		return result;
	}

	@Override
	public void show(String name) {
		calc(50.0);
		System.out.println(result + " 크기의 " + name + "이 그려졌습니다.");
	}

}
