package ex03.di.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContext.class);
		
		Cats catsInfo = context.getBean("catsInfo", Cats.class);		
		catsInfo.catsInfoPrint();
		
		MyCats cat2 = context.getBean("cat2", MyCats.class);
		catsInfo.setMyCats(cat2);
		catsInfo.catsInfoPrint();
	}
}
