package ex01.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				new String[] {"ex01/di/appContext.xml", "ex01/di/applicationContext.xml"});
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ex01/di/appContext.xml");
		
		MessageBeanImpl msgBean = context.getBean("messageBeanImpl", MessageBeanImpl.class);
		
		msgBean.sayHello();
	}
}
