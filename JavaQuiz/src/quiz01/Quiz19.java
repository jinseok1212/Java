package quiz01;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int max = 0;
		int min = 0;
		int sum = 0;
		
		
		if(a > b) {
			max = a;
			min = b;
		} else if(a == b){
			max = 0;
			min = 0;
		}
		else {
			max = b;
			min = a;
		}
		for(int i = min; i <= max; i++) {
			sum += i;

		}
		System.out.println(sum);
		
	}
}
