package hw7;

import java.io.*;

public class Hw7_2 {
	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("Data.txt", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);

		for (int n = 0; n <= 9; n++) {
			int num;
			if ((num = (int) Math.floor(Math.random() * 1000 + 1)) > 0) {
				ps.print(num + "\t");
			} else {
				n--;
			}
		}
		ps.println();
		ps.close();
		bos.close();
		fos.close();
	}
}
