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
		
		
		Soldier2 s = new Soldier2();
		Soldier3 ss = new Soldier3();
//		s.work();
//		s.eat();
//		s.salute();
		
//		어댑터를 사용하는 이유 중 한가지
		//인터페이스에서 일부만 구현하고 싶을 때
		// 혹은 인터페이스를 직접 상속한 class하고 구분하고 싶을 떄
//		instanceof
		System.out.println(s instanceof Soldier ); // Soldier2는 타입이나 부모 중에 Soldier가 있니?
		System.out.println(ss instanceof Soldier ); // Soldier3는 타입이나 부모 중에 Soldier가 있니?

		
		
		System.out.println(s instanceof SoldierAdapter ); // Soldier2는 타입이나 부모 중에 SoldierAdapter가 있니?
//		System.out.println(ss instanceof SoldierAdapter ); // Soldier3는 타입이나 부모 중에 SoldierAdapter가 있니?
	}
}
