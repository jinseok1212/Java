package quiz18;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueQuiz01 {

	public static void main(String[] args) {
		
		Customer[] arr = {
				new Customer("hong", 5),
				new Customer("lee", 4),
				new Customer("john", 1),
				new Customer("홍길동씨", 6),
				new Customer("alen", 2),
		};
		
		//은행에 번호표를 뽑아서 가지고 있는 랜덤한 Customer배열입니다.
		//번호표 순대로 객체를 출력.
		//john -> alen -> lee -> hong -> 홍길동씨
		
		//배열을 -> 컬렉션으로 형변환
		Queue<Customer> que = new PriorityQueue<>();
		que.addAll(Arrays.asList(arr));
		
//		for(int i = 0; i < arr.length; i++) {
//			que.offer(arr[i]);
//		}
		//큐를 소비
		while(que.isEmpty() == false) {
			System.out.println(que.poll());
		}
	}
}
