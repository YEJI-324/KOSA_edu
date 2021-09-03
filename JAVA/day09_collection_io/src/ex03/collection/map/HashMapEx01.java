package ex03.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx01 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("kosa", "123");
		map.put("number", "1234");
		map.put("sbs", "hi");
		map.put("kosa1", "123");
		
		System.out.println("number of elements : " + map.size());
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password 입력하세요. ");
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			System.out.print("pw : ");
			String pw = sc.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 시 입력해주세요.");
				continue;
			}
			else {
				if(!map.get(id).equals(pw)) {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				else {
					System.out.println(id + "와 " + pw + "가 일치합니다.");
					break;
				}
			}
		}
	}
}
