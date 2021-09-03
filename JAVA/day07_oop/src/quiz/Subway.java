package quiz;

public class Subway implements Trans {

	@Override
	public void start() {
		System.out.println("ÁöÇÏÃ¶ Ãâ¹ßÇÕ´Ï´Ù.");
	}

	@Override
	public void stop() {
		System.out.println("ÁöÇÏÃ¶ ¸ØÃè½À´Ï´Ù.");
	}

}
