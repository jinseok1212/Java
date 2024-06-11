package day09.modi.member.pac1;

public class B {

	public B() {
		A a = new A();
		a.var1 = 1;
		a.var2 = 2;
//		a.var3 = 3; //private(x)
		a.method01();
		a.method02();
//		a.method03(); //private(x)
		//////////////////////////
		//protected
		A aa = new A(1);
		aa.var = 1;
		aa.method();
		
	}

}
