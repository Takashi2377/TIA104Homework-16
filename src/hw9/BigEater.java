package hw9;

import java.util.concurrent.ThreadLocalRandom;

public class BigEater implements Runnable{
	int bowlNum = 0;
	String name;
	
	public BigEater(String name) {
		this.name = name;
	}
	
	public void run() {
		while(bowlNum < 10) {
			bowlNum++;
			System.out.println(name + "吃第" + bowlNum + "碗飯");
			if(bowlNum == 10) {
				System.out.println(name + "吃完了!");
			}
//			int sec = (int)(Math.random() * 2501 + 500);
			int sec = ThreadLocalRandom.current().nextInt(500, 3001);
			try {
				Thread.sleep(sec);
			} catch (Exception e) {
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("-----大胃王比賽開始!-----");
		BigEater be1 = new BigEater("詹姆士");
		BigEater be2 = new BigEater("饅頭人");
		Thread t1 = new Thread(be1);
		Thread t2 = new Thread(be2);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----大胃王比賽結束!-----");
		
	}
}
