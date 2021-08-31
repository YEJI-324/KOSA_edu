package quiz;

public class MainEntry {
	public static void main(String[] args) {
		Trans[] trans = new Trans[4];
		
		Object[] shape = {new Subway(), new Bus(), new Bicycle(), new plane()};
		
		for(int i = 0;i<trans.length;i++) { // 이렇게도 할 수 있다.
			trans[i] = (Trans)shape[i];
		}
		
//		trans[0] = new Subway();
//		trans[1] = new Bus();
//		trans[2] = new Bicycle();
//		trans[3] = new Plane();
		
		for(int i = 0;i<trans.length;i++) {
			trans[i].start();
			trans[i].stop();
		}
	}
}
