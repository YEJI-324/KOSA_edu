package assignment;

public class Assignment_2 {
	public static void main(String[] args) {

		// ����4] 1~ 10���� ����ϴ� ���α׷� �ۼ� (for�� )
		for (int i = 1; i < 11; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("\n=====================\n");

		// ����5] 1~ 100���� ���� ����ϴ� ���α׷� �ۼ�
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("\n=====================\n");

		// ����6] 1~ 100���� �߿��� ¦�� ����ϰ� ���࿡ 10���� ���
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
