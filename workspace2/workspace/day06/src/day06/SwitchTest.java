package day06;

public class SwitchTest {

	public static void main(String[] args) {
		
		
		int num = 2;
		
		System.out.println("프로그램 시작");
		
		switch(num) {
			case 1:
				System.out.println("1입니다.");
			case 2:
				System.out.println("2입니다.");
				break;
			case 5:
				System.out.println("5입니다.");
			case 10:
				System.out.println("10입니다.");
			default:
				System.out.println("default입니다.");
		}
		
		
		System.out.println("프로그램 끝");
		
		
		
		
	}
}
