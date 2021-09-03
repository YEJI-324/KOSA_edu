/*
package quiz.sawon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

public class Sawon {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		OutputStream os = new FileOutputStream("Sawon_Output.txt");
	
		while(true){
			
			System.out.println("1. ?��?��?���? 2. ?��로그?�� ?��?���?");
			int choice = sc.nextInt();
			
			if ( choice==2 ) break;
			
			System.out.println("?���? :");
			String name = sc.next()+ "  ";
			
			System.out.println("직급 :");
			String level = sc.next()+ "  ";
			
			System.out.println("�??�� :");
			String part = sc.next()+ "  ";
				
			os.write(name.getBytes());
			os.write(level.getBytes());
			os.write(part.getBytes());
		
		}
	}
}
//*/

//*


package quiz.sawon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sawon {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new FileWriter("sawon.txt"));
		
		String name, level, dept;
		int pay =0;

		try{
			while(true){
				
				System.out.println("?���?, 직급, �??��, 급여 �? ?��?��?��?��?��,\n q?��르면 최종?��?��");
				name = br.readLine();
				
				if(name.equals("q")){
					System.out.println("?��?��?��?��?��?��?��");
					break;
				}
				
				level = br.readLine();
				dept = br.readLine();
				pay = Integer.parseInt(br.readLine());

				String str = "name : "+name+"\r\nlevel : "+level+"\r\ndept : "+dept+"\r\npay : " + pay +"\r\n";
				//System.out.println(str); //?��면출?��
				System.out.println();

				// file�? 기재
				writer.write(str);

			}
		}catch(IOException ie){ ie.printStackTrace(); }
		catch(NumberFormatException ie){ ie.printStackTrace();}

		finally{
			try{ writer.close(); }
			catch(Exception e){ e.printStackTrace(); }

		}
	}
}
//*/