package Assignment;

import java.util.Scanner;

class Subject{
	String name;
	int score;
	
	public Subject(String name) {
		super();
		this.name = name;
	}

	public Subject(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}

class Student {
	String[] subject_name = {"국어", "영어", "전산"};
	
	private String name;
	private Subject[] subs;
	
	public Student() {
		this.subs = new Subject[subject_name.length];
		this.input();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		name = sc.next();

		for(int i = 0;i<subs.length;i++) {
			int score = 0;
			while (true) {
				System.out.print(subject_name[i]+" 점수 (0~100) : ");
				score = sc.nextInt();
				if (score >= 0 && score <= 100)
					break;
			}
			this.subs[i] = new Subject(subject_name[i], score);
		}	
	}
	
	public int getTotal() {
		int sum = 0;
		for(int i = 0;i<subs.length;i++) {
			sum += this.subs[i].score;
		}
		return sum;
	}
	
	public double getAverage(int sum) {
		return (double)sum/subs.length;
	}
	
	public String calculateGrade(double avg) {
		if (avg >= 90) {
			return "A";
		} else if (avg >= 80) {
			return "B";
		} else if (avg >= 70) {
			return "C";
		} else if (avg >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
	
	public void output() {	
		int sum = getTotal();
		double avg = getAverage(sum);
		String grade = calculateGrade(avg);
		System.out.println(name + "님의 성적표*************");
		for(int i = 0;i<subs.length;i++) {
			System.out.print(" "+subs[i].getName()+" : " + subs[i].getScore());
		}
		System.out.println("\n총점 : " + sum +" 평균 : " + avg+ " 평점 : " + grade);
	}
	
}

public class Assignment_2 {
	public static void main(String[] args) {
		int STUDENT_NUM = 7;
		
		for(int i = 0;i<STUDENT_NUM;i++) {
			Student student = new Student();
			student.output();
		}
		
	}
}
