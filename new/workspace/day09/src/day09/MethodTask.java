package day09;

import java.util.Scanner;

public class MethodTask {

	int money = 10;  //전역변수
	
	public static void main(String[] args) {

		
//		Scanner r = new Scanner(System.in);
//		
//		
//		
//		MethodTask t = new MethodTask();
//		
//		System.out.println(t.dong(r.nextInt()));		
//		
		MethodTask mt = new MethodTask();
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 입력 >> " );
		
		int dan = sc.nextInt();
		mt.printGugudan(dan);
		
				
		
//		구구단을 동적으로 출력하는 메소드를 만들어
//		사용자가 입력하는 수에 대한 구구단을 실행하도록 만드시오.
		
		
	}
	
	public void printGugudan(int dan) {
		
		for (int i = 1; i<10; i++ ) {
			System.out.println(dan + "X" + i + "=" + (dan*i));
		}
	}
	
//	public String dong ( int x) {
//		
//		int q = 0;
//		for ( int i = 1 ; i < 10 ; i++) {
//			q = i * x;
//			System.out.println(q);
//		}
//		return x + " 단입니다";
//	}
	
//		전역변수로 잔고 변수를 생성하여
//		입금과 출금하는 메서드를 각각 생성하시오.
	
//	public int bank ( int x ) {
//		
//		
//	}
	
	//입금
	public int deposit(int m) {
		money += m;
		return money;
	}
	
	//출금
	public int withdraw(int m ) {
		if(money < m ) {
			System.out.println("계좌에 잔고가 부족합니다.");
			return money;
		} else {
			money -= m;
			return money;
		}
		
		
	}
	
	
}
