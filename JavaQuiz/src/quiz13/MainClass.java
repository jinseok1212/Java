package quiz13;

public class MainClass {

	public static void main(String[] args) {
		
		Unit m = new Marine(3,3);
		Unit t = new Tank(3,3);
		Unit d = new DropShip(3,3);
		
		m.move(2,2);
		m.location();		
		
		
	}
}
