package day07;

public class PhoneMain {

	public static void main(String[] args) {
		Phone red = new Phone(); //new 생성자()
		red.info();
		
		
		Phone black = new Phone("검정");
		
		black.info();
		
		Phone white = new Phone("흰색", 10000);
		white.info();
		
		Phone blue = new Phone(10000000, "파랑");
		blue.info();
		
		//(색상, 가격, 모델)을 받는 생성자를 만들고, 객체로 생성해보세요.
		Phone brand = new Phone("화이트", 1030430, "모토로라");
		brand.info();
	}
}
