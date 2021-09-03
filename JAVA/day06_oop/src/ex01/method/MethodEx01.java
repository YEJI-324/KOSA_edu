package ex01.method;

//overload method
public class MethodEx01 {

	public static void main(String[] args) {
		line();
		line("*");
		line(30, "@");
	}
	
	public static void line() {
		System.out.println("=========================");
	}
	
	public static void line(String string) {
		for (int i = 0; i < 25; i++) {
			System.out.print(string);
		}
		System.out.println();
	}

	public static void line(int n, String str) {
		for(int i = 0; i<n;i++) {
			System.out.print(str);
		}
		System.out.println();
	}
}
