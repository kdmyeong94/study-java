package stringTest;

import java.util.Scanner;

public class StringTask {
	
	public static void main(String[] args) {
		
	// 사용자에게 문자열로 암호를 입력받아서
	// 암호화, 복호화를 진행
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("pw >> ");
	String pw = sc.nextLine();
	
	// "abcd" 입력받음
	// 'a', 'b', 'c', 'd'
	// 67, 68, 69, 70 > int 변환
	// * 5
	// 335, 340, 345, 350 
	// > char 형태로 바꾸면?
	// 알수 없는 문자로 표기.
	// 암호화 진행
	
	// 복호화 진행
	// 암호화된 char 형을 다시 int로 변환
	// 변환된 int 에 /5 진행
	// 67, 68, 69 ,70
	// > char 형으로 변환
	// 'a', 'b', 'c', 'd'
	
	
	}
}
