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
		System.out.print("?��름을 ?��?�� ?��?��?��:");
		String strname = new Scanner(System.in).next();
		System.out.print("몸무�?: ");
		String strKg = new Scanner(System.in).next();

		System.out.print("?��: ");
		String strHigth = new Scanner(System.in).next();

		System.out.print("?���? :1.?��?�� 2.?��?��");
		int nSex = new Scanner(System.in).nextInt();

		if (!PersonData.containsValue(strname)) {
			PersonData.put(strname, new Person_Info(strKg, strHigth, nSex));
		} else {
			// 중복?�� ?��름이 ?��?���?
			nNameCnt++;
			String str = strname + nNameCnt;

			PersonData.put(str, new Person_Info(strKg, strHigth, nSex));
		}
	}

	public void Del() {
		System.out.print("?��?��?�� ?��?��?�� ?��름을 ?��?��?��?��?��: ");
		String strName = new Scanner(System.in).next();
		if (PersonData.containsKey(strName)) {
			PersonData.remove(strName);
			System.out.println(strName + " ?��?�� ?��보�? ?��?�� ?��?��?��?��?��.");
		} else {
			System.out.println("?��?��?�� 찾을?���? ?��?��?��?��. ");
		}
	}

	public void PrintALL() {
		System.out.println("============  ?��?��?���? =============== ");
		Set<String> set = PersonData.keySet();
		for (String data : set) {
			System.out.printf("?���?: %s \n 몸무�?: %s  ?��: %s  ?���?: %s BMI: %.2f 비만?�� : %s\n", data, PersonData.get(data).strKg,
					PersonData.get(data).strHight, ((PersonData.get(data).nSex == 1) ? "?��" : "?��"),
					PersonData.get(data).fResultBMI, PersonData.get(data).strBMI);
			System.out.println("======================================");
		}

	}

	public void PrintSell() {
		System.out.print("?��?��?�� ?��?�� ?��름을 ?��?��?��?��:");

		String strName = new Scanner(System.in).next();

		if (PersonData.containsKey(strName)) {
			System.out.println("============  ?��?��?���? =============== ");
			System.out.printf("?���?: %s \n몸무�?: %s,  ?��: %s,  ?���?: %s, BMI: %.2f, 비만?��: %s\n", strName,
					PersonData.get(strName).strKg, PersonData.get(strName).strHight,
					((PersonData.get(strName).nSex == 1) ? "?��" : "?��"), PersonData.get(strName).fResultBMI,
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
				strSave = "?���?: " + data + ",몸무�?: " + PersonData.get(data).strKg + " ?��:" + PersonData.get(data).strHight
						+ " ?���?: " + ((PersonData.get(data).nSex == 1) ? "?��" : "?��") + " BMI:"
						+ PersonData.get(data).fResultBMI + " 비만?�� :" + PersonData.get(data).strBMI + "\r\n";

				os.write(strSave.getBytes());
				strSave = "======================================\r\n";
				os.write(strSave.getBytes());
			}
			System.out.println("???�� ?���?");
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
