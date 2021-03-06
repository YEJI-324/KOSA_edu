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
		System.out.print("?΄λ¦μ ?? ₯ ??Έ?:");
		String strname = new Scanner(System.in).next();
		System.out.print("λͺΈλ¬΄κ²?: ");
		String strKg = new Scanner(System.in).next();

		System.out.print("?€: ");
		String strHigth = new Scanner(System.in).next();

		System.out.print("?±λ³? :1.?¨? 2.?¬?");
		int nSex = new Scanner(System.in).nextInt();

		if (!PersonData.containsValue(strname)) {
			PersonData.put(strname, new Person_Info(strKg, strHigth, nSex));
		} else {
			// μ€λ³΅? ?΄λ¦μ΄ ??€λ©?
			nNameCnt++;
			String str = strname + nNameCnt;

			PersonData.put(str, new Person_Info(strKg, strHigth, nSex));
		}
	}

	public void Del() {
		System.out.print("?­? ?  ??? ?΄λ¦μ ?? ₯??Έ?: ");
		String strName = new Scanner(System.in).next();
		if (PersonData.containsKey(strName)) {
			PersonData.remove(strName);
			System.out.println(strName + " ?? ? λ³΄κ? ?­?  ???΅??€.");
		} else {
			System.out.println("??? μ°Ύμ?κ°? ??΅??€. ");
		}
	}

	public void PrintALL() {
		System.out.println("============  ??? λ³? =============== ");
		Set<String> set = PersonData.keySet();
		for (String data : set) {
			System.out.printf("?΄λ¦?: %s \n λͺΈλ¬΄κ²?: %s  ?€: %s  ?±λ³?: %s BMI: %.2f λΉλ§? : %s\n", data, PersonData.get(data).strKg,
					PersonData.get(data).strHight, ((PersonData.get(data).nSex == 1) ? "?¨" : "?¬"),
					PersonData.get(data).fResultBMI, PersonData.get(data).strBMI);
			System.out.println("======================================");
		}

	}

	public void PrintSell() {
		System.out.print("??Έ?  ?? ?΄λ¦μ ? ?Ό?Έ?:");

		String strName = new Scanner(System.in).next();

		if (PersonData.containsKey(strName)) {
			System.out.println("============  ??? λ³? =============== ");
			System.out.printf("?΄λ¦?: %s \nλͺΈλ¬΄κ²?: %s,  ?€: %s,  ?±λ³?: %s, BMI: %.2f, λΉλ§?: %s\n", strName,
					PersonData.get(strName).strKg, PersonData.get(strName).strHight,
					((PersonData.get(strName).nSex == 1) ? "?¨" : "?¬"), PersonData.get(strName).fResultBMI,
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
				strSave = "?΄λ¦?: " + data + ",λͺΈλ¬΄κ²?: " + PersonData.get(data).strKg + " ?€:" + PersonData.get(data).strHight
						+ " ?±λ³?: " + ((PersonData.get(data).nSex == 1) ? "?¨" : "?¬") + " BMI:"
						+ PersonData.get(data).fResultBMI + " λΉλ§? :" + PersonData.get(data).strBMI + "\r\n";

				os.write(strSave.getBytes());
				strSave = "======================================\r\n";
				os.write(strSave.getBytes());
			}
			System.out.println("???₯ ?λ£?");
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
