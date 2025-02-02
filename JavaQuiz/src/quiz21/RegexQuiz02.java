package quiz21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		
		String str = "123123-45644 GS25(치킨도시락) 4,400원";
		String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
		String str3 = "123456-3453 GS(갓혜자도시락) 6,000";
		
		String[] arr = {str, str2, str3};
		
		//arr 상품번호, GS25, (상품명), 가격을 정규표현식으로 나눠서 출력.
		String number = "[1-6]{6,6}-[3-6]+";
		String gs = "GS(25)?";
		String name = "\\([가-힣]+\\)";
		String price = "[0-9]+,[0-9]+원?";
		Pattern p1 = Pattern.compile(number);
		Pattern p3 = Pattern.compile(name);
		for(int i = 0; i < 3; i++) {
			Matcher m1 = p1.matcher(arr[i]);
			while(m1.find()) {
				System.out.print(m1.group() + " ");
			}
			Matcher m2 = Pattern.compile(gs).matcher(arr[i]);
			while(m2.find()) {
				System.out.print(m2.group() + " ");
			}
			Matcher m3 = p3.matcher(arr[i]);
			while(m3.find()) {
				System.out.print(m3.group() + " ");
			}
			Matcher m4 = Pattern.compile(price).matcher(arr[i]);
			while(m4.find()) {
				System.out.println(m4.group() + " ");
			}
			
		}
		
	}
}
