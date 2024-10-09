package hw3;

import java.util.Scanner;

public class Hw3_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = (int)(Math.random()*101);
		System.out.println("終極密碼0-100");

		while(true) {
			int n = s.nextInt();
			if( n < 0 || n > 100) {
				System.out.println("請重新輸入正確範圍內的數字");
			}else if( x == n) {
		    	System.out.println("恭喜答對! 數字為:" + x);
		    	break;
		    }else if( x > n ) {
		    	System.out.println("答案更大");
		    }else if( x < n ) {
		    	System.out.println("答案更小");
		    }	    
		}
	}
}
