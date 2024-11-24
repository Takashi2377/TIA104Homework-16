package hwExt;

public class TestPen {
	public static void main(String[] args) {
		Pen pencil = new Pencil();
		Pen inkBrush = new InkBrush();
		pencil.setPrice(100);
		inkBrush.setPrice(100);
		
		System.out.println("鉛筆實際售價:" + pencil.getPrice());
		pencil.write();
		
		System.out.println("");
		
		System.out.println("毛筆實際售價:" + inkBrush.getPrice());
		inkBrush.write();
	}
}
