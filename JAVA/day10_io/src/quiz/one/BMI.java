	/*static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String name() throws IOException {
		System.out.print("?΄λ¦μ ?? ₯??Έ? : ");
		String name = br.readLine();
		return name;
	}
	static String weight() throws IOException {
		System.out.print("λͺΈλ¬΄κ²λ?? ?? ₯??Έ? : ");
		String wei = br.readLine();
		Integer.parseInt(wei);
		return wei;
	}
	static String height() throws NumberFormatException, IOException {
		System.out.print("?€λ₯? ?? ₯??Έ? : ");
		String hei = br.readLine();
		Integer.parseInt(hei);
		return hei;
	}
	public static void main(String[] args) throws Exception {
		System.out.println("?΄λ¦? : " + name() + "\tλͺΈλ¬΄κ²? : " + weight() + "\t?€ : " + height());
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
		System.out.println("?΄λ¦μ ?? ₯??Έ? : ");
		bmi.name = br.readLine();
		System.out.print("λͺΈλ¬΄κ²λ?? ?? ₯??Έ? : ");
		/*String strW = br.readLine();
		wei = Integer.parseInt(strW);*/
		wei = Integer.parseInt( br.readLine());
		//bmi.weight = wei;
		System.out.print("?€λ₯? ?? ₯??Έ? : ");
		hei = Integer.parseInt(br.readLine());   //
		
		//BMI = λͺΈλ¬΄κ²? / ( (?€ / 100.0) * (?€ / 100.0) )  ;
		double sum = wei / ( (hei  / 100.0)  * (hei / 100.0) ) ;
		if(sum < 18.5) System.out.println("μ²΄μ€λΆ?μ‘±μ??€.");
		else if(sum>=18.5 && sum <=22.9) System.out.println("? ?μ²΄μ€???€.");
		else if(sum>=23.0 && sum <=24.9) System.out.println("κ³Όμ²΄μ€μ??€.");
		else System.out.println("λΉλ§???€!!! ?€?΄?΄?Έ ?????€!!!");
		
		return bmi;
	}
}