package hw7;

import java.io.*;

public class Hw7_4Output {
	public static void main(String[] args) throws Exception {
		
		Animal[] animals = new Animal[4];
		animals[0] = new Dog("Husky");
		animals[1] = new Dog("ShibaInu");
		animals[2] = new Cat("Neko");
		animals[3] = new Cat("Kitty");
		
		File dir = new File("c:/data");
		dir.mkdir();
		File file = new File("c:/data/Object.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		for (int i = 0; i < animals.length; i++)
			oos.writeObject(animals[i]);
		
		oos.close();
		fos.close();
	}
}
