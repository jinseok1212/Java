package quiz01;

import java.util.Scanner;

public class Quiz17 {
	
	public static void main(String[] args) {
		
		int[] arr = {1000, 500, 100, 50, 10};
		
		Scanner scan = new Scanner(System.in);
		
		int money = scan.nextInt();
		

		int i = 0;
		while(i < arr.length) {

			System.out.print(arr[i] + " " + money / arr[i] + " ");
			
			money %= arr[i]; 
			
			i++; 
		}
		scan.close();
	}
}
