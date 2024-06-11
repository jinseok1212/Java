package day06;

import java.util.Arrays;

public class MethodEx05 {

	public static void main(String[] args) {
		
		//배열의 한계점? - 크기가 정적이다.
		//Stack - Last In First Out (LIFO) 
		
		push(4);
		push(5);
		push(6);
		push(7);
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(Arrays.toString(arr));
	}
	
		
	static int[] arr = {1,2,3};
	
	static void push(int data) {
		//뒤에다가 값을 하나 추가
		//1.
		int[] temp = new int[arr.length + 1]; //하나 더 크게
		//2. 원본배열의 요소를 복사
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		//3. 마지막에 data를 추가함
		temp[temp.length - 1] = data;
		//4. 원본배열을 바꾼다
		arr = temp;
		temp = null; //템프 삭제
		
	}
	
	//pop - 특정요소를 마지막에서 삭제, 반환 - 삭제된 데이터를 반환
	static int pop() {
		
		if(arr.length > 0) {
			//1. 삭제할 데이터를 백업
			int data = arr[arr.length - 1];
			//2. arr가 -1 인 사본 배열을 만든다.
			int[] temp = new int [arr.length - 1];
			//3. 값을 복사
			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i];
			}
			//4. 원본 배열을 바꾼다.
			arr = temp;
			temp = null;
			
			return data; //삭제한 데이터를 반환
			
		}
		
		return 0;
	}
	
}


