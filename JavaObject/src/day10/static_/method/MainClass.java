package day10.static_.method;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		Count c = new Count();
		
		c.method01();
		c.method02();
		
		//static메서드의 사용 - 클래스명.메서드명()
		Count.method02();
		
		MainClass m = new MainClass();
		m.test();
		
		//비밀
		Math.random();
		Arrays.toString(new int[3]);
		String.valueOf(false);
		Integer.getInteger(null, 0);
	}
	
	public void test() {
		
	}
}
