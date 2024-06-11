package day01;

public class CastingEx02 {
	
	public static void main(String[] args) {
		
		/*
		 * 크기가 큰 타입을 작은 타입으로 변환 할 때는 (type) 캐스팅을 사용해서
		 * 명시적 형변환을 해야합니다.
		 */
		int i = 70;
		char c = (char)i; //알파벳F
		byte b = (byte)i; //70
		
		System.out.println(c);
		
		double d = 3.14;
		int j = (int)d;
		
		System.out.println(j);
		/*
		 * 주의할점
		 * 명시적 형변환시에 값을 저장할 수 없는 범위가 되면, 잘려나간 값이 저장됩니다.
		 * 
		 */
		
		int k = 1000;
		byte b2 = (byte)k;
		System.out.println(b2);
		
		//예외적으로 형변환을 해야하는 경우
		//char -> short,
		char cc = 'A';
		short ss = (short)cc;
		System.out.println(ss); //65
	}
}
