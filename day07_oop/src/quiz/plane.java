package quiz;

public class plane implements Trans {

	@Override
	public void start() {
		System.out.println("비행기 출발합니다.");
	}

	@Override
	public void stop() {
		System.out.println("비행기 멈췄습니다.");
	}
	
}
