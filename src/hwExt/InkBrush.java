package hwExt;

public class InkBrush extends Pen{
	
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	public int getPrice() {
		return (int)(super.getPrice()*0.9);
	}
}
