package day07;

import java.util.Scanner;

public class ForTask {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
//			 1. 사용자에게 반복 횟수를 입력 받아, 해당 횟수만큼 이름 출력하기
//	      입력 예시 
//	      반복 횟수 >> 5
//	      출력 예시
//	      김참이
//	      김참이
//	      .... 5번 반복
//			System.out.println("반복 횟수 입력");
//			
//			int a = sc.nextInt();
//			
//			int i = 0;
//			for(int i1 = 0 ; i1 < a  ; i1 = i1 + 1 ){
//				System.out.println("김참이");
//			}
				
			
	      
//	      2. 사용자에게 정수를 입력받아 1부터 해당 정수까지 가로로 출력하기
//	      입력예시
//	      정수 >> 10
//	      출력 예시
//	      1 2 3 4 5 6 7 8 9 10
//	      System.out.println("정수 입력 >>");
//			int b = sc.nextInt();
//			
//			for(int j = 1; j <=b; j = j +1) {
//				System.out.print(j + " ");
//			}
			
	      
//	      3. 10부터 1까지 가로로 출력하기
//	      10 9 8 7 6 5 4 3 2 1
	      
	      
	      
//	      for(int k = 10; k >= 1; k = k - 1) {
//	    	  System.out.print(k + " ");
//	      }
			
			
//	      4. 1부터 100까지의 숫자 중 짝수만 가로로 출력하기
	      
//			for(int l = 2 ; l <= 100; l = l + 2 ) {
//				System.out.print(l + " ");
//			}
			
			
//	      5. 사용자에게 정수를 입력받아 1부터 해당 수까지의 총합 출력하기
		
//		System.out.println("정수 입력 >> ");
//		int sum = 0;
//		int c = sc.nextInt();
//		
//		for(int m = 1 ; m <= c ; m = m + 1) {
//			sum= sum + m;
//		}
//			System.out.println(sum);
			
//			i		sum
//		1	0		0	
//		2	1		1
//		3	2		1+2 = 3
//		4	3		...
			
			
//	      6. 사용자에게 단을 입력받아 구구단 출력하기

//			System.out.println("단 입력 >> ");
//			int d = sc.nextInt();
//			
//			for(int o = d ; o < 10*d; o = o + d) {
//				System.out.println(o);
//			}
//			
////			
//			for(int i = 1 ; i < 10 ; i = i + 1){
//				System.out.println(d + "x" + i + "=" + (d*i));
//		}
			
			
//	      7. 사용자에게 정수 입력받아 별 출력하기
//	      *
//	      **
//	      ***
//	      ****
	      
//	         *
//	        **
//	       ***
//	      ****
	      
//			System.out.println("*");
//			System.out.println("**");
//			System.out.println("***");
//			System.out.println("****");
			
//			4번.

//			String star = "*";
//			for(int i = 0 ; i < 4 ; i = i +1 ) {
//				System.out.println(star);
//				star = star + "*";
//			}
			
			String star = "*";
			for(int i = 0 ; i < 4 ; i = i +1 ) {
				System.out.printf("%4s \n",star);
				star = star + "*";
			}
			
			
			
			

			
		}
}
