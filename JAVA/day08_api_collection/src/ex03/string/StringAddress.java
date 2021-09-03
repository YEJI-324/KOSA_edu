package ex03.string;

public class StringAddress {
	public static void main(String[] args) {
		String s1 = new String("korea");
		String s2 = new String("korea");
		
		System.out.println(s1 + ",  " + s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String s3 = "korea";
		System.out.println(s3.hashCode());
	}
}
