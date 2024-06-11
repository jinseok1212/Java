package quiz01;

import java.util.Scanner;

public class Quiz20 {
	
	public static void main(String[] args) {
		
		/*
		 * 가로, 세로를 입력받아서 사각형을 출력합니다.
		 * 단, 윤곽만 출력합니다.
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		for(int i = 1; i <= b; i++) {
			for(int j = 1; j <= a; j++) {
				if(i == 1 || i == b) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			} 
		System.out.println("*");
		}
		
	}
}
