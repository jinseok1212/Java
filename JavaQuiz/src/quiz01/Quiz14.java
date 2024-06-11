package quiz01;

import java.util.Scanner;

public class Quiz14 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();	//배수
		int x = scan.nextInt(); //반복 횟수
		
//		int a = 1;

		//방법 1
//		while(a <= n) {
//			
//			if( a % x == 0) {
//				System.out.print(a + " ");
//			}
//		
//		a++;
//		}
		//방법 2
		
		int i = x;
		while(i <= n) {
			System.out.print(i + " ");
			i += x;
		}

	}
}
