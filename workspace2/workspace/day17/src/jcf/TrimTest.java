package jcf;

public class TrimTest {

	public static void main(String[] args) {
		
		System.out.println("    abc    ".trim());
		System.out.println("abc    ".trim());
		System.out.println("    abc".trim());
		System.out.println("    a   b  c    ".trim());
		
		// 사이 공백이 존재하는 문자 a b c  를
		// abc 문자열로 변경하여 출력하라
		String str = "a b c";
		String tmp = "";
		
		for(int i = 0; i < str.length(); i++ ) {
			if(str.charAt(i) != ' ' ) {
				tmp += str.charAt(i);
			}
		}
		
		str = tmp;
		
		System.out.println("str : " + str);
	}
	
}
