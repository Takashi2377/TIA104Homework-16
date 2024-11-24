package hw8;

import java.util.*;

public class Hw8_Train {

	public static void main(String[] args) {
		Train t1 = new Train();
		Train t2 = new Train();
		Train t3 = new Train();
		Train t4 = new Train();
		Train t5 = new Train();
		Train t6 = new Train();
		Train t7 = new Train();
		
		t1.setNumber(202);
		t1.setType("普悠瑪");
		t1.setStart("樹林");
		t1.setDest("花蓮");
		t1.setPrice(400);
		
		t2.setNumber(1254);
		t2.setType("區間");
		t2.setStart("屏東");
		t2.setDest("基隆");
		t2.setPrice(700);
		
		t3.setNumber(118);
		t3.setType("自強");
		t3.setStart("高雄");
		t3.setDest("台北");
		t3.setPrice(500);
		
		t4.setNumber(1288);
		t4.setType("區間");
		t4.setStart("新竹");
		t4.setDest("基隆");
		t4.setPrice(400);
		
		t5.setNumber(122);
		t5.setType("自強");
		t5.setStart("台中");
		t5.setDest("花蓮");
		t5.setPrice(600);
		
		t6.setNumber(1222);
		t6.setType("區間");
		t6.setStart("樹林");
		t6.setDest("七堵");
		t6.setPrice(300);
		
		t7.setNumber(1254);
		t7.setType("區間");
		t7.setStart("屏東");
		t7.setDest("基隆");
		t7.setPrice(700);
		
		//1.印出不重複
		Set<Train> set = new HashSet<>();
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);
		
//		Iterator<Train> objs1 = set.iterator();
//		while(objs1.hasNext()) {
//			System.out.println(objs1.next().getNumber());
//		}
		
		for(Train t : set) {
			System.out.println(t.getNumber());
		}
		
		System.out.println("==========================");
		//2.班次編號由大到小印出
		List<Train> lt = new ArrayList<>();
		lt.add(t1);
		lt.add(t2);
		lt.add(t3);
		lt.add(t4);
		lt.add(t5);
		lt.add(t6);
		lt.add(t7);
		
		Collections.sort(lt);
		Collections.reverse(lt);

//		for(int i = 0; i < lt.size(); i++) {
//			System.out.println(lt.get(i).getNumber());
//		}
		
		for (Train t : lt) {
			System.out.println(t.getNumber());
		}
		
//		Iterator<Train> objs2 = lt.iterator();
//		while(objs2.hasNext()) {
//			System.out.println(objs2.next().getNumber());
//		}
		
		System.out.println("==========================");
		//3.班次編號由大到小且不重複印出
//		Set<Train> st = new TreeSet<Train>(Collections.reverseOrder());
		Set<Train> st = new TreeSet<Train>((n1, n2) -> n2.getNumber() - n1.getNumber());
		st.add(t1);
		st.add(t2);
		st.add(t3);
		st.add(t4);
		st.add(t5);
		st.add(t6);
		st.add(t7);
		
//		Iterator<Train> objs3 = st.iterator();
//		while (objs3.hasNext()) {
//			System.out.println(objs3.next().getNumber());
//		}
		
		for(Train t : st) {
			System.out.println(t.getNumber());
		}
	}

}

class Train implements Comparable<Train> {

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	
	public int compareTo(Train t) {
		if (this.number > t.number) {
			return 1;
		} else if (this.number < t.number){
			return -1;
		}else {
			return 0;
		}
	}
	

}
