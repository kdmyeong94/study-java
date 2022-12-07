package innerTest;

public class Main {

	public static void main(String[] args) {
		
//		Outer o = new Outer();
		
//		System.out.println(o.ov);
//		o.of();
		
		// 인스턴스 클래스의 생성자는
		// 인스턴스.new 생성자();
//		Outer.InnerInstance oii = o.new InnerInstance();
//		
//		System.out.println(oii.iiv);
//		oii.iif();
		
		
		// 스태틱 클래스
		
		// 객체 생성 > 변수 접근이 아닌
		// 스태택 > 프로그램 실행할떄 바로 메모리에 올라간다.
		// 즉, 객체 생성하기 전에 이미 메모리에 올라가있다.
//		Outer.InnerStatic ois = new Outer.InnerStatic();
//		
//		System.out.println(ois.isv);
//		ois.isf();
		// 사용법은 있지만, 애초에 이렇게 사용 될 일이 존재하면 잘못 만들어진 클래스
		
		
		//익명클래스
//		Car myCar = new Car();
		Car myCar = new Car() { // 클래스를 새롭게 정의하는 부분, 익명클래스
			@Override
			public void engineOn() {
				System.out.println("버튼 시동");
			}
			public void openRoof() {
				System.out.println("선루프 오픈");
			}
		};
		
		myCar.engineOn();
//		myCar.openRoof();
		
		
	}
	
}
