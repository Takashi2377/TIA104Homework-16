package hw9;

public class BearBig {
	public static void main(String[] args) {
		Living_expenses le = new Living_expenses();
		Mom m = new Mom(le);
		Son s = new Son(le);
		m.start();
		s.start();
	}
}

class Living_expenses{
	private int cash = 0;
	
	synchronized public void withdraw(int money) {	
		while (cash == 0) {
			System.out.println("熊大看到帳戶沒錢，停止提款");
			System.out.println("媽媽被熊大要求匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		cash -= money;
		System.out.println("熊大領了" + money + "元，帳戶還有:" + cash);
		if (cash <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}
	}

	
	synchronized public void deposit(int money) {
		cash += money;
		System.out.println("媽媽存了" + money + "元，帳戶還有:" + cash);
		while (cash >= 3000) {
			System.out.println("媽媽看到餘額在3000以上，停止匯款");
			notify();
			System.out.println("熊大被媽媽告知帳戶已有錢");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class Mom extends Thread {
	Living_expenses le;

	public Mom(Living_expenses le) {
		this.le = le;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			le.deposit(2000);
	}
}

class Son extends Thread {
	Living_expenses le;

	public Son(Living_expenses le) {
		this.le = le;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			le.withdraw(1000);
	}
}
