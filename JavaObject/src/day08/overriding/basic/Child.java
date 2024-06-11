package day08.overriding.basic;

public class Child extends Parent {


	/*
	 * 오버라이딩 - 부모님한테 물려받은 메서드의 내용을 바꿔쓰는것
	 * 규칙
	 * 부모님의 메서드 원형과 동일하게 만들면 됩니다.
	 */
	
	void method02() {
		System.out.println("자식의 오버라이딩된 메서드 2번 실행");
	}
	
}
