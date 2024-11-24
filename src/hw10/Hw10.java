package hw10;

import static java.lang.System.out;
import java.util.*;
import java.text.*;

public class Hw10 {
	public static void main(String[] args) throws ParseException {
		// 質數判斷
		for (int i = 0; i < 5; i++) {
			boolean isPrime = true;
			int rn = (int) (Math.random() * 100 + 1);
			int sr = (int) (Math.sqrt(rn));
			for (int n = 2; n <= sr; n++) {
				if (rn % n == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime && rn >= 2) {
				System.out.println(rn + "是質數");
			} else {
				System.out.println(rn + "不是質數");
			}
			;
		}

		System.out.println("==============================");

		// (1)千分位(2)百分比(3)科學記號 選擇表示
		Format dfm1 = new DecimalFormat("#,###");
		DecimalFormat percentFormat = new DecimalFormat("#.##%");
		DecimalFormat scientificFormat = new DecimalFormat("0.###E0");
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入數字");
		String intRegex = "^\\d+(\\.\\d+)?$";
		String num = s.next();
		while (!num.matches(intRegex)) {
			System.out.println("!!請輸入數字!!");
			num = s.next();
		}

		System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號");
		int num1 = s.nextInt();
		if( num1 == 1) {
			System.out.println("千分位:" + dfm1.format(Double.valueOf(num)));
		}else if(num1 == 2) {
			System.out.println("百分比:" + percentFormat.format(Double.valueOf(num)));
		}else {
			System.out.println("科學記號:" + scientificFormat.format(Double.valueOf(num)));
		}
		
		System.out.println("==============================");

		// 日期輸出格式選擇
		String DATE_PATTERN = "^(?:0{3}[1-9]|0{2}[1-9]\\d|0[1-9]\\d{2}|[1-9]\\d{3})(?:0[1-9]|1[0-2])(?:0[1-9]|[12]\\d|3[01])$";
		Scanner s2 = new Scanner(System.in);
		System.out.println("請輸入8位數字的日期 (YYYYMMDD格式，例如: 20241124)：");
		String input = s2.nextLine().trim();
		while (!input.matches(DATE_PATTERN)) {
            System.out.println("日期格式不正確，請確保輸入8位數字，且日期有效。");
            input = s2.nextLine().trim();
        }
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat outputFormat1 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat outputFormat2 = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat outputFormat3 = new SimpleDateFormat("dd/MM/yyyy");
		Date date = inputFormat.parse(input);
		
		System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年三選一");
		int num2 = s2.nextInt();
		if( num2 == 1) {
			System.out.println("年/月/日:" + outputFormat1.format(date));
		}else if(num2 == 2) {
			System.out.println("月/日/年:" + outputFormat2.format(date));
		}else {
			System.out.println("日/月/年:" + outputFormat3.format(date));
		}
		
	}
}
