package day04;

import java.util.Iterator;

public class BreakEx03 {

	public static void main(String[] args) {
		
		//중첩반복에서 break
		//탈출을 위한 변수를 활용
//		boolean bool = false;
//		for(char c = 'A'; c <= 'Z'; c++) {
//			
//			for (char l = 'a'; l <= 'z'; l++) {
//				System.out.println(c + "-" + l);
//				
//				if(l == 'e') {
//					bool = true; //if문을 실행했음을 나타냄
//					break;
//				}
//			}
//		if(bool) { // true였으면 완전탈출
//			break;
//		}
//			
//		}
		//이름붙이기
		//중첩 반복문에서 바깥 반복문을 완전히 탈출하려면 탈출할 반복문에 이름을 붙여줍니다.
		ex:for (int c = 'A'; c < 'Z'; c++) {
			
			for (char l = 'a'; l <= 'z'; l++) {
				System.out.println(c + "-" + l);
				
				if(l=='e') {
					break ex; //탈출할 이름
				}
			}
		}
		
		
	}
}
