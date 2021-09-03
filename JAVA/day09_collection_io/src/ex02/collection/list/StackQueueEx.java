package ex02.collection.list;
import java.util.*;

class StackQueueEx
{
	public static void main(String[] args) 
	{
		Stack st = new Stack();
		// LinkedList는 Queue인터페이스를 구현하였다.
		Queue q = new LinkedList();	
		
		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("0");
		q.offer("1");
		q.offer("2");

		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop()); // 역순으로 나옴.
		}

		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); // 들어간 순서대로
		}
	}
}