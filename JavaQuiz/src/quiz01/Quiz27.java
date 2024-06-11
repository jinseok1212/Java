package quiz01;

import java.util.Arrays;

public class Quiz27 {

	public static void main(String[] args) {
		
		/*
		 * 배열의 앞에 data를 추가하려고 합니다.
		 * 1. 새로운 배열 + 1 생성합니다.
		 * 2. 기존 배열을 다음 인덱스 번째로 옮겨담는다.
		 * 3. 0번 째에 data를 추가.
		 * 
		 */
		
		int[] arr = {10, 20, 30, 40, 50 };
		int data = 100;
		
		int[] arr2 = new int[arr.length + 1];
		for(int i = 0 ; i < arr.length; i++) {
			arr2[i + 1] = arr[i];
			
		}
		arr2[0] = data;
		arr = arr2;
		arr2 = null;
		System.out.println(Arrays.toString(arr));

	}
}
