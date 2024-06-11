package day06;

public class MethodEx07 {

	public static void main(String[] args) {
		
		method01(); //동기적인 호출 (순서대로)
		
		recursive(1);
		System.out.println(factorial(5));
		//재귀적인 호출 - 메서드 안에서 자신을 호출시킴
	}

	static void method01() {
		System.out.println("method1 start");
		method02(); //2번 호출
		System.out.println("method1 end");
	}

	static void method02() {
		System.out.println("method2 start");
		
		System.out.println("method2 end");
	}

	static void recursive(int a) {
		
		//재귀를 탈출할 조건이 반드시 필요
		if(a == 10) {
			return; //함수종료
		}
		System.out.println(a + "호출");
		a++;
		
		recursive(a);
		
		
	}

	static int factorial(int a) {
		
		if(a == 1) {
			return 1;
		}
		return a * factorial(a-1);
	}
}
