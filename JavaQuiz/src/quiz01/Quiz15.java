package quiz01;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int num = 1;
		int sum = 0;
		while(num <= n) {
			
			if(n % num == 0) {
				sum += num;
			}
			
			
			num++;
		}
		System.out.println(sum);
	}
}
