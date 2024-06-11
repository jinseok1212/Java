package day08.overloading.basic;

public class Basic {

	/*
	 * 오버로딩 - 같은 이름의 메서드를 여러개 만드는 것
	 * 
	 * 규칙
	 * 메서드 이름은 동일하게 만들고, 매개변수의 개수 or 유형 or 순서등을 다르게 하면 됩니다.
	 * 반환유형은 오버로딩과 상관 없음
	 * 
	 * 
	 */
	
	
	void input(int a) {
		System.out.println("정수 1개 입력");
		
	}
//	int input(int a) {
//	}
	
	void input(String s) {
		System.out.println("문자열 1개 입력");
	}
	
	void input(int a, double b) {
		System.out.println("정수 1개, 실수 1개 입력");
	}
	
	void input(double b, int a) {
		System.out.println("실수 1개, 정수 1개 입력");
	}
	
	void input(char c, int a, String s) {
		System.out.println("문자 1개, 정수 1개, 문자열 1개 입력");
	}
	
	
	
	
}
