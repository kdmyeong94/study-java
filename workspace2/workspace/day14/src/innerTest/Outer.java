package innerTest;

public class Outer {
	
	int ov = 10;
	static int sov = 20;
	//인스턴스 내부 클래스 : 클래스 내부에 선언된 클래스
	class InnerInstance{  // 인스턴스 내부 클래스
		int iiv = 20;
		
		public void iif() {
			System.out.println("InnerInstance 클래스 속의 메서드");
		}
	}
	
	// 스태틱 클래스
	static class InnerStatic{
		int isv = 30;
		public void isf() {
			System.out.println("InnerStatic클래스 속의 메서드");
		}
	}

	
	
	// 지역 클래스
	public void of() {

		
		class InnerLocal{ // 지역 클래스 : 해당 메서드 내부에서만 사용 할 수 있다.
			int liv = 40;
			
			public void hi() {
				System.out.println("InnerLocal클래스 속의 메서드");
			}
			
		}
		
		InnerLocal il = new InnerLocal();
		System.out.println(il.liv);
		il.hi();

		System.out.println("일반 메서드");
		
	}
	
}
