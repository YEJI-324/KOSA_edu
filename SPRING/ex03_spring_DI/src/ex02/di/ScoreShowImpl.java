package ex02.di;

import java.util.Scanner;

public class ScoreShowImpl implements ScoreShow {

	private ScoreImpl score;

//	// using constructor for DI
//	public ScoreShowImpl(ScoreImpl score) {
//		this.score = score;
//	}
	
	// using setter method for DI
	public void setScore(ScoreImpl score) {
		this.score = score;
	}

	@Override
	public void print() {
		System.out.println("kor : " + score.getKor());
		System.out.println("eng : " + score.getEng());
		System.out.println("com : " + score.getCom());
		System.out.println("total : " + score.total());
		System.out.println("avg : " + score.avg());
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("kor : ");
		score.setKor(sc.nextInt());
		System.out.print("eng : ");
		score.setEng(sc.nextInt());
		System.out.print("com : ");
		score.setCom(sc.nextInt());
	}

}
