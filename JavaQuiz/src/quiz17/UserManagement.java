package quiz17;

import java.util.ArrayList;
import java.util.List;

public class UserManagement implements IUserManagement{
	
	//값을 저장할 리스트
	private List<UserVO> list = new ArrayList<>();
	
	//회원정보 추가
	public void insert(String name, int age) {
		list.add(new UserVO(name, age));
	}
	//회원정보 출력
	public void printList() {
		System.out.println("=======회원정보 출력=======");
		for(int i = 0; i < list.size(); i++) {
			UserVO uv = list.get(i);
			System.out.println("이름: " + uv.getName() + " 나이: " + uv.getAge());
		}
	}
	//회원정보 검색
	public boolean search(String find) {
		boolean flag = false;
		for(int i = 0; i < list.size(); i++) {
			UserVO uv = list.get(i);
			if(uv.getName().equals(find)) { // 입력받은 회원 이름을 찾음
				System.out.println("이름: " + uv.getName() + "나이: " + uv.getAge());
				flag = true; //이프문을 실행했음.
			} 
		}
		return flag;
	}
	
	//회원정보 삭제
	public boolean delete(String delete) {
		boolean flag = false;
		for(int i = 0; i < list.size(); i++) {
			UserVO uv = list.get(i);
			if(uv.getName().equals(delete)) {
				list.remove(i);
				flag = true;
				break;
			}
		}
		return flag;
	}
}
