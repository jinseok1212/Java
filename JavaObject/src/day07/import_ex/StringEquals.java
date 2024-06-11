package day07.import_ex;

public class StringEquals {

	public static void main(String[] args) {
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//동일한 문자를 동일 클래스에서 선언하면, 동일한 주소를 바라보게 됩니다.
		//다른 클래스에서 넘어오거나, 직접 문자열을 생성하면 String이 다른 주소를 가지게 됩니다.
		System.out.println(str1 == str2); //주소값 비교
		System.out.println(str1 == str3); //주소값 비교
		
		//그래서 문자열 비교시에는 equals 문자열 자체를 비교하게 됩니다.
		if(str1.equals(str3)) {
			System.out.println("문자열 자체가 같음");
		}
		
		
	}
	
}
