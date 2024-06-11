package quiz15;

import java.net.MulticastSocket;
import java.util.Scanner;

public class TryQuiz02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = (int) ((Math.random()*100)+ 1);
		int cnt = 0;
		while(true) {
			
		try {
			System.out.print("1과 100사이의 값을 입력하세요>");
			int answer = scan.nextInt();
			if(answer > a) {
				System.out.println("더 작은 수를 입력하세요");
				cnt++;
			} else if (answer < a) {
				System.out.println("더 큰 수를 입력하세요");
				cnt++;
			} else {
				cnt++;
				System.out.println("정답입니다");
				System.out.println("시도횟수는:" + cnt);
				break;
			}
			
		} catch (Exception e) {
			System.out.println("잘못 입력했습니다");
			cnt++;
			scan.nextLine();
		}
			
		}
		
	}
}
