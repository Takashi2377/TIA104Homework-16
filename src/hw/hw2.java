package hw;

public class hw2 {
	public static void main(String[] args) {
			
		//1. 計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum1=0;
		for(int x=2;x<=1000;x+=2) {
			sum1+=x;
		}
		System.out.println(sum1);
		
		//2. 計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int sum2=1;
		for(int x=1;x<=10;x++) {
			sum2*=x;
		}
		System.out.println(sum2);
		
		//3. 計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int sum3=1;
		int x=1;
		while(x<=10) {
			sum3*=x;
			x++;
		}
		System.out.println(sum3);
		
		//4. 輸出結果為以下:1 4 9 16 25 36 49 64 81 100
		for(int n=1;n<=10;n++) {
			System.out.print((int)Math.pow(n, 2)+" ");
		}
		
		System.out.println();
		
		//5. 1 ~ 49不論是個位數或是十位數不能有4
		for(int ln=1;ln<=49;ln++) {
			if(ln%10==4||ln/10==4) {
				continue;
			} else {
				System.out.print(ln+" ");
			}
		}

		System.out.println();
		
		//6. 
		for(int y=10;y>=1;y--) {
			for(int z=1;z<=y;z++) {
				System.out.print(z);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//7.
		int c=1;
		for(char lt='A';lt<='F';lt++) {
			for(int i=1;i<=c;i++) {
				System.out.print(lt);
			}
			System.out.println();
			c++;
		}			
	}
}
