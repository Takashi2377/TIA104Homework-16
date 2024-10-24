package hw7;

import java.io.*;

public class Hw7_4Intput {
	public static void main(String[] args) throws Exception{
		File file = new File("c:/data/Object.ser");
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file.getName() + "檔案呼叫方法如下: ");
		System.out.println("--------------------");
		try {
			while (true) {
				((Animal) ois.readObject()).speak();
				System.out.println("--------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		
		ois.close();
		fis.close();
	}
}
