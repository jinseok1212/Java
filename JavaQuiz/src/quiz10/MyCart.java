package quiz10;

public class MyCart {
	//1. 모든 변수와 메서드에 접근제한자를 선언하세요.
	private int money;
	private Product[] cart = new Product[1]; //상품을 저장할 배열
	private int i = 0; //상품개수
	
	//2. MyCart의 생성자는 money만 받아서 초기화
	public MyCart(int money) {
		this.money = money;
	}
	
	/* 
	 * 3. buy(모든 상품을 받도록 선언)
	 * 접근제어자 퍼블릭
	 
	 * 가진돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 종료
	 * 가진돈이 충분하면 물건의 가격을 money에 빼고
	 * add(상품)을 호출해 줍니다.
     */ 	
	public void buy(Product p) {
		cart[i] = p;
		if (money < p.price) {
			System.out.println("금액부족");
		} else {
			money -= p.price;
			add(p);
		}
	}
	
	/* 
	 * 4. add(모든 상품을 받도록 선언)
	 * 접근제어자 프라이빗
	 *
	 * 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 * 기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 * 기존의 장바구니 값을 새로운 배열에 복사.
	 * 새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 
	 * 상품을 장바구니에 담는다.
	 * 
	 */
	private void add(Product p) {
		if(i >= cart.length) { // 2배증가
//			배열 = Arrays.copyOf(cart, cart.length * 2);
			Product[] cart2 = new Product[cart.length*2];
			for(int i = 0; i < cart.length; i++) {
				cart2[i] = cart[i];
			}
			cart = cart2;//멤버변수를 newArr로 변경
			cart2 = null;
		}
		cart[i] = p;
		i++;
		
	}

	/*
	 * 5.info()
	 * 
	 * instanceof 를 적용해보면 좋을것 같아요
	 *
	 * 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
	 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력
	 * 남은금액 출력
	 * 메인에서 buy메서드 실행 
	 * 
	 */
	int total = 0;
	public void info() {
		for(int j = 0; j < i; j++) {
		if(cart[j] instanceof Computer) {
			System.out.println(cart[j].name);
			total += cart[j].price;

		}
		if(cart[j] instanceof Radio) {
			System.out.println(cart[j].name);
			total += cart[j].price;

		}
		if(cart[j] instanceof Tv) {
			System.out.println(cart[j].name);
			total += cart[j].price;
		}
		}
		
		System.out.println("장바구니의 총합:" + total);
		System.out.println("남은금액:" + money);
	}
	
	
}
