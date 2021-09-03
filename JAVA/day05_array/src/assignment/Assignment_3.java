package assignment;

public class Assignment_3 {

	public static void main(String[] args) {
		int[] a = { 7, 5, 7, 8, 2, 7, 3, 7, 7, 90 };
		int seek = 7;
		
		int cnt = 0;
		
		for(int i = 0;i<a.length;i++) {
			if(seek== a[i]) cnt++;
		}
		
		System.out.println(seek+"는 "+ cnt+"개");
	}
}
