package quiz17;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {

	public static void main(String[] args) {
		/*
		 * 1. 숫자를 저장하는 리스트를 만들고, 1~20까지 값을 순서대로 저장
		 * 
		 * 2. UserVO를 저장할 수 있는 리스트를 만들고, User객체 3개를 저장
		 * 
		 * 3. 2번에 저장된 list안에 이름과 나이를 반복문으로 전부 출력
		 * 
		 * 4. 2번에 저장된 list안에, "홍길동" 이 있다면, 홍길동 객체의 이름과 나이를 출력
		 * 
		 * 5. 2번에 저장된 list안에 "홍길동" 이 있다면, 홍길동 객체를 삭제
		 */
		//1
		List<Integer> list = new ArrayList();
		for(int i = 1; i < 21; i++) {
			list.add(i);
		}
		System.out.println(list.toString());
		//2
		List<UserVO> userList = new ArrayList<>();
		userList.add(new UserVO("홍길동",22));
		userList.add(new UserVO("홍길자",23));
		userList.add(new UserVO("홍길길",24));
		//3
		for(int i = 0; i < 3; i++) {
			System.out.println(userList.get(i).getName() + " " + userList.get(i).getAge()); 
		}
		//4
		for(int i = 0; i < userList.size(); i++) {
			if("홍길동".equals(userList.get(i).getName()))
				System.out.println(userList.get(i).getName() +" "+ userList.get(i).getAge());
		}
		//5
		
		for(int i = 0; i < userList.size(); i++) {
			if("홍길동".equals(userList.get(i).getName()))
				userList.remove(i);
		}
		for(int i = 0; i < userList.size(); i++) {
		System.out.println(userList.get(i).getName());
		}
	}
}
