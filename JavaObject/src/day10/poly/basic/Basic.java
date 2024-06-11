package day10.poly.basic;
/*
 * 하나의 클래스 파일에는 여러 클래스 선언이 가능합니다.
 * 단, 파일명과 동일한 클래스가 있어야하고, 해당 클래스만 public이어야 합니다.
 */
class A {}
class B extends A {};
class C extends A {};
class D extends B {};
class E extends C {};


public class Basic {
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a1 = b; // B -> A클래스 형변환
	A a2 = new B();
	A a3 = new C();
	A a4 = new D();
	A a5 = new E();
	
	//상속 관계가 없으면 다형성이 불가능
//	B b2 = new E();
	
	//object에는 모든 클래스가 저장됩니다.
	Object o1 = a;
	Object o2 = 3.14;
	Object o3 = "홍길동";
	Object o4 = new B();
	
}
