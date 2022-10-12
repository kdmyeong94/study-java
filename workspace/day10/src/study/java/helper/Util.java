package study.java.helper;

/*
 * 기본적으로 공통 기능을 묶어놓은 클래스
 */
public class Util {
//	싱글톤 객체
	private static Util a;

	public static Util getIntance() {

		if (a == null) {
			a = new Util();
		}
		return a;

	}

	public static void freeIntance() {
		a = null;
	}

	private Util() {

	}

//	random(a,b)
//	범위를 갖는 랜덤값을 생성하여 리턴하는 메서드
//	@param  min : 범위 안에서의 최솟값
//	@param 	max : 범위 안에서의 최대값
//	@retun		: min~max 안에서의 랜덤값
	public int random(int a, int b) {

		int x = (int) ((Math.random() * (b - a + 1)) + a);

		return x;
	}
}
