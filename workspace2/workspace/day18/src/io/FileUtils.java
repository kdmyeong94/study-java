package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {

//	File file = null;
//	
//	public FileUtils(File file) {
//		this.file = file;
//	}
	
	public static boolean write(File file, String str) {
		
		return write(file, str, false);
	}
	
	public static boolean write(File file, String str,boolean append) {
		boolean result = false;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file, append);
			
			bw = new BufferedWriter(fw);
			
			// 파일에다 덧붙이기
			bw.write(str + "\n");
			
			result = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bw != null)
				bw.close();
				if(fw != null)
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		return result;
	}
	
	
	
	public static boolean append(File file, String str) { // 덧붙이기
//		boolean result = false;
//		
//		FileWriter fw = null;
//		BufferedWriter bw = null;
//		
//		try {
//			fw = new FileWriter(file, true);
//			
//			bw = new BufferedWriter(fw);
//			
//			// 파일에다 덧붙이기
//			bw.write(str + "\n");
//			
//			result = true;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				if(bw != null)
//				bw.close();
//				if(fw != null)
//				fw.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}
//		
//		return result;
		
		return write(file, str, true);
	}
	
	
	
	public static boolean insert(File file, String str, int rowNum) throws IOException {
		
		boolean result = false;
		
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
		
		result = true;
		
		return result;
	}
	
}
