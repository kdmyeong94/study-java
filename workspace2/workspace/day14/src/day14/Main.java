package day14;

public class Main {

	public static void main(String[] args) {
	
		Car c1 = new Car("홍길동", 1515);
		Car c2 = new Car("김철수", 2222);
		Car c3 = new Car("홍길동", 1515);
		Car c4 = new Car("김철수", 1717);
		
//		System.out.println(c1);
//		System.out.println(c1.toString());
//		
//		// 객체를 출력할때, 내부적으로 toString()을 사용해 출력하고 있던 것
//		// 클래스 위치 @ 주소
//		// 따라서 Object 클래스의 toString()을 재정의 한다면
//		// 객체를 쉽게 눈으로 확인하면서 개발 할 수 있다.
//		
//		// 두 객체가 서로 같은지 확인
//		// equals()
//		System.out.println(c1.equals(c3));
//		System.out.println(c1.equals(c4));
//		
//		
//		System.out.println("abc".equals("abc")); // true
//		System.out.println("abc" == "abc"); // true
//		
//		// String은 Class이기 떄문에, 비교할 때, equals를 사용해야 정확한 비교를 할 수 있다.
//		String str = new String("abc");
//		String str2 = new String("abc");
//		
//		System.out.println(str.equals(str2)); // true
//		System.out.println(str == str2); // false
		
//		// 주소값 출력
//		// 두 객체가 서로 논리적으로 같다면 hashCode()까지
//		// 같은 값이 나올 수 있도록 오버라이딩 해주면 좋다.
//		System.out.println(c1.hashCode());
//		System.out.println(c3.hashCode());
//		
//		System.out.println(c1 == c3); // false
//		
//		// 실질적인 참조 주소는 변하지 않는다.
//		System.out.println(System.identityHashCode(c1));
//		System.out.println(System.identityHashCode(c3));
//	
		
		//제네릭
//		Method m = new Method();
//		m.f1("안녕하세요");
//		m.f1(c1);
		
		Method<Car> m = new Method<>();
		m.f1(c4);
//		m.f1("안녕");
		Method<String> ms = new Method<>();
		ms.f1("안녕");
		
		//제네릭은 클래스 타입만 가능하다.
//		Method<int> mi = new Method<>();
		
		Method<Integer> mi = new Method<>();
		Method<Double> md = new Method<>();
		Method<Boolean> mb = new Method<>();
		
	}
	
	
}
