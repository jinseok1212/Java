package day04;

import java.util.Scanner;

public class WhileEx04 {
	public static void main(String[] args) {
		
		//여러번 입력을 받음
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();//반복의 횟수
		int i = 1;
		while(num >= i) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println("Case #" + i + ": " + (a+b));
			
			
			i++;
		}
		System.out.println("반복문 종료!");
	}
}
