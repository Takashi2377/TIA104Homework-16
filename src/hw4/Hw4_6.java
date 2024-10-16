package hw4;

import java.util.Arrays;

public class Hw4_6 {
	public static void main(String[] args) {
		int[][] ex = new int[][] {
			{10, 35, 40, 100, 90, 85, 75, 70},
			{37, 75, 77, 89, 64, 75, 70, 95},
			{100, 70, 79, 90, 75, 70, 79, 90},
			{77, 95, 70, 89, 60, 75, 85, 89},
			{98, 70, 89, 90, 75, 90, 89, 90},
			{90, 80, 100, 75, 50, 20, 99, 75}
			};
				
		int[] t = new int[8];

		for(int n = 0; n < ex.length; n++) {
			int max = ex[n][0];
			int index = 0;
			for(int i = 0; i < ex[n].length; i++) {
				if(ex[n][i] > max) {
					max = ex[n][i];
					index = i;
				}
			}
			t[index]++;
		}
		
		for(int n = 0; n < t.length; n++) {
			System.out.println((n+1) + "號同學考最高分的次數為" + t[n]);
		}
		
	}	
}
