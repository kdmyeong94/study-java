package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadWriteTask {

	public static void main(String[] args) {
		
		// 파일을 제어하는 프로그램
		// 1. 삽입 2. 덧붙이기 3. 종료
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(" 1. 삽입 2. 덧붙이기 3. 종료 ");
			System.out.println("입력 >> ");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice ==1 ) { // 파일 삽입 
				System.out.println("줄 번호 입력 >> ");
				int lineNum = Integer.parseInt(sc.nextLine());
				
				System.out.println("내용 >> ");
				String target = sc.nextLine();
				
				// 안녕하세요
				// 반갑습니다
				// > 1번째 라인에 홍길동입니다. 내용 삽입
				// 결과 :
				// 안녕하세요
				// 홍길동입니다.
				// 반갑습니다.
				
				
			} else if ( choice == 2) { // 덧붙이기
				
				System.out.println("내용 >> ");
				String target = sc.nextLine();
				
				// 단순 덧붙이기
				
				
			} else if ( choice == 3) { // 종료
				
			} else { // 재입력
				System.out.println("다시 입력해주세요.");
			}
	
			
		}
		
		
		
	}

}
