package ex02.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex02/di/appContext.xml");
		
		ScoreShowImpl show = context.getBean("scoreShowImpl", ScoreShowImpl.class);
		show.input();
		show.print();
	}
}
