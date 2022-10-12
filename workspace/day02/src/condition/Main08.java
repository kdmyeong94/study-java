package condition;

public class Main08 {

	public static void main(String[] args) {
		
		/*
		 * 1. 만약 3000원 이상의 돈을 가지고 있다면 택시를 타고,
		 * 그렇지 않으면 걸어가라
		 */
		int money = 2000;
		
		if( money >= 3000) {
			System.out.println("택시");
		} else {
			System.out.println("도보");
		}
		
		System.out.println("------------------");
		/*
		 * 2. 만약 돈이 3000원 이상 있거나, 카드가 있다면 택시를 타고
		 * 그렇지 않으면 걸어가라
		 */
		
		boolean card = true;  
		if ( money >= 3000 || card) {
			System.out.println("택시");
		} else {
			System.out.println("도보");
		}
		
		System.out.println("------------------");
		/*
		 * 3. 어떤 특정 정수 a가 짝수이면 "짝수", 홀수이면 "홀수"라고 출력  
		 */
		int d =5;
		
		if( (d % 2) == 0 ) {
			System.out.println("짝수");
		} else if( (d%2) != 0) {
			System.out.println("홀수");
		}
		
		System.out.println("------------------");
		/*
		 * 4. 서로다른 a,b,c의 최대값을 구하여라
		 */
		
		int a = 10 , b = 20 , c =9 ;
		
		System.out.print("최댓값은 : ");
		if( a > b && a > c) {
			System.out.println("A");
		} else if(b>a && b>c) {
			System.out.println("B");
		} else if(c>a && c>b) {
			System.out.println("C");
		}
		System.out.println("------------------");
		
		/*
		 * 5. 숫자가 3이면 안녕 "3줄", 2이면 "안녕"이 두줄,
		 * 1이면 "안녕"이 한줄, 그외는 "잘가" 출력
		 */
		
		int num = 3;
		switch(num) {
		case 3:
			System.out.println("안녕");
		case 2:
			System.out.println("안녕");
		case 1:
			System.out.println("안녕");
			break;
			default:
				System.out.println("잘가");
		}
	}
	/*ㅁㄴㅇㄻㄴㅇㄹ
	 * ㅁㄴㅇㄻㄴㅇㄻㄴㅇㄹ
	 * ㅁㄴㅇㄹㅋ
	 */
	
	
}

