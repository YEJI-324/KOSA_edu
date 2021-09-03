package quiz;

// 이중 while문으로 구구단 전체 출력

public class Quiz_6 {

	public static void main(String[] args) {

		int i = 1, j = 1;

		while (i < 10) {
			System.out.println(i + "단");
			j = 1;
			while (j < 10) {
				System.out.println(i + " * " + j + " = " + i * j);
				j++;
			}
			i++;
		}

	}
}
