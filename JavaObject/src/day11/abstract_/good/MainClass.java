package day11.abstract_.good;

public class MainClass {

	public static void main(String[] args) {
		//추상클래스는 객체생성이 안됩니다.
		//추상클래스를 사용하려면
		//자식으로 생성해서, 부모타입에 저장할 때 이것을 객체 추상화라고 부릅니다.
		//Store s = new Store();
		
		Store s = new BusanStore();//new SeoulStore(); //다형성 - 객체 추상화
		
		s.melon();
		s.apple();
		s.orange();
		s.mango();//부모님한테 상속받은 메서드
		String name = s.getName();
		System.out.println(name);
	}
}
