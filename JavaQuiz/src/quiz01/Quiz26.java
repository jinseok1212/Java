package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz26 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int [n]; 
		for(int a = 0; a < arr.length; a++) {
			arr [a] = a + 1;
		}
		
		for(int k = 0; k < m; k++) {
			int i = scan.nextInt(); 
			int j = scan.nextInt();
			int temp = 0;
			temp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = temp;
			
		}
		for(int p = 0; p < n; p++)
		System.out.print(arr[p] + " ");	
	}
}
