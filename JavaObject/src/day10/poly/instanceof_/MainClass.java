package day10.poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {
		

		Person s1 = new Student("홍길동", 20, "123123");
		Person t1 = new Teacher("세종대왕", 30, "국어");
		Person e1 = new Employee("장영실", 20, "개발부");
		
		personInfo(s1);
		personInfo(t1);
		personInfo(e1);
	
	}
	//메서드 - 매개변수로 Person 타입을 받는
	public static void personInfo(Person p) {
		
		//적잘하게 캐스팅
		if(p instanceof Employee) { //p가 Employee타입을 가졌다면 true
			
			Employee e = (Employee)p;
			System.out.println("임플로이 캐스팅 완료!");
			System.out.println(e.info());
		} else if(p instanceof Student) {
			System.out.println("스튜던트 캐스팅 완료!");
			Student s = (Student)p;
			System.out.println(s.info());
		} else if (p instanceof Teacher) {
			System.out.println("티쳐 캐스팅 완료!");
			Teacher t = (Teacher)p;
			System.out.println(t.info());
		}
	}
	
	
}
