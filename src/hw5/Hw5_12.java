package hw5;

import java.util.*;

public class Hw5_12 {
	public static void main(String[] args) {
		System.out.println("請輸入寬高");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		Hw5_12 hw1 = new Hw5_12();
		hw1.starSquare(x, y);
		hw1.randAvg();
	}

	
	void starSquare(int width, int height) {
		for(int n = 0; n < height; n++) {
			for(int i = 0; i < width; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void randAvg(){
		System.out.println("本次亂數結果");
//		int[] arr = new int[10];
//		int sum = 0;
//		for(int n = 0; n < 10; n++) {
//			arr[n] = (int) Math.round(Math.random() * 100 + 1); 
//			//Math.random()產生結果為double，Math.round(double a) 固定返回long，須強制轉型為int
//			sum += arr[n];
//			System.out.println(arr[n]);
//		}
//		System.out.println("平均數為"+sum / arr.length);
		// !!! 有機會取到重複值 !!!
		
		Set s = new HashSet();
		int sum = 0;
		while(s.size() != 10) {
			s.add((int) (Math.round(Math.random() * 100 + 1)));
		}
		Iterator objs = s.iterator();
		while(objs.hasNext()) {
			int num = (int)objs.next();
			System.out.print(num + " ");
			sum += num;
		}
		System.out.println();
		System.out.println("平均值為"+sum / s.size());
		
	}
}