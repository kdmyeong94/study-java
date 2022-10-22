package day05;

public class RelationalOperator {

	public static void main(String[] args) {
		
		System.out.println(10 > 15);
		System.out.println(10 < 15);
		System.out.println(10 <= 13.1);
		System.out.println(10 == 'a');
		System.out.println('a' > 'b');
		
//		문자열은 관계연산자 사용 불가능
//		String은 클래스이기 때문에, 기본 자료형처럼 비교 할 수가 없다.
//		System.out.println("안녕" >= "반가워"); //error
		System.out.println("안녕" == "안녕");
		
//		메소드를 사용해서 문자열이 같은지 확인 할 수 있는 방법도 존재한다.
//		문자열1.equals(문자열2) : 문자열1과 문자열2가 같다면 true, 아니면 false
		System.out.println("-----------------------");
		System.out.println("안녕".equals("안녕"));
		System.out.println("안녕".equals("안녕222"));
		System.out.println("-----------------------");
		
		System.out.println(false == false);
		
			
		
		

		
		
	}

}
