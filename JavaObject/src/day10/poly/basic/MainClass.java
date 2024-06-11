package day10.poly.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Child c = new Child();
		Parent p = c;

		/*
		 * 다형성이 적용 되었을때
		 * 부모님에 있는 메서드만 사용할 수 있지만 오버라이딩 된 메서드는 먼저 실행됨
		 */
		p.method01();
		p.method02();
//		p.method03(); //다형성이 적용되면 자식클래스가 가진 본래 메서드에 접근할 수 없음
		
		System.out.println(c);
		System.out.println(p);
		System.out.println(p == c); //주소값이 같음 = 자식이 일시적으로 부모로 형변환
		
		System.out.println("------------------------------");
		/*
		 클래스 캐스팅
		 
		  다형성이 적용된 객체는 클래스 캐스팅을 통해서 다시 자신으로 돌아올 수 있습니다.
		  단, 다형성이 적용되지 않은 객체는 에러가 발생합니다.
		  
		 */
		Parent pp = new Child();
		Child cc = (Child)pp;
		cc.method01();
		cc.method02();
		cc.method03(); //다시 본래의 기능 사용 가능
		
		//err
//		Parent ppp = new Parent();
//		Child ccc = (Child)ppp;
		
		
	}
}
