package extendsobject;

class Hello {  // 부모클래스
	public void say() {
		System.out.println("Hello");
	}
	
}

class English extends Hello{
	
}

class Korean extends Hello{
	public void say() { //부모클래스 Hello에 정의되어 있는 say() 메서드를 재정의 (override)
		System.out.println("안녕하세요");
	}
}


public class Main03 {

	public static void main(String[] args) {

	English e = new English();
	
	Korean k = new Korean();
	
	e.say(); // 자식 클래스에 구현된 메서드가 없기 때문에, 부모 클래스에 정의된 메서드를 찾아가게 된다.
	
	k.say(); // 자식 클래스가 부모와 같은 이름의 메서드랄 정의하고 있기 때문에, 
			 // k 객체에게는 부모 클래스가 정의하고 있는 say()메서드가 가려지게 된다.
	}

}
