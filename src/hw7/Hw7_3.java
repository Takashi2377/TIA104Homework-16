package hw7;

import java.io.*;

public class Hw7_3 {
	public void copyFile(String A, String B) throws Exception {
		FileReader fr = new FileReader(A);
		FileWriter fw = new FileWriter(B);
		
		int c;
		while( (c = fr.read()) != -1 ) {
			fw.write(c);
		}
		
		fr.close();
		fw.close();
	}
	
	public static void main(String[] args) throws Exception {
		Hw7_3 hw = new Hw7_3();
		hw.copyFile("FileIn.txt", "FileOut.txt");
	}
}
