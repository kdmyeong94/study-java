package patterncheck;

import java.util.regex.Pattern;

public class RegexHelper {

//	싱글톤 객체 생성
	private static RegexHelper regex;

	public static RegexHelper getInstance() {

		if (regex == null) {
			regex = new RegexHelper();

		}

		return regex;
	}

	public static void freeInstance() {
		regex = null;
	}

	private RegexHelper() {

	}
	/*
	 * 1. 주어진 문자열이 공백이거나 null인지 검사
	 * 
	 * @param str - 검색할 문자열
	 * 
	 * @return boolean - 공백,null이 아닐 경우 true 리턴
	 */

//	public String str1(String a) {
//		String t = "false";
//		boolean num = Pattern.matches("\s", a);
//		boolean num1 = Pattern.matches("\0", a);
//		if (!num && !num1) {
//			t = "true";
//			System.out.println(t);
//		} else {
//			System.out.println(t);
//		}
//		return t;
//	}

	public boolean isValue(String str) {
		boolean result = false;
		if(str != null) {
			result = str.trim().equals("");
					
		}
		
		return result;
	}
	
	/*
	 * 2. 숫자 모양에 대한 형식 검사
	 * 
	 * @param str - 검사할 문자열
	 * 
	 * @return boolean = 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
//	public String str2(String a) {
//		boolean num = Pattern.matches("^[0-9]*$", a);
//		if (!num) {
//			System.out.println("false");
//		} else {
//			System.out.println("true");
//		}
//		return String.valueOf(num);
//	}
	
	public boolean isNum( String str) {
		boolean result = false;
		
		if(! isValue(str)) {
			result = Pattern.matches("^[0-9]*$", str);
		}
		return result;
	}

	/*
	 * 3. 영문으로만 구성되었는지에 대한 형식 검사
	 * 
	 * @param str - 검사할 문자열
	 * 
	 * @return boolean = 형식에 맞을 경우 true, 맞지 않을 경우 false
	 * 
	 */
//	public String str3(String a) {
//		boolean num = Pattern.matches("^[a-zA-Z]*$", a);
//		if (!num) {
//			System.out.println("false");
//		} else {
//			System.out.println("true");
//		}
//		return String.valueOf(num);
//	}

	public boolean isEng( String str) {
		boolean result = false;
		
		if( !isValue(str)) {
			result = Pattern.matches("^[a-zA-Z]*$", str);
		}
		return result;
	}
	/*
	 * 4. 한글로만 구성되었는지에 대한 형식 검사
	 * 
	 * @param str - 검사할 문자열
	 * 
	 * @return boolean = 형식에 맞을 경우 true, 맞지 않을 경우 false
	 * 
	 */
//	public String str4(String a) {
//		boolean num = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", a);
//		if (!num) {
//			System.out.println("false");
//		} else {
//			System.out.println("true");
//		}
//		return String.valueOf(num);
//	}

	public boolean isKor( String str) {
		boolean result = false;
		
		if( !isValue(str)) {
			result = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);
		}
		return result;
	}
	/*
	 * 5. 영문과 숫자로만 구성되었는지에 대한 형식 검사
	 * 
	 * @param str - 검사할 문자열
	 * 
	 * @return boolean = 형식에 맞을 경우 true, 맞지 않을 경우 false
	 * 
	 */
//	public String str5(String a) {
//		boolean num = Pattern.matches("^[a-zA-Z0-9]*$", a);
//		if (!num) {
//			System.out.println("false");
//		} else {
//			System.out.println("true");
//		}
//		return String.valueOf(num);
//	}

	public boolean isEngNum( String str) {
		boolean result = false;
		
		if( !isValue(str)) {
			result = Pattern.matches("^[a-zA-Z0-9]*$", str);
		}
		return result;
	}
	
}
