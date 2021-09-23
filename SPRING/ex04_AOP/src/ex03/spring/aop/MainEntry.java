package ex03.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		String config = "classpath:ex03/spring/aop/appContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		
		// Proxy 만들고 객체 넘기기, 필요한 객체를 생성하는 작업은 이미 xml 설정 파일을 통해서 설정함.
		Calc proxy = context.getBean("proxy", Calc.class);
		System.out.println(proxy.add(1, 2, 3));
		System.out.println(proxy.mul(1, 5));
		System.out.println(proxy.sub(5, 2, 1));
	}
}
