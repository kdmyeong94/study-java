package day09;

public class MethodTest {

	// static : 프로그램을 실행할 때, 가장 먼저 준비되게 하는 문법
	public static void main(String[] args) {
		MethodTest test = new MethodTest();
		
		//선언된 메소드 호출
//		test.printHi();
//		test.printHello();
		
//		test.printPV(); //같은 클래스 내에 선언된 메소드라서 호출이 가능하다.
		
		
//		nextInt(); : int
//		next() : String
//		정수 10을 반환하는 메소드
//		System.out.println(test.intMethod());
//		System.out.println(test.doubleMethod());
		
//		a와 b를 더해주는 메소드
//		System.out.println(test.add(1, 2));
		System.out.println(test.addDouble(1.1, 2.2));
		
		
	}
	
	public double addDouble(double a , double b) {
		return a + b;
	}
	
	
	public int add(int a, int b) {
		return a + b;
	}
	
	
	
	
	public int intMethod() {
		return 10; // return은 메소드에서 값을 반환 할 때 사용.
	}
	
	public double doubleMethod() {
		return 10.101; // return은 메소드에서 값을 반환 할 때 사용.
	}
	
	
	
	public void printHi() {
		System.out.println("Hi");
	}
	
	public void printHello() {
		System.out.println("Hello");
	}
	
	public void printPB() {
		System.out.println("public Method입니다");
	}
	
	private void printPV() {
		System.out.println("private Method 입니다.");
	}
	
	protected void printPT() {
		System.out.println("protected Method 입니다.");
	}
	
	void printDF() {
		System.out.println("default Method 입니다.");
	}
	
	
	
	
	
	
}
