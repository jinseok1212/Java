package day14.generic.basic;

public class DEF<T, C> { //멀티제네릭 - 
	
	//t = 키, c = 값
	private T key;
	private C value;
	
	public void put(T key, C value) {
		this.key = key;
		this.value = value;
	}

	public C get(T key) {
		return value;
	}
	
}
