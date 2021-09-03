package ex06.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet();
		
		hs.add("키보드");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("java");
		hs.add("키보드");
		
		System.out.println("요소 개수 : " + hs.size());
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("===================");
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(100);
		hs2.add(200);
		hs2.add(40);
		hs2.add(567);
//		hs2.add("string"); // 타입이 안맞으면 에러
		hs2.add(new Integer(1000));
		
		it = hs2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("---------------");
		for (Integer item : hs2) {
			System.out.println(item);
			
		}
		
		System.out.println(hs);
	}
}
