package day09.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		
//		me.setYear(2025);
		me.setYear(2024);
		me.setMonth(12);
		me.setDay(23);
		me.setSsn("970422-1111111");

		int year = me.getYear();
		int month = me.getMonth();
		int day = me.getDay();
		String ssn = me.getSsn();
		
		System.out.println("년도:" + year);
		System.out.println("월:" + month);
		System.out.println("일:" + day);
		System.out.println("주민번호:" + ssn);
	}
}
