package day09.encap.bad;

public class MainClass {

	public static void main(String[] args) {
		
		//은닉이 없다면, 잘못된 값이 저장될 수도 있습니다.
		//또는 중요한 값을 누구나 가져갈 수도 있습니다.
		MyDate me = new MyDate();
		me.year = 2024;
		me.month = 12;
		me.day = 32;
		me.ssn = "이게 뭥미";
		
		String ssn = me.ssn;
		
		me.info();
		
	}
}
