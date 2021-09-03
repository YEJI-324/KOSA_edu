package ex01.basic;

public class HelloJava {

	public static void main(String[] args) { // 메인함수 : 컴파일러 시작점(진입점)
		// 순차적으로 위 -> 아래 / 좌 -> 우 읽어감
		System.out.println("hello java");
		System.out.println(123);
		System.out.println("자동완성 간지~");
		System.out.printf("%d %c %s %.2f\n", 30, 'A', "string", 0.23);
	}

}