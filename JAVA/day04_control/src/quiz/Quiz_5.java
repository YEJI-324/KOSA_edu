package quiz;

// 1~100 중에서 3의 배수의 개수와 합 구하기.

public class Quiz_5 {
	public static void main(String[] args) {
		
		int cnt = 0, sum = 0;
		
		for(int i = 1;i<=100;i++) {
			if(i%3 == 0) {
				cnt++;
				sum+=i;
			}
		}
		
		System.out.println("개수: "+ cnt+", 총합: " + sum);
	}
}
