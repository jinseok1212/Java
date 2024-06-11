package day11.inter.basic2;

public class PetHouse {

	/*
	 * 1. 메서드 생성 carePet()
	 * 매개변수 - 펫들의 공통부모타입
	 * 기능 - instanceof 사용해서 적합한 펫타입으로 캐스팅
	 * 반환 - x
	 */
	void carePet(IPet a) {
		if(a instanceof Dog) {
			Dog d = (Dog)a;
			d.playing();
			d.eating();
		} else if(a instanceof Cat) {
			Cat c = (Cat)a;
			c.playing();
			c.eating();
		} else if(a instanceof GoldFish) {
			GoldFish g = (GoldFish)a;
			g.playing();
			g.swimming();
		}
	}
	/*
	 * 2. 메서드생성 petInfo()
	 * 매개변수 - IPet[]
	 * 기능 - 배열반복
	 * 반환 - x
	 * 
	 */
	void petInfo(IPet[] arr) {
		for(IPet h : arr ) {
			h.playing();
			
		}
	}
}
