package hw4;

import java.util.Scanner;

public class Hw4_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("輸入欲借金額");
		int cash = s.nextInt();
		int sum = 0;
		int[][] colleague = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 2700 } };
		System.out.print("有錢可借的員工編號為:");
		for (int n = 0; n < colleague.length; n++) {
			if (colleague[n][1] >= cash) {
				System.out.print(colleague[n][0] + " ");
				sum++;
			}
		}
		System.out.print("共" + sum + "人");
	}
}
