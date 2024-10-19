package hw7;

import java.io.*;

public class Hw7_1 {
	public static void main(String[] args) throws Exception {
		File sample = new File("Sample.txt");
		long length = sample.length();
		FileReader fr = new FileReader(sample);
		
		int ch = 0;
		while(fr.read() != -1) {
			ch++;
		}
		
		
		FileReader fr2 = new FileReader(sample);
		BufferedReader br = new BufferedReader(fr2);
		
		int ln = 0;
		while(br.readLine() != null) {
			ln++;
		}
		
		System.out.println("Sample.txt檔案共有" + length + "個位元組, " + 
											    ch + "個字元, " + 
											    ln + "列資料");
		
		br.close();
		fr.close();
		fr2.close();
		
	}
}
