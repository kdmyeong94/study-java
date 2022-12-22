package errorTest;

public class Main {

	public static void main(String[] args) {
		
		Method m = new Method();
//		m.f(0, 0);
		
//		try {
//			m.rest();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
		
//		
//		m.f2(30);
		
		try {
			m.setNickName("바보");
		} catch (BadWordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
