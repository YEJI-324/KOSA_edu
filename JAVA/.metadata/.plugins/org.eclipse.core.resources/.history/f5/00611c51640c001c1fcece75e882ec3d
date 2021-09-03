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
		System.out.print("이름을 입력 하세요:");
		String strname = new Scanner(System.in).next();
		System.out.print("몸무게: ");
		String strKg = new Scanner(System.in).next();

		System.out.print("키: ");
		String strHigth = new Scanner(System.in).next();

		System.out.print("성별 :1.남자 2.여자");
		int nSex = new Scanner(System.in).nextInt();

		if (!PersonData.containsValue(strname)) {
			PersonData.put(strname, new Person_Info(strKg, strHigth, nSex));
		} else {
			// 중복된 이름이 있다면
			nNameCnt++;
			String str = strname + nNameCnt;

			PersonData.put(str, new Person_Info(strKg, strHigth, nSex));
		}
	}

	public void Del() {
		System.out.print("삭제할 회원의 이름을 입력하세요: ");
		String strName = new Scanner(System.in).next();
		if (PersonData.containsKey(strName)) {
			PersonData.remove(strName);
			System.out.println(strName + " 님의 정보가 삭제 되었습니다.");
		} else {
			System.out.println("회원을 찾을수가 없습니다. ");
		}
	}

	public void PrintALL() {
		System.out.println("============  회원정보 =============== ");
		Set<String> set = PersonData.keySet();
		for (String data : set) {
			System.out.printf("이름: %s \n 몸무게: %s  키: %s  성별: %s BMI: %.2f 비만도 : %s\n", data, PersonData.get(data).strKg,
					PersonData.get(data).strHight, ((PersonData.get(data).nSex == 1) ? "남" : "여"),
					PersonData.get(data).fResultBMI, PersonData.get(data).strBMI);
			System.out.println("======================================");
		}

	}

	public void PrintSell() {
		System.out.print("확인할 회원 이름을 적으세요:");

		String strName = new Scanner(System.in).next();

		if (PersonData.containsKey(strName)) {
			System.out.println("============  회원정보 =============== ");
			System.out.printf("이름: %s \n몸무게: %s,  키: %s,  성별: %s, BMI: %.2f, 비만도: %s\n", strName,
					PersonData.get(strName).strKg, PersonData.get(strName).strHight,
					((PersonData.get(strName).nSex == 1) ? "남" : "여"), PersonData.get(strName).fResultBMI,
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
				strSave = "이름: " + data + ",몸무게: " + PersonData.get(data).strKg + " 키:" + PersonData.get(data).strHight
						+ " 성별: " + ((PersonData.get(data).nSex == 1) ? "남" : "여") + " BMI:"
						+ PersonData.get(data).fResultBMI + " 비만도 :" + PersonData.get(data).strBMI + "\r\n";

				os.write(strSave.getBytes());
				strSave = "======================================\r\n";
				os.write(strSave.getBytes());
			}
			System.out.println("저장 완료");
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
