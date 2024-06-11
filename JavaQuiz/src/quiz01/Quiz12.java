package quiz01;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		
		/*
		 * 어떤수 N을 입력받아서 N까지의 구구단 모형의 출력을 완성
		 */
		int n = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요>");
		int num = scan.nextInt();
		System.out.println("구구단:" + num + "단");
		
		while(n <= 9) {
			System.out.println(num + "x" + n + "=" + (num * n));
			n++;
		}
		
		
	}
}
