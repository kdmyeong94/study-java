package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Main02 {

	public static void main(String[] args) {
		
		/*
		 * 문자열을 파일로 저장
		 *  -> 문자열을 파일로 저장하기 위해서는 byte 배열로 변환해야 한다.
		 *  -> 문자열을 byte 배열로 변환하기 위해서는 getByte 메서드를 사용하는데,
		 *  이 때 변환 과정에서 사용할 인코딩 형식을 지정해 주어야 한다.
		 */
		
		String path = "text.txt";
		
//		파일에 저장할 내용
		String write_string = "가나다라마바사abcdefg";
		
//		특정 인코딩 방식 적용
//		객체나 배열이 선언과 할당에 대한 블록이 서로 분리되어 있을 경우
//		명시적으로 빈 영역임을 알리기 위하여 null로 초기화
		
		byte[] buffer = null;
		try {
			buffer = write_string.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("[ERROR] 알 수 없는 인코딩 정보 >> " + path);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러 " + path);
			e.printStackTrace();
		}
		
//		파일 저장 절차 시작
//		finally 블록에서 인식하기 위해서 선언부를 위로 이동시킨다.
		OutputStream out = null;
		try {
			out = new FileOutputStream(path);
//			파일 쓰기
			out.write(buffer);
			System.out.println("[INFO]파일 저장 성공 >> " + path);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 지정된 경로를 찾을 수 없음 >> "+ path);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 저장 실패 >> " + path);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러 >> " + path);
			e.printStackTrace();
		} finally {
//			저장의 성공여부에 상관없이 스트림은 무조건 닫아야 하기 때문에 out.close()는 try문이 아닌 finally문으로 해야한다.
			
			try {
				out.close();
			} catch (IOException e) {
				System.out.println("[ERROR] ");
				e.printStackTrace();
			}
		}
		
				
	}
}
