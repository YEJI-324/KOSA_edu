package quiz;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Person_Manager pm = new Person_Manager();

		while (true) {
			System.out.println("1.추�? 2.?��?�� 3.?��체회?��?��보보�? 4.?��?��?��?��?��?��보보�? 5.???�� 6.종료");
			int nInput = new Scanner(System.in).nextInt();
			switch (nInput) {
			case 1:
				pm.Add();
				break;
			case 2:
				pm.Del();
				break;
			case 3:
				pm.PrintALL();
				break;
			case 4:
				pm.PrintSell();
				break;
			case 5:
				pm.Save();
				break;
			case 6:
				pm.Eixt();
				break;
			}
		}

	}
}
