package day11.inter.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		Animal[] arr = {dog, cat, tiger};
		
		for(Animal ani : arr) {
			ani.eating();
		}
		
		System.out.println("----------------------------");
		//IPet배열을 생성하고, IPet에 들어갈 수 있는 타입은 Dog, Cat, GoldFish
		IPet[] arr2 = new IPet[3];
		arr2[0] = (IPet)dog; //Animal과 IPet관계가 없지만, dog가 상호연관성이 있으면, 형변환이 됩니다.
		arr2[1] = (IPet)cat;
		arr2[2] = new GoldFish();//금붕어 -> IPet으로 자동형변환
		
		for(IPet pet : arr2) {
			pet.playing();
		}
		System.out.println("-------------------------");
		PetHouse pet = new PetHouse();
		pet.carePet( (IPet)dog );
		pet.carePet( (IPet)cat );
		pet.carePet( new GoldFish() );
		
		
		pet.petInfo( arr2 );
		
	}
}
