package day04;

import java.util.Scanner;

public class BreakEx02 {

	public static void main(String[] args) {
		
		//특정 조건까지 무한입력.
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("5 x 3 = ?");
			System.out.println(">");
			int num = scan.nextInt();
			
			if(num == 15) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println("틀렸는데요");
			}
			
			//입력받은 값이 조건에 만족하면 탈출
		}
		
		
		
	}
}
