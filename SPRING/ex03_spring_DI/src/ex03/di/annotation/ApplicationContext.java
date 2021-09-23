package ex03.di.annotation;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// context.xml 과 같음.
@Configuration
public class ApplicationContext {
	
	@Bean // create Object(Bean) using annotation
	public MyCats cat1() {
		ArrayList<String> hobbys = new ArrayList();
		hobbys.add("꾹꾹이");
		hobbys.add("우다다");
		
		MyCats myCats = new MyCats("점순이", 2, hobbys);
		myCats.setWeight(5.6);
		myCats.setColor("brown");
		
		return myCats;
	}
	
	@Bean // create Object(Bean) using annotation
	public MyCats cat2() {
		ArrayList<String> hobbys = new ArrayList();
		hobbys.add("꾹꾹이");
		hobbys.add("우다다");
		
		MyCats myCats = new MyCats("점순이", 2, hobbys);
		myCats.setWeight(5.6);
		myCats.setColor("white");
		
		return myCats;
	}
	
	@Bean
	public Cats catsInfo() {
		Cats cats = new Cats(this.cat1());
		
		return cats;
	}
}
