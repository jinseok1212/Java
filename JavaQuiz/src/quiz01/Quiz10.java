package quiz01;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String cal = scan.next();
		int num1 = scan.nextInt();
		
		switch (cal) {
		case "+":
			System.out.println(num + num1);
			break;
		case "-":
			System.out.println(num - num1);
			break;
		case "*":
			System.out.println(num * num1);
			break;
		case "/":
			System.out.println(num / num1);
			break;

		default:
			break;
		}
		scan.close();
	}
}
