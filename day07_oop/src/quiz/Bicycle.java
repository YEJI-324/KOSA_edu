package quiz;

public class Bicycle implements Trans {

	@Override
	public void start() {
		System.out.println("������ ����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("������ ������ϴ�.");
	}
	
}
