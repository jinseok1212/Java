package quiz01;

public class Quiz05 {
	
	public static void main(String[] args) {
		
		/*
		 * quiz02의 문제를 if~else문장으로 변경
		 */
		int a = (int)(Math.random() * 11) - 5;
		
		System.out.println("랜덤값: " + a);
		int result; //결과값을 저장 할 변수
		if(a >= 0) {
			result = a;
		} else {
			result = -a;
		}
		
		System.out.println("절대값: " + result);
	}
}
