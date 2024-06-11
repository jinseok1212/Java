package day04;

public class DoWhileEx01 {

	public static void main(String[] args) {
	
		//do ~while은 조건이 첫번째 회전은 반드시 하게되고 그 이후부터는 while 문과 동일함
		int i = 1;
		int sum = 0;
		
		do {
			System.out.println(i);
			
			sum += i;
			
			i++;
		} while (i <= 10);
		System.out.println("합계: " + sum);
	}
}
