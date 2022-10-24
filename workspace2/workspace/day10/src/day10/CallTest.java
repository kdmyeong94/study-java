package day10;

public class CallTest {

	int value = 10;
	
	public static void main(String[] args) {
	
		int a = 10;
		int b = a;
		b = 50;
		
		System.out.println(a); // 10 
		System.out.println(b); // 50
		
		CallTest ct1 = new CallTest();
		ct1.value = 10;
		
//		CallTest ct2 = ct1;  // 주소값 공유를 막기 위해서는 다음과 같이 새로 객체를 생성하여 복사해야한다.
		CallTest ct2 = new CallTest();
		ct2.value = 50;
		
		System.out.println(ct1.value);
		System.out.println(ct2.value);		
		
	}
	
	
	
	
	
}
