package quiz11;

public class MyArrays {

	/*
	 * Arrays.toString() 메서드 내가만들기
	 * 
	 * 1. MyArrays는 외부에서 객체로 생성할 수 없어야 됩니다.
	 * -> 생성자에 접근 제어자를 이용해서 객체생성을 하지못하도록..
	 * 2. 메서드 호출시에는 static키워드를 이용해서 사용하도록 만들어줍니다.
	 * 
	 * 3. int[]이나 String[] 이나 Char[] 이 전달되더라도 동일하게 동작하도록
	 * 메서드 오버로딩.
	 */

	private MyArrays() { //외부에서 객체 생성 불가
		
	}
	public static String toString(int[] a) {
		String str = "[";
		for(int i = 0; i < a.length; i++) {
			str += a[i];
			if(i == a.length - 1) {
				break;
			}
			str += ", ";
			
		}
		str += "]";
			return str;
		}
	
	
	public static String toString(String[] a) {
		String str = "[";
		for(int i = 0; i < a.length; i++) {
			str += a[i];
			if(i == a.length - 1) {
				break;
			}
			str += ", ";
			
		}
		str += "]";
			return str;
	}
	public static String toString(char[] a) {
		String str = "[";
		for(int i = 0; i < a.length; i++) {
			str += a[i];
			if(i == a.length - 1) {
				break;
			}
			str += ", ";
			
		}
		str += "]";
			return str;
	}
	
	
	
	
}
