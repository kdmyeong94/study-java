package InterfaceTest;

public class Main {

	public static void main(String[] args) {
//		Test test = new Test();
//		
//		System.out.println(test.test);
		
		System.out.println(Test.test);
		Test.method();
		
		Test test1 = new Test();
		test1.test =20;
		Test test2 = new Test();
		System.out.println(test2.test);
		
	}
}
