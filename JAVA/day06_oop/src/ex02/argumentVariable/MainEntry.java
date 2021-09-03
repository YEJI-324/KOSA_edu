package ex02.argumentVariable;

// 가변길이 배열 : 배열의 자료형은 같아야함.
public class MainEntry {
	
	public static void main(String[] args) {
		plus(1,2);
		plus(3);
		plus(10,22,40,4,5,6); // overload로 이 함수들을 다 구현하는 것 보다 메서드를 하나만 만들 수 있다.
		
		int sum = plus1(1,2,3);
		System.out.println("return type : " + sum);
		
		String str = plus2("123", "abc", "ㄱㄴㄷ");
		System.out.println(str);
	}
	
	public static void plus(int...x) {
		int sum = 0;
		for(int i = 0;i<x.length;i++) {
			sum += x[i];
			System.out.print(x[i] + " ");
		}
		System.out.println(" -> " + sum);
	}
	
	public static void plus(String...strs) {
		//문자열
		String sum = "";
		for(int i = 0;i<strs.length;i++) {
			System.out.println(strs[i]+ " ");
			sum += strs[i] + " ";
		}
	}
	
	// return type 형태로도 구현
	// 호출한 곳에서 결과값 다뤄야함.
	public static int plus1(int...x) {
		int sum = 0;
		for(int i = 0;i<x.length;i++) {
			sum += x[i];
		}
		return sum;
	}
	
	public static String plus2(String...strs) {
		//문자열
		String sum = "";
		for(int i = 0;i<strs.length;i++) {
			sum += strs[i] + " ";
		}
		return sum;
	}
}
