package object;

class Cal2{
//	데이터 타입은 전체 int
//	덧셈 결과 return, 파라미터 2개 메서드 생성
	int a(int x, int y){
		return x + y;
	}
//	뺄셈 결과 return, 파라미터 2개 메서드 생성
	int b(int x, int y) {
		return x - y;
	}
//	곱셈 결과 return, 파라미터 2개 메서드 생성
	int c(int x, int y) {
		return x * y;
	}
//	나눗셈 결과 return, 파라미터 2개 메서드 생성
	int d(int x, int y) {
		int result = 0;
		if(y != 0) {
			result = x / y;
		}
		return result;
	}
}

public class Main05 {

	public static void main(String[] args) {
//	객체 Calc2 클래스로 객체 생성 후
		Cal2 a = new Cal2();
		
//		덧셈
		System.out.println(a.a(5, 5));
//		뺄셈
		
		System.out.println(a.b(5, 5));
//		곱셈
		System.out.println(a.c(5, 5));
//		나눗셈 결과르 각각 출력
		System.out.println(a.d(5, 5));
		
		
		
		
		
}	
	
	
}
