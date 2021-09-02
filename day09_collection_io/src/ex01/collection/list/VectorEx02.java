package ex01.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx02 {
	public static void main(String[] args) {
		Vector v = new Vector(3, 5);
		
		v.addElement("자바");
		v.addElement(new Double(10.2));
		
		Date date = new Date();
		v.addElement(date);
		
		for(int i = 0;i<10;i++) {
			v.addElement(new Integer(i));
		}
		
		System.out.println("------- Vector 내용 출력 --------");
		Enumeration enu = v.elements();
		
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + " ");
		}
		System.out.println();
		
		System.out.println("-------- 객체 내용 포함 확인 ---------");
		if (v.contains("자바")) System.out.println("자바 객체 있음 ");
		else System.out.println("자바 객체 없다");
		
		System.out.println("10.2 객체 위치? : " + v.indexOf(new Double(10.2)));
		System.out.println("입력 시간 : " + date);
		
		v.removeElementAt(v.lastIndexOf(date));
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		System.out.println(v);
		
		for (int i = 0; i < v.size(); i++) { // 데이터 삭제
//			v.removeElementAt(i);
//			v.remove(0);
//			v.removeAllElements(); // 전체 삭제
			v.remove(10.2); // 객체 이름으로 삭제
			v.remove("자바");
		}
		System.out.println(v);
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());

		for(int i = 0;i<v.size();i++) {
			System.out.print(v.get(i) + "\t");
		}
		System.out.println();
		v.setElementAt("java", 2);
		for(int i = 0;i<v.size();i++) {
			System.out.print(v.get(i) + "\t");
		}
		
	}
}
