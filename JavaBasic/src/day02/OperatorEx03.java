package day02;

public class OperatorEx03 {
	
	public static void main(String[] args) {
		
		
		//& | && ||
		int x = 10;
		int y = 20;
		
		//if 소괄호가 true라면 if구문이 실행, false라면 else구문이 실행됨
		if ( x != 10 && ++y == 21) { //&&는 절대 true가 나올 수 없는 경우에 뒤에를 실행하지 않음
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
		}
		
		System.out.println("x값은: " + x);
		System.out.println("y값은: " + y);		
		
		if( x == 10 || ++y == 21) { //||는 절대 false가 나올 수 없는 경우에 뒤를 실행하지 않음
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
		}
		
		System.out.println("x값은: " + x);
		System.out.println("y값은: " + y);
	}
}
