package day06;

import java.util.Scanner;

public class IfTest3 {
	public static void main(String[] args) {
		
		//사용자에게 정수 입력받아
		// 3의 배수라면 3의 배수입니다.
		// 4의 배수라면 4의 배수입니다.
		//출력하기
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 입력 >> ");
//		int a = sc.nextInt();
//		
//		if(a % 3 == 0) {
//			System.out.println("3의배수입니다.");
//		} else {
//			if( a % 4 == 0) {
//				System.out.println("4의배수입니다.");
//						
//		} else {
//			System.out.println("3과 4의 배수가 아닙니다.");
//		}
//		}	
		
//		강사님풀이
//		1. 3의 배수인가?				if문의 첫번째 조건
//		2. "3의 배수입니다. " 출력하기	true일 때 실행코
//		3. 1의 조건이 아니라면			else
//		4. 4의 배수인가?				else if 조건
//		5. 4의 배수입니다.				true일때 실행코드
		
		int num = 9;
		
		if(num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else if(num % 4 == 0) {
			System.out.println("4의 배수입니다.");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
