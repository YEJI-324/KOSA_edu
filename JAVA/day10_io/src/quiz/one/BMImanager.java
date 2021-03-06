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
			System.out.println("??1?κ³ κ°μ λ³΄μΆκ°? \t??2?κ³ κ°μ λ³΄μΆ? ₯ \t??3?κ³ κ°μ λ³? ?­?  \t??4?μ’λ£?");
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
				System.out.println("μ’λ£?κ² μ΅??€");
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
			
			System.out.println(number + " : " + "?±?¨ : " + name + "\tλͺΈλ¬΄κ²? : " + wei + "\t?€ : " + hei + "λΉλ§?¨ : " + sum);
		}
	}
	private static void delete() throws IOException {
		System.out.println("?­? ??€ ?Έ?±?€λ²νΈλ₯? ?? ₯?΄μ£ΌμΈ?.");
		int num = br.read();
		if(map.containsKey(num)) {
			map.remove(num);
			System.out.println("?­? ???΅??€.");
		} else {
			System.out.println("κ³ κ°? ?Έ?±?€λ²νΈλ₯? ?λͺ? ?? ₯??¨?΅??€.");
		}
	}
}