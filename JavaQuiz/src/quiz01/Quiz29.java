package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz29 {

	public static void main(String[] args) {
		
		//백준 2차원배열 - 2566
		//값을 순서대로 저장하는 것부터 시작
		
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		int[] arr2 = new int[9];
		int x = 0;
		int y = 0;
		int max = arr[0][0];
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int a = scan.nextInt(); 
				arr[i][j] = a;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (max <= arr[i][j] ) {
					max = arr[i][j];
					x = i + 1;
					y = j + 1;
					
				}
			}
		}
		System.out.println(max);
		System.out.println(x + " " + y);
	}
}
