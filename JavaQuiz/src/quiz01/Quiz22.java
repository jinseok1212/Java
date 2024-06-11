package quiz01;

import java.util.Scanner;

public class Quiz22 {
	public static void main(String[] args) {
		
		/*
		 * 프로그램이 실행되면, 랜덤한 덧셈 문제를 출력해줍니다.
		 * 이 랜덤한 수의 범위는 1~100 사이의 값 입니다.
		 * 
		 * 사용자가 답안을 입력할 때 마다, 정답 또는 오답 카운트가 누적됩니다.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		//누적할 변수
		int correct = 0;
		int wrong = 0;

		while(true) {
			int a = (int)(Math.random() * 100) + 1;
			int b = (int)(Math.random() * 100) + 1;
			System.out.println("-----------");
			System.out.println(a + " + " + b + " = ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			int answer = scan.nextInt();
			
			if(answer == a + b) { //정답인 경우
				System.out.println("정답입니다");
				correct ++;
			} else if(answer == 0) {
				System.out.println("프로그램 정상 종료");
				System.out.println("정답:" + correct);
				System.out.println("오답:" + wrong);
				break;
				
			} else { // 정답이 아닌경우
				System.out.println("틀렸는데요?");
				wrong ++;
			}
		}
	}
}
