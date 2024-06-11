package day12.exception.trycatch;

public class RunTimeExample {

	public static void main(String[] args) {
		
		//실행예외 - 프로그램 실행시 발생되는 예외
		//nullpointer
		
//		String name = null;
//		name.charAt(0);
		
		//classCast
//		String s = (String)new Object();
		
		//ArrayIndexBound - 배열의 범위를 잘못 참조
//		int[] arr = {1,2,3};
//		arr[5] = 100;
		
		//NumberFormat - 문자를 숫자로 바꿀 때 에러
//		int a = Integer.parseInt("홍길동");
//		System.out.println(a + 10);
		//실행예외가 발생하면, 찾아서 고민해보기
		System.out.println("프로그램 종료");
	}
}
