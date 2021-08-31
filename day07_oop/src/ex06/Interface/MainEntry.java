package ex06.Interface;

public class MainEntry {
	public static void main(String[] args) {
		BB b = new BB();
		b.draw();
		
		System.out.println(b.num);
		
		IDraw i = new BB();
		i.draw();
		System.out.println(i.num);
	}
}
