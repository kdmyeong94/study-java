package day03;

import java.util.Scanner;

public class inputTest {

	public static void main(String[] args) {

//		변수 = 값;
//		출력(변수);
//		Scanner 클래스 생성
		Scanner sc = new Scanner(System.in);
//		
//		EX1)
//		String name;
//		name = sc.next();
//		
		
//		next = 문자열로 값을 입력받고 내보내는 기능.
//		
//		System.out.print("이름 : ");
////		()안의 가장 안쪽부터 실행된다.
//		System.out.println(name);
//		System.out.printf("%s님 안녕하세요", name );
		
		int age = sc.nextInt();
		
		System.out.print(" 나이 : ");
		System.out.println(age);
		
		
		
	}

}
