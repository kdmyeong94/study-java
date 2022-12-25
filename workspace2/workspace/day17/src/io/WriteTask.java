package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTask {

	public static void main(String[] args) {
		
		/*
		 * task.txt 파일을 만들고
		 * 해당 파일에
		 * 0번쨰 줄입니다.
		 * 1번쨰 줄입니다.
		 * .
		 * .
		 * .
		 * 9번째 줄입니다.
		 * 출력하기
		 * 
		 */
	
		File file = new File("E:\\자바\\task.txt");
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			for(int i = 0; i< 10; i++) {
				bw.write(i + "번째 줄입니다.\n");
			}
			
		} catch (IOException e) {
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
				
	
	}
}
