package quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("quiz/appContext.xml");
		
		Student stu = context.getBean("student", Student.class);
		Employee emp = context.getBean("employee", Employee.class);
		
		stu.print();
		emp.print();
	}
}
