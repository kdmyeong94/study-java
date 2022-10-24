package day10;

public class User {

	public static void main(String[] args) {
		
	// 김철수
	Bank kim = new Bank();
	// 박영희
	Bank park = new Bank();
	
	
		// 철수 입금
		kim.money = 10000;
		System.out.println(kim.money);
		
		// 영희 입금
		park.money = 50000;
		System.out.println(park.money);

		// 철수 괜히 잔고 조회
		// static 변수이기 때문에, 메모리 변수 값이 고정되어있어, 수정하는 경우 덮어씌워진다
		System.out.println(kim.money);
	}
}
