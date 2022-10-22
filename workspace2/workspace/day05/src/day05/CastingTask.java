package day05;

import java.util.Scanner;

public class CastingTask {

	public static void main(String[] args) {

//		사용자에게 국어점수와 영어점수를 문자열로 입력받고, 평균을 출력하세요
//		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		
		int kor = Integer.parseInt(sc.next());		
//		1. sc.next();  -> 30
//		2. Integer.parseInt("30") -> String to int -> "30" -> 30
//		3. int kor = 30
		
		System.out.print("영어점수 : ");
		int eng = Integer.parseInt(sc.next());	
		
		int ave = (kor + eng)/2;
		System.out.print("평균점수 = ");
		System.out.println(ave );
//		
		char target = 'A';
//		target에는 항상 대문자만 들어있다.
//		이때 target에 들어있는 대문자를 소문자로 바꾸어 출력하시오
//		hint) 아스키코드와 형변환
		
//		1. target을 int형으로 변환
//		2. 'A' -> 65로 변환된다.
//		3. 'a' = 97
//		4. 2번에서 char > int 로변환한 65 값에 32이를 더한다.
//		5. 97 > char형으로 변환한다.
		
		System.out.println((char)((int)target + 32)); // 65 + 32 = 97
		System.out.println((char)(target + 'a' - 'A'));
		
		
		
		
		
		
		
		
	}

}
