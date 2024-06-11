package day04;

import java.util.Iterator;

public class MultiForEx03 {

	public static void main(String[] args) {
		
		//바깥에 반복횟수에 따라서 다르게 회전하는 반복문
		
//		for(int i = 1; i <= 5; i++) {
//			
//			for(int j = 1; j <= i; j++) {
//				System.out.println(i + "-" + j);
//			}
//		}
		int star = 5;
		for(int i = 1; i <= star; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		System.out.println("----------------");
		
		/*
		 *****
		 ****
		 ***
		 **
		 *
		 */
//		
//		for(int i = 1; i <= star; i++) {//행
//			for(int j = 1; j <= star + 1 - i; j++) {
//				System.out.print("*");
//			}
//		System.out.println(); //줄바꿈
//		}
		for(int i = 1; i <= star; i++) {
			
			for(int j = star + 1 - i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		/*
		     *
		    **
		   ***
		  ****
		 *****
		 */
		int num = 5;
		for(int i = 1; i <= num; i++) { //공백출력하는 for
			for(int j = 1; j <= num-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {//별을 출력하는 for
				System.out.print("*");
			}
			
			System.out.println();
	    }
		
		
		System.out.println("-----------------");
		/*
		    *
		   ***
		  *****
		 *******
		*********
		 */
		int pyramid = 5;
		for(int i = 1; i <= pyramid; i++) {
			
			for(int j = 1; j <= pyramid - i; j++) {//공백찍음
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i * 2 - 1; j++) {// 별 찍음 1,3,5,7,9  i값에 따라서~
				 System.out.print("*");
			}
		System.out.println();
		
		System.out.println("------------------");
		
//		int sand = 5;
//		for(int i = 1; i <= sand; i++) {
//			for(int j = 1; j <= Math.abs(7-(i*2)); j++) {
//				System.out.println("*");
//			}
//			for (int k = 1; k < 2*i; k++) {
//				System.out.println(" ");
//			}
//		}
//		
		}
			
	}
		
		
	
}
