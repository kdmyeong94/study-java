package string;

public class Main03 {

	public static void main(String[] args) {

//		주민등록번호에서 생년월일 추출하기
//		- 주민번호 : 800501 1234567 -> 1980년 05월 01일 남자
//		- 태어난 년도의 판별 : 1 or 2 > 19~
//						: 3 or 4 > 20~
//		- 성별의 판별 : 1 or 3 -> 남자
//					: 2or 4 -> 여자
		
		String a = "8005011234567";
		String y = a.substring(0,2);
		String m = a.substring(2,4);
		String d = a.substring(4,6);
		String a_1 = a.substring(6,7);
		int a_2 = Integer.parseInt(a_1);
		
		String s = "";
		if (a_2 == 1 || a_2 == 3) {
			s = "남자";
		} else if (a_2 == 2 || a_2 == 4) {
			s = "여자";
		}
		if ( a_2 == 1 || a_2 == 2) {
			System.out.println("19"+ y + "년 "+m+"월 "+d +"일 " + s );
			System.out.printf("19%s년 %s월 %s일 %s", y, m , d ,s);
		}
	}

}
