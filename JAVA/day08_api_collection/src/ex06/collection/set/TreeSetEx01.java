package ex06.collection.set;

import java.util.TreeSet;

public class TreeSetEx01 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		int[] score = {85,77,50,44,98,100,65,50, 35};
		
		for(int i = 0;i<score.length;i++) {
			set.add(score[i]);
		}
		
		System.out.println(set);
		
		System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50)));
		System.out.println("50이상 : " + set.tailSet(new Integer(50)));
	}
}
