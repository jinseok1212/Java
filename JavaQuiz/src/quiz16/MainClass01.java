package quiz16;

import java.util.Scanner;

public class MainClass01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StringQuiz03 sen = new StringQuiz03();
		
		String a = scan.nextLine();
		
		System.out.println(sen.palindromeCheck(a));
	}
}
