package inheritance;

public class SuperCar extends Car{
//
	private String mode;
//	
//	public SuperCar() {
//		super(); // 클래스를 만들 때, 부모클래스를 생성하는 생성자도 함께 정의되어있다. ( 보이지 않아도 )
//		// = new Car();
////		System.out.println("SuperCar 객체가 만들어집니다.");
//	}
//	
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	public String getMode() {
		return mode;
	}
	
	@Override
	public void show() {
		super.show(); // super : 해당 클래스의 부모 클래스를 의미한다. 여기서 super는 car 클래스를 바라본다.
		System.out.println("모드 : " + getMode());
	}
	
//	
//	// 어노테이션 오버라이드 : 메서드 재정의
//	// 부모클래스에 있는 메서드가 자식에서는 다르게 동작해야 할 때
//	// 메서드를 재정의 할 수 있고, 이를 오버라이딩이라고 한다.
	@Override // 어노테이션 주석 : 컴퓨터에게 설명하기 위한 주석
	public void engineOn() {
		System.out.println("버튼시동");
	}
//	
//	
//	public void engineOn(int i ) {
//		System.out.println("버튼시동");
//	}
	
}
