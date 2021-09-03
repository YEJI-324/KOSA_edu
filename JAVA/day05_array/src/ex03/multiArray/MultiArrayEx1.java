package ex03.multiArray;

// 3차원 배열
public class MultiArrayEx1 {

	public static void main(String[] args) {
		int[][][] a = new int [2][2][3];
		int x = 0;
		
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				for(int k = 0;k<a[i][j].length;k++) {
					a[i][j][k] = ++x;
				}
			}
		}
		
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				for(int k = 0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
