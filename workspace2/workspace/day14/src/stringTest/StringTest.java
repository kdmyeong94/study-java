package stringTest;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		
		String str = "Hello java hi";
		
		// 1. length() : 해당 문자열의 길이를 return
		System.out.println(str.length());
	
		// 2. charAt(인덱스) : 해당 문자열에서 인덱스에 위치한 char값을 return
		System.out.println(str.charAt(3));
		
		// 3. indexOf ( 요소 ) : 앞에서부터 요소가 등장한 인덱스 번호를 return
		// indexOf ( 요소, 찾기 시작할 위치 : 해당 위치로부터 요소를 찾아 등장한 인덱스 번호 return
		// 찾기 못할 때는 -1을 return
		System.out.println(str.indexOf("j"));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf(97));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("i", 10));
		
		// 4. subString ( 인덱스 ) : 인덱스로부터 끝까지 자른 문자열을 return
		// subString ( 인덱스 1, 인덱스 2 ) : 인덱스 1부터 인덱스 2 - 1까지 자른 문자열을 return
		System.out.println(str.substring(5));
		
		// 5. split ( 쪼갤 문자열 ) : 해당 문자열로 쪼갠 요소가 들어있는 String[] 이 return
		String[] temp = str.split(" ");
		System.out.println(Arrays.toString(temp));
		
		// 6. join ( 연결시킬 문자열, 연결하고싶은 배열 )
		System.out.println(String.join(" ", temp));
		
	}
}
