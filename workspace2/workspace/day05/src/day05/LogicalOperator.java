package day05;

public class LogicalOperator {

	public static void main(String[] args) {
		
		System.out.println("------------&&--------------"); // and
//		모든 항이 true 일 때만 true 반환
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
	
		System.out.println("------------||--------------"); // or
//		항 중 하나만이라도 true 일 때 true 반환
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		
		System.out.println("------------!--------------"); // not
//		결과를 반대로 바꿔주는 것
		System.out.println(!true);
		System.out.println(!false);
		
//		System.out.println(!(10 % 2 == 0) && 8 + 10 > 5);
		
		
		
		
	}
}
