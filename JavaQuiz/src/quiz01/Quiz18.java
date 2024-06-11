package quiz01;

public class Quiz18 {

	public static void main(String[] args) {
		
		//for문 사용
		
		//1. 7~100까지 정수 중에서 7의 배수를 가로로 출력
//		for(int a = 7; a <= 100; a+=7 ) { 이렇게도 가능
		for(int a = 1; a <= 100; a++ ) {
			if(a % 7 == 0) {
				System.out.print(a + " ");
			}
			
		}
		System.out.println();
		//2. 1~100까지 정수 중에서 9의 배수의 개수를 출력
		int q = 0;
		for(int b = 1; b <= 100; b++) {
	
			if(b % 9 == 0) {
				q++;
			}
		}
		System.out.println(q);
		//3. 50~100까지 두 수 사이의 합계 출력
		int sum = 0;
		for(int c = 50; c <= 100; c++) {
			sum += c;
		}
		System.out.println(sum);
		//4. A~Z 문자열의 합 출력 ABCDEF...Z 65~90
		String str = "";
		for(char d = 65; d <= 90; d++) {
			str += d;
		}
		System.out.println(str);
	}
}
