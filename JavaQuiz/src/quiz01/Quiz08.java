package quiz01;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		
		//홀수 짝수 0 찾기
		/*어떤 정수를 입력받아

		홀수	라면 홀수
		짝수라면 짝수
		0이라면 제로
		음수라면 음수

		를 출력하는 프로그램 코드를 작성해주세요
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		} else if(num == 0) {
			System.out.println("제로");
		} else {
			System.out.println("음수");
		}
	}

}
