package day01;

public class CastingEx01 {
	public static void main(String[] args) {
		
		byte b = 10;
		/*
		 * 크기가 작은 타입을 큰 타입에 넣을 때는
		 * 자바 가상머신이 자동으로 형변환을 해줍니다.
		 */
		short s = b; // byte -> short 자동형변환
		int i = b; // byte -> int 자동형변환
		long l = b; // byte -> long 자동형 변환
		
		
		char c = '가'; //2byte
		int j = c; //char -> int 자동형변환
		System.out.println(j);
		
		int k = 1000;
		double d = k;
		
		System.out.println(d);
	}
}
