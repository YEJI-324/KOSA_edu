package kr.edu.kosta;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		String config = "kr/edu/kosta/appContext.xml";
		
		AbstractApplicationContext context = new GenericXmlApplicationContext(config);
		
		Student student = context.getBean("student", Student.class);
		student.getStudentInfo();
		
		Worker worker = context.getBean("worker", Worker.class);
		worker.getWorkerInfo();
		
		context.close();
	}
}
