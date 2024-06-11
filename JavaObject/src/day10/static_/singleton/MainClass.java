package day10.static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
//		3번의 getInstance() 로 객체를 끄집어 냅니다.
		Singleton s = Singleton.getInstance(); //객체생성방법
		
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s == s2);
		
		String name = s.getName();
		String name2 = s2.getName();
		
		System.out.println(name);//둘다 홍길동
		System.out.println(name2);
		
		
	}
}
