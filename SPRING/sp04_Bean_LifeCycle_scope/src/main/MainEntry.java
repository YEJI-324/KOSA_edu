package main;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.Client;

//컨테이너 생성 > 빈객체 등록(생성자 호출) >  property 주입 > 초기화(특정 메서드) > 
//           > 사용자가 필요한 함수 호출 (send)  > 소멸자 (close()) > 

public class MainEntry {
	public static void main(String[] args) {
		
		// xml 기반 설정 파일 이용한 실행
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:springconf.xml");
		
		Client client = ctx.getBean("client", Client.class);
		Client c2 = ctx.getBean("client", Client.class);
		
		client.send();
		ctx.close();  // 스프링 컨테이너 닫기
		
		System.out.println(client.hashCode());
		System.out.println(c2.hashCode());
		
	}
}






