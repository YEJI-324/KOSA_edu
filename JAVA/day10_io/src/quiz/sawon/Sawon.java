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
			
			System.out.println("1. ???±λ‘? 2. ?λ‘κ·Έ?¨ ??΄κΈ?");
			int choice = sc.nextInt();
			
			if ( choice==2 ) break;
			
			System.out.println("?΄λ¦? :");
			String name = sc.next()+ "  ";
			
			System.out.println("μ§κΈ :");
			String level = sc.next()+ "  ";
			
			System.out.println("λΆ?? :");
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
				
				System.out.println("?΄λ¦?, μ§κΈ, λΆ??, κΈμ¬ λ₯? ?? ₯??Έ?,\n q?λ₯΄λ©΄ μ΅μ’??±");
				name = br.readLine();
				
				if(name.equals("q")){
					System.out.println("??±???΅??€");
					break;
				}
				
				level = br.readLine();
				dept = br.readLine();
				pay = Integer.parseInt(br.readLine());

				String str = "name : "+name+"\r\nlevel : "+level+"\r\ndept : "+dept+"\r\npay : " + pay +"\r\n";
				//System.out.println(str); //?λ©΄μΆ? ₯
				System.out.println();

				// fileλ‘? κΈ°μ¬
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