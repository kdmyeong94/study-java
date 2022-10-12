package array;

public class Main01 {

	public static void main(String[] args) {

		
//		배열의 생성
//		배열의 선언과 크기 지정 및 값의 할당에 대한 개별 처리
		int[] dooly;
		dooly = new int[3];
		dooly[0] = 75;
		dooly[1] = 82;
		dooly[2] = 91;
		
//		배열의 선언과 크기 지정의 일괄처리
		int[] douneo = new int[3];
		douneo[0] = 88;
		douneo[1] = 64;
		douneo[2] = 50;
		
//		배열 생성의 일괄처리
		int[] ddochy = new int[] {100, 100, 90};
		
		
//		배열의 활용
		
//		반복문 각각의 총합, 평균 출력
		
		int sum = 0;
		int averge = 0;
		for(int i = 0 ; i < dooly.length ; i++ ) {
			sum += dooly[i];
		}
		System.out.println("둘리 총점 : " + sum);
		averge = sum / dooly.length;
		System.out.println("둘리 평균 : " +averge);
		
		int sum1 = 0;
		int averge1 = 0;
		for(int i = 0 ; i < douneo.length ; i++ ) {
			sum1 += douneo[i];
		}
		System.out.println("도우너 총점 : " +sum1);
		averge1 = sum1 / douneo.length;
		System.out.println("도우너 평균 : " +averge1);
		
		int sum2 = 0;
		int averge2 = 0;
		for(int i = 0 ; i < ddochy.length ; i++ ) {
			sum2 += ddochy[i];
		}
		System.out.println("또치 총점 : " +sum2);
		averge2 = sum2 / ddochy.length;
		System.out.println("또치 평균 : " +averge2);
		
	} //2

} //1
