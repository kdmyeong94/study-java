package day04;

import java.util.Scanner;

public class OperatorTask {

	public static void main(String[] args) {
//		---------------------------------------------------------------
//		1. 사용자에게 나이를 입력받아서 10년 후 나이를 계산해서 출력하라
//		입력예시
//		 나이 >> 27
//		출력예시
//		 10년 후 당신의 나이는 37살입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print( "나이 >> ");
		int age = sc.nextInt();
//		---------------------------------------------------------------
		
		
		System.out.printf("10년 후 당신의 나이는 %d살 입니다.\n", age + 10 );
//		---------------------------------------------------------------
//		2. 사용자에게 정수 하나를 입력받아서, 5로 나누었을 때 몫과 나머지를 출력하라.
//		입력예시
//		 정수 >> 27
//		출력예시
//		 27을 5로 나눈 몫은 5, 나머지는 2입니다. 
//		-------------------내 풀이--------------------------------------------
		System.out.printf("정수 >>");
		int age1 = sc.nextInt();
		System.out.printf("%d을 5로 나눈 몫은 %d, 나머지는 %d입니다.\n", age1, age1/5 , age1%5);
//		--------------------강사님풀이-------------------------------------------
//		System.out.printf("정수 >>");
//		int number = sc.nextInt();
//		System.out.println(number + "을 5로 나눈 몫은" + (number /5 ) ", 나머지는 " + (number % 5) + "입니다.");
//		---------------------------------------------------------------
		
		
//		---------------------------------------------------------------
//		3. 사용자에게 두 자릿수 정수를 입력받아서, 십의자리와 일의자리를 각각 출력하라.
//	 	입력예시
//		 정수 >> 85
//		출력예시
//		 십의자리 : 8
//		 일의자리 : 5
//		-----------------------내 풀이----------------------------------------
		System.out.printf("정수 : ");
		int num = sc.nextInt();
		System.out.printf("십의자리 : %d \n일의자리 : %d \n", num/10, num%10 );
//		------------------------강사님 풀이---------------------------------------
//		System.out.println("정수 >>");
//		int num = sc.nextInt();
//		System.out.println("십의 자리 : " + (num / 10));
//		System.out.println("일의 자리 : " + (num % 10));
//		---------------------------------------------------------------
		 
//		---------------------------------------------------------------
//		4. 노래 한 곡당 300원인 코인노래방이 있다. 사용자에게 금액 입력받고
//		부를 수 있는 노래 곡 수와 잔돈을 출력하라.
//		입력예시
//		 금액입력 >> 1600
//		출력예시
//		 부를 수 있는 노래 : 5 곡
//		 잔돈 100원이 반환되었습니다.
		
//		-----------------------내 풀이----------------------------------------
		System.out.printf("금액입력 >> ");
		int mon = sc.nextInt();
		System.out.printf(" 부를수 있는 노래 : %d곡 \n 잔돈 %d이 반환되었습니다.\n ", mon/300, mon%300);
//		-----------------------강사님 풀이----------------------------------------
//		System.out.println("금액입력 >> ");
//		int money = sc.nextInt();
//		System.out.println("부를 수 있는 노래 : " + (money / 300));
//		System.out.println("잔돈" + (money % 300) +"원이 반환되었습니다.");
//		---------------------------------------------------------------
		
//		---------------------------------------------------------------
//		5. 사용자에게 국어, 영어, 수학 점수를 입력받아서 평균을 출력하라
//		점수는 정수로 입력받는다.
//		입력에시
//		 국어점수 >>80
//		 영어점수 >>80
//		 수학점수 >>81
//		출력예시
//		 당신의 평균점수는 80.33점 입니다.
//		------------------------내 풀이---------------------------------------
		System.out.println("국어점수 >> ");
		int a = sc.nextInt();
		System.out.println("영어점수 >> ");
		int b = sc.nextInt();
		System.out.println("수학점수 >> ");
		int c = sc.nextInt();
		System.out.printf("당신의 평균점수는 %.2f 점입니다.", (a+b+c)/ 3.0);
//		------------------------강사님 풀이---------------------------------------
//		System.out.println("국어 점수 >> ");
//		int kor = sc.nextInt();
//		System.out.println("영어 점수 >> ");
//		int eng = sc.nextInt();
//		System.out.println("수학 점수 >> ");
//		int math = sc.nextInt();
//		System.out.println("당신의 평균 점수는 " + ((kor + eng + math)/3) + ".33점 입니다.");
//		---------------------------------------------------------------
	}

}
