package wrapperTest;

public class BoxingUnboxing {

	public static void main(String[] args) {
		
		int num = 10; // 기본자료형 10, num
		Integer wnum = new Integer(num); // 박싱
		int unboxing = wnum.intValue(); // 언박싱
		
		// 자동지원
		int num2 = wnum; // auto unboxing
		Integer wnum2 = 10; // auto boxing
		
		
		
		
		
	}
}
