	/*static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String name() throws IOException {
		System.out.print("?��름을 ?��?��?��?��?�� : ");
		String name = br.readLine();
		return name;
	}
	static String weight() throws IOException {
		System.out.print("몸무게�?? ?��?��?��?��?�� : ");
		String wei = br.readLine();
		Integer.parseInt(wei);
		return wei;
	}
	static String height() throws NumberFormatException, IOException {
		System.out.print("?���? ?��?��?��?��?�� : ");
		String hei = br.readLine();
		Integer.parseInt(hei);
		return hei;
	}
	public static void main(String[] args) throws Exception {
		System.out.println("?���? : " + name() + "\t몸무�? : " + weight() + "\t?�� : " + height());
	}*/
package quiz.one;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {
	protected String name , weight , height;
	static int wei , hei;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static BMI input(BMI bmi) throws IOException {
		System.out.println("?��름을 ?��?��?��?��?�� : ");
		bmi.name = br.readLine();
		System.out.print("몸무게�?? ?��?��?��?��?�� : ");
		/*String strW = br.readLine();
		wei = Integer.parseInt(strW);*/
		wei = Integer.parseInt( br.readLine());
		//bmi.weight = wei;
		System.out.print("?���? ?��?��?��?��?�� : ");
		hei = Integer.parseInt(br.readLine());   //
		
		//BMI = 몸무�? / ( (?�� / 100.0) * (?�� / 100.0) )  ;
		double sum = wei / ( (hei  / 100.0)  * (hei / 100.0) ) ;
		if(sum < 18.5) System.out.println("체중�?족입?��?��.");
		else if(sum>=18.5 && sum <=22.9) System.out.println("?��?��체중?��?��?��.");
		else if(sum>=23.0 && sum <=24.9) System.out.println("과체중입?��?��.");
		else System.out.println("비만?��?��?��!!! ?��?��?��?�� ?��?��?��?��?��!!!");
		
		return bmi;
	}
}