package hw8;

import java.math.*;
import java.util.*;

public class Hw8_Collection {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		//傳統for
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("=======================");
		//Iterator
		Iterator objs = list.iterator();
		while (objs.hasNext()) {
			System.out.println(objs.next());
		}
		
		System.out.println("=======================");
		//forEach
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=======================");
		
		List<Number> ln = new ArrayList<>();
		
		for(Object obj : list) {
			if(obj instanceof Number) {
				ln.add((Number)obj);
			}
		}
		
		for(Number num : ln) {
			System.out.println(num);
		}
		
	}
}
