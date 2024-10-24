package hw4;

import java.util.Scanner;

public class Hw4_5 {
	public static void main(String[] args) {
		// 任何能以4整除的年份都是閏年
		Scanner s = new Scanner(System.in);
		System.out.println("按順序輸入年月日");
		int[] date = new int[3];
		for (int n = 0; n < 3; n++) {
			date[n] = s.nextInt();
			if (date[n] <= 0) {
				System.out.println("請輸入正確日期格式");
				n--;
			} else if (date[1] > 12) {
				System.out.println("請輸入正確日期格式");
				n--;
			} else if ((date[1] == 1 || date[1] == 3 || date[1] == 5 || date[1] == 7 || date[1] == 8 || date[1] == 10
					|| date[1] == 12) && date[2] > 31) {
				System.out.println("請輸入正確日期格式");
				n--;
			} else if ((date[1] == 4 || date[1] == 6 || date[1] == 9 || date[1] == 11) && date[2] > 30) {
				System.out.println("請輸入正確日期格式");
				n--;
			} else if ((date[0] % 4 == 0 && date[1] == 2 && date[2] > 29)
					|| (date[0] % 4 != 0 && date[1] == 2 && date[2] > 28)) {
				System.out.println("請輸入正確日期格式");
				n--;
			}
		}
		int[] m1 = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] m2 = new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int sumDay = 0;
		for (int n = 0; n < date[1] - 1; n++) {
			if (date[0] % 4 == 0) {
				sumDay += m2[n];
			} else {
				sumDay += m1[n];
			}
		}
		sumDay += date[2];
		System.out.println("輸入的日期為該年第" + sumDay + "天");

	}
}
