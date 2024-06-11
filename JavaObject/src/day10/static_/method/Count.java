package day10.static_.method;

public class Count {

	public int a;
	public static int b;
	
	//일반메서드 - 일반변수, 정적변수 모두 사용가능.
	public int method01() {
		a = 10;
		b++;
		return b;
		
	}
	
	//정적메서드 - static멤버만 사용가능. 일반 멤버는 사용이 불가능
	public static int method02() {
		//a = 10;
		//단, 객체생성해서는 접근할 수 있음
		
		Count c = new Count();
		c.a = 10;
		b++;
		return b;
	}
	
	
}
