package ex03.string;

public class StringMethod {
	public static void main(String[] args) {
		// 앞에 s1~날라감 ㅎㅋ
		
		String s1 = "yeji";
		String s2 = "SEOUL";
		
		String s6 = "123456789def 324565 asgads string";
		char ch = s6.charAt(10);
		System.out.println(ch);
		
		System.out.println("소문자 출력 toLowerCase() : " + s2.toLowerCase());
		System.out.println("대문자 출력 toUpperCase() : " + s1.toUpperCase());
		
		System.out.println(s1.length());
		char[] ch2 = s1.toCharArray();
		for(int i = 0;i<ch2.length;i++) {
			System.out.print(ch2[i]+"\t");
		}
		
	}
}
