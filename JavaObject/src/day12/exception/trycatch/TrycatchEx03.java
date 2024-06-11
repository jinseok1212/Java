package day12.exception.trycatch;

public class TrycatchEx03 {

	public static void main(String[] args) {
		
		/*
		 * main메서드에 실행시 매개값을 주는 방법.
		 * Run탭 -> run configration(실행설정) -> arguments 탭
		 * 
		 * ${string_prompt}
		 */
		try {
			//두 수의 합을 구하는 코드
			String a = args[0];
			String b = args[1];
			
			//문자열을 숫자로 바꾸는 코드
			int x = Integer.parseInt(a);
			int y = Integer.parseInt(b);
			
			System.out.println("두 수의 합:" + (x + y));
			
			// 예외 만들기
			String str = null;
			str.charAt(0);
		} catch (ArrayIndexOutOfBoundsException | ClassCastException e) { // or 구문으로 여러 예외를 동시에 처리 할 수도 있음
			System.out.println("실행 시에 매개값을 2개 입력하세요.");
		} catch (NumberFormatException e) {
			System.out.println("매개값을 숫자로 입력하세요.");
		} catch (Exception e) { // 모든 예외처리 - exception클래스는 예외 종류클래스 중에서 최고 부모님클래스
			System.out.println("기타 예외 입니다.");
		}
		
		
		
		
		
		
	}
}
