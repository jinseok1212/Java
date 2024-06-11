package quiz01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int cnt = 0;
		int day = (c - b - 1) / (a - b) + 1;
		System.out.println(day);
		
		
	}
    
}
