package quiz01;

import java.util.Scanner;

public class Quiz16 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		String text = scan.next();
		
		String str = ""; //빈 문자열, 문자열 합
		
		int i = 1;
		
		while(i <= count) {
			
			str += text;
			
			i++;
		}
	
		System.out.println(str);
	}
}
