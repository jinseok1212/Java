package quiz19;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1~45까지 중복되지 않는 로또번호 6개 만들기
		 * 
		 * 1. 랜덤객체를 사용해서 1~45까지 랜덤수를 생성
		 * 2. List or Set을 사용해서 랜덤한 로또번호 6개를 만들면 됩니다.
		 */
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() != 6) {
			int a = (int) ((Math.random() * 45) + 1);

			set.add(a);
		}
		System.out.println(set.toString());
		
	}
}
