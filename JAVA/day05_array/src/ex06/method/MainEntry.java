package ex06.method;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("main start");
		line();
		printName("YEJI");
		plus(1, 3);
		System.out.println("max method return : " + max(4,5));
		System.out.println("main end");
	}

	public static void line() {
		System.out.println("====================");
	}

	public static void printName(String name) {
		System.out.println("name is : " + name);
	}

	public static void plus(int x, int y) {
		int sum = x + y;
		System.out.println(x + " + " + y + " = " + sum);
	}

	public static int max(int x, int y) {

		return (x > y) ? x : y;
	}
}
