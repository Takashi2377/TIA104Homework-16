package hwExt;

public class Pencil extends Pen{
	
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
	public int getPrice() {
		return (int)(super.getPrice()*0.8);
	}
}
