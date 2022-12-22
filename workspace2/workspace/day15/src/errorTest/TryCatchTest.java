package errorTest;

import java.util.Scanner;

public class TryCatchTest {

	public static void main(String[] args) {
		
//		int[] iarr = {1,2};
//		
//		
//		System.out.println(iarr);
		
		
		int[] ar = {10, 20, 30};
		
		// 사용자에게 인덱스번호와 정수를 입력받아서
		// 배열 속에 해당 인덱스를 정수로 나눈 몫을 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.println("인덱스 >> ");
		int idx = sc.nextInt();
		
		System.out.println("정수 >> ");
		int num = sc.nextInt();
		
//		try {
//			System.out.println("결과 : " + ar[idx]/num);
//		} catch (Exception e) { 
//			e.printStackTrace();
//			System.out.println("오류 발생");
//		}
		
//		try {
//			System.out.println("결과 : " + ar[idx]/num);
//		} catch (ArithmeticException e) { 
//			e.printStackTrace();
//			System.out.println("0으로는 나눌 수 없습니다.");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스가 잘못 지정되었습니다.");
//		} catch ( Exception e) {
//			System.out.println("알 수 없는 예외 발생");
//		} finally {
//			System.out.println("무조건 실행");
//		}
		
//		try {
//			System.out.println("결과 : " + ar[idx]/num);
//		} catch ( Exception e) {
//			e.printStackTrace(); // 하단의 catch문의 Exception 객체들이 모두 여기서 걸러지므로, 아래의 catch문은 의미가 없어진다.
//			System.out.println("0으로는 나눌 수 없습니다.");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스가 잘못 지정되었습니다.");
//		} catch (ArithmeticException e) { 
//			System.out.println("알 수 없는 예외 발생");
//		} finally {
//			System.out.println("무조건 실행");
//		}
		
	}
	
}
