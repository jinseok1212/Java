package quiz01;

import java.util.Scanner;

public class Quiz25 {

	public static void main(String[] args) {
		
		//백준 -1차원배열-
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int [n];
		int i = 0;
		while(i < arr.length) {
			arr[i] = scan.nextInt();
			i++;
		}
		int j = 0;
		int max = arr[0]; //배열의 첫번째요소
		int min = arr[0];
		while(j < arr.length) {
			
			if(arr[j] > max) {
				max = arr[j]; //최대값
			}
			if(arr[j] < min) {
				min = arr[j];
			}
				
			j++;
		}
		System.out.println(min + " " + max);
	}
}
