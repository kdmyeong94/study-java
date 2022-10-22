package day06;

import java.util.Scanner;

public class IfTest {
 
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
//		if(false) {
//				// 조건식이 참일 때 실행되는 문장
//			System.out.println("조건식이 참일 때 실행되는 문장");
//		} else {
//			// 상단의 조건식이 거짓일 때 실행되는 문
//			System.out.println("상단의 조건식이 거짓일 때 실행되는 문장");
//		}
//		
//		System.out.println("프로그램 끝");
		
//		사용자에게 정수를 입력받아 짝수면 짝수입니다.
//		홀수면 홀수입니다. 출력하기

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 >> ");
		int a = sc.nextInt();
		
		if( a % 2 == 0) {
			System.out.println("짝수입니다.");
			
		} else {
			System.out.println("홀수입니다.");
		}
	}
}
