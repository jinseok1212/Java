package quiz12;

public class MainClass {

	public static void main(String[] args) {
		
		Shape c = new Circle("원", 4);
		Shape r = new Rect("직사각형", 4);

		System.out.println(c.getName());
		System.out.println(c.getArea());
		
		System.out.println(r.getName());
		System.out.println(r.getArea());
		
	}
}
