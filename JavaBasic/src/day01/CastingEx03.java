package day01;

public class CastingEx03 {
	public static void main(String[] args) {
		
		//연산시에도 형변환이 일어납니다.
		char c = 'A';
		int i = 2;
		
		//연산에서의 형변환
		//1.int보다 작은 타입의 연산은 무조건 int가 됩니다.
		System.out.println(c + i); //int
		char cc = (char)(c + i);
		
		byte b1 = 3;
		byte b2 = 5;
		int b3 = b1 + b2; //(int)
		
		
		//byte + byte = int
		//byte + short = int
		//int + byte = int
		//char + int = int
		
		//2.int보다 큰 타입의 연산은 큰 타입을 따라가게 됩니다.
		int k = 3;
		double d = 3.14;
		
		System.out.println(k + d);
		//int 보다 크면 큰 타입으로 따라감
	}
}
