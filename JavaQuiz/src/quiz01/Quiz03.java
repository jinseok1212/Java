package quiz01;

public class Quiz03 {
	public static void main(String[] args) {
		
		int bucket = 10; // 바구니 크기
		int apple = (int)(Math.random() * 150) + 1; // 사과의 개수
		
		//사과의 개수가 정해질 때, 3항 연산식을 이용해서 필요한 바구니의 개수를 구하세요.
		
		int b = apple / bucket ;
		
		//System.out.println( apple % bucket == 0 ? b : b + 1 );
		int cnt = apple % bucket == 0 ? b : b + 1;
		System.out.println("바구니의 개수:" + cnt);
	}
}
