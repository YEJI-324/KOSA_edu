package ex08.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Date;

public class FileBufferedWriterEx {
	public static void main(String[] args) throws Exception {
			String str, file;
			Date date = new Date();
			str = "���� ���� �ð� \r\n" + date + "\r\n";
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("���� �̸� �Է� ��� : ");
			file = br.readLine();
			System.out.println("������ ���ڿ� �Է� �ϼ���. ");
			str += br.readLine();   // ���ڿ��� �����ؼ� �о����
			
			FileWriter  fw = new FileWriter(file);
			BufferedWriter  bw = new BufferedWriter(fw);
			
			bw.write(str);
			bw.close();
			System.out.println(file + " ������ ���������� ���� �߽��ϴ�. ");
	}
}




