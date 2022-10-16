package day05;

import java.util.Scanner;

public class ConditinalOperator {

	public static void main(String[] args) {
		
		System.out.println(true ? 10 : 20);
		
		
//		사용자에게 나이를 입력받아서 성인이라면 성인입니다. 성인이 아니라면 미성년자입니다. 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 >> ");
		int age = sc.nextInt();
		
		System.out.println(age>19 ? "성인입니다." : "미성년자입니다.");
		
		
		
		
	}
}
