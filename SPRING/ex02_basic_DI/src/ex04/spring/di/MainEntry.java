package ex04.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		// context 생성시 bean 생성 설정 파일 경로, 파일명 지정하기
		ApplicationContext context = new ClassPathXmlApplicationContext("ex04/spring/di/appContext.xml");
		
		// getBean(빈_이름)으로 객체 가져오기.
		// 그냥 빈이름으로 가져오면 Object가 리턴되기 때문에 타입을 맞춰줘야함.
		// 타입 맞춰주는 방법 1. IRecordViewImpl view = (IRecordViewImpl) context.getBean("view");
		// 타입 맞춰주는 방법 2.
		IRecordViewImpl view = context.getBean("view", IRecordViewImpl.class);
//		view.input();
		view.print();
	}
}
