package quiz;

// 1~100 �߿��� 3�� ����� ������ �� ���ϱ�.

public class Quiz_5 {
	public static void main(String[] args) {
		
		int cnt = 0, sum = 0;
		
		for(int i = 1;i<=100;i++) {
			if(i%3 == 0) {
				cnt++;
				sum+=i;
			}
		}
		
		System.out.println("����: "+ cnt+", ����: " + sum);
	}
}
