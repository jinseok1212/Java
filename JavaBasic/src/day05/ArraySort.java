package day05;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		//배열의 정렬
		//정렬을 하는 방법 9~10개 정도 됨,
		//선택정렬, 버블정렬 <- 좀 느림
		//
		int [] arr = {5, 23, 1, 43, 200, 100, 40};
		/*
		 * 1회전
		 * 1, 23, 5, 43, 200, 100, 40
		 * 2회전
		 * 1, 5, 23, 43, 200, 100, 40
		 * 3회전
		 * 1, 5, 23, 43, 200, 100, 40
		 * 4회전
		 * 1, 5, 23, 40, 200, 100, 43
		 * 5회전
		 * 1, 5, 23, 40, 43, 200, 100
		 * 마지막
		 * 1, 5, 23, 40, 43, 100, 200
		 * 
		 * 
		 */
		//1, 5, 23, 40, 43, 100, 200 오름차순
		
		//바깥 반복문 - 회전수
		//안쪽 반복문 - 자리바꿈
		for(int i = 0; i < arr.length - 1 ; i++) {
			
			for(int j = i + 1; j < arr.length; j++) {
				System.out.println(i + "-" + j);
				
				if(arr[i] > arr[j]) {//i는 대상, j는 비교대상
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
		
			}
		}
		System.out.println(Arrays.toString(arr));	
		
		
	}
}
