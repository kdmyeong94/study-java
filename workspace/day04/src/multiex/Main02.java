package multiex;

public class Main02 {

	public static void main(String[] args) {
		
		/* 4. 1~100까지 중에 홀수와 짝수의 합을 각각 구하여라
		 */ 
//		even = 2 + 4 + 6 + + 100  > 2n
//		odd	 = 1 + 3 + 5 + + 99   > 2n - 1
//		int num = 0;
//		int even = 0;
//		int odd = 0;
//		for(num = 0; num <= 100; num++) {
//			System.out.println(num);
//		}
		
//		int even = 0;
//		for(int num = 0; num <= 100 ; num +=2) {
//			even = even + num;
//	} System.out.println(even);
//	 
//		int odd = 0;
//		for(int num1 = 1; num1 <=100 ; num1+=2) {
//			odd = odd + num1;
//		} System.out.println(odd);
//	
//		System.out.println("--------------------");
//		
//		
////		5. 구구단 2단부터 9단까지의 결과값만을 출력하여라
////		단, 단수가 바뀔때마다 구분자를 넣어줄것
//		
//		/* 1. 2단 만들기 
//		 * 
//		 */
//		int j = 1;
//		int k = 2;
//		for ( k = 2 ; k <= 9 ;  k++) {
//			System.out.println("---------"+ k +"단"+"-----------");
//		for ( j = 1 ; j <= 9 ; j++) {
//			System.out.println(j*k);
//		 }
//		}
//		
//		System.out.println("--------------------");
		
//		6. 구구단 2단을 출력
//		 2 * 1 = 2
//		 2 * 2 = 4...
		int i = 1;
		int dan = 2;
		for ( i = 1 ; i <= 9 ; i++ ) {
			System.out.println(" 2 * " + i + " = " + dan );
			dan = dan * i;
		}
		
		System.out.println("--------------------");
		
		
		
		
		
		
		
		
		
		
	}
}
