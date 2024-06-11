package day11.abstract_.good;

public class BusanStore extends Store{

	@Override
	public void melon() {
		System.out.println("부산지점 멜론 100원");
	}

	@Override
	public void apple() {
		System.out.println("부산지점 사과 200원");
	}

	@Override
	public void orange() {
		System.out.println("부산지점 오렌지 300원");
	}

}
