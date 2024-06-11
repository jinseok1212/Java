package quiz17;

public interface IUserManagement {
	//클래스가 가져야하는 추상메서드 선언
	//추가
	public void insert(String name, int age);
	//출력
	public void printList();
	//검색
	public boolean search(String find);
	//삭제
	public boolean delete(String delete);
}
