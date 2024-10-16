package hw12;

public class hw1 {
	public static void main(String[] args) {
		//1.
		int x=12;
		int y=6;
		System.out.println("和為"+(x+y)+" "+"積為"+(x*y));
		
		//2.
		int dozens=200/12;
		int eggs=200%12;
		System.out.println(dozens+"打"+eggs+"顆");
		
		//3.   256559秒
		int days=256559/86400;
		int hours=(256559-86400*days)/3600;
		int mins=(256559-86400*days-3600*hours)/60;
		int secs=256559-86400*days-3600*hours-60*mins;
		System.out.println(days+"天"+hours+"小時"+mins+"分鐘"+secs+"秒");
		
		//4. 半徑為5的圓面積與圓周長
		final double PI=3.1415;
		double a= (int)Math.pow(5,2)*PI;
		double c=5*2*PI;
		System.out.println("面積為"+a+"周長為"+c);

		//5. 本利和 = 本金 × (1 + 年利率)^期間
		double sum=1500000*(double)Math.pow(1.02, 10);
		System.out.println("本利和為"+sum);
		
		//6.
		System.out.println(5+5); //兩個類別為int的整數相加
		System.out.println(5+'5'); //'5'對應的ASCII/Unicode值是53，在作運算時Java會自動將char類型轉換為對應的整數值，進行數字相加。
		System.out.println(5+"5"); //整數+String為串接相加
	}
}
