package day10;

public class StaticTest {

	static int i = 10;
	
	
	
	public static void main(String[] args) {
		StaticTest.printTest();
		
		// 바로 호출하지 못하는 이유
		// 1. i라는 변수는 StaticTest class가 객체화 되지 않아 ( 즉, heap 영역에 생성되지 않아) 접근 할 수가 없다.
		// 2. main은 Static이라서 프로그램 실행 시 , 자동메모리에 저장되어 있지만, i변수는 그렇지 않아 아직 생성되기 전 시점이다.
		
		//1번 문제에 대한 해결법
//		StaticTest st = new StaticTest();
//		System.out.println(st.i);
//		
		//2번 문제에 대한 해결법
		// 이전 전역변수 int i = 10; 을
		// static int i = 10; 으로 수정후
//		System.out.println(StaticTest.i);
		
		
		
//		School sc = new School();
	
	}
	
	public static void printTest() {
		System.out.println("printTest Method 실행");
	}
	
	
}
