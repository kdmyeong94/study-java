package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteTask {

	public static void main(String[] args) {
		
		// 파일을 제어하는 프로그램
		// 1. 삽입 2. 덧붙이기 3. 종료
		
		Scanner sc = new Scanner(System.in);
		File file = new File("E:\\자바\\task2.txt");
		
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
//				try {
//					ReadWriteTask.insert(lineNum, target);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
				
				FileUtils.insert(file, target, lineNum);
				
				
			} else if ( choice == 2) { // 덧붙이기
				
				System.out.println("내용 >> ");
				String target = sc.nextLine();
				
				// 단순 덧붙이기
//				try {
//					ReadWriteTask.append(target);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
				
				FileUtils.append(file, target);
				
			} else if ( choice == 3) { // 종료
				break;
			} else { // 재입력
				System.out.println("다시 입력해주세요.");
			}
	
			
		}
		
		
		
	} // main 닫는 괄호
	
	public static void append(String str) throws IOException { // 파일 뒤에 덧붙이기
		
		File file = new File("E:\\자바\\task2.txt");
		
		FileWriter fw = new FileWriter(file, true);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		// 파일에다 덧붙이기
		bw.write(str + "\n");
		
		bw.close();
		fw.close();
	}
	
	public static void insert(int rowNum, String str) throws IOException {
		File file = new File("E:\\자바\\task2.txt");
		
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		// 1. 끼워 넣고 싶은 라인까지 임시 문자변수에다 더한다.
		// 2. 끼워넣을 라인에 넣고싶은 문자열을 1번 변수에 더한다.
		// 3. 나머지 내용들도 덧붙인다.
		
		String contents = "";
		
		for(int i = 0; i < rowNum; i++) {
			contents += br.readLine() + "\n";
		}
		
		// for문이 끝나면 contents에는 내가 삽입하고 싶은 위치 이전까지의 내용이 더해진다
		contents += str + "\n";

		for(String line = br.readLine(); line != null; line = br.readLine()) {
			contents += line + "\n";
		}
		
		br.close();
		fr.close();
		
		FileWriter fw = new FileWriter(file);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(contents);
		
		bw.close();
		fw.close();
		
	}
	
	
} // class 닫는 괄호
