package ex07.main;

public class MainEntry {

	public static void main(String[] args) {
		
		if(args.length <= 0 || args.equals(null)) {
			System.out.println("Using error: ������ �Է�");
			return;
		}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println(num1 + num2);
	}
}
