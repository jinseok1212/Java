package day03;

import java.util.Arrays;

public class ArrayEx {
	
	public static void main(String[] args) {
	
		//배열의 선언
		int[] arr;
		//배열의 생성 - 생성할 때 크기를 지정
		arr = new int[5];
		
		System.out.println(arr); //상자 만들어진 위치(주소값)
		
		//배열의 초기화 - 상자 값을 대입
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
// 		arr[5] = 60; 없는 상자에 접근하면 err
		
		System.out.println("배열의 첫번째 상자값:" + arr[0] );
		arr[0] = 100; //첫번째 상자를 100으로 변경
		
		System.out.println("배열의 첫번째 상자값:" + arr[0] );
		
		//5. 배열의 값을 한눈에 문자열로 보고싶으면
		System.out.println( Arrays.toString(arr) ); //암기 필수
		
		//6. 배열의 길이를 확인
		System.out.println( "배열의 길이:" + arr.length );
		
		//마지막 인덱스
		System.out.println( "배열의 마지막 상자:" + arr[arr.length - 1]);
		
		System.out.println("----------------------------------");
		
		//7. 배열의 선언 생성을 동시에 하는 방법
		
		int[] arr2 = new int[7]; //암기필수
		
		//8. 배열의 선언 생성 초기화를 동시에 하는 방법
		byte[] arr3 = {1,2,3,4,5,6};		
		//		byte[] arr3 = new byte[] {1,2,3,4,5,6}; 같은 방법
		
		System.out.println( Arrays.toString(arr3));
		
		//배열은 값을 지정하지 않으면 기본값으로 초기화 됩니다.
		//0, 0.0, false, null
		System.out.println( Arrays.toString(arr2));
		
		System.out.println("-----------------------------------");
		
		/*
		 * 문자열을 저장하는 크기가 7 배열을 생성하고
		 * 
		 * 월~일 까지 값을 저장
		 */
		String[] arr4 = new String[7];
		
		arr4[0] = "월";
		arr4[1] = "화";
		arr4[2] = "수";
		arr4[3] = "목";
		arr4[4] = "금";
		arr4[5] = "토";
		arr4[6] = "일";
		System.out.println( Arrays.toString(arr4));
		
		System.out.println("-----------------------");
		/*
		 * arr 배열안의 값의 합계와 평균을 출력해주세요
		 */
		
		int sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
		System.out.println("합계: " + sum );
		System.out.println("평균: " + (double)sum / arr.length);
		
	}
}