package day06;

import java.util.Scanner;

public class IfTask {

	public static void main(String[] args) {
		
		// 사용자에게 점수입력받는다(정수)
	      // 90점 이상은 A
	      // 80점 이상 90점 미만 B
	      // 70점 이상 80점 미만 C
	      // 70점 미만 F
	      // 출력 예시 : 당신의 학점은 ??입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 >> ");
		
		int a = sc.nextInt();
		
		System.out.print("당신의 학점은");
		if(a >= 90) {
			System.out.println("A");
		} else {
			if( a >= 80 && a <90 ) {
				System.out.println("B");
			} else {
				if( a >= 70 && a < 80){
					System.out.println("C");
				} else {
					System.out.println("F");
				}
			}
		}
		System.out.println("입니다.");
		
//		if( a >= 90) {
//			System.out.println("당신의 학점은 A입니다.");
//		} else if( a >= 80 && a < 90) {
//			System.out.println("당신의 학점은 B입니다.");
//		} else if (a >= 70 && a <80 ) {
//			System.out.println("당신의 학점은 C입니다.");
//		} else if ( a < 70) {
//			System.out.println("당신의 학점은 f입니다.");
//		}
		
		
//		char grade = 0;
		
//		if( a >= 90) {
//			grade = 'A';
//		} else if( a >= 80 && a < 90) {
//			grade = 'B';
//		} else if (a >= 70 && a <80 ) {
//			grade = 'C';
//		} else if ( a < 70) {
//			grade = 'F';
//		}
//		System.out.println("당신의 학점은" + grade + "입니다.");
		
			
			
	}
	
}
