package ex04.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ex04/spring/aop/context.xml");
		
		MessageBean bean = context.getBean("messageBeanImpl", MessageBean.class);
		bean.sayHello();
		System.out.println("====================");
		bean.engHello();
		
		System.out.println("\n\n====================");
		BookBean book = (BookBean) context.getBean("bookBeanImpl");
		book.testHello("hello");
		book.korHello();
	}
}
