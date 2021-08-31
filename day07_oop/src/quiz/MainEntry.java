package quiz;

public class MainEntry {
	public static void main(String[] args) {
		Trans[] trans = new Trans[4];
		trans[0] = new Subway();
		trans[1] = new Bus();
		trans[2] = new Bicycle();
		trans[3] = new Plain();
		
		for(int i = 0;i<trans.length;i++) {
			trans[i].start();
			trans[i].stop();
		}
	}
}
