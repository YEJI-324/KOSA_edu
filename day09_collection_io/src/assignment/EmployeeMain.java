package assignment;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class EmployeeMain {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("employee.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("아무 키나 눌러서 직원 입력 시작하기");
		int num = 0;

		while ((num = System.in.read()) != -1) {
			System.out.println("== 직원 입력하기 ( Ctrl + z 종료 ) ==");
			System.out.print("이름 : ");
			String name = br.readLine();
			br.read();
			br.read();
			System.out.print("직급 : ");
			String rank = br.readLine();
			br.read();
			br.read();
			System.out.print("부서 : ");
			String depart = br.readLine();

			os.write(new Employee(name, rank, depart).toString().getBytes());
		}
	}
}
