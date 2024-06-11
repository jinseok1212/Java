package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz28 {

	public static void main(String[] args) {
		
		/*
		 * 사용자에게 수장하고 싶은 이름을 입력 받아서,
		 * 해당 이름이 있으면, 수정할 이름을 새롭게 입력 받습니다.
		 * 
		 * 만약에 값이 없으면 "이름은 존재하지 않습니다" 를 출력합니다.
		 * 
		 * 문자열의 비교
		 * 문자열.equals(비교할문자열)
		 */
		String[] arr = {"강타", "문희준", "토니안", "이재원", "장우혁"};
		
		boolean flag = false; //찾으면, true로 변경할것임
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수정할 학생의 별명을 입력>");
		String a = scan.next();
		int num = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(a)) {
				num = i;
			}
		}
		if (arr[num].equals(a)) {
			System.out.println(a + "별명을 변경합니다");
			System.out.print(">");
			String b = scan.next();
			arr[num] = b;
			System.out.println(Arrays.toString(arr));
		} else {
			System.out.println("별명이 존재하지 않습니다");
		}
		
		
		/*String[] arr = {"강타", "문희준", "토니안", "이재원", "장우혁"};
		
		boolean flag = false; //찾으면, true로 변경할것임
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수정할 학생의 별명을 입력>");
		String a = scan.next();
		int num = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(a)) {
			System.out.println(a + "별명을 변경합니다");
			System.out.print(">");
			String b = scan.next();
			arr[i] = b;
			flag = true;
			break;
			}
		}
		if (flag) {

			System.out.println(Arrays.toString(arr));
		} else {
			System.out.println("별명이 존재하지 않습니다");
		}
		 */
	}
}

