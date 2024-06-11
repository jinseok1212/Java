package day05;

public class ArraySearch {

	public static void main(String[] args) {
		
		//탐색(순회) 
		int[] arr = {1,3,4,10,20,50,80,100};
		
		int find = 80; //찾을값
		int findIndex = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == find) { //찾음
				findIndex = i;
				break; //탈출
			}
		}
		if(findIndex != -1) {
			
			System.out.println(find + "는 " + findIndex + "번째 인덱스에 있습니다.");
		} else {
			System.out.println(find + "는 없는데요?");
		}
		
	}
}
