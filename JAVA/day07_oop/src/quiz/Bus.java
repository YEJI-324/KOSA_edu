package quiz;

public class Bus implements Trans {

	@Override
	public void start() {
		System.out.println("버스 출발합니다.");
	}

	@Override
	public void stop() {
		System.out.println("버스 멈췄습니다.");
	}

}
