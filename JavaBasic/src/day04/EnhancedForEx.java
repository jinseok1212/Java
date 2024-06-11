package day04;

public class EnhancedForEx {

	public static void main(String[] args) {
		
		//향상된 for문
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		for(int v : arr) {
			System.out.println(v); //배열의 값을 순서대로 v에 담는다.
		}
		
		System.out.println("----------------------");
		char[] arr2 = {'A', 'B', 'C', 'D', 'E'};
		
		for(char c : arr2) {
			System.out.println(c);
		}
		
		int[] score = {33, 55, 43, 23, 43, 66};
		//향상된 for문을 이용해서 합계와, 평균(실수부분)을 출력.
		int sum = 0;
		int average = 0;
		for(int a : score) {
			sum += a;
		}

		System.out.println(sum);
		System.out.println((double)sum / score.length);
	}
}
