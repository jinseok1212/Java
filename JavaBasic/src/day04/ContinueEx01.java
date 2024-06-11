package day04;

public class ContinueEx01 {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			
			if(i % 2 == 0) {
				continue; //반복문의 다음
			}
			
			System.out.println(i);
		}
		
		System.out.println("---------------------");
		
		//continue도 중첩에서 이름붙이기 됨
		
		int i = 1;
		while (i <= 10) {
			
			if(i == 5) {
				i++;
				continue; //반복문의 다음으로 간다
			}
			
			System.out.println(i);
			i++;
		}
		
		
	}
}
