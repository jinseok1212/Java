package quiz16;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해서 공백을 포함한 id를 입력받습니다.
		 * 2. 공백을 제거한 아이디가 5글자 미만이면, 다시 입력받으세요.
		 * 3. 아이디는 소문자이어야 합니다. - 소문자로 변경
		 * 
		 * 아이디가 5글자 이상이면, "아이디가 등록되었습니다" 를 출력하고 프로그램을 종료.
		 */
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			//아이디를 입력
			System.out.print("ID>");
			String id = scan.nextLine().toLowerCase();
			if(id.replace(" ", "").length() < 5) {
			System.out.println("아이디는 5글자 이상이여야 합니다");
		} else if(id.replace(" ", "").length() >= 5){
			System.out.println(id.replace(" ", "") + "가 등록되었습니다");
			break;
		}
		}
		System.out.println("프로그램 종료");
	}
}
