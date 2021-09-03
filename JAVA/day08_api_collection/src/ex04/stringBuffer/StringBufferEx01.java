package ex04.stringBuffer;

public class StringBufferEx01 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.hashCode());
		
		int len = sb.length();
		int size = sb.capacity();
		System.out.println("length : " + len + "\t capacity : " + size);
		
		sb.append("kosa");
		len = sb.length();
		size = sb.capacity();
		System.out.println("length : " + len + "\t capacity : " + size);
		
		sb.append("kosa");
		len = sb.length();
		size = sb.capacity();
		System.out.println("length : " + len + "\t capacity : " + size);

		sb.append("kosa kosa kosa kosa");
		len = sb.length();
		size = sb.capacity();
		System.out.println("length : " + len + "\t capacity : " + size);

		sb.append("dkssudgktpdy sksms dPwl~~~~~~~~~~~~~~~~~~");
		len = sb.length();
		size = sb.capacity();
		System.out.println("length : " + len + "\t capacity : " + size);
		System.out.println(sb.hashCode());
		
		sb.trimToSize(); // 용량 크기 조절해줌.
		len = sb.length();
		size = sb.capacity();
		System.out.println("length : " + len + "\t capacity : " + size);
		
	}
}
