package day06;

import java.util.Scanner;

public class IfTest2 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			// 7. 두 정수를 입력받고 둘 중 더 큰수를 출력. 같다면 같다고 출력
		      // 입력예시
		      //  정수1입력 >> 50
		      //  정수2입력 >> 20
		      // 출력예시
		       // 50
			
			System.out.println("정수1 입력 >> ");
			int num1 = sc.nextInt();
			System.out.println("정수2입력 >>");
			int num2 = sc.nextInt();
			
//			System.out.println(num1 > num2 ? num1 : (num1==num2 ? "같다" : num2));
			
			if(num1>num2) {
				System.out.println(num1);
				
			} else {
				if(num1 == num2) {
					System.out.println("같다");
					
				} 	else {
					System.out.println( num2 );
				}
			}
			
			
			 
			// 8. target에 대문자 혹은 소문자 혹은 그 외의 문자가 들어갈 수 있고,
		      // 대문자와 소문자는 서로 바꿔 출력하지만(대문자 >> 소문자 / 소문자 >> 대문자)
		      // 그 외의 문자는 그대로 출력하기
			char target = 'C';
			
			System.out.println(target >= 'A' && target <= 'Z' ? (char)(target + 32) : 
		    	  (target >= 'a' && target <= 'z' ? (char)(target -32) : target));
//			1. 조건식이 : target >= 'A' && target <= 'Z'
//			2. 조건식이 TRUE 일때 : (char)(target + 32)
//			3. 조건식이 FALSE 일때 : 삼항연산자 한번 더 진입
//			4. 조건식 : target >= 'a' && target <= 'z'
//			5.4번 조건식이 TRUE일때 : (char)(target - 32)
//			6. 4번 조건식이 FALSE일때: target
			
			if( target >= 'a' && target <= 'Z') {
				System.out.println((char)(target + 32));
			} else {
				if(target>= 'a' && target <= 'z') {
					System.out.println((char)(target - 32));
				} else {
					System.out.println(target);
				}
			}
			
			if( target >= 'a' && target <= 'Z') {
				System.out.println((char)(target + 32));
			} else if(target>= 'a' && target <= 'z') {
					System.out.println((char)(target - 32));
				} else {
					System.out.println(target);
				}
			
			
			
			
			
		}
}
