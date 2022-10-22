package day05;

import java.util.Scanner;

public class conditionalTask {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
//			1. 사용자에게 정수 두개 입력받아서 둘중 더 큰수 출력하기
//			 입력예시
//			정수 1입력 >> 50
//			정수 2입력 >> 20
//			 출력예시
//			둘 중 더 큰 수는 50입니다.
//			System.out.println("정수 1 입력 :");
//			int a = sc.nextInt();
//			System.out.println("정수 2 입력 :");
//			int b = sc.nextInt();
//			
//			System.out.print("둘 중 더 큰 수는 ");
//			System.out.print( a > b ? a:b  );
//			System.out.println("입니다");
						
			
			
//			2. 1번에서 입력받은 두 수의 차(큰 수 - 작은수)를 출력하기
//			 출력예시
//			두 수의 차는 30입니다.
//			--------------------강사님 풀이---------------------
//			 System.out.printf("두 수의 차는" + (a > b ? a - b : b - a) + "입니다.");
			
//			--------------------강사님 풀이---------------------
			
//			-------------------내 풀이---------------
//			-------------------내 풀이---------------
			
//			3. 사용자에게 나이를 입력받아서
//			8상 이상 20살 미만은 2500원, 그 외의 경우에는 무료라고 출력하기
//			 입력예시
//			나이 >> 25
//			 출력예시
//			무료
////			--------------------강사님 풀이---------------------
//			System.out.println("나이 >> ");
//			int age = sc.nextInt();
//			
//			System.out.println(8 <= age && age < 20 ? "2500원" : "무료" );
//			System.out.println(!(8 <= age && age < 20) ? "무료" : "2500원" );
//			System.out.println(8 > age || age >= 20 ? "무료" : "2500원" );
////			--------------------강사님 풀이---------------------
			
////			-------------------내 풀이---------------
//			System.out.println("나이 : ");
//			int age = sc.nextInt();
//			System.out.println((8<= age) && ( age < 20 ) ? "2500원" : "무료");			
//			System.out.println();
////			--------------------강사님 풀이---------------------
//			System.out.println("나이 >> ");
//			int age = sc.nextInt();
//			System.out.println( "키 >> ");
//			int height = (int)sc.nexDouble();
//		
//			System.out.println( age >= 8 && height >= 150 ? "탑승 가능" : "탑승불가" );
//			System.out.println( !(age >= 8 && height >= 150) ? "탑승 가능" : "탑승가능" );
//			System.out.println( age < 8 || height < 150 ? "탑승 불가능" : "탑승가능" );
////			--------------------강사님 풀이---------------------
////			-------------------내 풀이---------------
////			4. 8살 이상, 키 150 이상만 탈 수 있는 놀이기구가 있다.
////			사용자에게 나이와 키를 입력받아서 탑승가능 / 탑승 불가능 출력하기
////			-------------------내 풀이---------------
//			System.out.println("나이 : ");
//			int age1 = sc.nextInt();
//			System.out.println("키 : ");
//			
//			int t = sc.nextInt();
//			
//			System.out.println((age1>=8) && (t>=150) ? "탑승가능":"탑승불가능");
////			-------------------내 풀이---------------
			
			// 5. 한 상자당 20개의 라면이 들어가있는 상자가 있다.
		      // 라면의 개수를 입력받아 필요한 상자의 개수 출력하기
		      // 입력예시 
		      // 라면개수 >> 25
		      // 출력예시 
//		      // 필요한 상자의 개수는 2개입니다.
////			--------------------강사님 풀이---------------------
//			System.out.println("라면개수 >>");
//			int ramenCnt = sc.nextInt();
//			int boxCnt = ramenCnt % 20 == 0 ? ramenCnt /20 
//			
//			System.out.println( ramenCnt % 20 == 0 ? ramenCnt / 20 : ramenCnt / 20 + 1 );
//			System.out.println("필요한 상자의 갯수는" + (ramenCnt % 20 == 0 ? ramenCnt / 20 : ramenCnt / 20 + 1)  + "개입니다");
////			--------------------강사님 풀이---------------------
			
//			&& , & : and
//			||, | : or
//			&& , || : 결과 값이 정해지면,뒤의 값은 확인하지 않고 바로 결과 출력한다.
//			& , | : 마지막까지 비교를 마친 다음에 결과를 출력한다.
//			System.out.println(true && true && false);
//			System.out.println(true & true & false);
			
////			-------------------내 풀이---------------
//		      System.out.println("라면의 갯수 : ");
//		      int m = sc.nextInt();
//		      
//		      System.out.println();
////			-------------------내 풀이---------------
		    
		      
		      char target = 'a';
//		      // 6. target에는 대문자 혹은 소문자의 문자만 들어갈 수 있습니다.
//		      // 만약 target에 대문자가 들어있다면 소문자로
//		      // 소문자면 대문자로 바꿔 출력하기
////			--------------------강사님 풀이---------------------
//		      boolean isCapitalLetter = target >= 'A' && target <= 'Z';
//		      char capitalLetter = (char) (target - 32);
//		      char smallLetter = (char) (target +32 );
//		      
//		      
//		      System.out.println(isCapitalLetter ? smallLetter : capitalLetter);  
//		      
//		   System.out.println(target >= 65 && target <= 90 ? (char)(target +32 ) : (char)(target - 32));  
//		   System.out.println(target >= 'A' && target <= 'Z' ? (char)(target +32 ) : (char)(target - 32));
//		   
////			--------------------강사님 풀이---------------------
//			-------------------내 풀이---------------
//		      System.out.println((char)(((int)target)-32));
//			-------------------내 풀이---------------
		      
		      
		      
		      // 7. 두 정수를 입력받고 둘 중 더 큰수를 출력. 같다면 같다고 출력
		      // 입력예시
		      //  정수1입력 >> 50
		      //  정수2입력 >> 20
		      // 출력예시
		       // 50
//			--------------------강사님 풀이---------------------
//		      System.out.println("정수 1 입력 >> ");
//		      int num1 = sc.nextInt();
//		      System.out.println("정수 2 입력 >>");
//		      int num2 = sc.nextInt();
//		      
////		      System.out.println( num1이 num2보다 크니? num1 : (num1과 num2가 같니? "같다" : num2));
//		      System.out.println(num1 > num2 ? num1 : (num1 == num2 ? "같다" : num2));
//		      System.out.println((num1>num2) ? num1:(num2>num1?num2:"같다"));
////			--------------------강사님 풀이---------------------
		      
////			-------------------내 풀이---------------
//		      System.out.println("정수 1 입력 : ");
//		      int a1 = sc.nextInt();
//		      System.out.println("정수 2 입력 : ");
//		      int a2 = sc.nextInt();
//		      
//		      System.out.println( (a1>a2 ? a1:a2));
////			-------------------내 풀이---------------
		      
		      
		      
		      // 8. target에 대문자 혹은 소문자 혹은 그 외의 문자가 들어갈 수 있고,
		      // 대문자와 소문자는 서로 바꿔 출력하지만(대문자 >> 소문자 / 소문자 >> 대문자)
		      // 그 외의 문자는 그대로 출력하기
////			--------------------강사님 풀이---------------------
//		      System.out.println("target >> ");
//		      target = sc.next().charAt(0);
//		      
////		      대문자라면 ? (Char)(target + 32) : 소문자라면 ? (Char)(target - 32) : target)
//		      System.out.println(target >= 'A' && target <= 'Z' ? (char)(target + 32) : 
//		    	  (target >= 'a' && target <= 'z' ? (char)(target -32) : target));
//			--------------------강사님 풀이---------------------

//			-------------------내 풀이---------------
//			-------------------내 풀이---------------
			
			
			
			
			
		}
}
