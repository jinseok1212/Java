package quiz01;

public class MethodQuiz02 {

	public static void main(String[] args) {
		
	/*
	 * 1. java()
	 * 매개변수로 정수를 받습니다.
	 * 매개변수 1 -> return "자";
	 * 매개변수 2 -> return "자바";
	 * 매개변수 3 -> return "자바자";
	 * 매개변수 4 -> return "자바자바";
	 * 
	 *  2. sum()
	 *  매개변수로 정수를 1개 받습니다.
	 *  매개변수의 약수의 합계를 리턴
	 *  매개변수 5 -> return 1 + 5
	 *  매개변수 6 -> return 1 + 2 + 3 + 6
	 *  
	 *  3.primeNum()
	 *  매개변수 2개를 받아서 순서 상관없이 두 수 사이의 합계를 리턴
	 *  1, 2 => return 1 + 2;
	 *  2, 1 => return 2 + 1;
	 *  1, 1 => return 0;
	 */
	System.out.println(java(3));
	System.out.println(sum(10));
	System.out.println(primeNum(1, 5));
	System.out.println(primeNum(5, 1));
	System.out.println(primeNum(5, 5));
	}
	//1.
	static String java(int a) {
		String x = "";
		for(int i = 0; i < a; i++) {
			//홀수일 때 자, 짝수일 때 바
			if (i % 2 == 0 ) {
				x += "자";
			} else {
				x += "바";
			}
		}
		return x;
	}
	//2.
	static int sum(int a) {
		int sum = 0;
		for(int i = 1; i <= a; i++) {

			if (a % i == 0) { //i 약수
				sum += i;
				
			}
		}
		return sum;
	}
	//3.
	static int primeNum(int a, int b) {
		if(a == b) return 0; //줄이 한 줄일 경우 옆에다 작성 가능
		int max = a > b ? a : b;
		int min = a > b ? b : a;
		int sum = 0;
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
}
