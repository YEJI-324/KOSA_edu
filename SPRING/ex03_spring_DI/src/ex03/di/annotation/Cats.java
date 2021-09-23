package ex03.di.annotation;

public class Cats {
	private MyCats myCats;
	
	// constructor
	public Cats(MyCats myCats) {
		this.myCats = myCats;
	}

	public void setMyCats(MyCats myCats) {
		this.myCats = myCats;
	}
	
	public void catsInfoPrint() {
		System.out.println("====================");
		System.out.println("cats Name : " + myCats.getName());
		System.out.println("cats Age : " + myCats.getAge());
		System.out.println("cats Hobbys : " + myCats.getHobbys());
		System.out.println("cats Weight : " + myCats.getWeight());
		System.out.println("cats Color : " + myCats.getColor());
		System.out.println("====================");
	}
}
