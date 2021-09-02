package assignment;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//  Video 추가 / 삭제 / Video리스트 출력 / 수정 / 프로그램 종료
public class Main {

	static HashMap videolist = new HashMap();

	public static void main(String[] args) {

		int command = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("메뉴 선택");
			System.out.print("1. 비디오 추가\t2. 비디오 삭제\t3. 비디오 목록 보기\t4. 비디오 수정\t5. 종료\t");
			command = sc.nextInt();

			if (command == 1) {
				// 추가
				System.out.println("비디오를 추가합니다.");
				System.out.print("비디오 제목 : ");
				String title = sc.next();

				System.out.print("비디오 장르 : ");
				String category = sc.next();

				System.out.print("대출여부(y/n) : ");
				String islend = sc.next();

				if (islend.equals("y")) {
					System.out.print("대여자 : ");
					String lendName = sc.next();

					Date lendDate = new Date();

					addVideo(title, category, lendName, lendDate);
				} else if (islend.equals("n"))
					addVideo(title, category);
				System.out.println("추가완료");
			} else if (command == 2) {
				// 삭제
			} else if (command == 3) {
				// 출력
				printVideoList();
			} else if (command == 4) {
				// 수정
			} else if (command == 5) {
				System.out.println("프로그램 종료");
				break;
			} else
				System.out.println("메뉴 중에서 골라주세요.");
		}
	}

	private static void addCategory(String category) {
		if (!videolist.containsKey(category)) {
			videolist.put(category, new HashMap());
		}
	}

	private static void addVideo(String title, String category) {
		addCategory(category);
		HashMap video = (HashMap) videolist.get(category);
		video.put(title, new Video(title));
	}

	private static void addVideo(String title, String category, String lendName, Date lendDate) {
		addCategory(category);
		HashMap video = (HashMap) videolist.get(category);
		video.put(title, new Video(title, lendName, lendDate));
	}

	private static void printVideoList() {
		// TODO Auto-generated method stub
		Iterator it = videolist.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();

			Set subSet = ((HashMap) e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			System.out.println(" * 장르 : " + e.getKey() + " [" + subSet.size() + "편]");
			
			while (subIt.hasNext()) {
				System.out.println(subIt.next().toString());
			}
		}
	}
}
