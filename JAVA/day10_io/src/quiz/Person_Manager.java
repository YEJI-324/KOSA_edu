package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Person_Manager extends Person_Info {
	static HashMap<String, Person_Info> PersonData = new HashMap<String, Person_Info>();
	static int nNameCnt = 0;

	public static void Add() {
		System.out.print("?´ë¦„ì„ ?…? ¥ ?•˜?„¸?š”:");
		String strname = new Scanner(System.in).next();
		System.out.print("ëª¸ë¬´ê²?: ");
		String strKg = new Scanner(System.in).next();

		System.out.print("?‚¤: ");
		String strHigth = new Scanner(System.in).next();

		System.out.print("?„±ë³? :1.?‚¨? 2.?—¬?");
		int nSex = new Scanner(System.in).nextInt();

		if (!PersonData.containsValue(strname)) {
			PersonData.put(strname, new Person_Info(strKg, strHigth, nSex));
		} else {
			// ì¤‘ë³µ?œ ?´ë¦„ì´ ?ˆ?‹¤ë©?
			nNameCnt++;
			String str = strname + nNameCnt;

			PersonData.put(str, new Person_Info(strKg, strHigth, nSex));
		}
	}

	public void Del() {
		System.out.print("?‚­? œ?•  ?šŒ?›?˜ ?´ë¦„ì„ ?…? ¥?•˜?„¸?š”: ");
		String strName = new Scanner(System.in).next();
		if (PersonData.containsKey(strName)) {
			PersonData.remove(strName);
			System.out.println(strName + " ?‹˜?˜ ? •ë³´ê? ?‚­? œ ?˜?—ˆ?Šµ?‹ˆ?‹¤.");
		} else {
			System.out.println("?šŒ?›?„ ì°¾ì„?ˆ˜ê°? ?—†?Šµ?‹ˆ?‹¤. ");
		}
	}

	public void PrintALL() {
		System.out.println("============  ?šŒ?›? •ë³? =============== ");
		Set<String> set = PersonData.keySet();
		for (String data : set) {
			System.out.printf("?´ë¦?: %s \n ëª¸ë¬´ê²?: %s  ?‚¤: %s  ?„±ë³?: %s BMI: %.2f ë¹„ë§Œ?„ : %s\n", data, PersonData.get(data).strKg,
					PersonData.get(data).strHight, ((PersonData.get(data).nSex == 1) ? "?‚¨" : "?—¬"),
					PersonData.get(data).fResultBMI, PersonData.get(data).strBMI);
			System.out.println("======================================");
		}

	}

	public void PrintSell() {
		System.out.print("?™•?¸?•  ?šŒ?› ?´ë¦„ì„ ? ?œ¼?„¸?š”:");

		String strName = new Scanner(System.in).next();

		if (PersonData.containsKey(strName)) {
			System.out.println("============  ?šŒ?›? •ë³? =============== ");
			System.out.printf("?´ë¦?: %s \nëª¸ë¬´ê²?: %s,  ?‚¤: %s,  ?„±ë³?: %s, BMI: %.2f, ë¹„ë§Œ?„: %s\n", strName,
					PersonData.get(strName).strKg, PersonData.get(strName).strHight,
					((PersonData.get(strName).nSex == 1) ? "?‚¨" : "?—¬"), PersonData.get(strName).fResultBMI,
					PersonData.get(strName).strBMI);
			System.out.println("======================================");
		}

	}

	public void Save() {
		try {
			OutputStream os = new FileOutputStream("BMI_Info.txt");
			String strSave;
			int nPersonCnt = 0;
			Set<String> set = PersonData.keySet();
			for (String data : set) {
				strSave = "?´ë¦?: " + data + ",ëª¸ë¬´ê²?: " + PersonData.get(data).strKg + " ?‚¤:" + PersonData.get(data).strHight
						+ " ?„±ë³?: " + ((PersonData.get(data).nSex == 1) ? "?‚¨" : "?—¬") + " BMI:"
						+ PersonData.get(data).fResultBMI + " ë¹„ë§Œ?„ :" + PersonData.get(data).strBMI + "\r\n";

				os.write(strSave.getBytes());
				strSave = "======================================\r\n";
				os.write(strSave.getBytes());
			}
			System.out.println("???¥ ?™„ë£?");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void Eixt() {
		System.out.println("See You!!!");
		System.exit(0);
	}
}
