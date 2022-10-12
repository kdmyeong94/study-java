package method;

public class Main02 {

	public static void main(String[] args) {

		plus(10,20);
		
		minus(20,10);
		
		multi(10,20);
		
		divis(20,4);
		
		
	} //2
	
	
	public static void plus(int x, int y ) {
		System.out.println( x + y);
		
	}
	
	public static void minus(int x, int y) {
		System.out.println(x - y);
	}
	
	public static void multi(int x, int y) {
		System.out.println( x * y);
		
	}
	
	public static void divis(int x, int y) {
		if(x <= 0 || y <= 0) {
			System.out.println("다시 입력해주세요");
		} else {
			System.out.println( x / y);
		}
		
		
	}
	
	
} //1
