package ex03.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();
		map.put("예지", 100);
		map.put("안녕", 90);
		map.put("와우", 88);
		map.put("치킨", 60);
		map.put("수프", 70);
		
//		Set set = map.entrySet();
//		Iterator it = set.iterator();
		
		Iterator it = map.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("name : " + e.getKey() + ", score : " + e.getValue());
		}
		
		Set set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i;
		}
		System.out.println("total score : " + total);
		System.out.println("avg score : " + total/set.size());
		System.out.println("max score : " + Collections.max(values));
		System.out.println("min score : " + Collections.min(values));
	}
}
