package quiz;

public class Bicycle implements Trans {

	@Override
	public void start() {
		System.out.println("자전거 출발합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자전거 멈췄습니다.");
	}
	
}
