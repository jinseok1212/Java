package quiz05;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyAccount acc = new MyAccount("홍길동", "1234", 1000);

		acc.withDraw(500);
		int bal = acc.getBalance();
		System.out.println(acc.name + "님의 계좌 잔액은: " + bal + "원입니다.");
		
	}
}
