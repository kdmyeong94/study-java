package day09;

public class MethodTest2 {

	String name = "김참이"; // 전역변수
	
	
	
	public static void main(String[] args) {
		MethodTest test = new MethodTest();
		MethodTest2 test2 = new MethodTest2();
		
//		test.printPB(); // public 모든 접근이 가능하기에 실행 o
//		test.printPV(); // private은 같은 클래스 내에서만 실행이 가능하기 때문에 여기서 실행하면 에러발생
//		test.printPT(); // protected는 같은 패키지 내에 있기 때문에 다른 클래스에서도 실행 가능
//		test.printDF(); // default도 같은 패키지 내에 있기 때문에 다른 클래스에서 실행 가능
		
		test2.name();
		test2.yourname();
		
	} // 2
	 
	public void name() {
		System.out.println(name); // 전역변수로 선언되어 있기에 접근가능
		String name = "유창희";
		System.out.println(name); // 메소드 내 선언된 변수와 전역 변수의 이름이 같을 경우 메소드 내 선언된 변수 먼저 바라본
	}
	
	public void yourname() {
		System.out.println(name); // 전역변수로 선언되어 있기에 접근 가능
	}
	
	
	
	
}  //1
