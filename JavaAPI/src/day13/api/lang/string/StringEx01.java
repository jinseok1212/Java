package day13.api.lang.string;

import java.util.Arrays;

public class StringEx01 {

	public static void main(String[] args) {
		
		String str = "홍길동 입니다~! 안녕하시요?";
		String str2 = new String("홍길동");
		String str3 = new String(new char[] {'홍', '길', '동'});
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		//charAt() - 문자열 자르기
		System.out.println(str.charAt(0));
		
		//substr()
		System.out.println(str.substring(0, 5)); //0이상 5미만 문자열 추출 
		System.out.println(str.substring(5)); //5미만 절삭
		
		//split()
		String[] arr = str.split(" "); //구문자 기준으로 문자열 자름
		System.out.println(Arrays.toString(arr));
		
		//toCharArray()
		char[] arr2 = str.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("----------------------");
		
		//문자열 찾기
		str = "아 좋다 좋아";
		System.out.println(str.indexOf("아")); //"아"가 있는 위치
		System.out.println(str.lastIndexOf("아")); //"아"가 뒤에서 발견되는 위치
		System.out.println(str.indexOf("헑")); // 없으면 -1 반환
		
		if(str.indexOf("헑") != -1) { //헑 이라는 문자가 있다는 조건
			
		}
		//문자열길이
		System.out.println(str.length()); //문자열의 길이 반환
		
		//알파벳의 대소문자 변경
		str = "Hello World Happy Day";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println("----------------------");
		
		//양측 공백제거
		str = "    abcaa 123    ";
		System.out.println(str.trim());
		//모든 공백제거 (문자열 변경)
		System.out.println(str.replace(" ", ""));		
		System.out.println(str.replace("a", "헑"));//원본 문자에는 반영되지 않음
		
		str = str.replace(" ", "");
		System.out.println(str);
		
		System.out.println("-----------------------------");
		
		//문자열 비교
		if("홍길동".equals("홍길동")) {
			System.out.println("같음");
		}
		//문자열 대소비교 - 사전등재순 기준으로
		System.out.println("홍길동".compareTo("이순신")); //뒤에 문자가 사전적으로 앞에있음
		System.out.println("홍길동".compareTo("홍길자")); //뒤에 문자가 사전적으로 뒤에있음
		System.out.println("홍".compareTo("홍")); //0이 나오면 같은 문자
		
		//문자열 합치기
		System.out.println(String.join("->", "서울", "대구", "대전", "부산", "찍고!"));
		
		//기본타입을 -> 문자열로 형변환
		System.out.println(String.valueOf(3) + String.valueOf(3));
		
		//포함하는지 확인
		System.out.println(str.contains("홍"));
	}
}
