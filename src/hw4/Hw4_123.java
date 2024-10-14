package hw4;

public class Hw4_123 {
	public static void main(String[] args) {
		//1.
		int sum1 = 0;
		int[] arr = new int[]{29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		for(int n = 1; n < arr.length; n++) {
			sum1 += arr[n];
		}
		int avg = sum1 / arr.length;
		System.out.println("平均數為:"+ avg);
		System.out.print("大於平均的數字有:");
		for(int n = 1; n < arr.length; n++) {
			if(arr[n] > avg) {
				System.out.print(arr[n] + " ");
			}
		}
		System.out.println();
		
		//2.
		String s1 = "Hello World";
		for(int n = s1.length() - 1; n >= 0; n--) {
			System.out.print(s1.charAt(n));
		}
		System.out.println();
		
		//3.
		String[] s2 = new String[]{"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int sum2 = 0;
		for(int i = 0; i < s2.length; i++) {  //陣列取得長度不需要括弧(屬性)，字串取得長度是方法需要括弧
			for(int n = 0; n < s2[i].length(); n++) {
				if( s2[i].charAt(n) == 'a' || s2[i].charAt(n) == 'e' || s2[i].charAt(n) == 'i' || s2[i].charAt(n) == 'o' || s2[i].charAt(n) == 'u') {
					sum2++;
				}
			}
		}
		System.out.print("總共包含母音數量為:" + sum2);
	}
}
