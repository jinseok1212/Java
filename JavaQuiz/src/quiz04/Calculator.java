package quiz04;

public class Calculator {

	

	int result;
	double pi = 3.14;
	
	void add(int a) {
		result += a;
		System.out.println(result);
	}
	void circle(int r) {
		System.out.println(pi * r * r);
	}
}
