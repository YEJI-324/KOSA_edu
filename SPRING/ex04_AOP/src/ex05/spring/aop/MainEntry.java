package ex05.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex05/spring/aop/context.xml");
		
		Student stu = context.getBean("student", Student.class);
		stu.show();
	}
}
