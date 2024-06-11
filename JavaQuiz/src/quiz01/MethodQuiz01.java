package quiz01;

public class MethodQuiz01 {
	
	public static void main(String[] args) {
		
		
		System.out.println(method3(1,2,3.3));
		
		System.out.println(method4(4));
		
		method5("x", 3);
		System.out.println();
		
		System.out.println(maxNum(4,5));
		
		System.out.println(abs(-4));
	}
	//1
	static double method3(int a, int b, double c) {
		return a + b + c;
	}
	//2
	static String method4(int num) {
		if (num % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
		
	}
	//3
	static void method5(String a, int b) {

		for(int i = 1; i <= b; i++) {
			System.out.print(a);
		}
	}
	//4
	static int maxNum(int a, int b) {
		return a > b? a : b;
	}
	//5
	static int abs(int a) {
		return a < 0? -a : a;
	}
}

