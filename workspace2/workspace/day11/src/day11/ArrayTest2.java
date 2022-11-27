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
		
		//첫번째 문제점
		//같은 패키지에 있는 Class를 가져올 때는, 바로 선언이 가능하나
		//다른 패키지에 있는 Class를 가져올 때는, 어느 경로에 있는지 import문이 필요하다.
		//해결법 : 상단에 import문 작성 ( 자동완성 )
		Dto[] dtos = new Dto[5];
		
		//클래스의 초기값도 null
//		System.out.println(dtos[0]);
		
		Dto dto = new Dto();
		
		dtos[0] = dto;
		dtos[1] = dto;
		dtos[2] = dto;
		dtos[3] = dto;
		dtos[4] = dto;
		
		// 두번째 문제점
		// 기존 Dto value 접근제어자는 default 였다.
		// 즉, 다른 패키지의 class에서 접근이 불가능한 변수였기에
		// 해결법 : 접근제어자를 pulbic으로 변경 후 접근 가능하게 만들었다.
//		dtos[0].value ??
//		dtos[0].value = 10;
		
		dtos[0].value = 1;
		dtos[1].value = 2;
		dtos[2].value = 3;
		dtos[3].value = 4;
		dtos[4].value = 5;
		
		// 세번째 문제점
		// dto 객체를 하나만 선언한 뒤, 배열에 삽입했기 때문에, 배열 안의 dto는 모두 같은 객체를 바라본다.
		// 즉, value 값을 변경할 때마다, 값이 덮어씌워져 결국 마지막 값만 출력된다.
		for(int i = 0; i < dtos.length; i++) {
			System.out.println(i + "번째 dto 값 : " + dto.value);
		}
		// 세번째 문제점 해결법
		dtos[0] = new Dto();
		dtos[1] = new Dto();
		dtos[2] = new Dto();
		dtos[3] = new Dto();
		dtos[4] = new Dto();
		
		dtos[0].value = 1;
		dtos[1].value = 2;
		dtos[2].value = 3;
		dtos[3].value = 4;
		dtos[4].value = 5;
		
		for(int i = 0; i < dtos.length; i++) {
			System.out.println(i + "번째 dtos 값 : " + dtos[i].value);
		}
		
		// 한번에 초기화
		
		Dto[] dtos2 = {new Dto(), new Dto(), new Dto(), new Dto(), new Dto()};
		
		for(int i = 0 ; i < dtos2.length; i++) {
			Dto tempDto = dtos2[i]; // 배열 안에 선언한 Dto 객체를 가져온다. 타입이 Dto
			tempDto.value = i + 1;  //꺼내온 클래스의 값을 변경하기
			
			
		}
		
	}
}
