package day09.encap.obj;

public class MainClass {

	public static void main(String[] args) {
//		Chef chef = new Chef();
		
		Hotel hotel = new Hotel(new Chef());
		
		
		//setter
		Chef chef = new Chef();
		hotel.setChef(chef);
		
		//getter
		Chef c = hotel.getChef();
		c.cooking();
	}
}
