package hw5;

public class Hw5_3 {
	public static void main(String[] args) {
		int[][] arr1 = {{1, 6, 3},
						{9, 5, 7}};
		
		double[][] arr2 = {{1.2, 3.5, 2.2},
						   {7.4, 2.1, 8.2}};
		
		Hw5_3 hw = new Hw5_3();
		System.out.println(hw.maxElement(arr1));
		System.out.println(hw.maxElement(arr2));
	}
	
	int maxElement(int x[][]) {
		int max = 0;
		for(int n = 0; n < x.length; n++) {
			for(int i = 0; i < x[n].length; i++) {
				if( x[n][i] > max) {
					max = x[n][i];
				}
			}
		}
		return max;
	}
	
	double maxElement(double x[][]) {
		double max = 0;
		for(int n = 0; n < x.length; n++) {
			for(int i = 0; i < x[n].length; i++) {
				if( x[n][i] > max) {
					max = x[n][i];
				}
			}
		}
		return max;
	}
}
