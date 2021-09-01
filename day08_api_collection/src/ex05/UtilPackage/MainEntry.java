package ex05.UtilPackage;

import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class MainEntry {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();

		System.out.print(c.get(Calendar.YEAR) + "년 ");
		System.out.print((c.get(Calendar.MONTH) + 1) + "월 ");
		System.out.println(c.get(Calendar.DATE) + "일");

		System.out.println("======================");
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.println("현재시간은 " + h + ":" + m + ":" + s);
		
		StringTokenizer st = new StringTokenizer("안녕하세요~~ 안녕 안녕");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
