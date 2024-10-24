package hw5;

public class Hw5_4_MyRectangleMain {
	public static void main(String[] args) {
		Hw5_4_MyRectangle mr1 = new Hw5_4_MyRectangle();
		mr1.setWidth(10);
		mr1.setDepth(20);
		System.out.println(mr1.getArea());

		Hw5_4_MyRectangle mr2 = new Hw5_4_MyRectangle(10, 20);
		System.out.println(mr2.getArea());

	}
}
