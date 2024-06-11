package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		 개수세기
//		int n = scan.nextInt();
//		
//		int count = 1;
//		int num = 0;
//
//		while(n >= count) {
			//조건 - 4의 배수이면서 8의 배수가 아니면 개수를 증가+
//			if(count % 4  == 0 && count % 8 != 0) {
//				num++;
//			}
//			count++;
//		}
//		System.out.println(num);
//	}
//}
		
	
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
		