package hw3;

import java.util.Scanner;

public class Hw3_1 {
	// 三角形驗證
	public static void main(String[] args) {
		int[] tri = new int[3];
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入三角形邊長");
		for (int n = 0; n < 3; n++) {
			tri[n] = s.nextInt();
			if (tri[n] <= 0) {
				System.out.println("請輸入正整數");
				n--;
			}
		}
		if (tri[0] + tri[1] > tri[2] && tri[1] + tri[2] > tri[0] && tri[0] + tri[2] > tri[1]) {
			if (tri[0] == tri[1] && tri[0] == tri[2] && tri[1] == tri[2]) {
				System.out.println("正三角形");
			} else if ((tri[0] == tri[1] && tri[0] != tri[2]) || (tri[1] == tri[2] && tri[1] != tri[0])
					|| (tri[0] == tri[2] && tri[0] != tri[1])) {
				System.out.println("等腰三角形");
			} else if (tri[0] > tri[1] && tri[0] > tri[2]
					&& Math.pow(tri[0], 2) == Math.pow(tri[1], 2) + Math.pow(tri[2], 2)
					|| tri[1] > tri[0] && tri[1] > tri[2]
							&& Math.pow(tri[1], 2) == Math.pow(tri[0], 2) + Math.pow(tri[2], 2)
					|| tri[2] > tri[1] && tri[2] > tri[0]
							&& Math.pow(tri[2], 2) == Math.pow(tri[1], 2) + Math.pow(tri[0], 2)) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("無法構成三角形");
		}
	}

}
