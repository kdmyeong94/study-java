package day10;

import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {
		// 사용자에게 나이를 입력받아서 미성년자인지 아닌지 판단하는 메서드
		MethodTest mt = new MethodTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		mt.isAdult(age);
			
	}
	
	public void isAdult() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		if ( age > 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자입니다.");
		}
	}
	
//	public void isAdult(int age) {
//		
//		
//		if ( age > 19) {
//			System.out.println("성인입니다.");
//		} else {
//			System.out.println("미성년자입니다.");
//		}
//	}
	
	public boolean isAdult(int age) {
		if (age <19) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
