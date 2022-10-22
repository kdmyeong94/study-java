package day08;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		
//		for(int i = 0 ; i <3 ; i++) {
//			System.out.println("for문 안쪽 문장");
//		}
//		System.out.println("for문 바깥쪽 문장");
		
//		int i = 0;
//		
//		while (i <3 ) {
//			System.out.println("while문 안쪽 문장");
//			i++;
//		}
		
//		while 조건식 확인 : i < 3
//		true 일 때, 내부 코드 실행
//		false일 때 , 종료
		
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("1. 주문하기");
//			System.out.println("2. 종료하기");
//			int choice = sc.nextInt();
//			
//			if ( choice == 2) {
//				break; // 반복문을 즉시 종료
//				
//			}
//					
//		}
		
//		int choice = 0;
//		
//		while(choice != 2) {
//			System.out.println("1. 주문하기");
//			System.out.println("2. 종료하기");
//			
//			choice = sc.nextInt();
//			
//		}
//		
//		int choice = 999999;
//		
//		while(choice != 0) {
//			System.out.println("1. 주문하기");
//			System.out.println("2. 종료하기");
//		}
//		
		
		int choice = 0;
		
//		최초 1번 실행 후 반복
		do {
			System.out.println("1. 주문하기");
			System.out.println("2. 종료하기");
			
		} while(choice != 0);
		
		
		
		
		
		
		
		
		
	}
}
