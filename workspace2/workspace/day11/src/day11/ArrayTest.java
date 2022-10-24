package day11;

public class ArrayTest {

	public static void main(String[] args) {
		
		// 배열
		// 같은 타입의 변수들로 이루어진 집합
		// 같은 자료형으로 여러개의 공간을 선언
		// 동일한 자료형으로 변수들을 묶는다.
		
		
	
//		int i =1;
//		int i2 =2;
//		int i3 =3;
//		int i4 =4;
//		int i5 =5;
		
		// 선언방식
		// 자료형[] 배열명 = new 자료형[길이]
		// 자바에서 길이는 최초 선언시 수정 불가
		int[] arr1 = new int[5];
		String[] arr2 = new String[10];
		boolean[] arr3 = new boolean[5];
		char[] arr4 = new char[5];
//		인덱스는 배열의 길이 -1
//		0부터 시작하기 때문
//		배열의 위치 == 인덱스 == 0 부터 시작
//		
//		System.out.println(arr1);  // 단순한 출력으로는 배열 안의 요소를 확인 할 수 없다.
//		System.out.println(arr1[0]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);
//		System.out.println(arr1[4]);
		
		
		// 배열의길이 => 배열명.length
//		System.out.println(arr1.length);
		
//		for (int i = 0 ; i < arr1.length ; i++) {
//			System.out.println("arr1[" + i + "] : " + arr1[i]);
//		} // 숫자류에 대해서는 아무값도 넣지 않으면 기본적으로 0 의 값이 들어간다.
//		
//		for (int i = 0; i< arr2.length; i ++) {
//			System.out.println("arr2[" + i + "] : " + arr2[i]);
//		} // String에 대해서는 기본값으로 null이 들어간다.
//		// null : 공백을 의미하며, 공집합을 뜻한다. 즉, 아무값도 없다는 의미
//		
//		for (int i = 0; i< arr3.length; i ++) {
//			System.out.println("arr3[" + i + "] : " + arr3[i]);
//		} // boolean에 대한 기본값은 false
		
//		for (int i = 0; i< arr4.length; i ++) {
//		System.out.println("arr4[" + i + "] : " + arr4[i]);
//	} // char의 기본값은 공백이며, 이에 해당하는 정수는 0이다.
		
		System.out.println(arr1[0]+10);
		System.out.println(arr2[0]+10);
//		System.out.println(arr3[0]+10);  // boolean은 더하기 불가능
		System.out.println(arr4[0]+10);
		
		
		
		//데이터 저장
		// 배열명[인덱스] = 값;
		arr1[0] = 10 ;
		arr1[1] = 20 ;
		arr1[2] = 30 ;
		arr1[3] = 40 ;
		arr1[4] = 50 ;
		
//		for (int i = 0 ; i < arr1.length ; i++) {
//			System.out.println("arr1[" + i + "] : " + arr1[i]);
//		} // 숫자류에 대해서는 아무값도 넣지 않으면 기본적으로 0 의 값이 들어간다.
		
		
		
	}
	
}
