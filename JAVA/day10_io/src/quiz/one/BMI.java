	/*static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String name() throws IOException {
		System.out.print("?´ë¦„ì„ ?…? ¥?•˜?„¸?š” : ");
		String name = br.readLine();
		return name;
	}
	static String weight() throws IOException {
		System.out.print("ëª¸ë¬´ê²Œë?? ?…? ¥?•˜?„¸?š” : ");
		String wei = br.readLine();
		Integer.parseInt(wei);
		return wei;
	}
	static String height() throws NumberFormatException, IOException {
		System.out.print("?‚¤ë¥? ?…? ¥?•˜?„¸?š” : ");
		String hei = br.readLine();
		Integer.parseInt(hei);
		return hei;
	}
	public static void main(String[] args) throws Exception {
		System.out.println("?´ë¦? : " + name() + "\tëª¸ë¬´ê²? : " + weight() + "\t?‚¤ : " + height());
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
		System.out.println("?´ë¦„ì„ ?…? ¥?•˜?„¸?š” : ");
		bmi.name = br.readLine();
		System.out.print("ëª¸ë¬´ê²Œë?? ?…? ¥?•˜?„¸?š” : ");
		/*String strW = br.readLine();
		wei = Integer.parseInt(strW);*/
		wei = Integer.parseInt( br.readLine());
		//bmi.weight = wei;
		System.out.print("?‚¤ë¥? ?…? ¥?•˜?„¸?š” : ");
		hei = Integer.parseInt(br.readLine());   //
		
		//BMI = ëª¸ë¬´ê²? / ( (?‚¤ / 100.0) * (?‚¤ / 100.0) )  ;
		double sum = wei / ( (hei  / 100.0)  * (hei / 100.0) ) ;
		if(sum < 18.5) System.out.println("ì²´ì¤‘ë¶?ì¡±ì…?‹ˆ?‹¤.");
		else if(sum>=18.5 && sum <=22.9) System.out.println("? •?ƒì²´ì¤‘?…?‹ˆ?‹¤.");
		else if(sum>=23.0 && sum <=24.9) System.out.println("ê³¼ì²´ì¤‘ì…?‹ˆ?‹¤.");
		else System.out.println("ë¹„ë§Œ?…?‹ˆ?‹¤!!! ?‹¤?´?–´?Š¸ ?•„?ˆ˜?…?‹ˆ?‹¤!!!");
		
		return bmi;
	}
}