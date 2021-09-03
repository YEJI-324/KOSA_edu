package quiz.one;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class BMImanager extends BMI {  //
	
	static HashMap<Integer, BMI> map = new HashMap<Integer , BMI>();
	static int top = 1;
	
	public static void main(String[] args) throws IOException {
		BMImanager bi = new BMImanager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("??1?‹ê³ ê°ì •ë³´ì¶”ê°? \t??2?‹ê³ ê°ì •ë³´ì¶œ? ¥ \t??3?‹ê³ ê°ì •ë³? ?‚­? œ \t??4?‹ì¢…ë£?");
			switch(sc.nextInt()) {
			case 1:
				add();
				break;
			case 2:
				print();
				break;
			case 3:
				delete();
				break;
			case 4:
				System.out.println("ì¢…ë£Œ?•˜ê² ìŠµ?‹ˆ?‹¤");
				System.exit(0);
				break;
			}
		}
	}
	private static void add() throws IOException {
		BMI bmi = new BMI();
		map.put(top, BMI.input(bmi));
		top++;
	}
	private static void print() {
		Set<Integer>set = map.keySet();
		
		for(Integer number : set) {
			String name = map.get(number).name;
			String weight = map.get(number).weight;
			int wei = Integer.parseInt(weight);
			String height = map.get(number).height;
			int hei = Integer.parseInt(height);
			double sum = wei / ( (hei  / 100.0)  * (hei / 100.0) ) ;
			
			System.out.println(number + " : " + "?„±?•¨ : " + name + "\tëª¸ë¬´ê²? : " + wei + "\t?‚¤ : " + hei + "ë¹„ë§Œ?œ¨ : " + sum);
		}
	}
	private static void delete() throws IOException {
		System.out.println("?‚­? œ?•˜?‹¤ ?¸?±?Š¤ë²ˆí˜¸ë¥? ?…? ¥?•´ì£¼ì„¸?š”.");
		int num = br.read();
		if(map.containsKey(num)) {
			map.remove(num);
			System.out.println("?‚­? œ?˜?—ˆ?Šµ?‹ˆ?‹¤.");
		} else {
			System.out.println("ê³ ê°?˜ ?¸?±?Š¤ë²ˆí˜¸ë¥? ?˜ëª? ?…? ¥?•˜?…¨?Šµ?‹ˆ?‹¤.");
		}
	}
}