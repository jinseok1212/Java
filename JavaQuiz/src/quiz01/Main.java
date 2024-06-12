package quiz01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr = new int[N];
		for(int i = 1, j = 0; i <= arr.length; i++,j++) arr[j] = i;
		for(int j = 0; j < M; j++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			for(int i = a; i <= b; i++) {
				arr[i-1] = arr[b - i];
			}
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
    
}
