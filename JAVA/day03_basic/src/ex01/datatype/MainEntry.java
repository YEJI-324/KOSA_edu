package ex01.datatype;

public class MainEntry {
	public static void main(String[] args) {
		short sh = 100;
		int iNum = -32769;
		
		double d = 12.34;
		float f = 12.34f;
		
//		iNum = sh;
		sh = (short)iNum;
		
		System.out.println(sh);		
		System.out.println(iNum);
	}
}
