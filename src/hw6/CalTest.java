package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Calculator c = new Calculator();
		boolean inputValid = false;

		while (!inputValid) {
			try {
				System.out.println("請輸入x的值");
				int x = s.nextInt();
				System.out.println("請輸入y的值");
				int y = s.nextInt();
				c.powerXY(x, y);
				inputValid = true;
			} catch (CalException ca) {
				System.out.println(ca.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("輸入格式不正確");
				s.next(); // 清空s.nextInt()所被輸入不符格式的值
			}
		}
	}
}
