package quiz01;

public class Quiz02 {
	public static void main(String[] args) {
		
		/*
		 * 0~10 범위의 랜덤한 정수를 생성하고, 5에서 빼주면 범위는 -5~5가 됩니다.
		 * 
		 * 이 값을 가지고, 3항 연산식을 이용해서(언제나 양수값) 절대값을 출력해주세요.
		 */
		
		int a = (int)(Math.random() * 11) - 5;
		
		System.out.println("랜덤값: " + a);
		System.out.println("절대값: " + (a > 0 ?  + a : -a) );
	
	
	
	}
}
