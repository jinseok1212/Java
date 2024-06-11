package day10.poly.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		//배열의 다형성 - 타입을 통일할 수 있음
		
//		Student s1 = new Student("홍길동", 20, "123123");
//		Student s2 = new Student("이순신", 30, "222222");
//		Student s3 = new Student("홍길자", 20, "333333");
//		
//		Teacher t1 = new Teacher("세종대왕", 30, "국어");
//		Teacher t2 = new Teacher("신사임당", 20, "미술");
//		
//		Employee e1 = new Employee("장영실", 20, "개발부");
//		
//		Student[] students = {s1, s2, s3};
//		Teacher[] teachers = {t1, t2};
//		Employee[] emps = {e1};

		//배열의 다형성 - 타입을 통일할 수 있음

		Person s1 = new Student("홍길동", 20, "123123");
		Person s2 = new Student("이순신", 30, "222222");
		Person s3 = new Student("홍길자", 20, "333333");
		Person t1 = new Teacher("세종대왕", 30, "국어");
		Person t2 = new Teacher("신사임당", 20, "미술");
		Person e1 = new Employee("장영실", 20, "개발부");
		
		Person[] persons = {s1, s2, s3, t1, t2, e1}; //부모타입 배열에 자식을 담을 수 있음
		
		for(Person p : persons ) {
			System.out.println(p.info() ); //오버라이딩된 메서드가 실행됨
		}
		System.out.println("---------------------------------------------------------------------------------");
		//매개변수에도 다형성이 적용 됩니다.
		
		House h = new House();
		h.checkIn(s1);
		h.checkIn(s2);
		h.checkIn(s3);
		h.checkIn(t1);
		h.checkIn(t2);
		h.checkIn(e1);
		
		h.confirm();
		
		
		
		
		
		
	
	}
}
