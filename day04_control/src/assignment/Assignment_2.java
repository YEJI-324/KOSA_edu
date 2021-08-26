package assignment;

public class Assignment_2 {
	public static void main(String[] args) {

		// 과제4] 1~ 10까지 출력하는 프로그램 작성 (for문 )
		for (int i = 1; i < 11; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("\n=====================\n");

		// 과제5] 1~ 100까지 합을 출력하는 프로그램 작성
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("\n=====================\n");

		// 과제6] 1~ 100까지 중에서 짝수 출력하고 한행에 10개씩 출력
		int cnt = 1;

		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
				if(cnt%10==0) System.out.println();
				cnt++;
			}
		}
	}

}
