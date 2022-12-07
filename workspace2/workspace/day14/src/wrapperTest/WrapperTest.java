package wrapperTest;

public class WrapperTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		// 권장하지 않는다는 표시
		Integer num2 = new Integer(10);
		int num3 = 10;
		Integer num4 = new Integer(10);
	
		String str1 = new String("홍길동");
		String str2 = "홍길동";
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(num2.toString());
		
		System.out.println("-----------------------");
		System.out.println(num1==num3); //true
		System.out.println(num2==num4); //false
		System.out.println(num2.equals(num4)); // true
		
		System.out.println(num2.hashCode());
		System.out.println(num4.hashCode());
		
		// 주소값은 다르다.
		System.out.println(System.identityHashCode(num2));
		System.out.println(System.identityHashCode(num4));
		
		// 상수와 객체 비교
		// Integer인 num2가 int로 auto unboxing 되어 비교된다.
		System.out.println(num1 == num2);
		
		// 객체와 상수 비교
		// int인 num1이 Object로 auto boxing되어 비교된다.
		System.out.println(num2.equals(num1));
		
		
	}
	
}
