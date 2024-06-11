package quiz10;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart my = new MyCart(10000);
		Computer com = new Computer();
		Radio ra = new Radio();
		Tv tv = new Tv();
		
		my.buy(com);

		
		my.info();
	}
}
