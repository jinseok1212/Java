package quiz13;

public class DropShip extends Unit {

	

	public DropShip(int x, int y) {
		super(x, y, 120);
		// TODO Auto-generated constructor stub
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;	

	}

	@Override
	public void location() {
		System.out.println("현재위치:" + x + ", " + y);		

	}

}
