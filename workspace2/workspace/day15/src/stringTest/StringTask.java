package stringTest;

import java.util.Scanner;

public class StringTask {
	
	public static void main(String[] args) {
		
	// 1. 사용자에게 문자열로 암호를 입력받아서
	// 암호화, 복호화를 진행
	
	
	
	// "abcd" 입력받음
	// 'a', 'b', 'c', 'd'  => char[]
	// 67, 68, 69, 70 > int 변환
	// * 5
	// 335, 340, 345, 350 
	// > char 형태로 바꾸면?
	// 알수 없는 문자로 표기.
	// 암호화 진행
		
//		final int KEY = 5;

		Scanner sc = new Scanner(System.in);
		
//		System.out.println("pw >> ");
//		String pw = sc.nextLine(); // abcd
//
//		String en_pw = "";
//		// 입력받은 비밀번호를 알아 볼 수 없게 암호화해서 출력
//		for(int i = 0; i< pw.length(); i++) {
//			en_pw += (char)(pw.charAt(i) * KEY);
//		}
//		
//		System.out.println(en_pw);
	
		
		// 복호화 진행
		// 암호화된 char 형을 다시 int로 변환
		// 변환된 int 에 /5 진행
		// 67, 68, 69 ,70
		// > char 형으로 변환
		// 'a', 'b', 'c', 'd'
//		String de_pw = "";
//		for(int i= 0; i<en_pw.length(); i++) {
//			de_pw += (char)(en_pw.charAt(i)/KEY);
//		}
//		System.out.println(de_pw);
		
		
		
		/*
		 *  2. 사용자에게 문자열을 입력받아
		 *  대문자는 소문자로, 소문자는 대문자로, 그외의 문자는 그대로 반영하여 출력하시오
		 */
		
//		System.out.println("입력 >> ");
//		String input = sc.nextLine();
//		
//		String result ="";
//		for(int i = 0; i <input.length(); i++) {
//			char ch = input.charAt(i);
//			if( ch >= 'A' && ch <='Z') { // 대문자라면
//				result += (char)(ch + 32); // 소문자로 바꾸어 result에 연결
//			} else if(ch >= 'a' && ch <= 'z') { // 소문자
//				result += (char)(ch - 32); // 대문자로 바꾸어 result에 연결
//			} else { // 대문자 x, 소문자 x
//				result += ch;
//			}
//		}
//		
//		System.out.println("입력 받은 문자 : " + input);
//		System.out.println("변경된 문자 : " + result);
//		
		/*
		 * 3. 사용자에게 노래순위, 노래제목, 가수 정보 모두 ,로 구분하여 한줄로 입력받는다.
		 * 그리고 원래 노래순위에다 10을 더하여 다시 띄어쓰기로 연결하고 한줄로 출력하기
		 * 
		 * ex)
		 * 입력 > 15, 좋은날, 아이유
		 * 출력 > 25, 좋은날, 아이유
		 */
		
//		System.out.println("순위, 제목, 가수를 입력하시오 >> ");
//		String input = sc.nextLine();
//		String input = "15, 좋은날, 아이유";
		// substring( 인덱스 1, 인덱스 2) : 원하는 인덱스 사이의 문자열을 잘라 추출
		// indexOf ( char 형 문자 ) : 해당 문자가 어느 인덱스에 위치하는지 가져오는 메서드
		// split( ',') : ,를 기준으로 문자열을 잘라내 문자배열로 만드는 메서드
		// join( ',' ) : 문자배열을 ',' 를 붙여 하나의 문자열로 만드는 메서드
		// Integer.parseInt("문자열") : 문자열을 숫자로 바꿔주는 메서드
		
		// 1. 문자열의 첫번째 , 가 어디에 위치해있는지 확인한다.
		// 2. 문자열의 첫번째 , 까지 문자를 자른다
		// 3. 2번의 문자를 int형으로 바꾼다.
		// 4. 10을 더한다
		// 5. ,를 기준으로 문자를 문자열배열로 바꾼다.
		// 6. 첫번째 요소에 4번의 값으로 바꾼다.
		// 7. 문자로 다시 합친다
		
//		System.out.println(input.substring(0, input.indexOf(','))); // 15
//		System.out.println(input.substring(input.indexOf(','))); // 뒤의 문자
//		
//		int rank = Integer.parseInt(input.substring(0, input.indexOf(','))) + 10;
//		String back_str = input.substring(input.indexOf(','));
//		System.out.println(rank);
//		
//		String result = rank + back_str;
//		
//		System.out.println(result);
		
		/*
		 * 4. 사용자에게 한글로 문자열을 입력받아서
		 * 해당 문자열을 숫자로 변경하여 출력하시오
		 * 단, 공 ~ 구까지의 숫자만 나옵니다.
		 * 일공이삼
		 * 1023
		 */
		
		System.out.println("한글로 입력하시오 >> ");
		String input = "일공이삼";
		
		// indexOf ( 요소 ) : 첫번째 요소의 인덱스를 리턴
		// charAt ( 인덱스 ): 해당 인덱스에 위치한 문자를 char형 리턴
		
		String hangeul = "공일이삼사오륙칠팔구";
		String result = "";
		
		for(int i = 0; i< input.length(); i++) {
			result += hangeul.indexOf(input.charAt(i) );
		}
		
		System.out.println(result);
		
		
		
		
	}
}
