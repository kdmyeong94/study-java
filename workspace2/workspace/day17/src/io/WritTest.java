package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritTest {

	public static void main(String[] args) {
		// 파일 출력 ( 파일에 쓰기 )
		
		// 0. 내가 사용할 파일 객체 만들기
		// 1. 스트림 열기
		// 1-2. 버퍼 생성 ( 옵션 )
		// 2. 파일 읽기/쓰기
		// 3-1. 버퍼 닫기 ( 1-2를 진행했을때)
		// 3-2. 스트림
		
		
		// 0. 내가 사용할 파일 객체 만들기
		File file = new File("E:\\자바\\text.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// 1. 스트림 열기
//			fw = new FileWriter(file);
			fw = new FileWriter(file, true); // true를 주면 기존 파일 내용에 덧붙인다
											// false는 기존 내용을 덮어쓴다. default값
			
			// 1-2. 버퍼 생성 ( 옵션 )
			bw = new BufferedWriter(fw);
			
			// 2. 파일 읽기/쓰기
			bw.write("안녕하세요\n"); // 기본적으로 줄바꿈은 포함하지 않는다.
			bw.write("반갑습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				// 3-1. 버퍼 닫기 ( 1-2를 진행했을때)
				if(bw != null)
				bw.close();
				
				// 3-2. 스트림 닫기
				if(fw != null)
				fw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
}
