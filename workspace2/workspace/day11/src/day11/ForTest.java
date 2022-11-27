package day11;

import dto.Dto;

public class ForTest {

	public static void main(String[] args) {

		String[] strArr = {"하나", "둘", "셋", "넷", "다섯"};
		
//		for(int i = 0; i < strArr.length; i++) {
//			System.out.println(strArr[i]);
//		}
		
//		향상된 for 문
		// 우측의 배열( strArr)을 "차례대로" 좌측에 선언된 변수 ( str )에 대입하는 것을 반복한다.
//		for(String str : strArr) {
//			System.out.println(str);
//		}
		
		// 배열의 짝수의 요소만 출력하기
//		for(int i = 1; i < strArr.length; i += 2) {
//			System.out.println(strArr[i]);
//		}
		
		int i = 0;
		
		for(String str : strArr) {
			if((i+1) % 2 == 0 ) {
				System.out.println(str);
			}
			i += 1;
		}
		
	}

}
