package day05;

public class CastingTest {

	public static void main(String[] args) {

		System.out.println((int)3.1);
		System.out.println((double)10);
		System.out.println((char)97);
//		String은 클래스이기 때문에 기본자료형끼리 변환하듯이 변환 할 수 없다.
//		System.out.println((int)"20");
//		System.out.println((char)"a");
		
//		String -> int
//		parseInt() : Integer 클래스에 만들어져있다.
//		Integer : int 자료 타입을 위해 만들어진 클래스. int의 클래스화
		System.out.println(Integer.parseInt("20"));
		int i = Integer.parseInt("20");
		System.out.println(i);
		
//		int -> String
//		toString()
		String s = Integer.toString(20);
		System.out.println(s);
		
//		String -> double
//		parseDouble() : Double 클래스에 만들어져 있다.
		double b = Double.parseDouble("3.14");
		System.out.println(b);
		
//		double -> String
//		toString() : Double 클래스에 만들어져 있다.
		s = Double.toString(3.14);
		System.out.println(s);
		
//		auto 지원(자동 변환, auto casting)
		double test = 10; // 10이 double 타입으로 바뀐 후 변수에 저장됨(auto casting)
		System.out.println(test);
		
		char c = 65; // 65가 'A'로 자동 형변환이 된다.
		System.out.println(c);
		
//		int ii = 10.1; // double형은 int형으로 자동 형 변환이 되지 않는다.
		
//		s = Integer.toString(10);
		s = 10 + ""; // tostring을 사용하지 않고 String으로 만드는 방법.
		System.out.println(s);

//		연산 결과를 바탕으로 자동형변환을 사용 할 수 있다.
		double dd = 10 + 0.0;
		dd = 10 * 1.0;
		dd = (double)10;
		
		
		
		
		
		
	}

}
