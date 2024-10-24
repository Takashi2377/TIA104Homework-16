package hw5;

public class Hw5_4_MyRectangle {
	private double width;
	private double depth;

	void setWidth(double width) {
		this.width = width;
	}

	void setDepth(double depth) {
		this.depth = depth;
	}

	double getArea() {
		return width * depth;
	}

	public Hw5_4_MyRectangle() {
	};

	public Hw5_4_MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
}
