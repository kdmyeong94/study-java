package day14;

import api.Calculator;
import innerTest.Outer;

//public class Method {
public class Method<T> {

	public void f1(T t) {
		
	}

	
//	---------------------------------------
	// 오브젝트 객체로 받더라도 다운캐스팅이 필요
//	public void f1(Object o) {
//		if ( o instanceof String) {
////			((String)o)
//		} else if (o instanceof Car) {
////			((Car)o)
//		}
//	}
	
	
//	---------------------------------------
//	메서드를 쓰고 싶은 타입에 맞게 할수 있으나 효율 떨어짐
//	public void f1(String a) {
//		// String을 활용하는 코드
//	}
//	
//	public void f1(Car c) {
//		
//	}
//	
//	public void f1(Calculator c) {
//		
//	}
//	
//	public void f1(Outer o) {
//		
//	}
	
	
	
}
