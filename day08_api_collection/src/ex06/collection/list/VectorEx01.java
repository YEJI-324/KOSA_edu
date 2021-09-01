package ex06.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx01 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		System.out.println("length : " + v1.size() + " , capacity : " + v1.capacity());
		
		Vector<Integer> v2 = new Vector<Integer>(3,4); // 초기용량, 증가용량
		v2.add(2);
		v2.add(new Integer(333));
		v2.add(3);
		v2.add(89);
		v2.add(57);
		v2.add(213);
		v2.add(241);
		v2.add(21);
		
		System.out.println("length : " + v2.size() + " , capacity : " + v2.capacity());
		System.out.println(v2);
		
		System.out.println("======== iterator() =========");
		Iterator it = v2.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		
		System.out.println("\n======== get() =========");
		for(int i = 0;i<v2.size();i++) {
			System.out.print(v2.get(i) + "\t");
		}
		
		System.out.println("\n======== sort result =========");
		Collections.sort(v2); // 정렬
		for(int i = 0;i<v2.size();i++) {
			System.out.print(v2.get(i) + "\t");
		}
		
		System.out.println("\n======== elementAt() method =========");
		for(int i = 0;i<v2.size();i++) {
			Integer num = v2.elementAt(i);
			System.out.print(num + "\t");
		}
		
		System.out.println("\n======== trimToSize() method =========");
		v2.trimToSize(); // capacity 조정하기
		System.out.print(v2.size() + "\t" + v2.capacity());
	}
}
