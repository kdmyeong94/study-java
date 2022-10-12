package multiex;

public class Main01 {

	public static void main(String[] args) {
		
//		1. 7의 구구단의 결과값만을 출력. 단, for문으로 작성할 것 
//		결과 값 : 7 14 ...63

		for(int i = 7; i <= 63 ; i += 7 ) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------------------");

//		2. 7의 구구단의 결과값만을 출력. 단, while문으로 작성할 것
		
		int j = 7;
		while ( j <= 63 ) {
			System.out.print(j + " ");
			j += 7;
		}
		System.out.println();
		
		System.out.println("-----------------------------");
		
//		3. 7의 구구단의 결과값만을 출력. 단, do~while문으로 작성할 것
		
		int k = 7;
		
		do{
			System.out.print( k + " ");
			k += 7;
		} while ( k <= 63);
		
		System.out.println();
		System.out.println("-----------------------------");
		
		
		
		
		
		
	}
}
