package hw3;

import java.util.*;

public class Hw3_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入範圍1~9內數字");
		int x = s.nextInt();
		int sum = 0;
		
		while( x > 9 || x < 1 ) {
			System.out.println("請重新輸入正確範圍內的數字");
			x = s.nextInt();
		}
		
		
		for(int n = 1; n <= 49; n++) {
			if( n / 10 == x || n % 10 == x) {
				continue;
			}else {
				sum++;
			}
		}
		
		
		int[] lot = new int[sum];
		int i = 0;
		for(int n = 1; n <= 49; n++) {
			if( n / 10 == x || n % 10 == x) {
				continue;
			}else {
				lot[i] = n;
				i++;
			}
		}
		System.out.println("共有" + sum + "個數字可選");
		
		// 建立一個空的 List<Integer>
        List<Integer> list = new ArrayList<>();
        
        // 使用 forEach 迴圈將 int 陣列轉換為 Integer物件 並加入 List(list內部元素須為物件)
        for (int num : lot) {
            list.add(num);
        }
        
        // 隨機打亂list
        Collections.shuffle(list);
        
        // 選擇前n個元素
        int n = 6;
        List<Integer> result = list.subList(0, n);
        
        System.out.println("隨機取出六個數字: " + result);
	}
}
