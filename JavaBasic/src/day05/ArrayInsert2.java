package day05;

import java.util.Arrays;

public class ArrayInsert2 {

	public static void main(String[] args) {
		
		//배열의 중간에 추가
		/*
		 * 1. 배열의 크기 + 1 생성
		 * 2. 배열을 옮겨담음
		 * 3. 새로운 배열의 마지막 인덱스 부터 타겟 인덱스 까지 값을 옮김
		 * 4. targetIndex에 data를 추가함
		 */
		int[] arr = {10, 20, 30, 40, 50};
		//targetIndex번째에 data를 추가
		int targetIndex = 2;
		int data = 100;
		
		//1.
		int[] newArr = new int[arr.length + 1];
		
		//2.
		for(int i = 0; i < arr.length; i++ ) {
			newArr[i] = arr[i];
		}
		
		//3.
		for(int i = newArr.length - 1; i > targetIndex; i--) {
			newArr[i] = newArr[i - 1];
			
		}
		//4.
		newArr[targetIndex] = data;
		System.out.println(Arrays.toString(newArr));
	}
}
