package day12.exception.trycatch;

public class TrycatchEx02 {
	public static void main(String[] args) {
		
		//반복문에서 예외처리
		
		String[] arr = {"홍길동", "홍길자", "이순신" };
		
		int i = 0;
		
		while (i < 4) {
			
			try {
				
				System.out.println(arr[i]);
			} catch (Exception e) { //모든 예외를 전부다 처리할 수 있음
				System.out.println("배열 참조 범위를 벗어남!");
			} finally {
				System.out.println("나는 예외여부 상관없이 무조건 실행됨~"); // 자원해제 할 때 많이 사용됨
			}
			
			System.out.println("프로그램 정상종료");
			i++;
		}
		
	}
}
