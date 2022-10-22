package day06;

import java.util.Scanner;

public class SwitchTask {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//1.사용자에게 점수를 입력받고(단, 점수는 0~100 사이의 정수만 입력받는다.)
		// 90점 이상 100점 이하면 A
		// 80점 이상 90점 미만이면 B
		// 70점 이상 80점 미만이먄 C
		// 70점 미만이면 F
		// 출력예시 >> 당신의 학점은 ??점입니다.
		System.out.println("점수 입력 >> ");
		int a = sc.nextInt();
		
		switch(a) {
		case 90 :
			System.out.println("A");
			break;
		case 80 :
			System.out.println("B");
			break;
		case 70 : 
			System.out.println("C");
			break;
			default :
				System.out.println("F");
				break;
		}
		
//		--------------------------
		
//		char grade = 'F';
//		if( a>= 0 && a <=100) {
//			switch(a/10) {
//			case 10:
//			case 9:
//				grade = 'A';
//				break;
//			case 8:
//				grade = 'B';
//				break;
//			case 7:
//				grade = 'C';
//				break;
//			default :
//				grade = 'F';
//				
//			}
//			System.out.println("당신의 학점은"+ grade +"입니다.");
			
			
			
			
		
		
	
		
		//2. 사용자에게 월을 입력받고 해당 월의 마지막 일 출력하기
		//2월은 28일이 마지막이라고 가정한다.
		
		System.out.println("월 입력");
		
		int m = sc.nextInt();
		
		int day = 0;
		if( m >=1 && m <=12) {
			
		switch(m) {
		case 1 :
		case 3 :
		case 5 : 
		case 7 :
		case 8 :
		case 10 : 
		case 12 : 
			day = 31;
			break;
		case 2 :
			day = 28;
			break;
		case 4 :
		case 6 : 
		case 9 :
		case 11 :
			day = 30;
			break;
		default : 
			break;
		}
		
		System.out.println("마지막 일은" + day + "입니다.");
		}
		else {
			System.out.println("정확한 월을 입력해주세요.");
			
		}
		
	}
}
