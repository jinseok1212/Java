package day09.encap.data;

public class MainClass {
	
	public static void main(String[] args) {
		
		//멤버객체를 2개만듬
		Member m = new Member("홍길동", 20, "naver", "서울시", "010");
		
		Member m2 = new Member();
		m2.setName("이순신");
		m2.setAge(20);
		m2.setEmail("google");
		m2.setAddr("경기도");
		m2.setPhone("010");
		
		//객체배열
		Member[] arr = new Member[2];
		arr[0] = m;
		arr[1] = m2;
		
		//객체배열을 순회
		for(int i = 0; i < arr.length; i++) {

			Member member = arr[i];
			System.out.println(member.getName());
			System.out.println(member.getAge());
		}

		
	}

}
