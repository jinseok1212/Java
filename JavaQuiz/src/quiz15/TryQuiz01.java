package quiz15;

import java.util.Scanner;

public class TryQuiz01 {

	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 통해서 정수 2개를 입력받습니다.
		 * 2. 입력받은 값이 정수라면 , 단순히 정수의 합을 출력하고 반복문을 종료하세요
		 * 		무한반복문이 돌면, 이유를 찾아서 해결해보세요.
		 * 3. 입력받은 값이 에러를 발생시키는 값이라면 "정수로만 입력하세요" 를 출력한 후에 다시 입력받습니다.
		 * 4. 반복문을 탈출하면 프로그램 정상 종료 문장을 띄워주세요.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while(true) {
		try {
			System.out.print("정수1>");
			int a = scan.nextInt();
			System.out.print("정수2>");
			int b = scan.nextInt();
			sum = a + b;
			System.out.println("합:" + sum);
			break;
		} catch (Exception e) {
			System.out.println("정수로만 입력하세요");
			scan.nextLine(); //엔터값(찌꺼기) 강제로 소모
		}
		}
		
	}
}
