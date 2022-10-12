package multiex;

public class Main03 {

	public static void main(String[] args) {
		
//		7. 이중 반복문 8 X 8 
/*		★★★★★★★★
		★★★★★★★★
		★★★★★★★★
		★★★★★★★★
		★★★★★★★★
		★★★★★★★★
		★★★★★★★★
		★★★★★★★★
*/
		for(int s = 1 ; s < 9 ; s ++) {
			System.out.println();
		 for(int i = 1 ; i < 9; i++) {
			System.out.print("★");
		 }
		} 
		
		System.out.println();
		System.out.println("-----------------------");
		
		/* 8. 이중 반복문 사용해서 별을 출력
		 * 
		 * ★★★★★★★★
		 * ★★★★★★★
		 * ★★★★★★
		 * ★★★★★
		 * ★★★★
		 * ★★★
		 * ★★
		 * ★
		 */
		for(int i1 = 1 ; i1 <9 ; i1++) {
			System.out.println();
			for(int a = i1 ; a < 9; a++) {
				System.out.print("★");
			}
		}
		
		System.out.println();
		System.out.println("-----------------------");
		
/*		9. 이중 반복문 사용해서 별을 출력
 * 		★
 * 		★★
 * 		★★★
 * 		★★★★
 *		★★★★★
 *		★★★★★★
 *		★★★★★★★
 *		★★★★★★★★ 
 */
		
//		★
		String d = "";
		for(int q = 1 ; q < 9 ; q++) {
				d = d + "★";
				System.out.println(d);
			
		}
		
		System.out.println("-----------------------");
		
/*		10. 10번찍어 안 넘어 가는 나무 없다 라는 문구를 출력. while문으로 작성
 * 		결과 : 나무를 1번 찍었습니다
 * 				나무를 2번 찍었습니다.
 * 				...
 * 				
 */
		int z = 1;
		while(z <= 10 ) {
			System.out.println("나무를"+ z + "번 찍었습니다.");
			z++;
		}
		System.out.println("-----------------------");
		
		
		
		
	}
}
