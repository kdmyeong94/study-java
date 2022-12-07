package api;

public class Main {

	public static void main(String[] args) {
		//계산기 api 적용 후 사용
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(10, 100));
		System.out.println(cal.minus(100, 50));
		System.out.println(cal.multiply(1, 50));
		System.out.println(cal.divide(50, 2));
		
		
		// SI , 솔루션, 서비스
		// 솔루션 : API를 만들어 제공, 판매하는 회사.
	}
	
}
