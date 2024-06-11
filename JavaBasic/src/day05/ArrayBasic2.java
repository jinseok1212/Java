package day05;

public class ArrayBasic2 {

	public static void main(String[] args) {
		
		//배열의 순회
		int[] arr = {34, 65, 23, 53, 65, 93};
		
		for (int i = 0; i < arr.length; i++) { //암기
			System.out.println("인덱스:" + i + ", 값:" + arr[i]);
		}
		
		for (int a : arr) {
			System.out.println("값:" + a);
		}
		
		System.out.println("------------------------------------");
		//배열을 거꾸로 순회
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println("인덱스:" + i + ", 값:" + arr[i]);
		}
		
		System.out.println("-------------------------------------");
		
		//배열 요소들의 합계
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; 
		}
		System.out.println("합계:" + sum);
		
		
		
		
		
		
	}
}
