package day11;

import dto.Dto;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] a = new int[5];
		
		
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		
		int[] b = a;
		
		b[0] = 10;
		
		for ( int i = 0; i < b.length; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
			System.out.println("b[" + i + "] : " + b[i]);
		} // 배열은 힙에 저장되며 같은 배열을 바라보고 있기 때문에 값 변경 시 , 서로간 영향을 받는다.
		
		
		// 배열 선언시 선언과 동시에 초기화 하는 법
		// 1 2 3 4 5
//		int[] arr = new int[5];
		int[] arr = new int[] { 1, 2, 3, 4, 5};
		int[] arr2 = new int[] {10, 20, 30, 40, 50};
		int[] arr3 = {100, 200, 300};
		int[] arr4 = arr3;
		arr4[0] = 555;
				
//		System.out.println(arr2[0] + arr2[4]);
//		System.out.println(arr3[0]);
//		System.out.println(arr3[0]);
		
		// Dto 클래스를 담는 길이 5의 배열을 선언 후
		// 각 Dto 클래스의 value 값을 저장하시오
		// 1, 2, 3, 4, 5
		
		Dto[] dtos = new Dto[5];
		
		
	}
}
