package hw5;

public class Hw5_5 {
	public static void main(String[] args) {
		Hw5_5 hw = new Hw5_5();
		hw.genAuthCode();
	};

	void genAuthCode() {
		char[] arr = new char[62];

		for (int n = 0; n < arr.length; n++) {
			if (n >= 0 && n <= 9) {
				arr[n] = (char) (48 + n);
			}

			if (n >= 10 && n <= 35) {
				arr[n] = (char) (65 + (n - 10));
			}

			if (n >= 36) {
				arr[n] = (char) (97 + (n - 36));
			}
		}
		System.out.println("本次隨機產生驗證碼為:");
		for (int n = 0; n <= 7; n++) {
			int x = (int) Math.floor(Math.random() * 61 + 1);
			System.out.print(arr[x]);
		}
	}

}
