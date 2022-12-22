package errorTest;

public class Method {

	// 배열을 정수로 나눴을 때 몫을 출력하는 메서드
//	public void f(int idx, int num) {
//		int[] ar = { 10, 20, 30};
//		
//		try {
//			System.out.println("결과 : " + ar[idx]/num);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 입력 오류");
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없음");
//		} catch (Exception e) {
//			System.out.println("알 수 없는 에러");
//		}
//	}

	
	public void f(int idx, int num) throws ArrayIndexOutOfBoundsException{
		int[] ar = { 10, 20, 30};
		
		System.out.println("결과 : " + ar[idx]/num);
	
	
	}

//	public void rest() {
//		
//		System.out.println("시작");
//		try {
//			Thread.sleep(1000);
//		} catch (Exception e) {
//			System.out.println("지연");
//		}
//	
//		System.out.println("끝");
//	}
//	
	public void rest() throws InterruptedException {
		
		System.out.println("시작");
		
			Thread.sleep(1000);
			
		System.out.println("끝");
	}
	
	public void f2(int num) {
		if(num>5) {
			throw new ArrayIndexOutOfBoundsException();
		}
		System.out.println("f2 정상실행됨");
		
	}
	
	
	public void setNickName(String nick) throws BadWordException {
		
		if(nick.equals("바보")) {
			throw new BadWordException();
		}
		
		System.out.println("닉네임 : " + nick);
		
	}
	
	
	
	
}
