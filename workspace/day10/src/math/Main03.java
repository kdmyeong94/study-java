package math;

import study.java.helper.Util;

public class Main03 {

	public static void main(String[] args) {

		/*
		 * Util class에 정의되어 있는 random() 사용해서 5자리 인증번호 생성 ex) 11289, 26955, 11135
		 */

//		Util u = Util.getIntance();
//		int a = u.random(10000, 99999);
//		System.out.println(a);

		String authNum = "";
		
		for ( int i = 0 ; i < 5; i ++) {
			authNum += Util.getIntance().random(0, 9);
		}
		System.out.println("인증번호 : " + authNum);
		
	}

}
