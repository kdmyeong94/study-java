package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {

	public static void main(String[] args) {
		
		
		File file = new File("E:\\자바\\task.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file); // 스트림 생성
			br = new BufferedReader(fr);  // 버퍼 생성
			
			// 파일 읽기
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
			
//			while(br.readLine() != null) {
//				System.out.println(br.readLine());
//			}
			
			String line= br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}	finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
