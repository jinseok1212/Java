package quiz21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		
		String str = "헐2,500원 ㅋㅋㅋ 찾아보시지 1,200원 6000원";
		
		String pattern = "[0-9]+,?[0-9]+원";
		Pattern p1 = Pattern.compile(pattern); //정규표현식
		Matcher m1 = p1.matcher(str);
		while(m1.find()) {
			System.out.println(m1.group());
			
		}
	}
}
