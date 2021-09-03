package ex03.string;

// String : 불변객체
public class MainEntry {
	public static void main(String[] args) {
		Integer x = 999;
		String str = "abc";
		System.out.println(x + " , " + str);
		System.out.println(str.hashCode());
		System.out.println("x = " + x + " , x ad : " + x.hashCode());
		
		char data[] = { 'a', 'b', 'c'};
		str = new String(data);
		System.out.println(str);
		System.out.println(str.hashCode());
		
		str = "korea";
		System.out.println(str);
		System.out.println(str.hashCode());
		
		str = "seoul";
		System.out.println(str);
		System.out.println(str.hashCode());
		
	}
}
